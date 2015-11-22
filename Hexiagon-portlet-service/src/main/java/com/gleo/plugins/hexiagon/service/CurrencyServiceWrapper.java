package com.gleo.plugins.hexiagon.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CurrencyService}.
 *
 * @author guillaumelenoir
 * @see CurrencyService
 * @generated
 */
public class CurrencyServiceWrapper implements CurrencyService,
    ServiceWrapper<CurrencyService> {
    private CurrencyService _currencyService;

    public CurrencyServiceWrapper(CurrencyService currencyService) {
        _currencyService = currencyService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _currencyService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _currencyService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _currencyService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.gleo.plugins.hexiagon.model.Currency addCurrency(
        com.gleo.plugins.hexiagon.model.Currency currency,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return _currencyService.addCurrency(currency, serviceContext);
    }

    @Override
    public com.gleo.plugins.hexiagon.model.Currency updateCurrency(
        com.gleo.plugins.hexiagon.model.Currency currency)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return _currencyService.updateCurrency(currency);
    }

    @Override
    public com.gleo.plugins.hexiagon.model.Currency deleteCurrency(
        long currencyId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return _currencyService.deleteCurrency(currencyId, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CurrencyService getWrappedCurrencyService() {
        return _currencyService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCurrencyService(CurrencyService currencyService) {
        _currencyService = currencyService;
    }

    @Override
    public CurrencyService getWrappedService() {
        return _currencyService;
    }

    @Override
    public void setWrappedService(CurrencyService currencyService) {
        _currencyService = currencyService;
    }
}
