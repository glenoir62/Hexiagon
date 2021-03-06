package com.gleo.plugins.hexiagon.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author guillaumelenoir
 * @generated
 */
public class AnnouncementImageSoap implements Serializable {
    private long _announcementImageId;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private long _announcementId;
    private long _fileEntryId;
    private String _description;
    private int _order;

    public AnnouncementImageSoap() {
    }

    public static AnnouncementImageSoap toSoapModel(AnnouncementImage model) {
        AnnouncementImageSoap soapModel = new AnnouncementImageSoap();

        soapModel.setAnnouncementImageId(model.getAnnouncementImageId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setAnnouncementId(model.getAnnouncementId());
        soapModel.setFileEntryId(model.getFileEntryId());
        soapModel.setDescription(model.getDescription());
        soapModel.setOrder(model.getOrder());

        return soapModel;
    }

    public static AnnouncementImageSoap[] toSoapModels(
        AnnouncementImage[] models) {
        AnnouncementImageSoap[] soapModels = new AnnouncementImageSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AnnouncementImageSoap[][] toSoapModels(
        AnnouncementImage[][] models) {
        AnnouncementImageSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AnnouncementImageSoap[models.length][models[0].length];
        } else {
            soapModels = new AnnouncementImageSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AnnouncementImageSoap[] toSoapModels(
        List<AnnouncementImage> models) {
        List<AnnouncementImageSoap> soapModels = new ArrayList<AnnouncementImageSoap>(models.size());

        for (AnnouncementImage model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AnnouncementImageSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _announcementImageId;
    }

    public void setPrimaryKey(long pk) {
        setAnnouncementImageId(pk);
    }

    public long getAnnouncementImageId() {
        return _announcementImageId;
    }

    public void setAnnouncementImageId(long announcementImageId) {
        _announcementImageId = announcementImageId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public long getAnnouncementId() {
        return _announcementId;
    }

    public void setAnnouncementId(long announcementId) {
        _announcementId = announcementId;
    }

    public long getFileEntryId() {
        return _fileEntryId;
    }

    public void setFileEntryId(long fileEntryId) {
        _fileEntryId = fileEntryId;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public int getOrder() {
        return _order;
    }

    public void setOrder(int order) {
        _order = order;
    }
}
