package com.zenixia.plugins.hexiagon.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.zenixia.plugins.hexiagon.model.Announcement;

/**
 * The persistence interface for the announcement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guillaumelenoir
 * @see AnnouncementPersistenceImpl
 * @see AnnouncementUtil
 * @generated
 */
public interface AnnouncementPersistence extends BasePersistence<Announcement> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AnnouncementUtil} to access the announcement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the announcements where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the announcements where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the announcements where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first announcement in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the first announcement in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last announcement in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the last announcement in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcements before and after the current announcement in the ordered set where uuid = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement[] findByUuid_PrevAndNext(
        long announcementId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Removes all the announcements where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of announcements where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcement where uuid = &#63; and groupId = &#63; or throws a {@link com.zenixia.plugins.hexiagon.NoSuchAnnouncementException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the announcement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the announcement where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the announcement that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the number of announcements where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the announcements where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the announcements where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the announcements where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first announcement in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the first announcement in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last announcement in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the last announcement in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcements before and after the current announcement in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement[] findByUuid_C_PrevAndNext(
        long announcementId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Removes all the announcements where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of announcements where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the announcements where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the announcements where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the announcements where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first announcement in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the first announcement in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last announcement in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the last announcement in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcements before and after the current announcement in the ordered set where groupId = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement[] findByGroupId_PrevAndNext(
        long announcementId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns all the announcements that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> filterFindByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the announcements that the user has permission to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> filterFindByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the announcements that the user has permissions to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> filterFindByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcements before and after the current announcement in the ordered set of announcements that the user has permission to view where groupId = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement[] filterFindByGroupId_PrevAndNext(
        long announcementId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Removes all the announcements where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of announcements where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of announcements that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public int filterCountByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the announcements where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByG_S(
        long groupId, int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the announcements where groupId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param status the status
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByG_S(
        long groupId, int status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the announcements where groupId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByG_S(
        long groupId, int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first announcement in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByG_S_First(
        long groupId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the first announcement in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByG_S_First(
        long groupId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last announcement in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByG_S_Last(
        long groupId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the last announcement in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByG_S_Last(
        long groupId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcements before and after the current announcement in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement[] findByG_S_PrevAndNext(
        long announcementId, long groupId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns all the announcements that the user has permission to view where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> filterFindByG_S(
        long groupId, int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the announcements that the user has permission to view where groupId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param status the status
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> filterFindByG_S(
        long groupId, int status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the announcements that the user has permissions to view where groupId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> filterFindByG_S(
        long groupId, int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcements before and after the current announcement in the ordered set of announcements that the user has permission to view where groupId = &#63; and status = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement[] filterFindByG_S_PrevAndNext(
        long announcementId, long groupId, int status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Removes all the announcements where groupId = &#63; and status = &#63; from the database.
    *
    * @param groupId the group ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_S(long groupId, int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of announcements where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public int countByG_S(long groupId, int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of announcements that the user has permission to view where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the number of matching announcements that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public int filterCountByG_S(long groupId, int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the announcements where typeId = &#63;.
    *
    * @param typeId the type ID
    * @return the matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByTypeId(
        long typeId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the announcements where typeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param typeId the type ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByTypeId(
        long typeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the announcements where typeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param typeId the type ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByTypeId(
        long typeId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first announcement in the ordered set where typeId = &#63;.
    *
    * @param typeId the type ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByTypeId_First(
        long typeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the first announcement in the ordered set where typeId = &#63;.
    *
    * @param typeId the type ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByTypeId_First(
        long typeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last announcement in the ordered set where typeId = &#63;.
    *
    * @param typeId the type ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByTypeId_Last(
        long typeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the last announcement in the ordered set where typeId = &#63;.
    *
    * @param typeId the type ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByTypeId_Last(
        long typeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcements before and after the current announcement in the ordered set where typeId = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param typeId the type ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement[] findByTypeId_PrevAndNext(
        long announcementId, long typeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Removes all the announcements where typeId = &#63; from the database.
    *
    * @param typeId the type ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByTypeId(long typeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of announcements where typeId = &#63;.
    *
    * @param typeId the type ID
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public int countByTypeId(long typeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the announcements where currencyId = &#63;.
    *
    * @param currencyId the currency ID
    * @return the matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByCurrencyId(
        long currencyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the announcements where currencyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param currencyId the currency ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByCurrencyId(
        long currencyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the announcements where currencyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param currencyId the currency ID
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findByCurrencyId(
        long currencyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first announcement in the ordered set where currencyId = &#63;.
    *
    * @param currencyId the currency ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByCurrencyId_First(
        long currencyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the first announcement in the ordered set where currencyId = &#63;.
    *
    * @param currencyId the currency ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByCurrencyId_First(
        long currencyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last announcement in the ordered set where currencyId = &#63;.
    *
    * @param currencyId the currency ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByCurrencyId_Last(
        long currencyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the last announcement in the ordered set where currencyId = &#63;.
    *
    * @param currencyId the currency ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByCurrencyId_Last(
        long currencyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcements before and after the current announcement in the ordered set where currencyId = &#63;.
    *
    * @param announcementId the primary key of the current announcement
    * @param currencyId the currency ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement[] findByCurrencyId_PrevAndNext(
        long announcementId, long currencyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Removes all the announcements where currencyId = &#63; from the database.
    *
    * @param currencyId the currency ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByCurrencyId(long currencyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of announcements where currencyId = &#63;.
    *
    * @param currencyId the currency ID
    * @return the number of matching announcements
    * @throws SystemException if a system exception occurred
    */
    public int countByCurrencyId(long currencyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the announcement in the entity cache if it is enabled.
    *
    * @param announcement the announcement
    */
    public void cacheResult(
        com.zenixia.plugins.hexiagon.model.Announcement announcement);

    /**
    * Caches the announcements in the entity cache if it is enabled.
    *
    * @param announcements the announcements
    */
    public void cacheResult(
        java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> announcements);

    /**
    * Creates a new announcement with the primary key. Does not add the announcement to the database.
    *
    * @param announcementId the primary key for the new announcement
    * @return the new announcement
    */
    public com.zenixia.plugins.hexiagon.model.Announcement create(
        long announcementId);

    /**
    * Removes the announcement with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param announcementId the primary key of the announcement
    * @return the announcement that was removed
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement remove(
        long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    public com.zenixia.plugins.hexiagon.model.Announcement updateImpl(
        com.zenixia.plugins.hexiagon.model.Announcement announcement)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcement with the primary key or throws a {@link com.zenixia.plugins.hexiagon.NoSuchAnnouncementException} if it could not be found.
    *
    * @param announcementId the primary key of the announcement
    * @return the announcement
    * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement findByPrimaryKey(
        long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;

    /**
    * Returns the announcement with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param announcementId the primary key of the announcement
    * @return the announcement, or <code>null</code> if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.zenixia.plugins.hexiagon.model.Announcement fetchByPrimaryKey(
        long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the announcements.
    *
    * @return the announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the announcements.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @return the range of announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the announcements.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of announcements
    * @param end the upper bound of the range of announcements (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of announcements
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the announcements from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of announcements.
    *
    * @return the number of announcements
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
