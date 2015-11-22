package com.gleo.plugins.hexiagon.model;

import com.gleo.plugins.hexiagon.service.ClpSerializer;
import com.gleo.plugins.hexiagon.service.CurrencyLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class CurrencyClp extends BaseModelImpl<Currency> implements Currency {
    private long _currencyId;
    private long _companyId;
    private String _label;
    private String _symbol;
    private int _order;
    private long _rate;
    private BaseModel<?> _currencyRemoteModel;

    public CurrencyClp() {
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
    public long getPrimaryKey() {
        return _currencyId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setCurrencyId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _currencyId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getCurrencyId() {
        return _currencyId;
    }

    @Override
    public void setCurrencyId(long currencyId) {
        _currencyId = currencyId;

        if (_currencyRemoteModel != null) {
            try {
                Class<?> clazz = _currencyRemoteModel.getClass();

                Method method = clazz.getMethod("setCurrencyId", long.class);

                method.invoke(_currencyRemoteModel, currencyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_currencyRemoteModel != null) {
            try {
                Class<?> clazz = _currencyRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_currencyRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLabel() {
        return _label;
    }

    @Override
    public void setLabel(String label) {
        _label = label;

        if (_currencyRemoteModel != null) {
            try {
                Class<?> clazz = _currencyRemoteModel.getClass();

                Method method = clazz.getMethod("setLabel", String.class);

                method.invoke(_currencyRemoteModel, label);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSymbol() {
        return _symbol;
    }

    @Override
    public void setSymbol(String symbol) {
        _symbol = symbol;

        if (_currencyRemoteModel != null) {
            try {
                Class<?> clazz = _currencyRemoteModel.getClass();

                Method method = clazz.getMethod("setSymbol", String.class);

                method.invoke(_currencyRemoteModel, symbol);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getOrder() {
        return _order;
    }

    @Override
    public void setOrder(int order) {
        _order = order;

        if (_currencyRemoteModel != null) {
            try {
                Class<?> clazz = _currencyRemoteModel.getClass();

                Method method = clazz.getMethod("setOrder", int.class);

                method.invoke(_currencyRemoteModel, order);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getRate() {
        return _rate;
    }

    @Override
    public void setRate(long rate) {
        _rate = rate;

        if (_currencyRemoteModel != null) {
            try {
                Class<?> clazz = _currencyRemoteModel.getClass();

                Method method = clazz.getMethod("setRate", long.class);

                method.invoke(_currencyRemoteModel, rate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getCurrencyRemoteModel() {
        return _currencyRemoteModel;
    }

    public void setCurrencyRemoteModel(BaseModel<?> currencyRemoteModel) {
        _currencyRemoteModel = currencyRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _currencyRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_currencyRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CurrencyLocalServiceUtil.addCurrency(this);
        } else {
            CurrencyLocalServiceUtil.updateCurrency(this);
        }
    }

    @Override
    public Currency toEscapedModel() {
        return (Currency) ProxyUtil.newProxyInstance(Currency.class.getClassLoader(),
            new Class[] { Currency.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        CurrencyClp clone = new CurrencyClp();

        clone.setCurrencyId(getCurrencyId());
        clone.setCompanyId(getCompanyId());
        clone.setLabel(getLabel());
        clone.setSymbol(getSymbol());
        clone.setOrder(getOrder());
        clone.setRate(getRate());

        return clone;
    }

    @Override
    public int compareTo(Currency currency) {
        int value = 0;

        if (getOrder() < currency.getOrder()) {
            value = -1;
        } else if (getOrder() > currency.getOrder()) {
            value = 1;
        } else {
            value = 0;
        }

        value = value * -1;

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CurrencyClp)) {
            return false;
        }

        CurrencyClp currency = (CurrencyClp) obj;

        long primaryKey = currency.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{currencyId=");
        sb.append(getCurrencyId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", label=");
        sb.append(getLabel());
        sb.append(", symbol=");
        sb.append(getSymbol());
        sb.append(", order=");
        sb.append(getOrder());
        sb.append(", rate=");
        sb.append(getRate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.gleo.plugins.hexiagon.model.Currency");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>currencyId</column-name><column-value><![CDATA[");
        sb.append(getCurrencyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>label</column-name><column-value><![CDATA[");
        sb.append(getLabel());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>symbol</column-name><column-value><![CDATA[");
        sb.append(getSymbol());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>order</column-name><column-value><![CDATA[");
        sb.append(getOrder());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rate</column-name><column-value><![CDATA[");
        sb.append(getRate());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
