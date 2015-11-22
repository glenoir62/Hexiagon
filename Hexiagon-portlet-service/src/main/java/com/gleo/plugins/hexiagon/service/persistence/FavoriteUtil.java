package com.gleo.plugins.hexiagon.service.persistence;

import com.gleo.plugins.hexiagon.model.Favorite;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the favorite service. This utility wraps {@link FavoritePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guillaumelenoir
 * @see FavoritePersistence
 * @see FavoritePersistenceImpl
 * @generated
 */
public class FavoriteUtil {
    private static FavoritePersistence _persistence;

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
    public static void clearCache(Favorite favorite) {
        getPersistence().clearCache(favorite);
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
    public static List<Favorite> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Favorite> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Favorite> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Favorite update(Favorite favorite) throws SystemException {
        return getPersistence().update(favorite);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Favorite update(Favorite favorite,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(favorite, serviceContext);
    }

    /**
    * Returns all the favorites where userId = &#63; and groupId = &#63;.
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @return the matching favorites
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findByUserIdGroupId(
        long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUserIdGroupId(userId, groupId);
    }

    /**
    * Returns a range of all the favorites where userId = &#63; and groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.FavoriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @param start the lower bound of the range of favorites
    * @param end the upper bound of the range of favorites (not inclusive)
    * @return the range of matching favorites
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findByUserIdGroupId(
        long userId, long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUserIdGroupId(userId, groupId, start, end);
    }

    /**
    * Returns an ordered range of all the favorites where userId = &#63; and groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.FavoriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @param start the lower bound of the range of favorites
    * @param end the upper bound of the range of favorites (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching favorites
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findByUserIdGroupId(
        long userId, long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUserIdGroupId(userId, groupId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first favorite in the ordered set where userId = &#63; and groupId = &#63;.
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching favorite
    * @throws com.gleo.plugins.hexiagon.NoSuchFavoriteException if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite findByUserIdGroupId_First(
        long userId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUserIdGroupId_First(userId, groupId, orderByComparator);
    }

    /**
    * Returns the first favorite in the ordered set where userId = &#63; and groupId = &#63;.
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching favorite, or <code>null</code> if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite fetchByUserIdGroupId_First(
        long userId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUserIdGroupId_First(userId, groupId,
            orderByComparator);
    }

    /**
    * Returns the last favorite in the ordered set where userId = &#63; and groupId = &#63;.
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching favorite
    * @throws com.gleo.plugins.hexiagon.NoSuchFavoriteException if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite findByUserIdGroupId_Last(
        long userId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUserIdGroupId_Last(userId, groupId, orderByComparator);
    }

    /**
    * Returns the last favorite in the ordered set where userId = &#63; and groupId = &#63;.
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching favorite, or <code>null</code> if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite fetchByUserIdGroupId_Last(
        long userId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUserIdGroupId_Last(userId, groupId, orderByComparator);
    }

    /**
    * Returns the favorites before and after the current favorite in the ordered set where userId = &#63; and groupId = &#63;.
    *
    * @param favoriteId the primary key of the current favorite
    * @param userId the user ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next favorite
    * @throws com.gleo.plugins.hexiagon.NoSuchFavoriteException if a favorite with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite[] findByUserIdGroupId_PrevAndNext(
        long favoriteId, long userId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUserIdGroupId_PrevAndNext(favoriteId, userId,
            groupId, orderByComparator);
    }

    /**
    * Removes all the favorites where userId = &#63; and groupId = &#63; from the database.
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUserIdGroupId(long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUserIdGroupId(userId, groupId);
    }

    /**
    * Returns the number of favorites where userId = &#63; and groupId = &#63;.
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @return the number of matching favorites
    * @throws SystemException if a system exception occurred
    */
    public static int countByUserIdGroupId(long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUserIdGroupId(userId, groupId);
    }

    /**
    * Returns all the favorites where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @return the matching favorites
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findByAnnouncementId(
        long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByAnnouncementId(announcementId);
    }

    /**
    * Returns a range of all the favorites where announcementId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.FavoriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param announcementId the announcement ID
    * @param start the lower bound of the range of favorites
    * @param end the upper bound of the range of favorites (not inclusive)
    * @return the range of matching favorites
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findByAnnouncementId(
        long announcementId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByAnnouncementId(announcementId, start, end);
    }

    /**
    * Returns an ordered range of all the favorites where announcementId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.FavoriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param announcementId the announcement ID
    * @param start the lower bound of the range of favorites
    * @param end the upper bound of the range of favorites (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching favorites
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findByAnnouncementId(
        long announcementId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByAnnouncementId(announcementId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first favorite in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching favorite
    * @throws com.gleo.plugins.hexiagon.NoSuchFavoriteException if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite findByAnnouncementId_First(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByAnnouncementId_First(announcementId, orderByComparator);
    }

    /**
    * Returns the first favorite in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching favorite, or <code>null</code> if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite fetchByAnnouncementId_First(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByAnnouncementId_First(announcementId,
            orderByComparator);
    }

    /**
    * Returns the last favorite in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching favorite
    * @throws com.gleo.plugins.hexiagon.NoSuchFavoriteException if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite findByAnnouncementId_Last(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByAnnouncementId_Last(announcementId, orderByComparator);
    }

    /**
    * Returns the last favorite in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching favorite, or <code>null</code> if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite fetchByAnnouncementId_Last(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByAnnouncementId_Last(announcementId, orderByComparator);
    }

    /**
    * Returns the favorites before and after the current favorite in the ordered set where announcementId = &#63;.
    *
    * @param favoriteId the primary key of the current favorite
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next favorite
    * @throws com.gleo.plugins.hexiagon.NoSuchFavoriteException if a favorite with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite[] findByAnnouncementId_PrevAndNext(
        long favoriteId, long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByAnnouncementId_PrevAndNext(favoriteId,
            announcementId, orderByComparator);
    }

    /**
    * Removes all the favorites where announcementId = &#63; from the database.
    *
    * @param announcementId the announcement ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByAnnouncementId(long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByAnnouncementId(announcementId);
    }

    /**
    * Returns the number of favorites where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @return the number of matching favorites
    * @throws SystemException if a system exception occurred
    */
    public static int countByAnnouncementId(long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByAnnouncementId(announcementId);
    }

    /**
    * Returns the favorite where announcementId = &#63; and userId = &#63; and groupId = &#63; or throws a {@link com.gleo.plugins.hexiagon.NoSuchFavoriteException} if it could not be found.
    *
    * @param announcementId the announcement ID
    * @param userId the user ID
    * @param groupId the group ID
    * @return the matching favorite
    * @throws com.gleo.plugins.hexiagon.NoSuchFavoriteException if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite findByA_U(
        long announcementId, long userId, long groupId)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByA_U(announcementId, userId, groupId);
    }

    /**
    * Returns the favorite where announcementId = &#63; and userId = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param announcementId the announcement ID
    * @param userId the user ID
    * @param groupId the group ID
    * @return the matching favorite, or <code>null</code> if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite fetchByA_U(
        long announcementId, long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByA_U(announcementId, userId, groupId);
    }

    /**
    * Returns the favorite where announcementId = &#63; and userId = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param announcementId the announcement ID
    * @param userId the user ID
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching favorite, or <code>null</code> if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite fetchByA_U(
        long announcementId, long userId, long groupId,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByA_U(announcementId, userId, groupId,
            retrieveFromCache);
    }

    /**
    * Removes the favorite where announcementId = &#63; and userId = &#63; and groupId = &#63; from the database.
    *
    * @param announcementId the announcement ID
    * @param userId the user ID
    * @param groupId the group ID
    * @return the favorite that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite removeByA_U(
        long announcementId, long userId, long groupId)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByA_U(announcementId, userId, groupId);
    }

    /**
    * Returns the number of favorites where announcementId = &#63; and userId = &#63; and groupId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param userId the user ID
    * @param groupId the group ID
    * @return the number of matching favorites
    * @throws SystemException if a system exception occurred
    */
    public static int countByA_U(long announcementId, long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByA_U(announcementId, userId, groupId);
    }

    /**
    * Caches the favorite in the entity cache if it is enabled.
    *
    * @param favorite the favorite
    */
    public static void cacheResult(
        com.gleo.plugins.hexiagon.model.Favorite favorite) {
        getPersistence().cacheResult(favorite);
    }

    /**
    * Caches the favorites in the entity cache if it is enabled.
    *
    * @param favorites the favorites
    */
    public static void cacheResult(
        java.util.List<com.gleo.plugins.hexiagon.model.Favorite> favorites) {
        getPersistence().cacheResult(favorites);
    }

    /**
    * Creates a new favorite with the primary key. Does not add the favorite to the database.
    *
    * @param favoriteId the primary key for the new favorite
    * @return the new favorite
    */
    public static com.gleo.plugins.hexiagon.model.Favorite create(
        long favoriteId) {
        return getPersistence().create(favoriteId);
    }

    /**
    * Removes the favorite with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param favoriteId the primary key of the favorite
    * @return the favorite that was removed
    * @throws com.gleo.plugins.hexiagon.NoSuchFavoriteException if a favorite with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite remove(
        long favoriteId)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(favoriteId);
    }

    public static com.gleo.plugins.hexiagon.model.Favorite updateImpl(
        com.gleo.plugins.hexiagon.model.Favorite favorite)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(favorite);
    }

    /**
    * Returns the favorite with the primary key or throws a {@link com.gleo.plugins.hexiagon.NoSuchFavoriteException} if it could not be found.
    *
    * @param favoriteId the primary key of the favorite
    * @return the favorite
    * @throws com.gleo.plugins.hexiagon.NoSuchFavoriteException if a favorite with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite findByPrimaryKey(
        long favoriteId)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(favoriteId);
    }

    /**
    * Returns the favorite with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param favoriteId the primary key of the favorite
    * @return the favorite, or <code>null</code> if a favorite with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Favorite fetchByPrimaryKey(
        long favoriteId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(favoriteId);
    }

    /**
    * Returns all the favorites.
    *
    * @return the favorites
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the favorites.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.FavoriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of favorites
    * @param end the upper bound of the range of favorites (not inclusive)
    * @return the range of favorites
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the favorites.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.FavoriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of favorites
    * @param end the upper bound of the range of favorites (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of favorites
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the favorites from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of favorites.
    *
    * @return the number of favorites
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static FavoritePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (FavoritePersistence) PortletBeanLocatorUtil.locate(com.gleo.plugins.hexiagon.service.ClpSerializer.getServletContextName(),
                    FavoritePersistence.class.getName());

            ReferenceRegistry.registerReference(FavoriteUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(FavoritePersistence persistence) {
    }
}
