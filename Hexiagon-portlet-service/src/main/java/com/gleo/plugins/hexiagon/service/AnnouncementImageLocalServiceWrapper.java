package com.gleo.plugins.hexiagon.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AnnouncementImageLocalService}.
 *
 * @author guillaumelenoir
 * @see AnnouncementImageLocalService
 * @generated
 */
public class AnnouncementImageLocalServiceWrapper
    implements AnnouncementImageLocalService,
        ServiceWrapper<AnnouncementImageLocalService> {
    private AnnouncementImageLocalService _announcementImageLocalService;

    public AnnouncementImageLocalServiceWrapper(
        AnnouncementImageLocalService announcementImageLocalService) {
        _announcementImageLocalService = announcementImageLocalService;
    }

    /**
    * Adds the announcement image to the database. Also notifies the appropriate model listeners.
    *
    * @param announcementImage the announcement image
    * @return the announcement image that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.gleo.plugins.hexiagon.model.AnnouncementImage addAnnouncementImage(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.addAnnouncementImage(announcementImage);
    }

    /**
    * Creates a new announcement image with the primary key. Does not add the announcement image to the database.
    *
    * @param announcementImageId the primary key for the new announcement image
    * @return the new announcement image
    */
    @Override
    public com.gleo.plugins.hexiagon.model.AnnouncementImage createAnnouncementImage(
        long announcementImageId) {
        return _announcementImageLocalService.createAnnouncementImage(announcementImageId);
    }

    /**
    * Deletes the announcement image with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param announcementImageId the primary key of the announcement image
    * @return the announcement image that was removed
    * @throws PortalException if a announcement image with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.gleo.plugins.hexiagon.model.AnnouncementImage deleteAnnouncementImage(
        long announcementImageId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.deleteAnnouncementImage(announcementImageId);
    }

    /**
    * Deletes the announcement image from the database. Also notifies the appropriate model listeners.
    *
    * @param announcementImage the announcement image
    * @return the announcement image that was removed
    * @throws PortalException
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.gleo.plugins.hexiagon.model.AnnouncementImage deleteAnnouncementImage(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.deleteAnnouncementImage(announcementImage);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _announcementImageLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.dynamicQuery(dynamicQuery, start,
            end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.gleo.plugins.hexiagon.model.AnnouncementImage fetchAnnouncementImage(
        long announcementImageId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.fetchAnnouncementImage(announcementImageId);
    }

    /**
    * Returns the announcement image with the primary key.
    *
    * @param announcementImageId the primary key of the announcement image
    * @return the announcement image
    * @throws PortalException if a announcement image with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.gleo.plugins.hexiagon.model.AnnouncementImage getAnnouncementImage(
        long announcementImageId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.getAnnouncementImage(announcementImageId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> getAnnouncementImages(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.getAnnouncementImages(start, end);
    }

    /**
    * Returns the number of announcement images.
    *
    * @return the number of announcement images
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getAnnouncementImagesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.getAnnouncementImagesCount();
    }

    /**
    * Updates the announcement image in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param announcementImage the announcement image
    * @return the announcement image that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.gleo.plugins.hexiagon.model.AnnouncementImage updateAnnouncementImage(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.updateAnnouncementImage(announcementImage);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _announcementImageLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _announcementImageLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _announcementImageLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public com.gleo.plugins.hexiagon.model.AnnouncementImage addAnnouncementImage(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage,
        long annoucementFolderId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.addAnnouncementImage(announcementImage,
            annoucementFolderId, serviceContext);
    }

    @Override
    public java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> getAnnouncementImageByAnnouncementId(
        long announcementId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.getAnnouncementImageByAnnouncementId(announcementId);
    }

    @Override
    public com.gleo.plugins.hexiagon.model.AnnouncementImage getAnnouncementImageByAnnouncementIdOrder(
        long announcementId, int order)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.getAnnouncementImageByAnnouncementIdOrder(announcementId,
            order);
    }

    @Override
    public com.gleo.plugins.hexiagon.model.AnnouncementImage updateAnnouncementImage(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage,
        long annoucementFolderId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _announcementImageLocalService.updateAnnouncementImage(announcementImage,
            annoucementFolderId, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AnnouncementImageLocalService getWrappedAnnouncementImageLocalService() {
        return _announcementImageLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAnnouncementImageLocalService(
        AnnouncementImageLocalService announcementImageLocalService) {
        _announcementImageLocalService = announcementImageLocalService;
    }

    @Override
    public AnnouncementImageLocalService getWrappedService() {
        return _announcementImageLocalService;
    }

    @Override
    public void setWrappedService(
        AnnouncementImageLocalService announcementImageLocalService) {
        _announcementImageLocalService = announcementImageLocalService;
    }
}
