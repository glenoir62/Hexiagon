package com.gleo.plugins.hexiagon.portlet.hexiagon.web;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Country;
import com.liferay.portal.model.Region;
import com.liferay.portal.service.CountryServiceUtil;
import com.liferay.portal.service.RegionServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;


public class HexiagonController extends MVCPortlet {
	
	/**
	 * HexagonController Logger.
	 */
	protected static Log LOGGER = LogFactoryUtil.getLog(HexiagonController.class);
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		List<Region> regions = null;
		
		try {
			Country france = CountryServiceUtil.getCountryByA2(Locale.FRANCE.getCountry());
			
			if (Validator.isNotNull(france)) {
				regions = RegionServiceUtil.getRegions(france.getCountryId());
				renderRequest.setAttribute("countryId", france.getCountryId());
			}
		}
		catch (PortalException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.debug("PortalException : impossible to get " + Locale.FRANCE.getCountry());
		}
		catch (SystemException e) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.debug("SystemException : impossible to get " + Locale.FRANCE.getCountry());
		}
		
		renderRequest.setAttribute("regions", regions);
		
		super.doView(renderRequest, renderResponse);
	}
}
