package com.zenixia.plugins.hexiagon.portlet.types.web;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.zenixia.plugins.hexiagon.model.Type;
import com.zenixia.plugins.hexiagon.permission.HexiagonPermission;
import com.zenixia.plugins.hexiagon.service.TypeLocalServiceUtil;
import com.zenixia.plugins.hexiagon.service.TypeServiceUtil;
import com.zenixia.plugins.hexiagon.validator.TypeValidator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

/**
 * Portlet implementation class TypesController
 */
public class TypesController extends MVCPortlet {
 
	/**
	 * TypeController Logger.
	 */
	protected static Log LOGGER = LogFactoryUtil.getLog(TypesController.class);

	/**
	 * Empty Results Message
	 */
	private String emptyResultsMessage = "type-empty-results-message";

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		PortletURL iteratorURL = renderResponse.createRenderURL();
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		int delta = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_DELTA_PARAM, SearchContainer.DEFAULT_DELTA);
		int cur = ParamUtil.getInteger(renderRequest, "curTypes", SearchContainer.DEFAULT_CUR);
		
		long groupId = themeDisplay.getScopeGroupId();

		// create search container
		SearchContainer<Type> searchTypeContainer = new SearchContainer<Type>(renderRequest, null, null, "curTypes", cur, delta, iteratorURL, null, emptyResultsMessage);

		int start = searchTypeContainer.getStart();
		int end = searchTypeContainer.getEnd();

		try {
			List<Type> types = TypeLocalServiceUtil.getTypes(groupId, start, end);
			int total = TypeLocalServiceUtil.getTypesCount(groupId);
			searchTypeContainer.setTotal(total);
			searchTypeContainer.setResults(types);
		}
		catch (SystemException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.error("SystemException : impossible to get searchTypeContainer");
		}
		
		renderRequest.setAttribute("searchTypeContainer", searchTypeContainer);
		
		super.doView(renderRequest, renderResponse);
	}


	/**
	 * Add Type
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws Exception
	 */
	public void addType(ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		Type type = typeFromRequest(actionRequest);
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Type.class.getName(), actionRequest);
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		try {
			ArrayList<String> errors = new ArrayList<String>();

			if (TypeValidator.validateType(type, errors, themeDisplay.getLocale())) {
				TypeServiceUtil.addType(type, serviceContext);
				SessionMessages.add(actionRequest, "type-added");
			}
			else {
				for (String error : errors) {
					SessionErrors.add(actionRequest, error);
				}

				PortalUtil.copyRequestParameters(actionRequest, actionResponse);
				actionResponse.setRenderParameter("jspPage", "/jsp/types/edit.jsp");
			}
		}
		catch (SystemException se) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(se);
			}
			LOGGER.error("SystemException : impossible to add type");

		}
	}
	
	/**
	 * Update type
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws Exception
	 */
	public void updateType(ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		Type type = typeFromRequest(actionRequest);
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		try {
			ArrayList<String> errors = new ArrayList<String>();

			if (TypeValidator.validateType(type, errors, themeDisplay.getLocale() )) {
				TypeServiceUtil.updateType(type);
				SessionMessages.add(actionRequest, "type-updated");
			}
			else {
				for (String error : errors) {
					SessionErrors.add(actionRequest, error);
				}

				PortalUtil.copyRequestParameters(actionRequest, actionResponse);
				actionResponse.setRenderParameter("jspPage", "/jsp/types/edit.jsp");
			}

		}
		catch (SystemException se) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(se);
			}
			if (Validator.isNotNull(type)) {
				LOGGER.error("SystemException : impossible to update type for " + type.getTypeId());
			}

		}
	}
	
	/**
	 * Convenience method to create a Type object out of the request.
	 * Used by the Add / Edit methods.
	 * 
	 * @param request
	 * @return type
	 */
	private Type typeFromRequest(ActionRequest request) {

		Type type = null;
		long typeId = ParamUtil.getLong(request, "typeId");
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		if (Validator.isNotNull(typeId)) {
			try {
				type = TypeLocalServiceUtil.getType(typeId);
			}
			catch (PortalException pe) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(pe);
				}
				LOGGER.error("PortalException : impossible to get type for id " + typeId);
			}
			catch (SystemException se) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(se);
				}
				LOGGER.error("PortalException : impossible to get type for id " + typeId);
			}
		}
		else {
			type = TypeLocalServiceUtil.createType(typeId);
		}
		
		type.setGroupId(themeDisplay.getScopeGroupId());
		type.setOrder(ParamUtil.getInteger(request, "order"));
		type.setNameMap(LocalizationUtil.getLocalizationMap(request, "name"));

		return type;
	}
	
	/**
	 * Delete Type
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void deleteType(ActionRequest request, ActionResponse response) throws Exception {

		long typeId = ParamUtil.getLong(request, "typeId");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Type.class.getName(), request);
		
		try {
			TypeServiceUtil.deleteType(typeId, serviceContext);
			SessionMessages.add(request, "type-deleted");
		}
		catch (SystemException se) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(se);
			}

			SessionErrors.add(request, se.getMessage());
			SessionErrors.add(request, "no-type-deleted");
		}

	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws IOException, PortletException {

		long[] typeIds = ParamUtil.getLongValues(resourceRequest, "typeIds");
		Type type = null;
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		// Save orders.
		// Permission Check.
		if (HexiagonPermission.contains(themeDisplay.getPermissionChecker(), themeDisplay.getScopeGroupId(), "UPDATE_ORDER")) {
			for (int i = 0; i < typeIds.length; i++) {
				long typeId = typeIds[i];
	
				try {
					type = TypeLocalServiceUtil.getType(typeId);
					type.setOrder(typeIds.length - i);
					TypeLocalServiceUtil.updateType(type);
				}
				catch (PortalException e) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug(e);
					}
					if (Validator.isNotNull(type)) {
						LOGGER.error("SystemException : impossible to update type for " + type.getTypeId());
					}
				}
				catch (SystemException e) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug(e);
					}
					if (Validator.isNotNull(type)) {
						LOGGER.error("SystemException : impossible to update type for " + type.getTypeId());
					}
				}
			}
		}
	}
}
