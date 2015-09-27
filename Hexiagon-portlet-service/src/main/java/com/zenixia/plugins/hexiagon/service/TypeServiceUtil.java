package com.zenixia.plugins.hexiagon.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Type. This utility wraps
 * {@link com.zenixia.plugins.hexiagon.service.impl.TypeServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author guillaumelenoir
 * @see TypeService
 * @see com.zenixia.plugins.hexiagon.service.base.TypeServiceBaseImpl
 * @see com.zenixia.plugins.hexiagon.service.impl.TypeServiceImpl
 * @generated
 */
public class TypeServiceUtil {
    private static TypeService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.zenixia.plugins.hexiagon.service.impl.TypeServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static com.zenixia.plugins.hexiagon.model.Type addType(
        com.zenixia.plugins.hexiagon.model.Type type,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return getService().addType(type, serviceContext);
    }

    public static com.zenixia.plugins.hexiagon.model.Type updateType(
        com.zenixia.plugins.hexiagon.model.Type type)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return getService().updateType(type);
    }

    public static com.zenixia.plugins.hexiagon.model.Type deleteType(
        long typeId, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return getService().deleteType(typeId, serviceContext);
    }

    public static java.util.List<com.zenixia.plugins.hexiagon.model.Type> getTypesByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTypesByGroupId(groupId, start, end);
    }

    public static void clearService() {
        _service = null;
    }

    public static TypeService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    TypeService.class.getName());

            if (invokableService instanceof TypeService) {
                _service = (TypeService) invokableService;
            } else {
                _service = new TypeServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(TypeServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(TypeService service) {
    }
}
