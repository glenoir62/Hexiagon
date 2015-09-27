package com.zenixia.plugins.hexiagon.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.zenixia.plugins.hexiagon.model.Type;
import com.zenixia.plugins.hexiagon.service.TypeLocalServiceUtil;

/**
 * @author guillaumelenoir
 * @generated
 */
public abstract class TypeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TypeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TypeLocalServiceUtil.getService());
        setClass(Type.class);

        setClassLoader(com.zenixia.plugins.hexiagon.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("typeId");
    }
}
