package com.gleo.plugins.hexiagon.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for AnnouncementImage. This utility wraps
 * {@link com.gleo.plugins.hexiagon.service.impl.AnnouncementImageLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author guillaumelenoir
 * @see AnnouncementImageLocalService
 * @see com.gleo.plugins.hexiagon.service.base.AnnouncementImageLocalServiceBaseImpl
 * @see com.gleo.plugins.hexiagon.service.impl.AnnouncementImageLocalServiceImpl
 * @generated
 */
public class AnnouncementImageLocalServiceUtil {
    private static AnnouncementImageLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.gleo.plugins.hexiagon.service.impl.AnnouncementImageLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the announcement image to the database. Also notifies the appropriate model listeners.
    *
    * @param announcementImage the announcement image
    * @return the announcement image that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage addAnnouncementImage(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addAnnouncementImage(announcementImage);
    }

    /**
    * Creates a new announcement image with the primary key. Does not add the announcement image to the database.
    *
    * @param announcementImageId the primary key for the new announcement image
    * @return the new announcement image
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage createAnnouncementImage(
        long announcementImageId) {
        return getService().createAnnouncementImage(announcementImageId);
    }

    /**
    * Deletes the announcement image with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param announcementImageId the primary key of the announcement image
    * @return the announcement image that was removed
    * @throws PortalException if a announcement image with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage deleteAnnouncementImage(
        long announcementImageId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAnnouncementImage(announcementImageId);
    }

    /**
    * Deletes the announcement image from the database. Also notifies the appropriate model listeners.
    *
    * @param announcementImage the announcement image
    * @return the announcement image that was removed
    * @throws PortalException
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage deleteAnnouncementImage(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAnnouncementImage(announcementImage);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.gleo.plugins.hexiagon.model.AnnouncementImage fetchAnnouncementImage(
        long announcementImageId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchAnnouncementImage(announcementImageId);
    }

    /**
    * Returns the announcement image with the primary key.
    *
    * @param announcementImageId the primary key of the announcement image
    * @return the announcement image
    * @throws PortalException if a announcement image with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage getAnnouncementImage(
        long announcementImageId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementImage(announcementImageId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> getAnnouncementImages(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementImages(start, end);
    }

    /**
    * Returns the number of announcement images.
    *
    * @return the number of announcement images
    * @throws SystemException if a system exception occurred
    */
    public static int getAnnouncementImagesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementImagesCount();
    }

    /**
    * Updates the announcement image in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param announcementImage the announcement image
    * @return the announcement image that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.gleo.plugins.hexiagon.model.AnnouncementImage updateAnnouncementImage(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateAnnouncementImage(announcementImage);
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

    public static com.gleo.plugins.hexiagon.model.AnnouncementImage addAnnouncementImage(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage,
        long annoucementFolderId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addAnnouncementImage(announcementImage,
            annoucementFolderId, serviceContext);
    }

    public static java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> getAnnouncementImageByAnnouncementId(
        long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAnnouncementImageByAnnouncementId(announcementId);
    }

    public static com.gleo.plugins.hexiagon.model.AnnouncementImage getAnnouncementImageByAnnouncementIdOrder(
        long announcementId, int order)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getAnnouncementImageByAnnouncementIdOrder(announcementId,
            order);
    }

    public static com.gleo.plugins.hexiagon.model.AnnouncementImage updateAnnouncementImage(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage,
        long annoucementFolderId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateAnnouncementImage(announcementImage,
            annoucementFolderId, serviceContext);
    }

    public static void clearService() {
        _service = null;
    }

    public static AnnouncementImageLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    AnnouncementImageLocalService.class.getName());

            if (invokableLocalService instanceof AnnouncementImageLocalService) {
                _service = (AnnouncementImageLocalService) invokableLocalService;
            } else {
                _service = new AnnouncementImageLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(AnnouncementImageLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(AnnouncementImageLocalService service) {
    }
}
