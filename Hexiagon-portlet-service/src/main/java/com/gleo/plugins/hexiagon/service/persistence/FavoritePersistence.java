package com.gleo.plugins.hexiagon.service.persistence;

import com.gleo.plugins.hexiagon.model.Favorite;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the favorite service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guillaumelenoir
 * @see FavoritePersistenceImpl
 * @see FavoriteUtil
 * @generated
 */
public interface FavoritePersistence extends BasePersistence<Favorite> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FavoriteUtil} to access the favorite persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the favorites where userId = &#63; and groupId = &#63;.
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @return the matching favorites
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findByUserIdGroupId(
        long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findByUserIdGroupId(
        long userId, long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findByUserIdGroupId(
        long userId, long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.gleo.plugins.hexiagon.model.Favorite findByUserIdGroupId_First(
        long userId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first favorite in the ordered set where userId = &#63; and groupId = &#63;.
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching favorite, or <code>null</code> if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Favorite fetchByUserIdGroupId_First(
        long userId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.gleo.plugins.hexiagon.model.Favorite findByUserIdGroupId_Last(
        long userId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last favorite in the ordered set where userId = &#63; and groupId = &#63;.
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching favorite, or <code>null</code> if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Favorite fetchByUserIdGroupId_Last(
        long userId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.gleo.plugins.hexiagon.model.Favorite[] findByUserIdGroupId_PrevAndNext(
        long favoriteId, long userId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the favorites where userId = &#63; and groupId = &#63; from the database.
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUserIdGroupId(long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of favorites where userId = &#63; and groupId = &#63;.
    *
    * @param userId the user ID
    * @param groupId the group ID
    * @return the number of matching favorites
    * @throws SystemException if a system exception occurred
    */
    public int countByUserIdGroupId(long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the favorites where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @return the matching favorites
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findByAnnouncementId(
        long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findByAnnouncementId(
        long announcementId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findByAnnouncementId(
        long announcementId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first favorite in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching favorite
    * @throws com.gleo.plugins.hexiagon.NoSuchFavoriteException if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Favorite findByAnnouncementId_First(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first favorite in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching favorite, or <code>null</code> if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Favorite fetchByAnnouncementId_First(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last favorite in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching favorite
    * @throws com.gleo.plugins.hexiagon.NoSuchFavoriteException if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Favorite findByAnnouncementId_Last(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last favorite in the ordered set where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching favorite, or <code>null</code> if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Favorite fetchByAnnouncementId_Last(
        long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.gleo.plugins.hexiagon.model.Favorite[] findByAnnouncementId_PrevAndNext(
        long favoriteId, long announcementId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the favorites where announcementId = &#63; from the database.
    *
    * @param announcementId the announcement ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByAnnouncementId(long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of favorites where announcementId = &#63;.
    *
    * @param announcementId the announcement ID
    * @return the number of matching favorites
    * @throws SystemException if a system exception occurred
    */
    public int countByAnnouncementId(long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.gleo.plugins.hexiagon.model.Favorite findByA_U(
        long announcementId, long userId, long groupId)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the favorite where announcementId = &#63; and userId = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param announcementId the announcement ID
    * @param userId the user ID
    * @param groupId the group ID
    * @return the matching favorite, or <code>null</code> if a matching favorite could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Favorite fetchByA_U(
        long announcementId, long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.gleo.plugins.hexiagon.model.Favorite fetchByA_U(
        long announcementId, long userId, long groupId,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the favorite where announcementId = &#63; and userId = &#63; and groupId = &#63; from the database.
    *
    * @param announcementId the announcement ID
    * @param userId the user ID
    * @param groupId the group ID
    * @return the favorite that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Favorite removeByA_U(
        long announcementId, long userId, long groupId)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of favorites where announcementId = &#63; and userId = &#63; and groupId = &#63;.
    *
    * @param announcementId the announcement ID
    * @param userId the user ID
    * @param groupId the group ID
    * @return the number of matching favorites
    * @throws SystemException if a system exception occurred
    */
    public int countByA_U(long announcementId, long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the favorite in the entity cache if it is enabled.
    *
    * @param favorite the favorite
    */
    public void cacheResult(com.gleo.plugins.hexiagon.model.Favorite favorite);

    /**
    * Caches the favorites in the entity cache if it is enabled.
    *
    * @param favorites the favorites
    */
    public void cacheResult(
        java.util.List<com.gleo.plugins.hexiagon.model.Favorite> favorites);

    /**
    * Creates a new favorite with the primary key. Does not add the favorite to the database.
    *
    * @param favoriteId the primary key for the new favorite
    * @return the new favorite
    */
    public com.gleo.plugins.hexiagon.model.Favorite create(long favoriteId);

    /**
    * Removes the favorite with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param favoriteId the primary key of the favorite
    * @return the favorite that was removed
    * @throws com.gleo.plugins.hexiagon.NoSuchFavoriteException if a favorite with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Favorite remove(long favoriteId)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.gleo.plugins.hexiagon.model.Favorite updateImpl(
        com.gleo.plugins.hexiagon.model.Favorite favorite)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the favorite with the primary key or throws a {@link com.gleo.plugins.hexiagon.NoSuchFavoriteException} if it could not be found.
    *
    * @param favoriteId the primary key of the favorite
    * @return the favorite
    * @throws com.gleo.plugins.hexiagon.NoSuchFavoriteException if a favorite with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Favorite findByPrimaryKey(
        long favoriteId)
        throws com.gleo.plugins.hexiagon.NoSuchFavoriteException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the favorite with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param favoriteId the primary key of the favorite
    * @return the favorite, or <code>null</code> if a favorite with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Favorite fetchByPrimaryKey(
        long favoriteId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the favorites.
    *
    * @return the favorites
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.gleo.plugins.hexiagon.model.Favorite> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the favorites from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of favorites.
    *
    * @return the number of favorites
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
