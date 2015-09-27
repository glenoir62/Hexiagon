package com.zenixia.plugins.hexiagon.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.zenixia.plugins.hexiagon.service.http.CurrencyServiceSoap}.
 *
 * @author guillaumelenoir
 * @see com.zenixia.plugins.hexiagon.service.http.CurrencyServiceSoap
 * @generated
 */
public class CurrencySoap implements Serializable {
    private long _currencyId;
    private long _companyId;
    private String _label;
    private String _symbol;
    private int _order;
    private long _rate;

    public CurrencySoap() {
    }

    public static CurrencySoap toSoapModel(Currency model) {
        CurrencySoap soapModel = new CurrencySoap();

        soapModel.setCurrencyId(model.getCurrencyId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setLabel(model.getLabel());
        soapModel.setSymbol(model.getSymbol());
        soapModel.setOrder(model.getOrder());
        soapModel.setRate(model.getRate());

        return soapModel;
    }

    public static CurrencySoap[] toSoapModels(Currency[] models) {
        CurrencySoap[] soapModels = new CurrencySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CurrencySoap[][] toSoapModels(Currency[][] models) {
        CurrencySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CurrencySoap[models.length][models[0].length];
        } else {
            soapModels = new CurrencySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CurrencySoap[] toSoapModels(List<Currency> models) {
        List<CurrencySoap> soapModels = new ArrayList<CurrencySoap>(models.size());

        for (Currency model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CurrencySoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _currencyId;
    }

    public void setPrimaryKey(long pk) {
        setCurrencyId(pk);
    }

    public long getCurrencyId() {
        return _currencyId;
    }

    public void setCurrencyId(long currencyId) {
        _currencyId = currencyId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public String getLabel() {
        return _label;
    }

    public void setLabel(String label) {
        _label = label;
    }

    public String getSymbol() {
        return _symbol;
    }

    public void setSymbol(String symbol) {
        _symbol = symbol;
    }

    public int getOrder() {
        return _order;
    }

    public void setOrder(int order) {
        _order = order;
    }

    public long getRate() {
        return _rate;
    }

    public void setRate(long rate) {
        _rate = rate;
    }
}
