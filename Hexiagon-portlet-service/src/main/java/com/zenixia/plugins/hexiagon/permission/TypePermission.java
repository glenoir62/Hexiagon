
package com.zenixia.plugins.hexiagon.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.staging.permission.StagingPermissionUtil;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.zenixia.plugins.hexiagon.constants.PortletKeys;
import com.zenixia.plugins.hexiagon.model.Type;
import com.zenixia.plugins.hexiagon.service.TypeLocalServiceUtil;

/**
 * @author guillaumelenoir
 *
 */
public class TypePermission {

	public static void check(PermissionChecker permissionChecker, long typeId, String actionId)
		throws PortalException, SystemException {

		if (!contains(permissionChecker, typeId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker, Type type, String actionId)
		throws PortalException, SystemException {

		if (!contains(permissionChecker, type, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker, long typeId, String actionId)
		throws PortalException, SystemException {

		Type type = TypeLocalServiceUtil.getType(typeId);

		Boolean hasPermission = StagingPermissionUtil.hasPermission(permissionChecker, type.getGroupId(), Type.class.getName(), type.getTypeId(), PortletKeys.TYPE_PORTLETID, actionId);

		if (hasPermission != null) {
			return hasPermission.booleanValue();
		}

		return permissionChecker.hasPermission(type.getGroupId(), Type.class.getName(), type.getTypeId(), actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, Type type, String actionId)
		throws PortalException, SystemException {

		return permissionChecker.hasPermission(type.getGroupId(), Type.class.getName(), type.getTypeId(), actionId);
	}
}
