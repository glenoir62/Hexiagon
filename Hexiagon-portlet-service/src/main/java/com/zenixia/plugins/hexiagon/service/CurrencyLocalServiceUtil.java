package com.zenixia.plugins.hexiagon.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Currency. This utility wraps
 * {@link com.zenixia.plugins.hexiagon.service.impl.CurrencyLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author guillaumelenoir
 * @see CurrencyLocalService
 * @see com.zenixia.plugins.hexiagon.service.base.CurrencyLocalServiceBaseImpl
 * @see com.zenixia.plugins.hexiagon.service.impl.CurrencyLocalServiceImpl
 * @generated
 */
public class CurrencyLocalServiceUtil {
    private static CurrencyLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.zenixia.plugins.hexiagon.service.impl.CurrencyLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the currency to the database. Also notifies the appropriate model listeners.
    *
    * @param currency the currency
    * @return the currency that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Currency addCurrency(
        com.zenixia.plugins.hexiagon.model.Currency currency)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addCurrency(currency);
    }

    /**
    * Creates a new currency with the primary key. Does not add the currency to the database.
    *
    * @param currencyId the primary key for the new currency
    * @return the new currency
    */
    public static com.zenixia.plugins.hexiagon.model.Currency createCurrency(
        long currencyId) {
        return getService().createCurrency(currencyId);
    }

    /**
    * Deletes the currency with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param currencyId the primary key of the currency
    * @return the currency that was removed
    * @throws PortalException if a currency with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Currency deleteCurrency(
        long currencyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteCurrency(currencyId);
    }

    /**
    * Deletes the currency from the database. Also notifies the appropriate model listeners.
    *
    * @param currency the currency
    * @return the currency that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Currency deleteCurrency(
        com.zenixia.plugins.hexiagon.model.Currency currency)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteCurrency(currency);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.zenixia.plugins.hexiagon.model.Currency fetchCurrency(
        long currencyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchCurrency(currencyId);
    }

    /**
    * Returns the currency with the primary key.
    *
    * @param currencyId the primary key of the currency
    * @return the currency
    * @throws PortalException if a currency with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Currency getCurrency(
        long currencyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getCurrency(currencyId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Currency> getCurrencies(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCurrencies(start, end);
    }

    /**
    * Returns the number of currencies.
    *
    * @return the number of currencies
    * @throws SystemException if a system exception occurred
    */
    public static int getCurrenciesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCurrenciesCount();
    }

    /**
    * Updates the currency in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param currency the currency
    * @return the currency that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Currency updateCurrency(
        com.zenixia.plugins.hexiagon.model.Currency currency)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateCurrency(currency);
    }

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

    /**
    * Adds the currency to the database incrementing the primary key
    *
    * @throws PortalException
    */
    public static com.zenixia.plugins.hexiagon.model.Currency addCurrency(
        com.zenixia.plugins.hexiagon.model.Currency currency,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addCurrency(currency, serviceContext);
    }

    public static void clearService() {
        _service = null;
    }

    public static CurrencyLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    CurrencyLocalService.class.getName());

            if (invokableLocalService instanceof CurrencyLocalService) {
                _service = (CurrencyLocalService) invokableLocalService;
            } else {
                _service = new CurrencyLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(CurrencyLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(CurrencyLocalService service) {
    }
}
