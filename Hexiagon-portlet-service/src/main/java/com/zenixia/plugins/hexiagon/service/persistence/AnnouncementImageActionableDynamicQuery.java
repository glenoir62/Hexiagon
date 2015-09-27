package com.zenixia.plugins.hexiagon.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.zenixia.plugins.hexiagon.model.AnnouncementImage;
import com.zenixia.plugins.hexiagon.service.AnnouncementImageLocalServiceUtil;

/**
 * @author guillaumelenoir
 * @generated
 */
public abstract class AnnouncementImageActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AnnouncementImageActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AnnouncementImageLocalServiceUtil.getService());
        setClass(AnnouncementImage.class);

        setClassLoader(com.zenixia.plugins.hexiagon.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("announcementImageId");
    }
}
