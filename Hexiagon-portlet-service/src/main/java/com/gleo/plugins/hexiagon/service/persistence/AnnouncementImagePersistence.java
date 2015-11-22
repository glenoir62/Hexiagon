package com.gleo.plugins.hexiagon.service.persistence;

import com.gleo.plugins.hexiagon.model.AnnouncementImage;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the announcement image service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guillaumelenoir
 * @see AnnouncementImagePersistenceImpl
 * @see AnnouncementImageUtil
 * @generated
 */
public interface AnnouncementImagePersistence extends BasePersistence<AnnouncementImage> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AnnouncementImageUtil} to access the announcement image persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the announcement images where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @return the matching announcement images
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> findByG_A(
        long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> findByG_A(
        long announcementId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> findByG_A(
        long announcementId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first announcement image in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement image
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.AnnouncementImage findByG_A_First(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first announcement image in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement image, or <code>null</code> if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.AnnouncementImage fetchByG_A_First(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last announcement image in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement image
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.AnnouncementImage findByG_A_Last(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last announcement image in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement image, or <code>null</code> if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.AnnouncementImage fetchByG_A_Last(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.gleo.plugins.hexiagon.model.AnnouncementImage[] findByG_A_PrevAndNext(
        long announcementImageId, long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the announcement images where announcementId = &#63; from the database.
    *
    * @param announcementId the announcement ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_A(long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of announcement images where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @return the number of matching announcement images
    * @throws SystemException if a system exception occurred
    */
    public int countByG_A(long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcement image where announcementId = &#63; and order = &#63; or throws a {@link com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException} if it could not be found.
    *
    * @param announcementId the announcement ID
    * @param order the order
    * @return the matching announcement image
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.AnnouncementImage findByA_O(
        long announcementId, int order)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcement image where announcementId = &#63; and order = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param announcementId the announcement ID
    * @param order the order
    * @return the matching announcement image, or <code>null</code> if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.AnnouncementImage fetchByA_O(
        long announcementId, int order)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcement image where announcementId = &#63; and order = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param announcementId the announcement ID
    * @param order the order
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching announcement image, or <code>null</code> if a matching announcement image could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.AnnouncementImage fetchByA_O(
        long announcementId, int order, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the announcement image where announcementId = &#63; and order = &#63; from the database.
    *
    * @param announcementId the announcement ID
    * @param order the order
    * @return the announcement image that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.AnnouncementImage removeByA_O(
        long announcementId, int order)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of announcement images where announcementId = &#63; and order = &#63;.
    *
    * @param announcementId the announcement ID
    * @param order the order
    * @return the number of matching announcement images
    * @throws SystemException if a system exception occurred
    */
    public int countByA_O(long announcementId, int order)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the announcement image in the entity cache if it is enabled.
    *
    * @param announcementImage the announcement image
    */
    public void cacheResult(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage);

    /**
    * Caches the announcement images in the entity cache if it is enabled.
    *
    * @param announcementImages the announcement images
    */
    public void cacheResult(
        java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> announcementImages);

    /**
    * Creates a new announcement image with the primary key. Does not add the announcement image to the database.
    *
    * @param announcementImageId the primary key for the new announcement image
    * @return the new announcement image
    */
    public com.gleo.plugins.hexiagon.model.AnnouncementImage create(
        long announcementImageId);

    /**
    * Removes the announcement image with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param announcementImageId the primary key of the announcement image
    * @return the announcement image that was removed
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a announcement image with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.AnnouncementImage remove(
        long announcementImageId)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.gleo.plugins.hexiagon.model.AnnouncementImage updateImpl(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcement image with the primary key or throws a {@link com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException} if it could not be found.
    *
    * @param announcementImageId the primary key of the announcement image
    * @return the announcement image
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a announcement image with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.AnnouncementImage findByPrimaryKey(
        long announcementImageId)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcement image with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param announcementImageId the primary key of the announcement image
    * @return the announcement image, or <code>null</code> if a announcement image with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.AnnouncementImage fetchByPrimaryKey(
        long announcementImageId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the announcement images.
    *
    * @return the announcement images
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the announcement images from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of announcement images.
    *
    * @return the number of announcement images
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
