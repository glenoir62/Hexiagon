package com.gleo.plugins.hexiagon.portlet.categories.web;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.FileItem;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.asset.DuplicateVocabularyException;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetCategoryPropertyLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetVocabularyLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class CategoriesImporterController
 */
public class CategoriesImporterController extends MVCPortlet {

	/**
	 * AssetCategoriesImporter Logger.
	 */
	protected static Log LOGGER = LogFactoryUtil.getLog(CategoriesImporterController.class);

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		LOGGER.info("do view  AssetCategoriesImporter");
		super.doView(renderRequest, renderResponse);
	}

	public void loadCategoriesFromCsv(ActionRequest actionRequest, ActionResponse actionResponse)
		throws IOException, PortletException, PortalException, SystemException {

		LOGGER.info("Begin  AssetCategoriesImporter");
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		ThemeDisplay themeDisplay = (ThemeDisplay) uploadPortletRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Map<String, FileItem[]> multipartParameterMap = uploadPortletRequest.getMultipartParameterMap();

		
		File file = null;
		BufferedReader bufferedReader = null;
		AssetVocabulary assetVocabulary = null;
		long userId = themeDisplay.getUserId();
		long groupId = themeDisplay.getScopeGroupId();

		ServiceContext serviceContext = ServiceContextFactory.getInstance(AssetCategory.class.getName(), uploadPortletRequest);
		
		// create vocabulary
		try {
			
			assetVocabulary = AssetVocabularyLocalServiceUtil.addVocabulary(userId, "Announcements", ServiceContextFactory.getInstance(AssetVocabulary.class.getName(), uploadPortletRequest));
		}
		catch (DuplicateVocabularyException dve) {
			try {
				assetVocabulary = AssetVocabularyLocalServiceUtil.getGroupVocabulary(groupId, "Announcements");
			}
			catch (PortalException e) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(e);
				}
				LOGGER.error(e.getMessage());
			}
			catch (SystemException e) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(e);
				}
				LOGGER.error(e.getMessage());
			}
		}

		if (multipartParameterMap.keySet().contains("fileCategory") && Validator.isNotNull(assetVocabulary)) {
			try {
				file = uploadPortletRequest.getFile("fileCategory");
				bufferedReader = new BufferedReader(new FileReader(file.getAbsolutePath()));
				String line = StringPool.BLANK;
				long vocabularyId = assetVocabulary.getVocabularyId();

				String parentCategoryName = StringPool.BLANK;
				AssetCategory parentCategory = null;
				
				while ((line = bufferedReader.readLine()) != null) {
					
					// use comma as separator
					String[] categories = line.split(StringPool.SEMICOLON);
					
					if (categories.length == 4) {
						String parentCategoryCode = categories[0];
						
						if (Validator.isNull(parentCategory) || !parentCategoryName.equals(categories[1])) {
							parentCategoryName = categories[1];
							try {
								parentCategory = AssetCategoryLocalServiceUtil.addCategory(userId, parentCategoryName, vocabularyId, serviceContext);
								AssetCategoryPropertyLocalServiceUtil.addCategoryProperty(userId, parentCategory.getCategoryId(), "Code", parentCategoryCode);
							}
							catch (Exception e) {
								if (LOGGER.isDebugEnabled()) {
									LOGGER.debug(e);
								}
								LOGGER.error(e.getMessage());
							}
						}
	
						Map<Locale, String> titles = new HashMap<Locale, String>();
						Map<Locale, String> descriptionMap = new HashMap<Locale, String>();
	
						titles.put(LocaleUtil.fromLanguageId("fr_FR"), categories[3]);
						titles.put(LocaleUtil.fromLanguageId("en_US"), categories[3]);
	
						try {
							AssetCategory child = AssetCategoryLocalServiceUtil.addCategory(userId, parentCategory.getCategoryId(), titles, descriptionMap, vocabularyId, null, serviceContext);
							AssetCategoryPropertyLocalServiceUtil.addCategoryProperty(userId, child.getCategoryId(), "Code", categories[2]);
						}
						catch (Exception e) {
							if (LOGGER.isDebugEnabled()) {
								LOGGER.debug(e);
							}
							LOGGER.error(e.getMessage());
						}
					}
				}
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				if (bufferedReader != null) {
					try {
						bufferedReader.close();
					}
					catch (IOException e) {
						if (LOGGER.isDebugEnabled()) {
							LOGGER.debug(e);
						}
						LOGGER.error(e.getMessage());
					}
				}
			}
		}
		LOGGER.info("End  AssetCategoriesImporter");
	}
 

}
