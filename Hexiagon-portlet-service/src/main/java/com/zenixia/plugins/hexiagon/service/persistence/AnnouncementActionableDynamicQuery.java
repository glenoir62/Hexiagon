package com.zenixia.plugins.hexiagon.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.zenixia.plugins.hexiagon.model.Announcement;
import com.zenixia.plugins.hexiagon.service.AnnouncementLocalServiceUtil;

/**
 * @author guillaumelenoir
 * @generated
 */
public abstract class AnnouncementActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AnnouncementActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AnnouncementLocalServiceUtil.getService());
        setClass(Announcement.class);

        setClassLoader(com.zenixia.plugins.hexiagon.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("announcementId");
    }
}
