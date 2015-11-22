package com.gleo.plugins.hexiagon.portlet.announcements.asset;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;
import com.gleo.plugins.hexiagon.constants.PortletKeys;
import com.gleo.plugins.hexiagon.model.Announcement;
import com.gleo.plugins.hexiagon.permission.AnnouncementPermission;
import com.gleo.plugins.hexiagon.permission.HexiagonPermission;
import com.gleo.plugins.hexiagon.service.AnnouncementLocalServiceUtil;

import javax.portlet.PortletURL;


public class AnnouncementAssetRendererFactory extends BaseAssetRendererFactory {

	public static final String CLASS_NAME = Announcement.class.getName();

	public static final String TYPE = "announcement";

	
	@Override
	public AssetRenderer getAssetRenderer(long classPK, int type)
		throws PortalException, SystemException {

		Announcement announcement = AnnouncementLocalServiceUtil.getAnnouncement(classPK);

		return new AnnouncementAssetRenderer(announcement);
	}
	
	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	public String getType() {
		return TYPE;
	}
	
	@Override
	public boolean isLinkable() {
		return _LINKABLE;
	}
	
	@Override
	public boolean hasPermission(
			PermissionChecker permissionChecker, long classPK, String actionId)
		throws Exception {

		return  AnnouncementPermission.contains(permissionChecker, classPK, actionId);
	}
	

	@Override
	public PortletURL getURLAdd(LiferayPortletRequest liferayPortletRequest, LiferayPortletResponse liferayPortletResponse)
		throws PortalException, SystemException {

		ThemeDisplay themeDisplay =
						(ThemeDisplay)liferayPortletRequest.getAttribute(
							WebKeys.THEME_DISPLAY);

		if (!HexiagonPermission.contains(
				themeDisplay.getPermissionChecker(),
				themeDisplay.getScopeGroupId(), "ADD_ANNOUNCEMENT")) {

			return null;
		}

		PortletURL portletURL = liferayPortletResponse.createRenderURL(
			PortletKeys.ADD_ANNOUNCEMENT_PORTLETID);

		return portletURL;
	}



	private static final boolean _LINKABLE = true;
}
