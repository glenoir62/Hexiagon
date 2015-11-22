
package com.gleo.plugins.hexiagon.portlet.currencies.web;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.gleo.plugins.hexiagon.model.Currency;
import com.gleo.plugins.hexiagon.permission.HexiagonPermission;
import com.gleo.plugins.hexiagon.service.CurrencyLocalServiceUtil;
import com.gleo.plugins.hexiagon.service.CurrencyServiceUtil;
import com.gleo.plugins.hexiagon.validator.CurrencyValidator;

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
 * Portlet implementation class CurrenciesController
 */
public class CurrenciesController extends MVCPortlet {

	/**
	 * AnnouncementCurrencyController Logger.
	 */
	protected static Log LOGGER = LogFactoryUtil.getLog(CurrenciesController.class);

	/**
	 * Empty Results Message
	 */
	private String emptyResultsMessage = "currency-empty-results-message";

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		PortletURL iteratorURL = renderResponse.createRenderURL();
		int delta = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_DELTA_PARAM, SearchContainer.DEFAULT_DELTA);
		int cur = ParamUtil.getInteger(renderRequest, "curCurrencies", SearchContainer.DEFAULT_CUR);

		// create search container
		SearchContainer<Currency> searchCurrencyContainer = new SearchContainer<Currency>(renderRequest, null, null, "curCurrencies", cur, delta, iteratorURL, null, emptyResultsMessage);

		int start = searchCurrencyContainer.getStart();
		int end = searchCurrencyContainer.getEnd();

		try {
			List<Currency> currencies = CurrencyLocalServiceUtil.getCurrencies(start, end);
			int total = CurrencyLocalServiceUtil.getCurrenciesCount();

			searchCurrencyContainer.setTotal(total);
			searchCurrencyContainer.setResults(currencies);
		}
		catch (SystemException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.error("SystemException : impossible to get searchCurrencyContainer");
		}

		renderRequest.setAttribute("searchCurrencyContainer", searchCurrencyContainer);

		super.doView(renderRequest, renderResponse);
	}
	
	/**
	 * Adds a new Currency to the database
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws Exception
	 */
	public void addCurrency(ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		Currency currency = currencyFromRequest(actionRequest);
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Currency.class.getName(), actionRequest);

		try {
			ArrayList<String> errors = new ArrayList<String>();

			if (CurrencyValidator.validateCurrency(currency, errors)) {

				CurrencyServiceUtil.addCurrency(currency, serviceContext);
				SessionMessages.add(actionRequest, "currency-added");
			}
			else {
				for (String error : errors) {
					SessionErrors.add(actionRequest, error);
				}
				PortalUtil.copyRequestParameters(actionRequest, actionResponse);
				actionResponse.setRenderParameter("jspPage", "/jsp/currencies/edit.jsp");
			}
		}
		catch (SystemException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			if (Validator.isNotNull(currency)) {
				LOGGER.error("SystemException : impossible to add currency for " + currency.getCurrencyId());
			}
		}
	}
	
	/**
	 * Update a Currency to the database
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws Exception
	 */
	public void updateCurrency(ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		Currency currency = currencyFromRequest(actionRequest);
		try {

			ArrayList<String> errors = new ArrayList<String>();

			if (CurrencyValidator.validateCurrency(currency, errors)) {

				CurrencyServiceUtil.updateCurrency(currency);
				SessionMessages.add(actionRequest, "currency-updated");
			}
			else {
				for (String error : errors) {
					SessionErrors.add(actionRequest, error);
				}
				PortalUtil.copyRequestParameters(actionRequest, actionResponse);
				actionResponse.setRenderParameter("jspPage", "/jsp/currencies/edit.jsp");
			}
		}
		catch (SystemException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			if (Validator.isNotNull(currency)) {
				LOGGER.error("SystemException : impossible to update currency for " + currency.getCurrencyId());
			}
		}

	}

	/**
	 * Deletes a currency from the database.
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void deleteCurrency(ActionRequest request, ActionResponse response)
		throws Exception {

		long currencyId = ParamUtil.getLong(request, "currencyId");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Currency.class.getName(), request);

		try {
			CurrencyServiceUtil.deleteCurrency(currencyId, serviceContext);
			SessionMessages.add(request, "currency-deleted");
		}
		catch (SystemException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}

			SessionErrors.add(request, e.getMessage());
			SessionErrors.add(request, "no-currency-deleted");
		}
		catch (PortalException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}

			SessionErrors.add(request, e.getMessage());
			SessionErrors.add(request, "no-currency-deleted");
		}

	}
	/**
	 * Convenience method to create a Currency object out of the request. Used
	 * by the Add / Edit methods.
	 * 
	 * @param request
	 * @return
	 */
	private Currency currencyFromRequest(ActionRequest request) {

		Currency currency = null;
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long currencyId = ParamUtil.getLong(request, "currencyId");
		long companyId = themeDisplay.getCompanyId();

		if (Validator.isNotNull(currencyId)) {
			try {
				currency = CurrencyLocalServiceUtil.getCurrency(currencyId);
			}
			catch (PortalException pe) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(pe);
				}
				LOGGER.error("PortalException : impossible to get  currency for id " + currencyId);
			}
			catch (SystemException se) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug(se);
				}
				LOGGER.error("PortalException : impossible to get currency for id " + currencyId);
			}
		}
		else {
			currency = CurrencyLocalServiceUtil.createCurrency(currencyId);
		}

		currency.setCompanyId(companyId);
		currency.setOrder(ParamUtil.getInteger(request, "order"));
		currency.setSymbol(ParamUtil.getString(request, "symbol"));
		currency.setLabel(ParamUtil.getString(request, "label"));

		return currency;
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws IOException, PortletException {

		long[] currencyIds = ParamUtil.getLongValues(resourceRequest, "currencyIds");
		Currency currency = null;
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		// Save orders.
		// Permission Check.
		if (HexiagonPermission.contains(themeDisplay.getPermissionChecker(), themeDisplay.getScopeGroupId(), "UPDATE_ORDER")) {
			for (int i = 0; i < currencyIds.length; i++) {
				long currencyId = currencyIds[i];
	
				try {
					currency = CurrencyLocalServiceUtil.getCurrency(currencyId);
					currency.setOrder(currencyIds.length - i);
					CurrencyLocalServiceUtil.updateCurrency(currency);
				}
				catch (PortalException e) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug(e);
					}
					if (Validator.isNotNull(currency)) {
						LOGGER.error("SystemException : impossible to update currency for " + currency.getCurrencyId());
					}
				}
				catch (SystemException e) {
					if (LOGGER.isDebugEnabled()) {
						LOGGER.debug(e);
					}
					if (Validator.isNotNull(currency)) {
						LOGGER.error("SystemException : impossible to update currency for " + currency.getCurrencyId());
					}
				}
			}
		}
	}

}
