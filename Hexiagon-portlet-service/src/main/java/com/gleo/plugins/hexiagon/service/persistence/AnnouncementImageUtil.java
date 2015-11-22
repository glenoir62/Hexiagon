package com.gleo.plugins.hexiagon.service.persistence;

import com.gleo.plugins.hexiagon.model.AnnouncementImage;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the announcement image service. This utility wraps {@link AnnouncementImagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guillaumelenoir
 * @see AnnouncementImagePersistence
 * @see AnnouncementImagePersistenceImpl
 * @generated
 */
public class AnnouncementImageUtil {
    private static AnnouncementImagePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(AnnouncementImage announcementImage) {
        getPersistence().clearCache(announcementImage);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<AnnouncementImage> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<AnnouncementImage> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<AnnouncementImage> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static AnnouncementImage update(AnnouncementImage announcementImage)
        throws SystemException {
        return getPersistence().update(announcementImage);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static AnnouncementImage update(
        AnnouncementImage announcementImage, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(announcementImage, serviceContext);
    }

    /**
    * Returns all the announcement images where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @return the matching announcement images
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> findByG_A(
        long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_A(announcementId);
    }

    /**
    * Returns a range of all the announcement images where announcementId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param announcementId the announcement ID
    * @param start the lower bound of the range of announcement images
    * @param end the upper bound of the range of announcement images (not inclusive)
    * @return the range of matching announcement images
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> findByG_A(
        long announcementId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_A(announcementId, start, end);
    }

    /**
    * Returns an ordered range of all the announcement images where announcementId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param announcementId the announcement ID
    * @param start the lower bound of the range of announcement images
    * @param end the upper bound of the range of announcement images (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcement images
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> findByG_A(
        long announcementId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_A(announcementId, start, end, orderByComparator);
    }

    /**
    * Returns the first announcement image in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement image
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage findByG_A_First(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_A_First(announcementId, orderByComparator);
    }

    /**
    * Returns the first announcement image in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement image, or <code>null</code> if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage fetchByG_A_First(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_A_First(announcementId, orderByComparator);
    }

    /**
    * Returns the last announcement image in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement image
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage findByG_A_Last(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_A_Last(announcementId, orderByComparator);
    }

    /**
    * Returns the last announcement image in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement image, or <code>null</code> if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage fetchByG_A_Last(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_A_Last(announcementId, orderByComparator);
    }

    /**
    * Returns the announcement images before and after the current announcement image in the ordered set where announcementId = &#63;.
    *
    * @param announcementImageId the primary key of the current announcement image
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement image
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a announcement image with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage[] findByG_A_PrevAndNext(
        long announcementImageId, long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_A_PrevAndNext(announcementImageId, announcementId,
            orderByComparator);
    }

    /**
    * Removes all the announcement images where announcementId = &#63; from the database.
    *
    * @param announcementId the announcement ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_A(long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_A(announcementId);
    }

    /**
    * Returns the number of announcement images where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @return the number of matching announcement images
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_A(long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_A(announcementId);
    }

    /**
    * Returns the announcement image where announcementId = &#63; and order = &#63; or throws a {@link com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException} if it could not be found.
    *
    * @param announcementId the announcement ID
    * @param order the order
    * @return the matching announcement image
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage findByA_O(
        long announcementId, int order)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByA_O(announcementId, order);
    }

    /**
    * Returns the announcement image where announcementId = &#63; and order = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param announcementId the announcement ID
    * @param order the order
    * @return the matching announcement image, or <code>null</code> if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage fetchByA_O(
        long announcementId, int order)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByA_O(announcementId, order);
    }

    /**
    * Returns the announcement image where announcementId = &#63; and order = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param announcementId the announcement ID
    * @param order the order
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching announcement image, or <code>null</code> if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage fetchByA_O(
        long announcementId, int order, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByA_O(announcementId, order, retrieveFromCache);
    }

    /**
    * Removes the announcement image where announcementId = &#63; and order = &#63; from the database.
    *
    * @param announcementId the announcement ID
    * @param order the order
    * @return the announcement image that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage removeByA_O(
        long announcementId, int order)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByA_O(announcementId, order);
    }

    /**
    * Returns the number of announcement images where announcementId = &#63; and order = &#63;.
    *
    * @param announcementId the announcement ID
    * @param order the order
    * @return the number of matching announcement images
    * @throws SystemException if a system exception occurred
    */
    public static int countByA_O(long announcementId, int order)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByA_O(announcementId, order);
    }

    /**
    * Caches the announcement image in the entity cache if it is enabled.
    *
    * @param announcementImage the announcement image
    */
    public static void cacheResult(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage) {
        getPersistence().cacheResult(announcementImage);
    }

    /**
    * Caches the announcement images in the entity cache if it is enabled.
    *
    * @param announcementImages the announcement images
    */
    public static void cacheResult(
        java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> announcementImages) {
        getPersistence().cacheResult(announcementImages);
    }

    /**
    * Creates a new announcement image with the primary key. Does not add the announcement image to the database.
    *
    * @param announcementImageId the primary key for the new announcement image
    * @return the new announcement image
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage create(
        long announcementImageId) {
        return getPersistence().create(announcementImageId);
    }

    /**
    * Removes the announcement image with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param announcementImageId the primary key of the announcement image
    * @return the announcement image that was removed
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a announcement image with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage remove(
        long announcementImageId)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(announcementImageId);
    }

    public static com.gleo.plugins.hexiagon.model.AnnouncementImage updateImpl(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(announcementImage);
    }

    /**
    * Returns the announcement image with the primary key or throws a {@link com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException} if it could not be found.
    *
    * @param announcementImageId the primary key of the announcement image
    * @return the announcement image
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a announcement image with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage findByPrimaryKey(
        long announcementImageId)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(announcementImageId);
    }

    /**
    * Returns the announcement image with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param announcementImageId the primary key of the announcement image
    * @return the announcement image, or <code>null</code> if a announcement image with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage fetchByPrimaryKey(
        long announcementImageId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(announcementImageId);
    }

    /**
    * Returns all the announcement images.
    *
    * @return the announcement images
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the announcement images.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of announcement images
    * @param end the upper bound of the range of announcement images (not inclusive)
    * @return the range of announcement images
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the announcement images.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of announcement images
    * @param end the upper bound of the range of announcement images (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of announcement images
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the announcement images from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of announcement images.
    *
    * @return the number of announcement images
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AnnouncementImagePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AnnouncementImagePersistence) PortletBeanLocatorUtil.locate(com.gleo.plugins.hexiagon.service.ClpSerializer.getServletContextName(),
                    AnnouncementImagePersistence.class.getName());

            ReferenceRegistry.registerReference(AnnouncementImageUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(AnnouncementImagePersistence persistence) {
    }
}
