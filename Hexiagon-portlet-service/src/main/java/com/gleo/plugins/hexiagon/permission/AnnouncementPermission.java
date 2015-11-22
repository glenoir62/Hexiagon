
package com.gleo.plugins.hexiagon.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.staging.permission.StagingPermissionUtil;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.gleo.plugins.hexiagon.constants.PortletKeys;
import com.gleo.plugins.hexiagon.model.Announcement;
import com.gleo.plugins.hexiagon.service.AnnouncementLocalServiceUtil;


/**
 * @author guillaumelenoir
 */
public class AnnouncementPermission {

	public static void check(PermissionChecker permissionChecker, Announcement announcement, String actionId)
		throws PortalException, SystemException {

		if (!contains(permissionChecker, announcement, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker, long announcementId, String actionId)
		throws PortalException, SystemException {

		Announcement announcement = AnnouncementLocalServiceUtil.getAnnouncement(announcementId);

		check(permissionChecker, announcement, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, Announcement announcement, String actionId)
		throws PortalException, SystemException {

		Boolean hasPermission =
			StagingPermissionUtil.hasPermission(permissionChecker, announcement.getGroupId(), Announcement.class.getName(), announcement.getAnnouncementId(), PortletKeys.ANNOUNCEMENT_PORTLETID, actionId);

		if (hasPermission != null) {
			return hasPermission.booleanValue();
		}

		return permissionChecker.hasPermission(announcement.getGroupId(), Announcement.class.getName(), announcement.getAnnouncementId(), actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, long announcementId, String actionId)
		throws PortalException, SystemException {

		Announcement announcement = AnnouncementLocalServiceUtil.getAnnouncement(announcementId);

		return contains(permissionChecker, announcement, actionId);
	}
}
