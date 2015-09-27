package com.zenixia.plugins.hexiagon.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the AnnouncementImage service. Represents a row in the &quot;Hexiagon_AnnouncementImage&quot; database table, with each column mapped to a property of this class.
 *
 * @author guillaumelenoir
 * @see AnnouncementImageModel
 * @see com.zenixia.plugins.hexiagon.model.impl.AnnouncementImageImpl
 * @see com.zenixia.plugins.hexiagon.model.impl.AnnouncementImageModelImpl
 * @generated
 */
public interface AnnouncementImage extends AnnouncementImageModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementImageImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.lang.Boolean isActive();

    public void setActive(java.lang.Boolean isActive);

    public java.io.InputStream getInputStream();

    public void setInputStream(java.io.InputStream inputStream);

    public java.lang.String getImageURL(
        com.liferay.portal.theme.ThemeDisplay themeDisplay);
}
