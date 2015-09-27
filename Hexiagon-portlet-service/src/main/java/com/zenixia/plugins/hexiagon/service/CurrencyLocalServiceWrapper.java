package com.zenixia.plugins.hexiagon.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CurrencyLocalService}.
 *
 * @author guillaumelenoir
 * @see CurrencyLocalService
 * @generated
 */
public class CurrencyLocalServiceWrapper implements CurrencyLocalService,
    ServiceWrapper<CurrencyLocalService> {
    private CurrencyLocalService _currencyLocalService;

    public CurrencyLocalServiceWrapper(
        CurrencyLocalService currencyLocalService) {
        _currencyLocalService = currencyLocalService;
    }

    /**
    * Adds the currency to the database. Also notifies the appropriate model listeners.
    *
    * @param currency the currency
    * @return the currency that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.zenixia.plugins.hexiagon.model.Currency addCurrency(
        com.zenixia.plugins.hexiagon.model.Currency currency)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.addCurrency(currency);
    }

    /**
    * Creates a new currency with the primary key. Does not add the currency to the database.
    *
    * @param currencyId the primary key for the new currency
    * @return the new currency
    */
    @Override
    public com.zenixia.plugins.hexiagon.model.Currency createCurrency(
        long currencyId) {
        return _currencyLocalService.createCurrency(currencyId);
    }

    /**
    * Deletes the currency with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param currencyId the primary key of the currency
    * @return the currency that was removed
    * @throws PortalException if a currency with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.zenixia.plugins.hexiagon.model.Currency deleteCurrency(
        long currencyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.deleteCurrency(currencyId);
    }

    /**
    * Deletes the currency from the database. Also notifies the appropriate model listeners.
    *
    * @param currency the currency
    * @return the currency that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.zenixia.plugins.hexiagon.model.Currency deleteCurrency(
        com.zenixia.plugins.hexiagon.model.Currency currency)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.deleteCurrency(currency);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _currencyLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.CurrencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.CurrencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.zenixia.plugins.hexiagon.model.Currency fetchCurrency(
        long currencyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.fetchCurrency(currencyId);
    }

    /**
    * Returns the currency with the primary key.
    *
    * @param currencyId the primary key of the currency
    * @return the currency
    * @throws PortalException if a currency with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.zenixia.plugins.hexiagon.model.Currency getCurrency(
        long currencyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.getCurrency(currencyId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the currencies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.CurrencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of currencies
    * @param end the upper bound of the range of currencies (not inclusive)
    * @return the range of currencies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.zenixia.plugins.hexiagon.model.Currency> getCurrencies(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.getCurrencies(start, end);
    }

    /**
    * Returns the number of currencies.
    *
    * @return the number of currencies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getCurrenciesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.getCurrenciesCount();
    }

    /**
    * Updates the currency in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param currency the currency
    * @return the currency that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.zenixia.plugins.hexiagon.model.Currency updateCurrency(
        com.zenixia.plugins.hexiagon.model.Currency currency)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.updateCurrency(currency);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _currencyLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _currencyLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _currencyLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
    * Adds the currency to the database incrementing the primary key
    *
    * @throws PortalException
    */
    @Override
    public com.zenixia.plugins.hexiagon.model.Currency addCurrency(
        com.zenixia.plugins.hexiagon.model.Currency currency,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _currencyLocalService.addCurrency(currency, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CurrencyLocalService getWrappedCurrencyLocalService() {
        return _currencyLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCurrencyLocalService(
        CurrencyLocalService currencyLocalService) {
        _currencyLocalService = currencyLocalService;
    }

    @Override
    public CurrencyLocalService getWrappedService() {
        return _currencyLocalService;
    }

    @Override
    public void setWrappedService(CurrencyLocalService currencyLocalService) {
        _currencyLocalService = currencyLocalService;
    }
}
