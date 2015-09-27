package com.zenixia.plugins.hexiagon.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for Announcement. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author guillaumelenoir
 * @see AnnouncementLocalServiceUtil
 * @see com.zenixia.plugins.hexiagon.service.base.AnnouncementLocalServiceBaseImpl
 * @see com.zenixia.plugins.hexiagon.service.impl.AnnouncementLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface AnnouncementLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AnnouncementLocalServiceUtil} to access the announcement local service. Add custom service methods to {@link com.zenixia.plugins.hexiagon.service.impl.AnnouncementLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the announcement to the database. Also notifies the appropriate model listeners.
    *
    * @param announcement the announcement
    * @return the announcement that was added
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public com.zenixia.plugins.hexiagon.model.Announcement addAnnouncement(
        com.zenixia.plugins.hexiagon.model.Announcement announcement)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new announcement with the primary key. Does not add the announcement to the database.
    *
    * @param announcementId the primary key for the new announcement
    * @return the new announcement
    */
    public com.zenixia.plugins.hexiagon.model.Announcement createAnnouncement(
        long announcementId);

    /**
    * Deletes the announcement with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param announcementId the primary key of the announcement
    * @return the announcement that was removed
    * @throws PortalException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public com.zenixia.plugins.hexiagon.model.Announcement deleteAnnouncement(
        long announcementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the announcement from the database. Also notifies the appropriate model listeners.
    *
    * @param announcement the announcement
    * @return the announcement that was removed
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public com.zenixia.plugins.hexiagon.model.Announcement deleteAnnouncement(
        com.zenixia.plugins.hexiagon.model.Announcement announcement)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.zenixia.plugins.hexiagon.model.Announcement fetchAnnouncement(
        long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcement with the matching UUID and company.
    *
    * @param uuid the announcement's UUID
    * @param companyId the primary key of the company
    * @return the matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.zenixia.plugins.hexiagon.model.Announcement fetchAnnouncementByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcement matching the UUID and group.
    *
    * @param uuid the announcement's UUID
    * @param groupId the primary key of the group
    * @return the matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.zenixia.plugins.hexiagon.model.Announcement fetchAnnouncementByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcement with the primary key.
    *
    * @param announcementId the primary key of the announcement
    * @return the announcement
    * @throws PortalException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.zenixia.plugins.hexiagon.model.Announcement getAnnouncement(
        long announcementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcement with the matching UUID and company.
    *
    * @param uuid the announcement's UUID
    * @param companyId the primary key of the company
    * @return the matching announcement
    * @throws PortalException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.zenixia.plugins.hexiagon.model.Announcement getAnnouncementByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the announcement matching the UUID and group.
    *
    * @param uuid the announcement's UUID
    * @param groupId the primary key of the group
    * @return the matching announcement
    * @throws PortalException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.zenixia.plugins.hexiagon.model.Announcement getAnnouncementByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

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
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> getAnnouncements(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of announcements.
    *
    * @return the number of announcements
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getAnnouncementsCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the announcement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param announcement the announcement
    * @return the announcement that was updated
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public com.zenixia.plugins.hexiagon.model.Announcement updateAnnouncement(
        com.zenixia.plugins.hexiagon.model.Announcement announcement)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    /**
    * Adds the Announcement to the database incrementing the primary key
    *
    * @throws PortalException
    */
    public com.zenixia.plugins.hexiagon.model.Announcement addAnnouncement(
        com.zenixia.plugins.hexiagon.model.Announcement announcement,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void updateAsset(long userId,
        com.zenixia.plugins.hexiagon.model.Announcement announcement,
        long[] assetCategoryIds, java.lang.String[] assetTagNames,
        long[] assetLinkEntryIds)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public com.zenixia.plugins.hexiagon.model.Announcement updateAnnouncement(
        com.zenixia.plugins.hexiagon.model.Announcement announcement,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Gets a list with all the Announcements in a group
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> getAnnouncementsByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Gets a list with a range of Announcements from a group
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> getAnnouncementsByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Gets the number of Announcements in a group
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getAnnouncementsCountByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Gets a list with all the Announcements by type Id
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> getAnnouncementsByTypeId(
        long typeId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Gets the number of Announcements by type Id
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getAnnouncementsCountByTypeId(long typeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Gets a list with all the Announcements by currency Id
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> getAnnouncementsByCurrencyId(
        long currencyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Gets the number of Announcements by currency Id
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getAnnouncementsCountByCurrencyId(long currencyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public com.zenixia.plugins.hexiagon.model.Announcement updateStatus(
        long userId, long resourcePrimKey, int status,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> getFavoritesAnnouncementsByGroupIUserId(
        long groupId, long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}
