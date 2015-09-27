
package com.zenixia.plugins.hexiagon.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Group;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.zenixia.plugins.hexiagon.model.Currency;
import com.zenixia.plugins.hexiagon.service.CurrencyLocalServiceUtil;

/**
 * @author guillaumelenoir
 */
public class CurrencyPermission {

	public static void check(PermissionChecker permissionChecker, Currency Currency, String actionId)
		throws PortalException, SystemException {

		if (!contains(permissionChecker, Currency, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker, long CurrencyId, String actionId)
		throws PortalException, SystemException {

		Currency Currency = CurrencyLocalServiceUtil.getCurrency(CurrencyId);

		check(permissionChecker, Currency, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, Currency currency, String actionId)
		throws PortalException, SystemException {

		Group group = GroupLocalServiceUtil.getCompanyGroup(currency.getCompanyId());

		return permissionChecker.hasPermission(group.getGroupId(), Currency.class.getName(), currency.getCurrencyId(), actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker, long CurrencyId, String actionId)
		throws PortalException, SystemException {

		Currency Currency = CurrencyLocalServiceUtil.getCurrency(CurrencyId);

		return contains(permissionChecker, Currency, actionId);
	}
}
