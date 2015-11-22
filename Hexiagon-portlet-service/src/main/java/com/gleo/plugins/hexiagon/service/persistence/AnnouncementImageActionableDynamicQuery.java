package com.gleo.plugins.hexiagon.service.persistence;

import com.gleo.plugins.hexiagon.model.AnnouncementImage;
import com.gleo.plugins.hexiagon.service.AnnouncementImageLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author guillaumelenoir
 * @generated
 */
public abstract class AnnouncementImageActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AnnouncementImageActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AnnouncementImageLocalServiceUtil.getService());
        setClass(AnnouncementImage.class);

        setClassLoader(com.gleo.plugins.hexiagon.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("announcementImageId");
    }
}
