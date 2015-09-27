package com.zenixia.plugins.hexiagon.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.zenixia.plugins.hexiagon.model.Type;
import com.zenixia.plugins.hexiagon.service.TypeService;
import com.zenixia.plugins.hexiagon.service.persistence.AnnouncementImagePersistence;
import com.zenixia.plugins.hexiagon.service.persistence.AnnouncementPersistence;
import com.zenixia.plugins.hexiagon.service.persistence.CurrencyPersistence;
import com.zenixia.plugins.hexiagon.service.persistence.FavoritePersistence;
import com.zenixia.plugins.hexiagon.service.persistence.TypePersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the type remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.zenixia.plugins.hexiagon.service.impl.TypeServiceImpl}.
 * </p>
 *
 * @author guillaumelenoir
 * @see com.zenixia.plugins.hexiagon.service.impl.TypeServiceImpl
 * @see com.zenixia.plugins.hexiagon.service.TypeServiceUtil
 * @generated
 */
public abstract class TypeServiceBaseImpl extends BaseServiceImpl
    implements TypeService, IdentifiableBean {
    @BeanReference(type = com.zenixia.plugins.hexiagon.service.AnnouncementLocalService.class)
    protected com.zenixia.plugins.hexiagon.service.AnnouncementLocalService announcementLocalService;
    @BeanReference(type = com.zenixia.plugins.hexiagon.service.AnnouncementService.class)
    protected com.zenixia.plugins.hexiagon.service.AnnouncementService announcementService;
    @BeanReference(type = AnnouncementPersistence.class)
    protected AnnouncementPersistence announcementPersistence;
    @BeanReference(type = com.zenixia.plugins.hexiagon.service.AnnouncementImageLocalService.class)
    protected com.zenixia.plugins.hexiagon.service.AnnouncementImageLocalService announcementImageLocalService;
    @BeanReference(type = AnnouncementImagePersistence.class)
    protected AnnouncementImagePersistence announcementImagePersistence;
    @BeanReference(type = com.zenixia.plugins.hexiagon.service.CurrencyLocalService.class)
    protected com.zenixia.plugins.hexiagon.service.CurrencyLocalService currencyLocalService;
    @BeanReference(type = com.zenixia.plugins.hexiagon.service.CurrencyService.class)
    protected com.zenixia.plugins.hexiagon.service.CurrencyService currencyService;
    @BeanReference(type = CurrencyPersistence.class)
    protected CurrencyPersistence currencyPersistence;
    @BeanReference(type = com.zenixia.plugins.hexiagon.service.FavoriteLocalService.class)
    protected com.zenixia.plugins.hexiagon.service.FavoriteLocalService favoriteLocalService;
    @BeanReference(type = FavoritePersistence.class)
    protected FavoritePersistence favoritePersistence;
    @BeanReference(type = com.zenixia.plugins.hexiagon.service.TypeLocalService.class)
    protected com.zenixia.plugins.hexiagon.service.TypeLocalService typeLocalService;
    @BeanReference(type = com.zenixia.plugins.hexiagon.service.TypeService.class)
    protected com.zenixia.plugins.hexiagon.service.TypeService typeService;
    @BeanReference(type = TypePersistence.class)
    protected TypePersistence typePersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private TypeServiceClpInvoker _clpInvoker = new TypeServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.zenixia.plugins.hexiagon.service.TypeServiceUtil} to access the type remote service.
     */

    /**
     * Returns the announcement local service.
     *
     * @return the announcement local service
     */
    public com.zenixia.plugins.hexiagon.service.AnnouncementLocalService getAnnouncementLocalService() {
        return announcementLocalService;
    }

    /**
     * Sets the announcement local service.
     *
     * @param announcementLocalService the announcement local service
     */
    public void setAnnouncementLocalService(
        com.zenixia.plugins.hexiagon.service.AnnouncementLocalService announcementLocalService) {
        this.announcementLocalService = announcementLocalService;
    }

    /**
     * Returns the announcement remote service.
     *
     * @return the announcement remote service
     */
    public com.zenixia.plugins.hexiagon.service.AnnouncementService getAnnouncementService() {
        return announcementService;
    }

    /**
     * Sets the announcement remote service.
     *
     * @param announcementService the announcement remote service
     */
    public void setAnnouncementService(
        com.zenixia.plugins.hexiagon.service.AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    /**
     * Returns the announcement persistence.
     *
     * @return the announcement persistence
     */
    public AnnouncementPersistence getAnnouncementPersistence() {
        return announcementPersistence;
    }

    /**
     * Sets the announcement persistence.
     *
     * @param announcementPersistence the announcement persistence
     */
    public void setAnnouncementPersistence(
        AnnouncementPersistence announcementPersistence) {
        this.announcementPersistence = announcementPersistence;
    }

    /**
     * Returns the announcement image local service.
     *
     * @return the announcement image local service
     */
    public com.zenixia.plugins.hexiagon.service.AnnouncementImageLocalService getAnnouncementImageLocalService() {
        return announcementImageLocalService;
    }

    /**
     * Sets the announcement image local service.
     *
     * @param announcementImageLocalService the announcement image local service
     */
    public void setAnnouncementImageLocalService(
        com.zenixia.plugins.hexiagon.service.AnnouncementImageLocalService announcementImageLocalService) {
        this.announcementImageLocalService = announcementImageLocalService;
    }

    /**
     * Returns the announcement image persistence.
     *
     * @return the announcement image persistence
     */
    public AnnouncementImagePersistence getAnnouncementImagePersistence() {
        return announcementImagePersistence;
    }

    /**
     * Sets the announcement image persistence.
     *
     * @param announcementImagePersistence the announcement image persistence
     */
    public void setAnnouncementImagePersistence(
        AnnouncementImagePersistence announcementImagePersistence) {
        this.announcementImagePersistence = announcementImagePersistence;
    }

    /**
     * Returns the currency local service.
     *
     * @return the currency local service
     */
    public com.zenixia.plugins.hexiagon.service.CurrencyLocalService getCurrencyLocalService() {
        return currencyLocalService;
    }

    /**
     * Sets the currency local service.
     *
     * @param currencyLocalService the currency local service
     */
    public void setCurrencyLocalService(
        com.zenixia.plugins.hexiagon.service.CurrencyLocalService currencyLocalService) {
        this.currencyLocalService = currencyLocalService;
    }

    /**
     * Returns the currency remote service.
     *
     * @return the currency remote service
     */
    public com.zenixia.plugins.hexiagon.service.CurrencyService getCurrencyService() {
        return currencyService;
    }

    /**
     * Sets the currency remote service.
     *
     * @param currencyService the currency remote service
     */
    public void setCurrencyService(
        com.zenixia.plugins.hexiagon.service.CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    /**
     * Returns the currency persistence.
     *
     * @return the currency persistence
     */
    public CurrencyPersistence getCurrencyPersistence() {
        return currencyPersistence;
    }

    /**
     * Sets the currency persistence.
     *
     * @param currencyPersistence the currency persistence
     */
    public void setCurrencyPersistence(CurrencyPersistence currencyPersistence) {
        this.currencyPersistence = currencyPersistence;
    }

    /**
     * Returns the favorite local service.
     *
     * @return the favorite local service
     */
    public com.zenixia.plugins.hexiagon.service.FavoriteLocalService getFavoriteLocalService() {
        return favoriteLocalService;
    }

    /**
     * Sets the favorite local service.
     *
     * @param favoriteLocalService the favorite local service
     */
    public void setFavoriteLocalService(
        com.zenixia.plugins.hexiagon.service.FavoriteLocalService favoriteLocalService) {
        this.favoriteLocalService = favoriteLocalService;
    }

    /**
     * Returns the favorite persistence.
     *
     * @return the favorite persistence
     */
    public FavoritePersistence getFavoritePersistence() {
        return favoritePersistence;
    }

    /**
     * Sets the favorite persistence.
     *
     * @param favoritePersistence the favorite persistence
     */
    public void setFavoritePersistence(FavoritePersistence favoritePersistence) {
        this.favoritePersistence = favoritePersistence;
    }

    /**
     * Returns the type local service.
     *
     * @return the type local service
     */
    public com.zenixia.plugins.hexiagon.service.TypeLocalService getTypeLocalService() {
        return typeLocalService;
    }

    /**
     * Sets the type local service.
     *
     * @param typeLocalService the type local service
     */
    public void setTypeLocalService(
        com.zenixia.plugins.hexiagon.service.TypeLocalService typeLocalService) {
        this.typeLocalService = typeLocalService;
    }

    /**
     * Returns the type remote service.
     *
     * @return the type remote service
     */
    public com.zenixia.plugins.hexiagon.service.TypeService getTypeService() {
        return typeService;
    }

    /**
     * Sets the type remote service.
     *
     * @param typeService the type remote service
     */
    public void setTypeService(
        com.zenixia.plugins.hexiagon.service.TypeService typeService) {
        this.typeService = typeService;
    }

    /**
     * Returns the type persistence.
     *
     * @return the type persistence
     */
    public TypePersistence getTypePersistence() {
        return typePersistence;
    }

    /**
     * Sets the type persistence.
     *
     * @param typePersistence the type persistence
     */
    public void setTypePersistence(TypePersistence typePersistence) {
        this.typePersistence = typePersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Type.class;
    }

    protected String getModelClassName() {
        return Type.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = typePersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
