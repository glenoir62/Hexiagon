package com.gleo.plugins.hexiagon.service.persistence;

import com.gleo.plugins.hexiagon.model.Type;
import com.gleo.plugins.hexiagon.service.TypeLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author guillaumelenoir
 * @generated
 */
public abstract class TypeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TypeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TypeLocalServiceUtil.getService());
        setClass(Type.class);

        setClassLoader(com.gleo.plugins.hexiagon.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("typeId");
    }
}
