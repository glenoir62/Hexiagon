package com.zenixia.plugins.hexiagon.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.zenixia.plugins.hexiagon.model.Favorite;
import com.zenixia.plugins.hexiagon.service.FavoriteLocalServiceUtil;

/**
 * @author guillaumelenoir
 * @generated
 */
public abstract class FavoriteActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FavoriteActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FavoriteLocalServiceUtil.getService());
        setClass(Favorite.class);

        setClassLoader(com.zenixia.plugins.hexiagon.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("favoriteId");
    }
}
