package com.gleo.plugins.hexiagon.service.persistence;

import com.gleo.plugins.hexiagon.model.Announcement;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the announcement service. This utility wraps {@link AnnouncementPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guillaumelenoir
 * @see AnnouncementPersistence
 * @see AnnouncementPersistenceImpl
 * @generated
 */
public class AnnouncementUtil {
    private static AnnouncementPersistence _persistence;

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
    public static void clearCache(Announcement announcement) {
        getPersistence().clearCache(announcement);
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
    public static List<Announcement> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Announcement> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Announcement> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Announcement update(Announcement announcement)
        throws SystemException {
        return getPersistence().update(announcement);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Announcement update(Announcement announcement,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(announcement, serviceContext);
    }

    /**
    * Returns all the announcements where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the announcements where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the announcements where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first announcement in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first announcement in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last announcement in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last announcement in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the announcements before and after the current announcement in the ordered set where uuid = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement[] findByUuid_PrevAndNext(
        long announcementId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_PrevAndNext(announcementId, uuid,
            orderByComparator);
    }

    /**
    * Removes all the announcements where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of announcements where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the announcement where uuid = &#63; and groupId = &#63; or throws a {@link com.gleo.plugins.hexiagon.NoSuchAnnouncementException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the announcement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the announcement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the announcement where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the announcement that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of announcements where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the announcements where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the announcements where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the announcements where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first announcement in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first announcement in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last announcement in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last announcement in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the announcements before and after the current announcement in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement[] findByUuid_C_PrevAndNext(
        long announcementId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(announcementId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the announcements where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid_C(uuid, companyId);
    }

    /**
    * Returns the number of announcements where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the announcements where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

    /**
    * Returns a range of all the announcements where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the announcements where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first announcement in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first announcement in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last announcement in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last announcement in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the announcements before and after the current announcement in the ordered set where groupId = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement[] findByGroupId_PrevAndNext(
        long announcementId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(announcementId, groupId,
            orderByComparator);
    }

    /**
    * Returns all the announcements that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> filterFindByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByGroupId(groupId);
    }

    /**
    * Returns a range of all the announcements that the user has permission to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> filterFindByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the announcements that the user has permissions to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> filterFindByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the announcements before and after the current announcement in the ordered set of announcements that the user has permission to view where groupId = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement[] filterFindByGroupId_PrevAndNext(
        long announcementId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByGroupId_PrevAndNext(announcementId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the announcements where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Returns the number of announcements where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns the number of announcements that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static int filterCountByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterCountByGroupId(groupId);
    }

    /**
    * Returns all the announcements where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByG_S(
        long groupId, int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_S(groupId, status);
    }

    /**
    * Returns a range of all the announcements where groupId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param status the status
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByG_S(
        long groupId, int status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_S(groupId, status, start, end);
    }

    /**
    * Returns an ordered range of all the announcements where groupId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param status the status
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByG_S(
        long groupId, int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_S(groupId, status, start, end, orderByComparator);
    }

    /**
    * Returns the first announcement in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByG_S_First(
        long groupId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_S_First(groupId, status, orderByComparator);
    }

    /**
    * Returns the first announcement in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByG_S_First(
        long groupId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_S_First(groupId, status, orderByComparator);
    }

    /**
    * Returns the last announcement in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByG_S_Last(
        long groupId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_S_Last(groupId, status, orderByComparator);
    }

    /**
    * Returns the last announcement in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByG_S_Last(
        long groupId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_S_Last(groupId, status, orderByComparator);
    }

    /**
    * Returns the announcements before and after the current announcement in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement[] findByG_S_PrevAndNext(
        long announcementId, long groupId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_S_PrevAndNext(announcementId, groupId, status,
            orderByComparator);
    }

    /**
    * Returns all the announcements that the user has permission to view where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> filterFindByG_S(
        long groupId, int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByG_S(groupId, status);
    }

    /**
    * Returns a range of all the announcements that the user has permission to view where groupId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param status the status
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> filterFindByG_S(
        long groupId, int status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByG_S(groupId, status, start, end);
    }

    /**
    * Returns an ordered range of all the announcements that the user has permissions to view where groupId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param status the status
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> filterFindByG_S(
        long groupId, int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByG_S(groupId, status, start, end,
            orderByComparator);
    }

    /**
    * Returns the announcements before and after the current announcement in the ordered set of announcements that the user has permission to view where groupId = &#63; and status = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement[] filterFindByG_S_PrevAndNext(
        long announcementId, long groupId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByG_S_PrevAndNext(announcementId, groupId,
            status, orderByComparator);
    }

    /**
    * Removes all the announcements where groupId = &#63; and status = &#63; from the database.
    *
    * @param groupId the group ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_S(long groupId, int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_S(groupId, status);
    }

    /**
    * Returns the number of announcements where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_S(long groupId, int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_S(groupId, status);
    }

    /**
    * Returns the number of announcements that the user has permission to view where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the number of matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static int filterCountByG_S(long groupId, int status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterCountByG_S(groupId, status);
    }

    /**
    * Returns all the announcements where typeId = &#63;.
    *
    * @param typeId the type ID
    * @return the matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByTypeId(
        long typeId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByTypeId(typeId);
    }

    /**
    * Returns a range of all the announcements where typeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param typeId the type ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByTypeId(
        long typeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByTypeId(typeId, start, end);
    }

    /**
    * Returns an ordered range of all the announcements where typeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param typeId the type ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByTypeId(
        long typeId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByTypeId(typeId, start, end, orderByComparator);
    }

    /**
    * Returns the first announcement in the ordered set where typeId = &#63;.
    *
    * @param typeId the type ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByTypeId_First(
        long typeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByTypeId_First(typeId, orderByComparator);
    }

    /**
    * Returns the first announcement in the ordered set where typeId = &#63;.
    *
    * @param typeId the type ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByTypeId_First(
        long typeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByTypeId_First(typeId, orderByComparator);
    }

    /**
    * Returns the last announcement in the ordered set where typeId = &#63;.
    *
    * @param typeId the type ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByTypeId_Last(
        long typeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByTypeId_Last(typeId, orderByComparator);
    }

    /**
    * Returns the last announcement in the ordered set where typeId = &#63;.
    *
    * @param typeId the type ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByTypeId_Last(
        long typeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByTypeId_Last(typeId, orderByComparator);
    }

    /**
    * Returns the announcements before and after the current announcement in the ordered set where typeId = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param typeId the type ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement[] findByTypeId_PrevAndNext(
        long announcementId, long typeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByTypeId_PrevAndNext(announcementId, typeId,
            orderByComparator);
    }

    /**
    * Removes all the announcements where typeId = &#63; from the database.
    *
    * @param typeId the type ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByTypeId(long typeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByTypeId(typeId);
    }

    /**
    * Returns the number of announcements where typeId = &#63;.
    *
    * @param typeId the type ID
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static int countByTypeId(long typeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByTypeId(typeId);
    }

    /**
    * Returns all the announcements where currencyId = &#63;.
    *
    * @param currencyId the currency ID
    * @return the matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByCurrencyId(
        long currencyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCurrencyId(currencyId);
    }

    /**
    * Returns a range of all the announcements where currencyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param currencyId the currency ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByCurrencyId(
        long currencyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCurrencyId(currencyId, start, end);
    }

    /**
    * Returns an ordered range of all the announcements where currencyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param currencyId the currency ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findByCurrencyId(
        long currencyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCurrencyId(currencyId, start, end, orderByComparator);
    }

    /**
    * Returns the first announcement in the ordered set where currencyId = &#63;.
    *
    * @param currencyId the currency ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByCurrencyId_First(
        long currencyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCurrencyId_First(currencyId, orderByComparator);
    }

    /**
    * Returns the first announcement in the ordered set where currencyId = &#63;.
    *
    * @param currencyId the currency ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByCurrencyId_First(
        long currencyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCurrencyId_First(currencyId, orderByComparator);
    }

    /**
    * Returns the last announcement in the ordered set where currencyId = &#63;.
    *
    * @param currencyId the currency ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByCurrencyId_Last(
        long currencyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCurrencyId_Last(currencyId, orderByComparator);
    }

    /**
    * Returns the last announcement in the ordered set where currencyId = &#63;.
    *
    * @param currencyId the currency ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByCurrencyId_Last(
        long currencyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCurrencyId_Last(currencyId, orderByComparator);
    }

    /**
    * Returns the announcements before and after the current announcement in the ordered set where currencyId = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param currencyId the currency ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement[] findByCurrencyId_PrevAndNext(
        long announcementId, long currencyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCurrencyId_PrevAndNext(announcementId, currencyId,
            orderByComparator);
    }

    /**
    * Removes all the announcements where currencyId = &#63; from the database.
    *
    * @param currencyId the currency ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCurrencyId(long currencyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCurrencyId(currencyId);
    }

    /**
    * Returns the number of announcements where currencyId = &#63;.
    *
    * @param currencyId the currency ID
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public static int countByCurrencyId(long currencyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCurrencyId(currencyId);
    }

    /**
    * Caches the announcement in the entity cache if it is enabled.
    *
    * @param announcement the announcement
    */
    public static void cacheResult(
        com.gleo.plugins.hexiagon.model.Announcement announcement) {
        getPersistence().cacheResult(announcement);
    }

    /**
    * Caches the announcements in the entity cache if it is enabled.
    *
    * @param announcements the announcements
    */
    public static void cacheResult(
        java.util.List<com.gleo.plugins.hexiagon.model.Announcement> announcements) {
        getPersistence().cacheResult(announcements);
    }

    /**
    * Creates a new announcement with the primary key. Does not add the announcement to the database.
    *
    * @param announcementId the primary key for the new announcement
    * @return the new announcement
    */
    public static com.gleo.plugins.hexiagon.model.Announcement create(
        long announcementId) {
        return getPersistence().create(announcementId);
    }

    /**
    * Removes the announcement with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param announcementId the primary key of the announcement
    * @return the announcement that was removed
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement remove(
        long announcementId)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(announcementId);
    }

    public static com.gleo.plugins.hexiagon.model.Announcement updateImpl(
        com.gleo.plugins.hexiagon.model.Announcement announcement)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(announcement);
    }

    /**
    * Returns the announcement with the primary key or throws a {@link com.gleo.plugins.hexiagon.NoSuchAnnouncementException} if it could not be found.
    *
    * @param announcementId the primary key of the announcement
    * @return the announcement
    * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement findByPrimaryKey(
        long announcementId)
        throws com.gleo.plugins.hexiagon.NoSuchAnnouncementException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(announcementId);
    }

    /**
    * Returns the announcement with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param announcementId the primary key of the announcement
    * @return the announcement, or <code>null</code> if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.Announcement fetchByPrimaryKey(
        long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(announcementId);
    }

    /**
    * Returns all the announcements.
    *
    * @return the announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the announcements.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the announcements.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of announcements
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the announcements from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of announcements.
    *
    * @return the number of announcements
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AnnouncementPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AnnouncementPersistence) PortletBeanLocatorUtil.locate(com.gleo.plugins.hexiagon.service.ClpSerializer.getServletContextName(),
                    AnnouncementPersistence.class.getName());

            ReferenceRegistry.registerReference(AnnouncementUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(AnnouncementPersistence persistence) {
    }
}
