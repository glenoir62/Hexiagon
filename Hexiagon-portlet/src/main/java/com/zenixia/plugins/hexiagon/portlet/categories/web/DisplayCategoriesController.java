package com.zenixia.plugins.hexiagon.portlet.categories.web;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetCategoryConstants;
import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.asset.service.AssetCategoryServiceUtil;
import com.liferay.portlet.asset.service.AssetVocabularyServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.zenixia.plugins.hexiagon.model.Announcement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class DisplayCategoriesController
 */
public class DisplayCategoriesController extends MVCPortlet {
 
	/**
	 * DisplayCategoriesController Logger.
	 */
	protected static Log LOGGER = LogFactoryUtil.getLog(DisplayCategoriesController.class);

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		List<AssetVocabulary> vocabularies = new ArrayList<AssetVocabulary>();
		Map<AssetVocabulary, List<AssetCategory>> vocabulariesMap = new HashMap<AssetVocabulary, List<AssetCategory>>();
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long[] categoryIds = ParamUtil.getLongValues(renderRequest, "categoryIds");
		try {

			Group siteGroup = themeDisplay.getSiteGroup();
			long scopeGroupId = themeDisplay.getScopeGroupId();
			vocabularies.addAll(AssetVocabularyServiceUtil.getGroupVocabularies(siteGroup.getGroupId(), false));
			
			if (scopeGroupId != themeDisplay.getCompanyGroupId()) {
				vocabularies.addAll(AssetVocabularyServiceUtil.getGroupVocabularies(themeDisplay.getCompanyGroupId(), false));
			}

			long classNameId = PortalUtil.getClassNameId(Announcement.class);

			// Select announcement vocabularies for announcement only.
			for (AssetVocabulary vocabulary : vocabularies) {
				vocabulary = vocabulary.toEscapedModel();

				int vocabularyCategoriesCount = AssetCategoryServiceUtil.getVocabularyCategoriesCount(vocabulary.getGroupId(), vocabulary.getVocabularyId());

				if (vocabularyCategoriesCount == 0) {
					continue;
				}

				UnicodeProperties settingsProperties = vocabulary.getSettingsProperties();

				long[] selectedClassNameIds = StringUtil.split(settingsProperties.getProperty("selectedClassNameIds"), 0L);

				if ((selectedClassNameIds.length > 0) && (selectedClassNameIds[0] != AssetCategoryConstants.ALL_CLASS_NAME_IDS) && !ArrayUtil.contains(selectedClassNameIds, classNameId)) {
					continue;
				}
				
				List<AssetCategory> assetCategories = AssetCategoryServiceUtil.getVocabularyRootCategories(themeDisplay.getScopeGroupId(), vocabulary.getVocabularyId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
				vocabulariesMap.put(vocabulary, assetCategories);
			}
		}
		catch (SystemException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.error("SystemException: unable to get types or currencies or vocabularies");
		}
		catch (PortalException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.error("SystemException: unable to get types or currencies or vocabularies");
		}
		
		renderRequest.setAttribute("vocabulariesMap", vocabulariesMap);
		renderRequest.setAttribute("categoryIds", StringUtil.merge(categoryIds));

		super.doView(renderRequest, renderResponse);
	}
}
