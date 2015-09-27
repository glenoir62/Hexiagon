
package com.zenixia.plugins.hexiagon.portlet.search.web;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.QueryConfig;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchContextFactory;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.SearchResult;
import com.liferay.portal.kernel.search.SearchResultUtil;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.LayoutConstants;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.zenixia.plugins.hexiagon.constants.AnnouncementConstants;
import com.zenixia.plugins.hexiagon.constants.AnnouncementFilterEnum;
import com.zenixia.plugins.hexiagon.constants.PortletKeys;
import com.zenixia.plugins.hexiagon.model.Announcement;
import com.zenixia.plugins.hexiagon.model.Currency;
import com.zenixia.plugins.hexiagon.model.Type;
import com.zenixia.plugins.hexiagon.permission.HexiagonPermission;
import com.zenixia.plugins.hexiagon.service.AnnouncementLocalServiceUtil;
import com.zenixia.plugins.hexiagon.service.CurrencyLocalServiceUtil;
import com.zenixia.plugins.hexiagon.service.FavoriteLocalServiceUtil;
import com.zenixia.plugins.hexiagon.service.TypeServiceUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

/**
 * Portlet implementation class AnnoucementSearchController
 */
public class AnnoucementSearchController extends MVCPortlet {

	/**
	 * AnnoucementSearchController Logger.
	 */
	protected static Log LOGGER = LogFactoryUtil.getLog(AnnoucementSearchController.class);

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		List<Type> types = null;
		List<Currency> currencies = null;

		boolean hasAddRight = false;

		long plid = LayoutConstants.DEFAULT_PLID;

