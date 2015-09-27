package com.zenixia.plugins.hexiagon.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Currency}.
 * </p>
 *
 * @author guillaumelenoir
 * @see Currency
 * @generated
 */
public class CurrencyWrapper implements Currency, ModelWrapper<Currency> {
    private Currency _currency;

    public CurrencyWrapper(Currency currency) {
        _currency = currency;
    }

    @Override
    public Class<?> getModelClass() {
        return Currency.class;
    }

    @Override
    public String getModelClassName() {
        return Currency.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("currencyId", getCurrencyId());
        attributes.put("companyId", getCompanyId());
        attributes.put("label", getLabel());
        attributes.put("symbol", getSymbol());
        attributes.put("order", getOrder());
        attributes.put("rate", getRate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long currencyId = (Long) attributes.get("currencyId");

        if (currencyId != null) {
            setCurrencyId(currencyId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        String label = (String) attributes.get("label");

        if (label != null) {
            setLabel(label);
        }

        String symbol = (String) attributes.get("symbol");

        if (symbol != null) {
            setSymbol(symbol);
        }

        Integer order = (Integer) attributes.get("order");

        if (order != null) {
            setOrder(order);
        }

        Long rate = (Long) attributes.get("rate");

        if (rate != null) {
            setRate(rate);
        }
    }

    /**
    * Returns the primary key of this currency.
    *
    * @return the primary key of this currency
    */
    @Override
    public long getPrimaryKey() {
        return _currency.getPrimaryKey();
    }

    /**
    * Sets the primary key of this currency.
    *
    * @param primaryKey the primary key of this currency
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _currency.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the currency ID of this currency.
    *
    * @return the currency ID of this currency
    */
    @Override
    public long getCurrencyId() {
        return _currency.getCurrencyId();
    }

    /**
    * Sets the currency ID of this currency.
    *
    * @param currencyId the currency ID of this currency
    */
    @Override
    public void setCurrencyId(long currencyId) {
        _currency.setCurrencyId(currencyId);
    }

    /**
    * Returns the company ID of this currency.
    *
    * @return the company ID of this currency
    */
    @Override
    public long getCompanyId() {
        return _currency.getCompanyId();
    }

    /**
    * Sets the company ID of this currency.
    *
    * @param companyId the company ID of this currency
    */
    @Override
    public void setCompanyId(long companyId) {
        _currency.setCompanyId(companyId);
    }

    /**
    * Returns the label of this currency.
    *
    * @return the label of this currency
    */
    @Override
    public java.lang.String getLabel() {
        return _currency.getLabel();
    }

    /**
    * Sets the label of this currency.
    *
    * @param label the label of this currency
    */
    @Override
    public void setLabel(java.lang.String label) {
        _currency.setLabel(label);
    }

    /**
    * Returns the symbol of this currency.
    *
    * @return the symbol of this currency
    */
    @Override
    public java.lang.String getSymbol() {
        return _currency.getSymbol();
    }

    /**
    * Sets the symbol of this currency.
    *
    * @param symbol the symbol of this currency
    */
    @Override
    public void setSymbol(java.lang.String symbol) {
        _currency.setSymbol(symbol);
    }

    /**
    * Returns the order of this currency.
    *
    * @return the order of this currency
    */
    @Override
    public int getOrder() {
        return _currency.getOrder();
    }

    /**
    * Sets the order of this currency.
    *
    * @param order the order of this currency
    */
    @Override
    public void setOrder(int order) {
        _currency.setOrder(order);
    }

    /**
    * Returns the rate of this currency.
    *
    * @return the rate of this currency
    */
    @Override
    public long getRate() {
        return _currency.getRate();
    }

    /**
    * Sets the rate of this currency.
    *
    * @param rate the rate of this currency
    */
    @Override
    public void setRate(long rate) {
        _currency.setRate(rate);
    }

    @Override
    public boolean isNew() {
        return _currency.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _currency.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _currency.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _currency.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _currency.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _currency.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _currency.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _currency.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _currency.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _currency.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _currency.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CurrencyWrapper((Currency) _currency.clone());
    }

    @Override
    public int compareTo(Currency currency) {
        return _currency.compareTo(currency);
    }

    @Override
    public int hashCode() {
        return _currency.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Currency> toCacheModel() {
        return _currency.toCacheModel();
    }

    @Override
    public Currency toEscapedModel() {
        return new CurrencyWrapper(_currency.toEscapedModel());
    }

    @Override
    public Currency toUnescapedModel() {
        return new CurrencyWrapper(_currency.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _currency.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _currency.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _currency.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CurrencyWrapper)) {
            return false;
        }

        CurrencyWrapper currencyWrapper = (CurrencyWrapper) obj;

        if (Validator.equals(_currency, currencyWrapper._currency)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Currency getWrappedCurrency() {
        return _currency;
    }

    @Override
    public Currency getWrappedModel() {
        return _currency;
    }

    @Override
    public void resetOriginalValues() {
        _currency.resetOriginalValues();
    }
}
