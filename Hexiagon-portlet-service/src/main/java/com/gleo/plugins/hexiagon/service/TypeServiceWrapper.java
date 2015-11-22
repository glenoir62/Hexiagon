package com.gleo.plugins.hexiagon.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TypeService}.
 *
 * @author guillaumelenoir
 * @see TypeService
 * @generated
 */
public class TypeServiceWrapper implements TypeService,
    ServiceWrapper<TypeService> {
    private TypeService _typeService;

    public TypeServiceWrapper(TypeService typeService) {
        _typeService = typeService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _typeService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _typeService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _typeService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.gleo.plugins.hexiagon.model.Type addType(
        com.gleo.plugins.hexiagon.model.Type type,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return _typeService.addType(type, serviceContext);
    }

    @Override
    public com.gleo.plugins.hexiagon.model.Type updateType(
        com.gleo.plugins.hexiagon.model.Type type)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return _typeService.updateType(type);
    }

    @Override
    public com.gleo.plugins.hexiagon.model.Type deleteType(long typeId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return _typeService.deleteType(typeId, serviceContext);
    }

    @Override
    public java.util.List<com.gleo.plugins.hexiagon.model.Type> getTypesByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _typeService.getTypesByGroupId(groupId, start, end);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TypeService getWrappedTypeService() {
        return _typeService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTypeService(TypeService typeService) {
        _typeService = typeService;
    }

    @Override
    public TypeService getWrappedService() {
        return _typeService;
    }

    @Override
    public void setWrappedService(TypeService typeService) {
        _typeService = typeService;
    }
}
