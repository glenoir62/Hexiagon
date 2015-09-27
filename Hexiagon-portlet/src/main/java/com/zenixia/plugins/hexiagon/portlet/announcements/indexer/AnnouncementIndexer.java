
package com.zenixia.plugins.hexiagon.portlet.announcements.indexer;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.BooleanClauseOccur;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.BooleanQueryFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.liferay.portlet.messageboards.service.MBMessageLocalServiceUtil;
import com.liferay.portlet.ratings.model.RatingsStats;
import com.liferay.portlet.ratings.service.RatingsStatsLocalServiceUtil;
import com.zenixia.plugins.hexiagon.constants.PortletKeys;
import com.zenixia.plugins.hexiagon.model.Announcement;
import com.zenixia.plugins.hexiagon.service.AnnouncementLocalServiceUtil;
import com.zenixia.plugins.hexiagon.service.persistence.AnnouncementActionableDynamicQuery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import javax.portlet.PortletURL;

/**
 * Indexer
 *
 */
public class AnnouncementIndexer extends BaseIndexer {

	public static final String[] CLASS_NAMES = {
		Announcement.class.getName()
	};

	public static final String PORTLET_ID = PortletKeys.ANNOUNCEMENT_PORTLETID;

	public AnnouncementIndexer() {

		setPermissionAware(true);
	}

	public String[] getClassNames() {

		return CLASS_NAMES;
	}

	@Override
	protected void doDelete(Object obj)
		throws Exception {

		Announcement announcement = (Announcement) obj;
		deleteDocument(announcement.getCompanyId(), announcement.getAnnouncementId());
	}

	@Override
	protected Document doGetDocument(Object obj)
		throws Exception {

		Announcement announcement = (Announcement) obj;
		int commentsCount = 0;
		double ratingsCount = 0;
		if (announcement != null && !announcement.isNew()) {
			commentsCount = MBMessageLocalServiceUtil.getDiscussionMessagesCount(Announcement.class.getName(), announcement.getAnnouncementId(), WorkflowConstants.STATUS_APPROVED);
			RatingsStats ratingsStats = RatingsStatsLocalServiceUtil.getStats(Announcement.class.getName(), announcement.getAnnouncementId());
			ratingsCount = ratingsStats.getAverageScore();
		}

		Document document = getBaseModelDocument(PORTLET_ID, announcement);

		document.addDate(Field.MODIFIED_DATE, announcement.getModifiedDate());
		document.addDate(Field.CREATE_DATE, announcement.getCreateDate());
		document.addLocalizedKeyword(Field.TITLE, announcement.getTitleMap());
		document.addKeyword("announcementId", announcement.getAnnouncementId());
		document.addKeyword("currencyId", announcement.getCurrencyId());
		document.addKeyword("price", announcement.getPrice());
		document.addKeyword("typeId", announcement.getTypeId());
		document.addKeyword("regionId", announcement.getRegionId());
		document.addKeyword("countryId", announcement.getCountryId());

		document.addNumber(Field.COMMENTS, commentsCount);
		document.addNumber(Field.RATINGS, ratingsCount);

		return document;
	}

	@Override
	protected void doReindex(Object obj)
		throws Exception {

		Announcement announcement = (Announcement) obj;
		Document document = getDocument(announcement);

		SearchEngineUtil.updateDocument(getSearchEngineId(), announcement.getCompanyId(), document);
	}

	@Override
	protected void doReindex(String className, long classPK)
		throws Exception {

		Announcement announcement = AnnouncementLocalServiceUtil.getAnnouncement(classPK);

		doReindex(announcement);
	}

	@Override
	protected void doReindex(String[] ids)
		throws Exception {

		long companyId = GetterUtil.getLong(ids[0]);

		reindexEntries(companyId);
	}

	protected void reindexEntries(long companyId)
		throws PortalException, SystemException {

		final Collection<Document> documents = new ArrayList<Document>();

		ActionableDynamicQuery actionableDynamicQuery = new AnnouncementActionableDynamicQuery() {

			@Override
			protected void addCriteria(DynamicQuery dynamicQuery) {

			}

			@Override
			protected void performAction(Object object)
				throws PortalException {

				Announcement artist = (Announcement) object;

				Document document = getDocument(artist);

				documents.add(document);
			}

		};

		actionableDynamicQuery.setCompanyId(companyId);

		actionableDynamicQuery.performActions();

		SearchEngineUtil.updateDocuments(getSearchEngineId(), companyId, documents);
	}

