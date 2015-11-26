package com.gleo.plugins.hexiagon.portlet.announcements.web;

import com.gleo.plugins.hexiagon.constants.AnnouncementConstants;
import com.gleo.plugins.hexiagon.constants.PortletKeys;
import com.gleo.plugins.hexiagon.model.Announcement;
import com.gleo.plugins.hexiagon.model.AnnouncementImage;
import com.gleo.plugins.hexiagon.model.Currency;
import com.gleo.plugins.hexiagon.model.Type;
import com.gleo.plugins.hexiagon.portlet.announcements.asset.AnnouncementAssetRendererFactory;
import com.gleo.plugins.hexiagon.service.AnnouncementImageLocalServiceUtil;
import com.gleo.plugins.hexiagon.service.AnnouncementLocalServiceUtil;
import com.gleo.plugins.hexiagon.service.AnnouncementServiceUtil;
import com.gleo.plugins.hexiagon.service.CurrencyLocalServiceUtil;
import com.gleo.plugins.hexiagon.service.TypeLocalServiceUtil;
import com.gleo.plugins.hexiagon.util.AnnouncementImageUtil;
import com.gleo.plugins.hexiagon.util.PortalUtil;
import com.gleo.plugins.hexiagon.validator.AnnouncementValidator;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.FileItem;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnicodeFormatter;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Country;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.LayoutConstants;
import com.liferay.portal.service.CountryServiceUtil;
import com.liferay.portal.service.PortletPreferencesLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.asset.AssetCategoryException;
import com.liferay.portlet.asset.AssetRendererFactoryRegistryUtil;
import com.liferay.portlet.asset.model.AssetCategoryConstants;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.AssetRendererFactory;
import com.liferay.portlet.asset.model.AssetVocabulary;
import com.liferay.portlet.asset.service.AssetCategoryServiceUtil;
import com.liferay.portlet.asset.service.AssetVocabularyServiceUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class AddAnnouncementController
 */
public class AddAnnouncementController extends MVCPortlet {

	protected static Log LOGGER = LogFactoryUtil.getLog(AddAnnouncementController.class);
	
	private static final String AGREEMENT_FILE_ENTRYID = "agreementFileEntryId";
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Locale locale = themeDisplay.getLocale();
		
		Announcement announcement = null;
		List<Type> types = null;
		Map<Integer, AnnouncementImage> announcementImages = null;
		List<AnnouncementImage> announcementImagesList = null;
		List<Currency> currencies = null;
		List<Long> vocabularyIds = new ArrayList<Long>();
		long countryId = 0l;
		long regionId = 0l;

		long announcementId = ParamUtil.getLong(renderRequest, "announcementId");
		String redirect = ParamUtil.getString(renderRequest, "redirect");
		
		String content = UnicodeFormatter.toString(ParamUtil.getString(renderRequest, "editor"));
		
		PortletPreferences preferences;
		long agreementFileEntryId = 0;
		