		try {
			plid = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(), PortletKeys.ADD_ANNOUNCEMENT_PORTLETID);
		}
		catch (PortalException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.info("PortalException: unable to get plid for ANNOUNCEMENT_DISPLAY_PORTLETID");
		}
		catch (SystemException se) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(se);
			}
			LOGGER.info("SystemException: unable to get plid for ANNOUNCEMENT_DISPLAY_PORTLETID");
		}

		try {
			types = TypeServiceUtil.getTypesByGroupId(themeDisplay.getScopeGroupId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		}
		catch (SystemException se) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(se);
			}
			LOGGER.error("SystemException : impossible to get types");
		}
		
		try {
			currencies = CurrencyLocalServiceUtil.getCurrencies(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		}
		catch (SystemException se) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(se);
			}
			LOGGER.error("SystemException : impossible to get currencies");
		}
		
		hasAddRight = HexiagonPermission.contains(themeDisplay.getPermissionChecker(), themeDisplay.getScopeGroupId(), "ADD_ANNOUNCEMENT");

		renderRequest.setAttribute("types", types);
		renderRequest.setAttribute("currencies", currencies);
		renderRequest.setAttribute("hasAddRight", hasAddRight);
		renderRequest.setAttribute("filterEnum", AnnouncementFilterEnum.values());
		renderRequest.setAttribute("addAnnouncementPlid", plid);

		doSearch(renderRequest, renderResponse.createRenderURL());

		super.doView(renderRequest, renderResponse);
	}

	/**
	 * Search
	 * 
	 * @param resourceRequest
	 * @param resourceResponse
	 * @return
	 * @throws IOException
	 * @throws PortletException
	 */
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws IOException, PortletException {

		doSearch(resourceRequest, resourceResponse.createRenderURL());

		resourceResponse.setContentType("text/html; charset=UTF-8");
		super.serveResource(resourceRequest, resourceResponse);
	}

	/**
	 * @param portletRequest
	 * @param hitURL
	 */
	public static void doSearch(PortletRequest portletRequest, PortletURL hitURL) {

		long[] categoryIds = ParamUtil.getLongValues(portletRequest, "categoryIds");

		long typeId = ParamUtil.getLong(portletRequest, "typeId");
		long currencyId = ParamUtil.getLong(portletRequest, "currencyId");
		long countryId = ParamUtil.getLong(portletRequest, "countryId");
		long regionId = ParamUtil.getLong(portletRequest, "regionId");

		ThemeDisplay themeDisplay = (ThemeDisplay) portletRequest.getAttribute(WebKeys.THEME_DISPLAY);

		int filter = ParamUtil.getInteger(portletRequest, "filterId");
		Indexer indexer = IndexerRegistryUtil.getIndexer(Announcement.class);
		PortletPreferences preferences = portletRequest.getPreferences();
		List<Announcement> announcements = null;
		ArrayList<String> categoryList = null;
		long userId = themeDisplay.getUserId();
		long groupId = themeDisplay.getScopeGroupId();

		// Pagination
		int delta = GetterUtil.getInteger(preferences.getValue("delta", String.valueOf(AnnouncementConstants.DELDA_SEARCH)));
		int page = ParamUtil.getInteger(portletRequest, "page");

		int start = delta * page;
		int end = start + delta;
		int total = 0;

		boolean isUserAnnouncements = GetterUtil.getBoolean(preferences.getValue("isUserAnnouncements", "false"));

		boolean isFavoriteUserAnnouncements = GetterUtil.getBoolean(preferences.getValue("isFavoriteUserAnnouncements", "false"));

		
		// Get favorite user announcements
		if(isFavoriteUserAnnouncements && themeDisplay.isSignedIn()) {
			try {
				total = FavoriteLocalServiceUtil.countUserFavoriteAnnouncement(userId, groupId);
				announcements =  AnnouncementLocalServiceUtil.getFavoritesAnnouncementsByGroupIUserId(groupId, userId, start, end);
			}
			catch (SystemException se) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(se);
				}
				LOGGER.error("SystemException : impossible to get favorite announcements for user " +  userId);
			}
			catch (PortalException pe) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(pe);
				}
				LOGGER.error("PortalException : impossible to get favorite announcements for user " +  userId);
			}
		} else {
			SearchContext searchContext = SearchContextFactory.getInstance(PortalUtil.getHttpServletRequest(portletRequest));

			searchContext.setAndSearch(true);

			if (Validator.isNotNull(typeId)) {
				searchContext.setAttribute("typeId", typeId);
			}
			if (Validator.isNotNull(currencyId)) {
				searchContext.setAttribute("currencyId", currencyId);
			}

			searchContext.setAttribute("isUserAnnouncements", isUserAnnouncements);
			
			if (Validator.isNotNull(countryId)) {
				searchContext.setAttribute("countryId", countryId);
			}
			if (Validator.isNotNull(regionId)) {
				searchContext.setAttribute("regionId", regionId);
			}
			if (categoryIds != null && categoryIds.length > 0) {
				searchContext.setAssetCategoryIds(categoryIds);
			}

			searchContext.setIncludeAttachments(false);
			searchContext.setIncludeDiscussions(false);

			QueryConfig queryConfig = new QueryConfig();

			queryConfig.setHighlightEnabled(true);

			searchContext.setQueryConfig(queryConfig);
			searchContext.setStart(start);
			searchContext.setEnd(end);

			// Sort
			Sort sort = new Sort();

			// Filter
			AnnouncementFilterEnum filterEnum = AnnouncementFilterEnum.UPDATEDATE;

			if (filter > 0) {
				AnnouncementFilterEnum[] announcementFilterEnumTab = AnnouncementFilterEnum.values();
				for (int i = 0; i < announcementFilterEnumTab.length; i++) {
					AnnouncementFilterEnum filterEnumTab = announcementFilterEnumTab[i];
					if (filterEnumTab.getFieldId() == filter) {
						filterEnum = filterEnumTab;
						i = announcementFilterEnumTab.length;
					}
				}
			}

			sort.setFieldName(filterEnum.getField());
			sort.setReverse(filterEnum.isAsc());
			sort.setType(filterEnum.getType());

			searchContext.setSorts(sort);

			Hits hits = null;
			try {
				hits = indexer.search(searchContext);
				
				List<SearchResult> searchResultsList = SearchResultUtil.getSearchResults(hits, themeDisplay.getLocale(), hitURL);
				if (searchResultsList.size() > 0) {
					total = hits.getLength();
					announcements = new ArrayList<Announcement>();
					for (SearchResult searchResult : searchResultsList) {
						Announcement announcement = null;
						try {
							announcement = AnnouncementLocalServiceUtil.getAnnouncement(searchResult.getClassPK());
							announcements.add(announcement);
						}
						catch (PortalException e) {
							if (LOGGER.isDebugEnabled()) {
								LOGGER.debug(e);
							}
							LOGGER.error("PortalException : impossible to get announcement " + searchResult.getClassPK());
						}
						catch (SystemException e) {
							if (LOGGER.isDebugEnabled()) {
								LOGGER.debug(e);
							}
							LOGGER.error("SystemException : impossible to get announcement" + searchResult.getClassPK());
						}
					}
				}

			}
			catch (SearchException e) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(e);
				}
				LOGGER.error("SearchException : impossible to search announcements");
			}

			if (Validator.isNotNull(categoryIds.length)) {
				categoryList = new ArrayList<String>(categoryIds.length);

				for (long parentCategoryId : categoryIds) {
					if (parentCategoryId != 0) {
						try {
							AssetCategory assetCategory = AssetCategoryLocalServiceUtil.getAssetCategory(parentCategoryId);
							categoryList.add(assetCategory.getTitle(themeDisplay.getLocale()));
						}
						catch (PortalException e) {
							if (LOGGER.isDebugEnabled()) {
								LOGGER.debug(e);
							}
							LOGGER.error("PortalException : impossible to get category " + parentCategoryId);
						}
						catch (SystemException e) {
							if (LOGGER.isDebugEnabled()) {
								LOGGER.debug(e);
							}
							LOGGER.error("SystemException : impossible to get category" + parentCategoryId);
						}
					}
				}
			}
		}

		portletRequest.setAttribute("parentCategoryList", categoryList);
		portletRequest.setAttribute("announcements", announcements);
		portletRequest.setAttribute("categoryIds", StringUtil.merge(categoryIds));
		portletRequest.setAttribute("typeId", typeId);
		portletRequest.setAttribute("currencyId", currencyId);
		portletRequest.setAttribute("end", end);
		portletRequest.setAttribute("total", total);
		portletRequest.setAttribute("page", page);
		portletRequest.setAttribute("delda", delta);
		portletRequest.setAttribute("filterId", filter);
		portletRequest.setAttribute("typeId", typeId);
		portletRequest.setAttribute("countryId", countryId);
		portletRequest.setAttribute("regionId", regionId);
	}

	/**
	 * Do edit
	 * 
	 * @param renderRequest
	 * @param renderResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	@Override
	public void doEdit(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		PortletPreferences preferences = renderRequest.getPreferences();

		String vocabularyIdPref = GetterUtil.getString(preferences.getValue("vocabularyIdPref", StringPool.BLANK));
		int delta = GetterUtil.getInteger(preferences.getValue("delta", String.valueOf(AnnouncementConstants.DELDA_SEARCH)));
		boolean isUserAnnouncements = GetterUtil.getBoolean(preferences.getValue("isUserAnnouncements", "false"));
		boolean isFavoriteUserAnnouncements = GetterUtil.getBoolean(preferences.getValue("isFavoriteUserAnnouncements", "false"));
		
		
		renderRequest.setAttribute("vocabularyIdPref", vocabularyIdPref);
		renderRequest.setAttribute("isUserAnnouncements", isUserAnnouncements);
		renderRequest.setAttribute("isFavoriteUserAnnouncements", isFavoriteUserAnnouncements);


		renderRequest.setAttribute("delta", delta);
		super.doEdit(renderRequest, renderResponse);
	}

	/**
	 * Sets the preferences for how many announcements can be viewed per page,
	 * is user announcements, and the vocabulary to show (panels)
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 * @throws SystemException
	 * @throws PortalException
	 */
	public void saveVocabularyPreferences(ActionRequest actionRequest, ActionResponse actionResponse)
		throws IOException, PortletException, SystemException, PortalException {

		int delta = ParamUtil.getInteger(actionRequest, "delta");
		boolean isUserAnnouncements = ParamUtil.getBoolean(actionRequest, "isUserAnnouncements");
		boolean isFavoriteUserAnnouncements = ParamUtil.getBoolean(actionRequest, "isFavoriteUserAnnouncements");
		PortletPreferences preferences = actionRequest.getPreferences();
		
		// delta search
		preferences.setValue("delta", String.valueOf(delta));
		// display user's announcements
		preferences.setValue("isUserAnnouncements", String.valueOf(isUserAnnouncements));
		preferences.setValue("isFavoriteUserAnnouncements", String.valueOf(isFavoriteUserAnnouncements));

		SessionMessages.add(actionRequest, "your-request-completed-successfully");

		preferences.store();
	}

}
