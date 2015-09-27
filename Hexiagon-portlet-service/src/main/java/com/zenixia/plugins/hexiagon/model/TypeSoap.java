package com.zenixia.plugins.hexiagon.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.zenixia.plugins.hexiagon.service.http.TypeServiceSoap}.
 *
 * @author guillaumelenoir
 * @see com.zenixia.plugins.hexiagon.service.http.TypeServiceSoap
 * @generated
 */
public class TypeSoap implements Serializable {
    private long _typeId;
    private String _name;
    private long _groupId;
    private long _companyId;
    private int _order;

    public TypeSoap() {
    }

    public static TypeSoap toSoapModel(Type model) {
        TypeSoap soapModel = new TypeSoap();

        soapModel.setTypeId(model.getTypeId());
        soapModel.setName(model.getName());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setOrder(model.getOrder());

        return soapModel;
    }

    public static TypeSoap[] toSoapModels(Type[] models) {
        TypeSoap[] soapModels = new TypeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TypeSoap[][] toSoapModels(Type[][] models) {
        TypeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TypeSoap[models.length][models[0].length];
        } else {
            soapModels = new TypeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TypeSoap[] toSoapModels(List<Type> models) {
        List<TypeSoap> soapModels = new ArrayList<TypeSoap>(models.size());

        for (Type model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TypeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _typeId;
    }

    public void setPrimaryKey(long pk) {
        setTypeId(pk);
    }

    public long getTypeId() {
        return _typeId;
    }

    public void setTypeId(long typeId) {
        _typeId = typeId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public int getOrder() {
        return _order;
    }

    public void setOrder(int order) {
        _order = order;
    }
}
