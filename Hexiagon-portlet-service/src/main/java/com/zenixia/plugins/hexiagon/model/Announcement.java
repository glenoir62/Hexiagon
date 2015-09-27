package com.zenixia.plugins.hexiagon.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Announcement service. Represents a row in the &quot;Hexiagon_Announcement&quot; database table, with each column mapped to a property of this class.
 *
 * @author guillaumelenoir
 * @see AnnouncementModel
 * @see com.zenixia.plugins.hexiagon.model.impl.AnnouncementImpl
 * @see com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl
 * @generated
 */
public interface Announcement extends AnnouncementModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public void setAnnouncementImages(
        java.util.List<com.zenixia.plugins.hexiagon.model.AnnouncementImage> announcementImages);

    public boolean isFavorite(long userId);

    public boolean isValidAgreement();

    public void setValidAgreement(boolean isValidAgreement);

    public java.util.List<com.zenixia.plugins.hexiagon.model.AnnouncementImage> getAnnouncementImages();

    public java.util.List<com.zenixia.plugins.hexiagon.model.AnnouncementImage> getImages();

    public com.zenixia.plugins.hexiagon.model.AnnouncementImage getImage();

    public com.zenixia.plugins.hexiagon.model.Type getType();

    public java.lang.String getSummary(java.util.Locale locale);

    public int getMessagesCount();

    /**
    * @return
    */
    public int getRatingsCount();

    /**
    * @return
    */
    public java.lang.String getCurrencySymbol();

    /**
    * @param locale
    * @return
    */
    public java.lang.String getStatus(java.util.Locale locale);

    /**
    * @param locale
    * @return
    */
    public java.lang.String getCountry(java.util.Locale locale);

    /**
    * @param liferayPortletRequest
    * @param liferayPortletResponse
    * @return
    * @throws WindowStateException
    */
    public java.lang.String getAnnouncementUrl(
        com.liferay.portal.kernel.portlet.LiferayPortletRequest liferayPortletRequest,
        com.liferay.portal.kernel.portlet.LiferayPortletResponse liferayPortletResponse)
        throws java.lang.Exception;
}
