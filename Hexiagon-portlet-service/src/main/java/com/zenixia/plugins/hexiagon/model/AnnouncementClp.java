package com.zenixia.plugins.hexiagon.model;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.zenixia.plugins.hexiagon.service.AnnouncementLocalServiceUtil;
import com.zenixia.plugins.hexiagon.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class AnnouncementClp extends BaseModelImpl<Announcement>
    implements Announcement {
    private String _uuid;
    private long _announcementId;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private String _userUuid;
    private long _typeId;
    private long _folderId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _currencyId;
    private String _title;
    private String _titleCurrentLanguageId;
    private String _emailAddress;
    private String _phoneNumber;
    private long _price;
    private String _content;
    private String _contentCurrentLanguageId;
    private int _status;
    private long _statusByUserId;
    private String _statusByUserUuid;
    private String _statusByUserName;
    private Date _statusDate;
    private long _countryId;
    private long _regionId;
    private BaseModel<?> _announcementRemoteModel;
    private Class<?> _clpSerializerClass = com.zenixia.plugins.hexiagon.service.ClpSerializer.class;

    public AnnouncementClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Announcement.class;
    }

    @Override
    public String getModelClassName() {
        return Announcement.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _announcementId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setAnnouncementId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _announcementId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("announcementId", getAnnouncementId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("userId", getUserId());
        attributes.put("typeId", getTypeId());
        attributes.put("folderId", getFolderId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("currencyId", getCurrencyId());
        attributes.put("title", getTitle());
        attributes.put("emailAddress", getEmailAddress());
        attributes.put("phoneNumber", getPhoneNumber());
        attributes.put("price", getPrice());
        attributes.put("content", getContent());
        attributes.put("status", getStatus());
        attributes.put("statusByUserId", getStatusByUserId());
        attributes.put("statusByUserName", getStatusByUserName());
        attributes.put("statusDate", getStatusDate());
        attributes.put("countryId", getCountryId());
        attributes.put("regionId", getRegionId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long announcementId = (Long) attributes.get("announcementId");

        if (announcementId != null) {
            setAnnouncementId(announcementId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Long typeId = (Long) attributes.get("typeId");

        if (typeId != null) {
            setTypeId(typeId);
        }

        Long folderId = (Long) attributes.get("folderId");

        if (folderId != null) {
            setFolderId(folderId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Long currencyId = (Long) attributes.get("currencyId");

        if (currencyId != null) {
            setCurrencyId(currencyId);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String emailAddress = (String) attributes.get("emailAddress");

        if (emailAddress != null) {
            setEmailAddress(emailAddress);
        }

        String phoneNumber = (String) attributes.get("phoneNumber");

        if (phoneNumber != null) {
            setPhoneNumber(phoneNumber);
        }

        Long price = (Long) attributes.get("price");

        if (price != null) {
            setPrice(price);
        }

        String content = (String) attributes.get("content");

        if (content != null) {
            setContent(content);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Long statusByUserId = (Long) attributes.get("statusByUserId");

        if (statusByUserId != null) {
            setStatusByUserId(statusByUserId);
        }

        String statusByUserName = (String) attributes.get("statusByUserName");

        if (statusByUserName != null) {
            setStatusByUserName(statusByUserName);
        }

        Date statusDate = (Date) attributes.get("statusDate");

        if (statusDate != null) {
            setStatusDate(statusDate);
        }

        Long countryId = (Long) attributes.get("countryId");

        if (countryId != null) {
            setCountryId(countryId);
        }

        Long regionId = (Long) attributes.get("regionId");

        if (regionId != null) {
            setRegionId(regionId);
        }
    }

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_announcementRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getAnnouncementId() {
        return _announcementId;
    }

    @Override
    public void setAnnouncementId(long announcementId) {
        _announcementId = announcementId;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setAnnouncementId", long.class);

                method.invoke(_announcementRemoteModel, announcementId);
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

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_announcementRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_announcementRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_announcementRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public long getTypeId() {
        return _typeId;
    }

    @Override
    public void setTypeId(long typeId) {
        _typeId = typeId;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setTypeId", long.class);

                method.invoke(_announcementRemoteModel, typeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFolderId() {
        return _folderId;
    }

    @Override
    public void setFolderId(long folderId) {
        _folderId = folderId;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setFolderId", long.class);

                method.invoke(_announcementRemoteModel, folderId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_announcementRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_announcementRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_announcementRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCurrencyId() {
        return _currencyId;
    }

    @Override
    public void setCurrencyId(long currencyId) {
        _currencyId = currencyId;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setCurrencyId", long.class);

                method.invoke(_announcementRemoteModel, currencyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public String getTitle(Locale locale) {
        String languageId = LocaleUtil.toLanguageId(locale);

        return getTitle(languageId);
    }

    @Override
    public String getTitle(Locale locale, boolean useDefault) {
        String languageId = LocaleUtil.toLanguageId(locale);

        return getTitle(languageId, useDefault);
    }

    @Override
    public String getTitle(String languageId) {
        return LocalizationUtil.getLocalization(getTitle(), languageId);
    }

    @Override
    public String getTitle(String languageId, boolean useDefault) {
        return LocalizationUtil.getLocalization(getTitle(), languageId,
            useDefault);
    }

    @Override
    public String getTitleCurrentLanguageId() {
        return _titleCurrentLanguageId;
    }

    @Override
    public String getTitleCurrentValue() {
        Locale locale = getLocale(_titleCurrentLanguageId);

        return getTitle(locale);
    }

    @Override
    public Map<Locale, String> getTitleMap() {
        return LocalizationUtil.getLocalizationMap(getTitle());
    }

    @Override
    public void setTitle(String title) {
        _title = title;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setTitle", String.class);

                method.invoke(_announcementRemoteModel, title);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public void setTitle(String title, Locale locale) {
        setTitle(title, locale, LocaleUtil.getDefault());
    }

    @Override
    public void setTitle(String title, Locale locale, Locale defaultLocale) {
        String languageId = LocaleUtil.toLanguageId(locale);
        String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

        if (Validator.isNotNull(title)) {
            setTitle(LocalizationUtil.updateLocalization(getTitle(), "Title",
                    title, languageId, defaultLanguageId));
        } else {
            setTitle(LocalizationUtil.removeLocalization(getTitle(), "Title",
                    languageId));
        }
    }

    @Override
    public void setTitleCurrentLanguageId(String languageId) {
        _titleCurrentLanguageId = languageId;
    }

    @Override
    public void setTitleMap(Map<Locale, String> titleMap) {
        setTitleMap(titleMap, LocaleUtil.getDefault());
    }

    @Override
    public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale) {
        if (titleMap == null) {
            return;
        }

        ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        try {
            if (contextClassLoader != portalClassLoader) {
                currentThread.setContextClassLoader(portalClassLoader);
            }

            setTitle(LocalizationUtil.updateLocalization(titleMap, getTitle(),
                    "Title", LocaleUtil.toLanguageId(defaultLocale)));
        } finally {
            if (contextClassLoader != portalClassLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    @Override
    public String getEmailAddress() {
        return _emailAddress;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        _emailAddress = emailAddress;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setEmailAddress", String.class);

                method.invoke(_announcementRemoteModel, emailAddress);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPhoneNumber() {
        return _phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setPhoneNumber", String.class);

                method.invoke(_announcementRemoteModel, phoneNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPrice() {
        return _price;
    }

    @Override
    public void setPrice(long price) {
        _price = price;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setPrice", long.class);

                method.invoke(_announcementRemoteModel, price);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getContent() {
        return _content;
    }

    @Override
    public String getContent(Locale locale) {
        String languageId = LocaleUtil.toLanguageId(locale);

        return getContent(languageId);
    }

    @Override
    public String getContent(Locale locale, boolean useDefault) {
        String languageId = LocaleUtil.toLanguageId(locale);

        return getContent(languageId, useDefault);
    }

    @Override
    public String getContent(String languageId) {
        return LocalizationUtil.getLocalization(getContent(), languageId);
    }

    @Override
    public String getContent(String languageId, boolean useDefault) {
        return LocalizationUtil.getLocalization(getContent(), languageId,
            useDefault);
    }

    @Override
    public String getContentCurrentLanguageId() {
        return _contentCurrentLanguageId;
    }

    @Override
    public String getContentCurrentValue() {
        Locale locale = getLocale(_contentCurrentLanguageId);

        return getContent(locale);
    }

    @Override
    public Map<Locale, String> getContentMap() {
        return LocalizationUtil.getLocalizationMap(getContent());
    }

    @Override
    public void setContent(String content) {
        _content = content;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setContent", String.class);

                method.invoke(_announcementRemoteModel, content);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public void setContent(String content, Locale locale) {
        setContent(content, locale, LocaleUtil.getDefault());
    }

    @Override
    public void setContent(String content, Locale locale, Locale defaultLocale) {
        String languageId = LocaleUtil.toLanguageId(locale);
        String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

        if (Validator.isNotNull(content)) {
            setContent(LocalizationUtil.updateLocalization(getContent(),
                    "Content", content, languageId, defaultLanguageId));
        } else {
            setContent(LocalizationUtil.removeLocalization(getContent(),
                    "Content", languageId));
        }
    }

    @Override
    public void setContentCurrentLanguageId(String languageId) {
        _contentCurrentLanguageId = languageId;
    }

    @Override
    public void setContentMap(Map<Locale, String> contentMap) {
        setContentMap(contentMap, LocaleUtil.getDefault());
    }

    @Override
    public void setContentMap(Map<Locale, String> contentMap,
        Locale defaultLocale) {
        if (contentMap == null) {
            return;
        }

        ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        try {
            if (contextClassLoader != portalClassLoader) {
                currentThread.setContextClassLoader(portalClassLoader);
            }

            setContent(LocalizationUtil.updateLocalization(contentMap,
                    getContent(), "Content",
                    LocaleUtil.toLanguageId(defaultLocale)));
        } finally {
            if (contextClassLoader != portalClassLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    @Override
    public int getStatus() {
        return _status;
    }

    @Override
    public void setStatus(int status) {
        _status = status;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", int.class);

                method.invoke(_announcementRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getStatusByUserId() {
        return _statusByUserId;
    }

    @Override
    public void setStatusByUserId(long statusByUserId) {
        _statusByUserId = statusByUserId;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusByUserId", long.class);

                method.invoke(_announcementRemoteModel, statusByUserId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStatusByUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getStatusByUserId(), "uuid",
            _statusByUserUuid);
    }

    @Override
    public void setStatusByUserUuid(String statusByUserUuid) {
        _statusByUserUuid = statusByUserUuid;
    }

    @Override
    public String getStatusByUserName() {
        return _statusByUserName;
    }

    @Override
    public void setStatusByUserName(String statusByUserName) {
        _statusByUserName = statusByUserName;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusByUserName",
                        String.class);

                method.invoke(_announcementRemoteModel, statusByUserName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getStatusDate() {
        return _statusDate;
    }

    @Override
    public void setStatusDate(Date statusDate) {
        _statusDate = statusDate;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setStatusDate", Date.class);

                method.invoke(_announcementRemoteModel, statusDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCountryId() {
        return _countryId;
    }

    @Override
    public void setCountryId(long countryId) {
        _countryId = countryId;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setCountryId", long.class);

                method.invoke(_announcementRemoteModel, countryId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getRegionId() {
        return _regionId;
    }

    @Override
    public void setRegionId(long regionId) {
        _regionId = regionId;

        if (_announcementRemoteModel != null) {
            try {
                Class<?> clazz = _announcementRemoteModel.getClass();

                Method method = clazz.getMethod("setRegionId", long.class);

                method.invoke(_announcementRemoteModel, regionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean isFavorite(long userId) {
        try {
            String methodName = "isFavorite";

            Class<?>[] parameterTypes = new Class<?>[] { long.class };

            Object[] parameterValues = new Object[] { userId };

            Boolean returnObj = (Boolean) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public boolean isValidAgreement() {
        try {
            String methodName = "isValidAgreement";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            Boolean returnObj = (Boolean) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setValidAgreement(boolean isValidAgreement) {
        try {
            String methodName = "setValidAgreement";

            Class<?>[] parameterTypes = new Class<?>[] { boolean.class };

            Object[] parameterValues = new Object[] { isValidAgreement };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getCountry(java.util.Locale locale) {
        try {
            String methodName = "getCountry";

            Class<?>[] parameterTypes = new Class<?>[] { java.util.Locale.class };

            Object[] parameterValues = new Object[] { locale };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getCurrencySymbol() {
        try {
            String methodName = "getCurrencySymbol";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public com.zenixia.plugins.hexiagon.model.Type getType() {
        try {
            String methodName = "getType";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            com.zenixia.plugins.hexiagon.model.Type returnObj = (com.zenixia.plugins.hexiagon.model.Type) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setAnnouncementImages(
        java.util.List<com.zenixia.plugins.hexiagon.model.AnnouncementImage> announcementImages) {
        try {
            String methodName = "setAnnouncementImages";

            Class<?>[] parameterTypes = new Class<?>[] { java.util.List.class };

            Object[] parameterValues = new Object[] { announcementImages };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public int getMessagesCount() {
        try {
            String methodName = "getMessagesCount";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            Integer returnObj = (Integer) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public int getRatingsCount() {
        try {
            String methodName = "getRatingsCount";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            Integer returnObj = (Integer) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getStatus(java.util.Locale locale) {
        try {
            String methodName = "getStatus";

            Class<?>[] parameterTypes = new Class<?>[] { java.util.Locale.class };

            Object[] parameterValues = new Object[] { locale };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.util.List<com.zenixia.plugins.hexiagon.model.AnnouncementImage> getImages() {
        try {
            String methodName = "getImages";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.util.List<com.zenixia.plugins.hexiagon.model.AnnouncementImage> returnObj =
                (java.util.List<com.zenixia.plugins.hexiagon.model.AnnouncementImage>) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public com.zenixia.plugins.hexiagon.model.AnnouncementImage getImage() {
        try {
            String methodName = "getImage";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            com.zenixia.plugins.hexiagon.model.AnnouncementImage returnObj = (com.zenixia.plugins.hexiagon.model.AnnouncementImage) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getSummary(java.util.Locale locale) {
        try {
            String methodName = "getSummary";

            Class<?>[] parameterTypes = new Class<?>[] { java.util.Locale.class };

            Object[] parameterValues = new Object[] { locale };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getAnnouncementUrl(
        com.liferay.portal.kernel.portlet.LiferayPortletRequest liferayPortletRequest,
        com.liferay.portal.kernel.portlet.LiferayPortletResponse liferayPortletResponse) {
        try {
            String methodName = "getAnnouncementUrl";

            Class<?>[] parameterTypes = new Class<?>[] {
                    com.liferay.portal.kernel.portlet.LiferayPortletRequest.class,
                    com.liferay.portal.kernel.portlet.LiferayPortletResponse.class
                };

            Object[] parameterValues = new Object[] {
                    liferayPortletRequest, liferayPortletResponse
                };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.util.List<com.zenixia.plugins.hexiagon.model.AnnouncementImage> getAnnouncementImages() {
        try {
            String methodName = "getAnnouncementImages";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.util.List<com.zenixia.plugins.hexiagon.model.AnnouncementImage> returnObj =
                (java.util.List<com.zenixia.plugins.hexiagon.model.AnnouncementImage>) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Announcement.class.getName()));
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #isApproved}
     */
    @Override
    public boolean getApproved() {
        return isApproved();
    }

    @Override
    public boolean isApproved() {
        if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isDenied() {
        if (getStatus() == WorkflowConstants.STATUS_DENIED) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isDraft() {
        if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isExpired() {
        if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isInactive() {
        if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isIncomplete() {
        if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isPending() {
        if (getStatus() == WorkflowConstants.STATUS_PENDING) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isScheduled() {
        if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
            return true;
        } else {
            return false;
        }
    }

    public BaseModel<?> getAnnouncementRemoteModel() {
        return _announcementRemoteModel;
    }

    public void setAnnouncementRemoteModel(BaseModel<?> announcementRemoteModel) {
        _announcementRemoteModel = announcementRemoteModel;
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

        Class<?> remoteModelClass = _announcementRemoteModel.getClass();

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

        Object returnValue = method.invoke(_announcementRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AnnouncementLocalServiceUtil.addAnnouncement(this);
        } else {
            AnnouncementLocalServiceUtil.updateAnnouncement(this);
        }
    }

    @Override
    public String[] getAvailableLanguageIds() {
        Set<String> availableLanguageIds = new TreeSet<String>();

        Map<Locale, String> titleMap = getTitleMap();

        for (Map.Entry<Locale, String> entry : titleMap.entrySet()) {
            Locale locale = entry.getKey();
            String value = entry.getValue();

            if (Validator.isNotNull(value)) {
                availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
            }
        }

        Map<Locale, String> contentMap = getContentMap();

        for (Map.Entry<Locale, String> entry : contentMap.entrySet()) {
            Locale locale = entry.getKey();
            String value = entry.getValue();

            if (Validator.isNotNull(value)) {
                availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
            }
        }

        return availableLanguageIds.toArray(new String[availableLanguageIds.size()]);
    }

    @Override
    public String getDefaultLanguageId() {
        String xml = getTitle();

        if (xml == null) {
            return StringPool.BLANK;
        }

        return LocalizationUtil.getDefaultLanguageId(xml);
    }

    @Override
    public void prepareLocalizedFieldsForImport() throws LocaleException {
        prepareLocalizedFieldsForImport(null);
    }

    @Override
    @SuppressWarnings("unused")
    public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
        throws LocaleException {
        Locale defaultLocale = LocaleUtil.getDefault();

        String modelDefaultLanguageId = getDefaultLanguageId();

        String title = getTitle(defaultLocale);

        if (Validator.isNull(title)) {
            setTitle(getTitle(modelDefaultLanguageId), defaultLocale);
        } else {
            setTitle(getTitle(defaultLocale), defaultLocale, defaultLocale);
        }

        String content = getContent(defaultLocale);

        if (Validator.isNull(content)) {
            setContent(getContent(modelDefaultLanguageId), defaultLocale);
        } else {
            setContent(getContent(defaultLocale), defaultLocale, defaultLocale);
        }
    }

    @Override
    public Announcement toEscapedModel() {
        return (Announcement) ProxyUtil.newProxyInstance(Announcement.class.getClassLoader(),
            new Class[] { Announcement.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AnnouncementClp clone = new AnnouncementClp();

        clone.setUuid(getUuid());
        clone.setAnnouncementId(getAnnouncementId());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setUserId(getUserId());
        clone.setTypeId(getTypeId());
        clone.setFolderId(getFolderId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setCurrencyId(getCurrencyId());
        clone.setTitle(getTitle());
        clone.setEmailAddress(getEmailAddress());
        clone.setPhoneNumber(getPhoneNumber());
        clone.setPrice(getPrice());
        clone.setContent(getContent());
        clone.setStatus(getStatus());
        clone.setStatusByUserId(getStatusByUserId());
        clone.setStatusByUserName(getStatusByUserName());
        clone.setStatusDate(getStatusDate());
        clone.setCountryId(getCountryId());
        clone.setRegionId(getRegionId());

        return clone;
    }

    @Override
    public int compareTo(Announcement announcement) {
        int value = 0;

        value = getTitle().compareTo(announcement.getTitle());

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

        if (!(obj instanceof AnnouncementClp)) {
            return false;
        }

        AnnouncementClp announcement = (AnnouncementClp) obj;

        long primaryKey = announcement.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(45);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", announcementId=");
        sb.append(getAnnouncementId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", typeId=");
        sb.append(getTypeId());
        sb.append(", folderId=");
        sb.append(getFolderId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", currencyId=");
        sb.append(getCurrencyId());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", emailAddress=");
        sb.append(getEmailAddress());
        sb.append(", phoneNumber=");
        sb.append(getPhoneNumber());
        sb.append(", price=");
        sb.append(getPrice());
        sb.append(", content=");
        sb.append(getContent());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", statusByUserId=");
        sb.append(getStatusByUserId());
        sb.append(", statusByUserName=");
        sb.append(getStatusByUserName());
        sb.append(", statusDate=");
        sb.append(getStatusDate());
        sb.append(", countryId=");
        sb.append(getCountryId());
        sb.append(", regionId=");
        sb.append(getRegionId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(70);

        sb.append("<model><model-name>");
        sb.append("com.zenixia.plugins.hexiagon.model.Announcement");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>announcementId</column-name><column-value><![CDATA[");
        sb.append(getAnnouncementId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>typeId</column-name><column-value><![CDATA[");
        sb.append(getTypeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>folderId</column-name><column-value><![CDATA[");
        sb.append(getFolderId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>currencyId</column-name><column-value><![CDATA[");
        sb.append(getCurrencyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>emailAddress</column-name><column-value><![CDATA[");
        sb.append(getEmailAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>phoneNumber</column-name><column-value><![CDATA[");
        sb.append(getPhoneNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>price</column-name><column-value><![CDATA[");
        sb.append(getPrice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>content</column-name><column-value><![CDATA[");
        sb.append(getContent());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
        sb.append(getStatusByUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusByUserName</column-name><column-value><![CDATA[");
        sb.append(getStatusByUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>statusDate</column-name><column-value><![CDATA[");
        sb.append(getStatusDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>countryId</column-name><column-value><![CDATA[");
        sb.append(getCountryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>regionId</column-name><column-value><![CDATA[");
        sb.append(getRegionId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
