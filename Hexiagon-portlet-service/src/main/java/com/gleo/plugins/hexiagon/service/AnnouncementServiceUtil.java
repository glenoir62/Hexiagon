package com.gleo.plugins.hexiagon.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Announcement. This utility wraps
 * {@link com.gleo.plugins.hexiagon.service.impl.AnnouncementServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author guillaumelenoir
 * @see AnnouncementService
 * @see com.gleo.plugins.hexiagon.service.base.AnnouncementServiceBaseImpl
 * @see com.gleo.plugins.hexiagon.service.impl.AnnouncementServiceImpl
 * @generated
 */
public class AnnouncementServiceUtil {
    private static AnnouncementService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.gleo.plugins.hexiagon.service.impl.AnnouncementServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

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

    public static com.gleo.plugins.hexiagon.model.Announcement addAnnouncement(
        com.gleo.plugins.hexiagon.model.Announcement announcement,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return getService().addAnnouncement(announcement, serviceContext);
    }

    public static com.gleo.plugins.hexiagon.model.Announcement updateAnnouncement(
        com.gleo.plugins.hexiagon.model.Announcement announcement,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return getService().updateAnnouncement(announcement, serviceContext);
    }

    public static com.gleo.plugins.hexiagon.model.Announcement deleteAnnouncement(
        long announcementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.security.auth.PrincipalException {
        return getService().deleteAnnouncement(announcementId);
    }

    public static com.gleo.plugins.hexiagon.model.Announcement getAnnouncement(
        long announcementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncement(announcementId);
    }

    public static java.util.List<com.gleo.plugins.hexiagon.model.Announcement> getAnnouncementsByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementsByGroupId(groupId, start, end);
    }

    public static int getAnnouncementsCountByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementsCountByGroupId(groupId);
    }

    public static void clearService() {
        _service = null;
    }

    public static AnnouncementService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    AnnouncementService.class.getName());

            if (invokableService instanceof AnnouncementService) {
                _service = (AnnouncementService) invokableService;
            } else {
                _service = new AnnouncementServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(AnnouncementServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(AnnouncementService service) {
    }
}
