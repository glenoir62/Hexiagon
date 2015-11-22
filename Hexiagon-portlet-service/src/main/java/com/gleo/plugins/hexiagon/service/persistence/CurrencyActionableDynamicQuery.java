package com.gleo.plugins.hexiagon.service.persistence;

import com.gleo.plugins.hexiagon.model.Currency;
import com.gleo.plugins.hexiagon.service.CurrencyLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author guillaumelenoir
 * @generated
 */
public abstract class CurrencyActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CurrencyActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CurrencyLocalServiceUtil.getService());
        setClass(Currency.class);

        setClassLoader(com.gleo.plugins.hexiagon.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("currencyId");
    }
}
