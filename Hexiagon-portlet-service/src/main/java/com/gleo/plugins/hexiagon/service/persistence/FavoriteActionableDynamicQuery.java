package com.gleo.plugins.hexiagon.service.persistence;

import com.gleo.plugins.hexiagon.model.Favorite;
import com.gleo.plugins.hexiagon.service.FavoriteLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author guillaumelenoir
 * @generated
 */
public abstract class FavoriteActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FavoriteActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FavoriteLocalServiceUtil.getService());
        setClass(Favorite.class);

        setClassLoader(com.gleo.plugins.hexiagon.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("favoriteId");
    }
}
