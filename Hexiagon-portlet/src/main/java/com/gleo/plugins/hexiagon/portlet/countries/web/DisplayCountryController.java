package com.gleo.plugins.hexiagon.portlet.countries.web;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class DisplayCountryController
 */
public class DisplayCountryController extends MVCPortlet {
 
	/**
	 * DisplayCountryController Logger.
	 */
	protected static Log LOGGER = LogFactoryUtil.getLog(DisplayCountryController.class);

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		renderRequest.setAttribute("countryId", ParamUtil.getLong(renderRequest, "countryId"));
		renderRequest.setAttribute("regionId", ParamUtil.getLong(renderRequest, "regionId"));
		
		super.doView(renderRequest, renderResponse);
	}
}
