package com.zenixia.plugins.hexiagon.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Announcement. This utility wraps
 * {@link com.zenixia.plugins.hexiagon.service.impl.AnnouncementLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author guillaumelenoir
 * @see AnnouncementLocalService
 * @see com.zenixia.plugins.hexiagon.service.base.AnnouncementLocalServiceBaseImpl
 * @see com.zenixia.plugins.hexiagon.service.impl.AnnouncementLocalServiceImpl
 * @generated
 */
public class AnnouncementLocalServiceUtil {
    private static AnnouncementLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.zenixia.plugins.hexiagon.service.impl.AnnouncementLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the announcement to the database. Also notifies the appropriate model listeners.
    *
    * @param announcement the announcement
    * @return the announcement that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Announcement addAnnouncement(
        com.zenixia.plugins.hexiagon.model.Announcement announcement)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addAnnouncement(announcement);
    }

    /**
    * Creates a new announcement with the primary key. Does not add the announcement to the database.
    *
    * @param announcementId the primary key for the new announcement
    * @return the new announcement
    */
    public static com.zenixia.plugins.hexiagon.model.Announcement createAnnouncement(
        long announcementId) {
        return getService().createAnnouncement(announcementId);
    }

    /**
    * Deletes the announcement with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param announcementId the primary key of the announcement
    * @return the announcement that was removed
    * @throws PortalException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Announcement deleteAnnouncement(
        long announcementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAnnouncement(announcementId);
    }

    /**
    * Deletes the announcement from the database. Also notifies the appropriate model listeners.
    *
    * @param announcement the announcement
    * @return the announcement that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Announcement deleteAnnouncement(
        com.zenixia.plugins.hexiagon.model.Announcement announcement)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAnnouncement(announcement);
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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

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

    public static com.zenixia.plugins.hexiagon.model.Announcement fetchAnnouncement(
        long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchAnnouncement(announcementId);
    }

    /**
    * Returns the announcement with the matching UUID and company.
    *
    * @param uuid the announcement's UUID
    * @param companyId the primary key of the company
    * @return the matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Announcement fetchAnnouncementByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchAnnouncementByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the announcement matching the UUID and group.
    *
    * @param uuid the announcement's UUID
    * @param groupId the primary key of the group
    * @return the matching announcement, or <code>null</code> if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Announcement fetchAnnouncementByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchAnnouncementByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the announcement with the primary key.
    *
    * @param announcementId the primary key of the announcement
    * @return the announcement
    * @throws PortalException if a announcement with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Announcement getAnnouncement(
        long announcementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncement(announcementId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the announcement with the matching UUID and company.
    *
    * @param uuid the announcement's UUID
    * @param companyId the primary key of the company
    * @return the matching announcement
    * @throws PortalException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Announcement getAnnouncementByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the announcement matching the UUID and group.
    *
    * @param uuid the announcement's UUID
    * @param groupId the primary key of the group
    * @return the matching announcement
    * @throws PortalException if a matching announcement could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Announcement getAnnouncementByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementByUuidAndGroupId(uuid, groupId);
    }

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
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> getAnnouncements(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncements(start, end);
    }

    /**
    * Returns the number of announcements.
    *
    * @return the number of announcements
    * @throws SystemException if a system exception occurred
    */
    public static int getAnnouncementsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementsCount();
    }

    /**
    * Updates the announcement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param announcement the announcement
    * @return the announcement that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Announcement updateAnnouncement(
        com.zenixia.plugins.hexiagon.model.Announcement announcement)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateAnnouncement(announcement);
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
    * Adds the Announcement to the database incrementing the primary key
    *
    * @throws PortalException
    */
    public static com.zenixia.plugins.hexiagon.model.Announcement addAnnouncement(
        com.zenixia.plugins.hexiagon.model.Announcement announcement,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addAnnouncement(announcement, serviceContext);
    }

    public static void updateAsset(long userId,
        com.zenixia.plugins.hexiagon.model.Announcement announcement,
        long[] assetCategoryIds, java.lang.String[] assetTagNames,
        long[] assetLinkEntryIds)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService()
            .updateAsset(userId, announcement, assetCategoryIds, assetTagNames,
            assetLinkEntryIds);
    }

    public static com.zenixia.plugins.hexiagon.model.Announcement updateAnnouncement(
        com.zenixia.plugins.hexiagon.model.Announcement announcement,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().updateAnnouncement(announcement, serviceContext);
    }

    /**
    * Gets a list with all the Announcements in a group
    */
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> getAnnouncementsByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementsByGroupId(groupId);
    }

    /**
    * Gets a list with a range of Announcements from a group
    */
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> getAnnouncementsByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementsByGroupId(groupId, start, end);
    }

    /**
    * Gets the number of Announcements in a group
    */
    public static int getAnnouncementsCountByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementsCountByGroupId(groupId);
    }

    /**
    * Gets a list with all the Announcements by type Id
    */
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> getAnnouncementsByTypeId(
        long typeId) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementsByTypeId(typeId);
    }

    /**
    * Gets the number of Announcements by type Id
    */
    public static int getAnnouncementsCountByTypeId(long typeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementsCountByTypeId(typeId);
    }

    /**
    * Gets a list with all the Announcements by currency Id
    */
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> getAnnouncementsByCurrencyId(
        long currencyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementsByCurrencyId(currencyId);
    }

    /**
    * Gets the number of Announcements by currency Id
    */
    public static int getAnnouncementsCountByCurrencyId(long currencyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementsCountByCurrencyId(currencyId);
    }

    public static com.zenixia.plugins.hexiagon.model.Announcement updateStatus(
        long userId, long resourcePrimKey, int status,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateStatus(userId, resourcePrimKey, status, serviceContext);
    }

    public static java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> getFavoritesAnnouncementsByGroupIUserId(
        long groupId, long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getFavoritesAnnouncementsByGroupIUserId(groupId, userId,
            start, end);
    }

    public static void clearService() {
        _service = null;
    }

    public static AnnouncementLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    AnnouncementLocalService.class.getName());

            if (invokableLocalService instanceof AnnouncementLocalService) {
                _service = (AnnouncementLocalService) invokableLocalService;
            } else {
                _service = new AnnouncementLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(AnnouncementLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(AnnouncementLocalService service) {
    }
}
