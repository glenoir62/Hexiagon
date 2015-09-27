package com.zenixia.plugins.hexiagon.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.zenixia.plugins.hexiagon.model.Currency;
import com.zenixia.plugins.hexiagon.service.CurrencyLocalServiceUtil;

/**
 * @author guillaumelenoir
 * @generated
 */
public abstract class CurrencyActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CurrencyActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CurrencyLocalServiceUtil.getService());
        setClass(Currency.class);

        setClassLoader(com.zenixia.plugins.hexiagon.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("currencyId");
    }
}
