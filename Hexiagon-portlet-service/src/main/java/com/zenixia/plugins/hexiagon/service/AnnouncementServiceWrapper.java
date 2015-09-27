package com.zenixia.plugins.hexiagon.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AnnouncementService}.
 *
 * @author guillaumelenoir
 * @see AnnouncementService
 * @generated
 */
public class AnnouncementServiceWrapper implements AnnouncementService,
    ServiceWrapper<AnnouncementService> {
    private AnnouncementService _announcementService;

    public AnnouncementServiceWrapper(AnnouncementService announcementService) {
        _announcementService = announcementService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _announcementService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _announcementService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _announcementService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.zenixia.plugins.hexiagon.model.Announcement addAnnouncement(
        com.zenixia.plugins.hexiagon.model.Announcement announcement,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return _announcementService.addAnnouncement(announcement, serviceContext);
    }

    @Override
    public com.zenixia.plugins.hexiagon.model.Announcement updateAnnouncement(
        com.zenixia.plugins.hexiagon.model.Announcement announcement,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return _announcementService.updateAnnouncement(announcement,
            serviceContext);
    }

    @Override
    public com.zenixia.plugins.hexiagon.model.Announcement deleteAnnouncement(
        long announcementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return _announcementService.deleteAnnouncement(announcementId);
    }

    @Override
    public com.zenixia.plugins.hexiagon.model.Announcement getAnnouncement(
        long announcementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _announcementService.getAnnouncement(announcementId);
    }

    @Override
    public java.util.List<com.zenixia.plugins.hexiagon.model.Announcement> getAnnouncementsByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementService.getAnnouncementsByGroupId(groupId, start,
            end);
    }

    @Override
    public int getAnnouncementsCountByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementService.getAnnouncementsCountByGroupId(groupId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AnnouncementService getWrappedAnnouncementService() {
        return _announcementService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAnnouncementService(
        AnnouncementService announcementService) {
        _announcementService = announcementService;
    }

    @Override
    public AnnouncementService getWrappedService() {
        return _announcementService;
    }

    @Override
    public void setWrappedService(AnnouncementService announcementService) {
        _announcementService = announcementService;
    }
}
