package com.gleo.plugins.hexiagon.service.persistence;

import com.gleo.plugins.hexiagon.model.Announcement;
import com.gleo.plugins.hexiagon.service.AnnouncementLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author guillaumelenoir
 * @generated
 */
public abstract class AnnouncementActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AnnouncementActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AnnouncementLocalServiceUtil.getService());
        setClass(Announcement.class);

        setClassLoader(com.gleo.plugins.hexiagon.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("announcementId");
    }
}