	@Override
	protected String getPortletId(SearchContext searchContext) {

		return PORTLET_ID;
	}

	public Summary doGetSummary(Document document, Locale locale, String snippet, PortletURL portletURL) {

		String title = document.get(locale, Field.TITLE);

		String content = snippet;

		if (Validator.isNull(snippet)) {
			content = document.get(Field.DESCRIPTION);

			if (Validator.isNull(content)) {
				content = StringUtil.shorten(document.get(Field.CONTENT), 200);
			}
		}

		String resourcePrimKey = document.get(Field.ENTRY_CLASS_PK);

		portletURL.setParameter("action", "full_content");
		portletURL.setParameter("resourcePrimKey", resourcePrimKey);

		return new Summary(title, content, null);
	}

	@Override
	public void postProcessSearchQuery(BooleanQuery searchQuery, SearchContext searchContext)
		throws Exception {

		if (searchContext.getAttributes() == null) {
			return;
		}

		addSearchLocalizedTerm(searchQuery, searchContext, Field.TITLE, true);
	}

	@Override
	public void postProcessContextQuery(BooleanQuery contextQuery, SearchContext searchContext)
		throws Exception {

		addStatus(contextQuery, searchContext);

		int announcementId = GetterUtil.getInteger(searchContext.getAttribute("announcementId"));
		long currencyId = GetterUtil.getLong(searchContext.getAttribute("currencyId"));
		long typeId = GetterUtil.getLong(searchContext.getAttribute("typeId"));
		long regionId = GetterUtil.getLong(searchContext.getAttribute("regionId"));
		long countryId = GetterUtil.getLong(searchContext.getAttribute("countryId"));
		
		boolean isUserAnnouncements = GetterUtil.getBoolean(searchContext.getAttribute("isUserAnnouncements"));;

		if (announcementId != 0) {
			contextQuery.addRequiredTerm("announcementId", announcementId);
		}

		if (currencyId != 0) {
			contextQuery.addRequiredTerm("currencyId", currencyId);
		}

		if (typeId != 0) {
			contextQuery.addRequiredTerm("typeId", typeId);
		}
		
		if (regionId != 0) {
			contextQuery.addRequiredTerm("regionId", regionId);
		}
		
		if (countryId != 0) {
			contextQuery.addRequiredTerm("countryId", countryId);
		}
		
		if (isUserAnnouncements) {
			BooleanQuery userIdQuery = BooleanQueryFactoryUtil.create(searchContext);
			userIdQuery.addRequiredTerm(Field.USER_ID, searchContext.getUserId());
			contextQuery.add(userIdQuery, BooleanClauseOccur.MUST);
		}
		
	}

	@Override
	protected void addSearchAssetCategoryIds(BooleanQuery contextQuery, SearchContext searchContext)
		throws Exception {

		addSearchAnyCategories(contextQuery, searchContext);

	}

	@Override
	public String getPortletId() {

		return PORTLET_ID;
	}

	protected void addSearchAnyCategories(BooleanQuery contextQuery, SearchContext searchContext)
		throws Exception {

		long[] anyCategoryIds = searchContext.getAssetCategoryIds();

		if (anyCategoryIds.length == 0) {
			return;
		}

		BooleanQuery categoryIdsQuery = BooleanQueryFactoryUtil.create(searchContext);

		for (long anyCategoryId : anyCategoryIds) {
			if(anyCategoryId > 0) {
				AssetCategory assetCategory = AssetCategoryLocalServiceUtil.fetchAssetCategory(anyCategoryId);

				if (assetCategory == null) {
					continue;
				}

				List<Long> categoryIds = new ArrayList<Long>();

				categoryIds = AssetCategoryLocalServiceUtil.getSubcategoryIds(anyCategoryId);

				if (categoryIds.isEmpty()) {
					categoryIds.add(anyCategoryId);
				}

				for (long categoryId : categoryIds) {
					categoryIdsQuery.addTerm(Field.ASSET_CATEGORY_IDS, categoryId);
				}
				
				searchContext.setAssetCategoryIds(ArrayUtil.toLongArray(categoryIds));
			}
		}

		contextQuery.add(categoryIdsQuery, BooleanClauseOccur.MUST);
	}
}
