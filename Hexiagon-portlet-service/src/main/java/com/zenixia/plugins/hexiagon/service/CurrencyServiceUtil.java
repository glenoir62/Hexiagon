package com.zenixia.plugins.hexiagon.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Currency. This utility wraps
 * {@link com.zenixia.plugins.hexiagon.service.impl.CurrencyServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author guillaumelenoir
 * @see CurrencyService
 * @see com.zenixia.plugins.hexiagon.service.base.CurrencyServiceBaseImpl
 * @see com.zenixia.plugins.hexiagon.service.impl.CurrencyServiceImpl
 * @generated
 */
public class CurrencyServiceUtil {
    private static CurrencyService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.zenixia.plugins.hexiagon.service.impl.CurrencyServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.zenixia.plugins.hexiagon.model.Currency addCurrency(
        com.zenixia.plugins.hexiagon.model.Currency currency,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return getService().addCurrency(currency, serviceContext);
    }

    public static com.zenixia.plugins.hexiagon.model.Currency updateCurrency(
        com.zenixia.plugins.hexiagon.model.Currency currency)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return getService().updateCurrency(currency);
    }

    public static com.zenixia.plugins.hexiagon.model.Currency deleteCurrency(
        long currencyId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return getService().deleteCurrency(currencyId, serviceContext);
    }

    public static void clearService() {
        _service = null;
    }

    public static CurrencyService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    CurrencyService.class.getName());

            if (invokableService instanceof CurrencyService) {
                _service = (CurrencyService) invokableService;
            } else {
                _service = new CurrencyServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(CurrencyServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(CurrencyService service) {
    }
}