		try {
			long plid = LayoutConstants.DEFAULT_PLID;
			
			try {
				 plid = PortalUtil.getPlidFromPortletId(
					themeDisplay.getScopeGroupId(), PortletKeys.ADD_ANNOUNCEMENT_PORTLETID);
			}
			catch (PortalException e) {
				if (LOGGER.isDebugEnabled()){
					LOGGER.debug(e);
				}
				LOGGER.info("PortalException: unable to get plid for ADD_ANNOUNCEMENT_PORTLETID");
			}
			catch (SystemException se) {
				if (LOGGER.isDebugEnabled()){
					LOGGER.debug(se);
				}
				LOGGER.info("SystemException: unable to get plid for ADD_ANNOUNCEMENT_PORTLETID");
			}
			
			preferences = PortletPreferencesLocalServiceUtil.getPreferences(themeDisplay.getCompanyId(), PortletKeys.PREFS_OWNER_ID_DEFAULT, PortletKeys.PREFS_OWNER_TYPE_LAYOUT, plid, PortletKeys.ADD_ANNOUNCEMENT_PORTLETID);
			
			// preferences = renderRequest.getPreferences();
			agreementFileEntryId = GetterUtil.getLong(preferences.getValue(AGREEMENT_FILE_ENTRYID, StringPool.BLANK));
			
			Country country = CountryServiceUtil.getCountryByA3(themeDisplay.getLocale().getISO3Country());
			
			if (Validator.isNotNull(country)) {
				countryId = country.getCountryId();
			}
		}
		catch (SystemException se) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(se);
			}
			LOGGER.error("PortalException: unable to get preferences " + se.getMessage());
		}
		catch (PortalException pe) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(pe);
			}
			LOGGER.error("PortalException: unable to get preferences " + pe.getMessage());
		}

		// add case
		String title = "new-announcement";
		
		// get announcement and images
		if (announcementId > 0) {
			try {
				announcement = AnnouncementLocalServiceUtil.getAnnouncement(announcementId);
				title = announcement.getTitle(locale);
				content = UnicodeFormatter.toString(announcement.getContent(locale));
				announcementImagesList = announcement.getImages();
				countryId = announcement.getCountryId();
				regionId = announcement.getRegionId();

				if (Validator.isNotNull(announcementImagesList)) {
					announcementImages = new HashMap<Integer, AnnouncementImage>();
					for (AnnouncementImage announcementImage : announcementImagesList) {
						announcementImages.put(announcementImage.getOrder(), announcementImage);
					}
				}
			}
			catch (PortalException e) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(e);
				}
				LOGGER.error("PortalException: unable to get announcement " + announcementId);
			}
			catch (SystemException e) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(e);
				}
				LOGGER.error("SystemException: unable to get announcement " + announcementId);
			}

		}

		// get types and currencies
		try {
			// types = TypeServiceUtil.getTypesByGroupId(themeDisplay.getScopeGroupId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			types = TypeLocalServiceUtil.getTypes(themeDisplay.getScopeGroupId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
			for (Type type : types) {
				String name = type.getName(locale);
				type.setName(HtmlUtil.escape(name), locale);
			}

			currencies = CurrencyLocalServiceUtil.getCurrencies(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			List<AssetVocabulary> vocabularies = new ArrayList<AssetVocabulary>();

			Group siteGroup = themeDisplay.getSiteGroup();
			long scopeGroupId = themeDisplay.getScopeGroupId();

			vocabularies.addAll(AssetVocabularyServiceUtil.getGroupVocabularies(siteGroup.getGroupId(), false));

			if (scopeGroupId != themeDisplay.getCompanyGroupId()) {
				vocabularies.addAll(AssetVocabularyServiceUtil.getGroupVocabularies(themeDisplay.getCompanyGroupId(), false));

			}
			long classNameId = PortalUtil.getClassNameId(Announcement.class);

			// Select announcement vocabularies
			for (AssetVocabulary vocabulary : vocabularies) {
				vocabulary = vocabulary.toEscapedModel();

				int vocabularyCategoriesCount = AssetCategoryServiceUtil.getVocabularyCategoriesCount(vocabulary.getGroupId(), vocabulary.getVocabularyId());

				if (vocabularyCategoriesCount == 0) {
					continue;
				}

				UnicodeProperties settingsProperties = vocabulary.getSettingsProperties();

				long[] selectedClassNameIds = StringUtil.split(settingsProperties.getProperty("selectedClassNameIds"), 0L);
				long[] requiredClassNameIds = StringUtil.split(settingsProperties.getProperty("requiredClassNameIds"), 0L);

				if ((selectedClassNameIds.length > 0) && (selectedClassNameIds[0] != AssetCategoryConstants.ALL_CLASS_NAME_IDS) && !ArrayUtil.contains(selectedClassNameIds, classNameId)) {
					continue;
				}
				else if (ArrayUtil.contains(requiredClassNameIds, classNameId)) {
					vocabularyIds.add(vocabulary.getVocabularyId());
				}

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

		//preview
		renderRequest.setAttribute("previewFileURL", AnnouncementImageUtil.getImageURL(themeDisplay, agreementFileEntryId));

		renderRequest.setAttribute("redirect", redirect);
		renderRequest.setAttribute("title", title);
		renderRequest.setAttribute("model", Announcement.class);
		renderRequest.setAttribute("imageModel", AnnouncementImage.class);
		renderRequest.setAttribute("imageBean", AnnouncementConstants.ANNOUNCEMENT_IMAGE);
		renderRequest.setAttribute("maxPrice", AnnouncementConstants.MAX_PRICE);
		renderRequest.setAttribute("types", types);
		renderRequest.setAttribute("currencies", currencies);
		renderRequest.setAttribute("announcement", announcement);
		renderRequest.setAttribute("content", content);
		renderRequest.setAttribute("announcementImages", announcementImages);
		renderRequest.setAttribute("imageLimit", AnnouncementConstants.IMAGE_LIMIT);
		renderRequest.setAttribute("vocabularyIds", vocabularyIds);

		renderRequest.setAttribute("fileSizeRule", AnnouncementConstants.IMAGE_MAX_SIZE);
		renderRequest.setAttribute("acceptFiles", AnnouncementConstants.IMAGE_EXTENSIONS);
		
		renderRequest.setAttribute("countryId", countryId);
		renderRequest.setAttribute("regionId", regionId);
		
		renderRequest.setAttribute("actionName", announcement != null ? "updateAnnouncement" : "addAnnouncement");

		super.doView(renderRequest, renderResponse);
	}
	
	/**
	 * Adds a new Announcement to the database
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 */
	public void addAnnouncement(ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
		ThemeDisplay themeDisplay = (ThemeDisplay) uploadPortletRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Announcement announcement;
		try {
			announcement = announcementFromRequest(uploadPortletRequest, themeDisplay);
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Announcement.class.getName(), uploadPortletRequest);

			ArrayList<String> errors = new ArrayList<String>();

			if (AnnouncementValidator.validateAnnouncement(announcement, errors, themeDisplay.getLocale())) {
				announcement = AnnouncementServiceUtil.addAnnouncement(announcement, serviceContext);
			
				// Redirect	
				AssetRendererFactory assetRendererFactory = AssetRendererFactoryRegistryUtil.getAssetRendererFactoryByClassName(AnnouncementAssetRendererFactory.CLASS_NAME);
				AssetRenderer assetRenderer = assetRendererFactory.getAssetRenderer(announcement.getAnnouncementId());
				
				String redirect = assetRenderer.getURLViewInContext(PortalUtil.getLiferayPortletRequest(actionRequest),PortalUtil.getLiferayPortletResponse(actionResponse), StringPool.BLANK);
				
				if(!Validator.isBlank(redirect))
					actionRequest.setAttribute(WebKeys.REDIRECT, redirect);
			}
			else {
				for (String error : errors) {
					SessionErrors.add(actionRequest, error);
				}
				
				PortalUtil.copyRequestParameters(uploadPortletRequest, actionResponse);
			}
		}
		catch (IOException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.error("IOException: unable to get announcement from request");
			SessionErrors.add(actionRequest, IOException.class);
			PortalUtil.copyRequestParameters(uploadPortletRequest, actionResponse);
		}
		catch (AssetCategoryException ace) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(ace);
			}
			LOGGER.error("AssetCategoryException: impossible to validate categories from request");
			SessionErrors.add(actionRequest, AssetCategoryException.class);
			PortalUtil.copyRequestParameters(uploadPortletRequest, actionResponse);
		}
		catch (PortalException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.error("PortalException: unable to get add announcement from request");
			SessionErrors.add(actionRequest, PortalException.class);
			PortalUtil.copyRequestParameters(uploadPortletRequest, actionResponse);
		}
		catch (SystemException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.error("SystemException: unable to get add announcement from request");
			SessionErrors.add(actionRequest, SystemException.class);
			PortalUtil.copyRequestParameters(uploadPortletRequest, actionResponse);
		}
	}
	
	/**
	 * Updates the database record of an existing Announcement.
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws Exception
	 */
	public void updateAnnouncement(ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		Announcement announcement = announcementFromRequest(uploadPortletRequest, themeDisplay);
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Announcement.class.getName(), uploadPortletRequest);
		ArrayList<String> errors = new ArrayList<String>();

		if (AnnouncementValidator.validateAnnouncement(announcement, errors, themeDisplay.getLocale())) {
			AnnouncementServiceUtil.updateAnnouncement(announcement, serviceContext);
			
			// Redirect	
			AssetRendererFactory assetRendererFactory = AssetRendererFactoryRegistryUtil.getAssetRendererFactoryByClassName(AnnouncementAssetRendererFactory.CLASS_NAME);
			AssetRenderer assetRenderer = assetRendererFactory.getAssetRenderer(announcement.getAnnouncementId());
			
			String redirect = assetRenderer.getURLViewInContext(PortalUtil.getLiferayPortletRequest(actionRequest),PortalUtil.getLiferayPortletResponse(actionResponse), StringPool.BLANK);
			
			if(!Validator.isBlank(redirect))
				actionResponse.sendRedirect(redirect);
		}
		else {
			for (String error : errors) {
				SessionErrors.add(actionRequest, error);
			}
			
			PortalUtil.copyRequestParameters(uploadPortletRequest, actionResponse);
		}
	}
	
	/**
	 * Convenience method to create a Announcement object out of the request.
	 * Used by the Add / Edit methods.
	 * 
	 * @throws SystemException
	 * @throws PortalException
	 */
	private Announcement announcementFromRequest(UploadPortletRequest uploadPortletRequest, ThemeDisplay themeDisplay)
		throws IOException, PortalException, SystemException {

		Announcement announcement = null;

		long announcementId = ParamUtil.getLong(uploadPortletRequest, "announcementId");
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();
		
		long countryId = ParamUtil.getLong(uploadPortletRequest, "countryId");
		long regionId = ParamUtil.getLong(uploadPortletRequest, "regionId");

		if (Validator.isNotNull(announcementId)) {
			announcement = AnnouncementLocalServiceUtil.getAnnouncement(announcementId);
		}
		else {
			announcement = AnnouncementLocalServiceUtil.createAnnouncement(announcementId);
		}

		Map<String, FileItem[]> multipartParameterMap = uploadPortletRequest.getMultipartParameterMap();
		List<AnnouncementImage> announcementImages = new ArrayList<AnnouncementImage>();

		String imagePrefix = "image";

		// images
		for (int i = 1; i <= AnnouncementConstants.IMAGE_LIMIT; i++) {
			boolean isImageDisabled = ParamUtil.getBoolean(uploadPortletRequest, "imageDisabled" + i);
			String imageName = imagePrefix + i;

			if (multipartParameterMap.keySet().contains(imageName) || isImageDisabled) {
				InputStream inputStream = uploadPortletRequest.getFileAsStream(imageName);

				AnnouncementImage image = null;
				long announcementImageId = ParamUtil.getLong(uploadPortletRequest, "announcementImageId" + i);

				if (Validator.isNotNull(announcementImageId)) {
					image = AnnouncementImageLocalServiceUtil.getAnnouncementImage(announcementImageId);
				}
				else {
					image = AnnouncementImageLocalServiceUtil.createAnnouncementImage(announcementImageId);
				}

				image.setDescriptionMap(LocalizationUtil.getLocalizationMap(uploadPortletRequest, "description" + i));
				image.setAnnouncementId(announcementId);

				// resize Image
				if (Validator.isNotNull(inputStream)) {
					image.setInputStream(AnnouncementImageUtil.resizeImages(inputStream));
				}
				image.setOrder(i);
				image.setGroupId(groupId);
				image.setCompanyId(companyId);
				image.setUserId(userId);
				image.setActive(!isImageDisabled);
				announcementImages.add(image);
			}
		}

		announcement.setValidAgreement(ParamUtil.getBoolean(uploadPortletRequest, "agreement"));
		announcement.setAnnouncementImages(announcementImages);
		announcement.setAnnouncementId(announcementId);
		announcement.setTitleMap(LocalizationUtil.getLocalizationMap(uploadPortletRequest, "title"));
		String content = ParamUtil.getString(uploadPortletRequest, "editor");
		announcement.setContent(content, themeDisplay.getLocale());
		announcement.setTypeId(ParamUtil.getLong(uploadPortletRequest, "typeId"));
		announcement.setPrice(ParamUtil.getLong(uploadPortletRequest, "price"));
		announcement.setCurrencyId(ParamUtil.getLong(uploadPortletRequest, "currencyId"));

		announcement.setEmailAddress(ParamUtil.getString(uploadPortletRequest, "emailAddress"));
		announcement.setPhoneNumber(ParamUtil.getString(uploadPortletRequest, "phoneNumber"));
		announcement.setCompanyId(companyId);
		announcement.setGroupId(groupId);
		announcement.setUserId(userId);
		announcement.setRegionId(regionId);
		announcement.setCountryId(countryId);

		return announcement;
	}
	
	/**
	 * Deletes a Announcement from the database.
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void deleteAnnouncement(ActionRequest request, ActionResponse response)
		throws Exception {

		long announcementId = ParamUtil.getLong(request, "announcementId");

		try {
			if (Validator.isNotNull(announcementId)) {
				AnnouncementServiceUtil.deleteAnnouncement(announcementId);
				SessionMessages.add(request, "announcement-deleted");
				String redirect = ParamUtil.getString(request, "redirect");
				
				if(!Validator.isBlank(redirect)) {
					response.sendRedirect(redirect);
				} 
			}
			else {
				SessionErrors.add(request, "announcement-errors");
			}
		}
		catch (PortalException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.error(e.getMessage());
			SessionErrors.add(request, "permission-error");
		}
		catch (SystemException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.error(e.getMessage());
			SessionErrors.add(request, "permission-error");
		}
	}


	/**
	 * Save Agreement
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void saveAgreement(ActionRequest actionRequest, ActionResponse actionResponse)
		throws IOException, PortletException {

		long fileEntryId = ParamUtil.getLong(actionRequest,"fileEntryId");
		
		PortletPreferences portletPreferences = actionRequest.getPreferences();
		
		portletPreferences.setValue(AGREEMENT_FILE_ENTRYID, String.valueOf(fileEntryId));
		portletPreferences.store();
	}

	@Override
	public void doEdit(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		PortletPreferences portletPreferences = renderRequest.getPreferences();
		long agreementFileEntryId = GetterUtil.getLong(portletPreferences.getValue(AGREEMENT_FILE_ENTRYID, StringPool.BLANK));
		String title = StringPool.BLANK;
		
		// Get agreement title	
		try {
			if(agreementFileEntryId > 0) {
				DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil.getDLFileEntry(agreementFileEntryId);
				
				if (dlFileEntry != null) {
					title = dlFileEntry.getTitle();
				}
			}
		}
		catch (PortalException pe) {
			LOGGER.error(pe);
		}
		catch (SystemException se) {
			LOGGER.error(se);
		}
		
		renderRequest.setAttribute("fileEntryId", agreementFileEntryId);
		renderRequest.setAttribute("title", title);
		
		super.doEdit(renderRequest, renderResponse);
	}
	
}
