package com.gleo.plugins.hexiagon.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Announcement}.
 * </p>
 *
 * @author guillaumelenoir
 * @see Announcement
 * @generated
 */
public class AnnouncementWrapper implements Announcement,
    ModelWrapper<Announcement> {
    private Announcement _announcement;

    public AnnouncementWrapper(Announcement announcement) {
        _announcement = announcement;
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

    /**
    * Returns the primary key of this announcement.
    *
    * @return the primary key of this announcement
    */
    @Override
    public long getPrimaryKey() {
        return _announcement.getPrimaryKey();
    }

    /**
    * Sets the primary key of this announcement.
    *
    * @param primaryKey the primary key of this announcement
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _announcement.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this announcement.
    *
    * @return the uuid of this announcement
    */
    @Override
    public java.lang.String getUuid() {
        return _announcement.getUuid();
    }

    /**
    * Sets the uuid of this announcement.
    *
    * @param uuid the uuid of this announcement
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _announcement.setUuid(uuid);
    }

    /**
    * Returns the announcement ID of this announcement.
    *
    * @return the announcement ID of this announcement
    */
    @Override
    public long getAnnouncementId() {
        return _announcement.getAnnouncementId();
    }

    /**
    * Sets the announcement ID of this announcement.
    *
    * @param announcementId the announcement ID of this announcement
    */
    @Override
    public void setAnnouncementId(long announcementId) {
        _announcement.setAnnouncementId(announcementId);
    }

    /**
    * Returns the company ID of this announcement.
    *
    * @return the company ID of this announcement
    */
    @Override
    public long getCompanyId() {
        return _announcement.getCompanyId();
    }

    /**
    * Sets the company ID of this announcement.
    *
    * @param companyId the company ID of this announcement
    */
    @Override
    public void setCompanyId(long companyId) {
        _announcement.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this announcement.
    *
    * @return the group ID of this announcement
    */
    @Override
    public long getGroupId() {
        return _announcement.getGroupId();
    }

    /**
    * Sets the group ID of this announcement.
    *
    * @param groupId the group ID of this announcement
    */
    @Override
    public void setGroupId(long groupId) {
        _announcement.setGroupId(groupId);
    }

    /**
    * Returns the user ID of this announcement.
    *
    * @return the user ID of this announcement
    */
    @Override
    public long getUserId() {
        return _announcement.getUserId();
    }

    /**
    * Sets the user ID of this announcement.
    *
    * @param userId the user ID of this announcement
    */
    @Override
    public void setUserId(long userId) {
        _announcement.setUserId(userId);
    }

    /**
    * Returns the user uuid of this announcement.
    *
    * @return the user uuid of this announcement
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcement.getUserUuid();
    }

    /**
    * Sets the user uuid of this announcement.
    *
    * @param userUuid the user uuid of this announcement
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _announcement.setUserUuid(userUuid);
    }

    /**
    * Returns the type ID of this announcement.
    *
    * @return the type ID of this announcement
    */
    @Override
    public long getTypeId() {
        return _announcement.getTypeId();
    }

    /**
    * Sets the type ID of this announcement.
    *
    * @param typeId the type ID of this announcement
    */
    @Override
    public void setTypeId(long typeId) {
        _announcement.setTypeId(typeId);
    }

    /**
    * Returns the folder ID of this announcement.
    *
    * @return the folder ID of this announcement
    */
    @Override
    public long getFolderId() {
        return _announcement.getFolderId();
    }

    /**
    * Sets the folder ID of this announcement.
    *
    * @param folderId the folder ID of this announcement
    */
    @Override
    public void setFolderId(long folderId) {
        _announcement.setFolderId(folderId);
    }

    /**
    * Returns the user name of this announcement.
    *
    * @return the user name of this announcement
    */
    @Override
    public java.lang.String getUserName() {
        return _announcement.getUserName();
    }

    /**
    * Sets the user name of this announcement.
    *
    * @param userName the user name of this announcement
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _announcement.setUserName(userName);
    }

    /**
    * Returns the create date of this announcement.
    *
    * @return the create date of this announcement
    */
    @Override
    public java.util.Date getCreateDate() {
        return _announcement.getCreateDate();
    }

    /**
    * Sets the create date of this announcement.
    *
    * @param createDate the create date of this announcement
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _announcement.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this announcement.
    *
    * @return the modified date of this announcement
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _announcement.getModifiedDate();
    }

    /**
    * Sets the modified date of this announcement.
    *
    * @param modifiedDate the modified date of this announcement
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _announcement.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the currency ID of this announcement.
    *
    * @return the currency ID of this announcement
    */
    @Override
    public long getCurrencyId() {
        return _announcement.getCurrencyId();
    }

    /**
    * Sets the currency ID of this announcement.
    *
    * @param currencyId the currency ID of this announcement
    */
    @Override
    public void setCurrencyId(long currencyId) {
        _announcement.setCurrencyId(currencyId);
    }

    /**
    * Returns the title of this announcement.
    *
    * @return the title of this announcement
    */
    @Override
    public java.lang.String getTitle() {
        return _announcement.getTitle();
    }

    /**
    * Returns the localized title of this announcement in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param locale the locale of the language
    * @return the localized title of this announcement
    */
    @Override
    public java.lang.String getTitle(java.util.Locale locale) {
        return _announcement.getTitle(locale);
    }

    /**
    * Returns the localized title of this announcement in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param locale the local of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized title of this announcement. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
    */
    @Override
    public java.lang.String getTitle(java.util.Locale locale, boolean useDefault) {
        return _announcement.getTitle(locale, useDefault);
    }

    /**
    * Returns the localized title of this announcement in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @return the localized title of this announcement
    */
    @Override
    public java.lang.String getTitle(java.lang.String languageId) {
        return _announcement.getTitle(languageId);
    }

    /**
    * Returns the localized title of this announcement in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized title of this announcement
    */
    @Override
    public java.lang.String getTitle(java.lang.String languageId,
        boolean useDefault) {
        return _announcement.getTitle(languageId, useDefault);
    }

    @Override
    public java.lang.String getTitleCurrentLanguageId() {
        return _announcement.getTitleCurrentLanguageId();
    }

    @Override
    public java.lang.String getTitleCurrentValue() {
        return _announcement.getTitleCurrentValue();
    }

    /**
    * Returns a map of the locales and localized titles of this announcement.
    *
    * @return the locales and localized titles of this announcement
    */
    @Override
    public java.util.Map<java.util.Locale, java.lang.String> getTitleMap() {
        return _announcement.getTitleMap();
    }

    /**
    * Sets the title of this announcement.
    *
    * @param title the title of this announcement
    */
    @Override
    public void setTitle(java.lang.String title) {
        _announcement.setTitle(title);
    }

    /**
    * Sets the localized title of this announcement in the language.
    *
    * @param title the localized title of this announcement
    * @param locale the locale of the language
    */
    @Override
    public void setTitle(java.lang.String title, java.util.Locale locale) {
        _announcement.setTitle(title, locale);
    }

    /**
    * Sets the localized title of this announcement in the language, and sets the default locale.
    *
    * @param title the localized title of this announcement
    * @param locale the locale of the language
    * @param defaultLocale the default locale
    */
    @Override
    public void setTitle(java.lang.String title, java.util.Locale locale,
        java.util.Locale defaultLocale) {
        _announcement.setTitle(title, locale, defaultLocale);
    }

    @Override
    public void setTitleCurrentLanguageId(java.lang.String languageId) {
        _announcement.setTitleCurrentLanguageId(languageId);
    }

    /**
    * Sets the localized titles of this announcement from the map of locales and localized titles.
    *
    * @param titleMap the locales and localized titles of this announcement
    */
    @Override
    public void setTitleMap(
        java.util.Map<java.util.Locale, java.lang.String> titleMap) {
        _announcement.setTitleMap(titleMap);
    }

    /**
    * Sets the localized titles of this announcement from the map of locales and localized titles, and sets the default locale.
    *
    * @param titleMap the locales and localized titles of this announcement
    * @param defaultLocale the default locale
    */
    @Override
    public void setTitleMap(
        java.util.Map<java.util.Locale, java.lang.String> titleMap,
        java.util.Locale defaultLocale) {
        _announcement.setTitleMap(titleMap, defaultLocale);
    }

    /**
    * Returns the email address of this announcement.
    *
    * @return the email address of this announcement
    */
    @Override
    public java.lang.String getEmailAddress() {
        return _announcement.getEmailAddress();
    }

    /**
    * Sets the email address of this announcement.
    *
    * @param emailAddress the email address of this announcement
    */
    @Override
    public void setEmailAddress(java.lang.String emailAddress) {
        _announcement.setEmailAddress(emailAddress);
    }

    /**
    * Returns the phone number of this announcement.
    *
    * @return the phone number of this announcement
    */
    @Override
    public java.lang.String getPhoneNumber() {
        return _announcement.getPhoneNumber();
    }

    /**
    * Sets the phone number of this announcement.
    *
    * @param phoneNumber the phone number of this announcement
    */
    @Override
    public void setPhoneNumber(java.lang.String phoneNumber) {
        _announcement.setPhoneNumber(phoneNumber);
    }

    /**
    * Returns the price of this announcement.
    *
    * @return the price of this announcement
    */
    @Override
    public long getPrice() {
        return _announcement.getPrice();
    }

    /**
    * Sets the price of this announcement.
    *
    * @param price the price of this announcement
    */
    @Override
    public void setPrice(long price) {
        _announcement.setPrice(price);
    }

    /**
    * Returns the content of this announcement.
    *
    * @return the content of this announcement
    */
    @Override
    public java.lang.String getContent() {
        return _announcement.getContent();
    }

    /**
    * Returns the localized content of this announcement in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param locale the locale of the language
    * @return the localized content of this announcement
    */
    @Override
    public java.lang.String getContent(java.util.Locale locale) {
        return _announcement.getContent(locale);
    }

    /**
    * Returns the localized content of this announcement in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param locale the local of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized content of this announcement. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
    */
    @Override
    public java.lang.String getContent(java.util.Locale locale,
        boolean useDefault) {
        return _announcement.getContent(locale, useDefault);
    }

    /**
    * Returns the localized content of this announcement in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @return the localized content of this announcement
    */
    @Override
    public java.lang.String getContent(java.lang.String languageId) {
        return _announcement.getContent(languageId);
    }

    /**
    * Returns the localized content of this announcement in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized content of this announcement
    */
    @Override
    public java.lang.String getContent(java.lang.String languageId,
        boolean useDefault) {
        return _announcement.getContent(languageId, useDefault);
    }

    @Override
    public java.lang.String getContentCurrentLanguageId() {
        return _announcement.getContentCurrentLanguageId();
    }

    @Override
    public java.lang.String getContentCurrentValue() {
        return _announcement.getContentCurrentValue();
    }

    /**
    * Returns a map of the locales and localized contents of this announcement.
    *
    * @return the locales and localized contents of this announcement
    */
    @Override
    public java.util.Map<java.util.Locale, java.lang.String> getContentMap() {
        return _announcement.getContentMap();
    }

    /**
    * Sets the content of this announcement.
    *
    * @param content the content of this announcement
    */
    @Override
    public void setContent(java.lang.String content) {
        _announcement.setContent(content);
    }

    /**
    * Sets the localized content of this announcement in the language.
    *
    * @param content the localized content of this announcement
    * @param locale the locale of the language
    */
    @Override
    public void setContent(java.lang.String content, java.util.Locale locale) {
        _announcement.setContent(content, locale);
    }

    /**
    * Sets the localized content of this announcement in the language, and sets the default locale.
    *
    * @param content the localized content of this announcement
    * @param locale the locale of the language
    * @param defaultLocale the default locale
    */
    @Override
    public void setContent(java.lang.String content, java.util.Locale locale,
        java.util.Locale defaultLocale) {
        _announcement.setContent(content, locale, defaultLocale);
    }

    @Override
    public void setContentCurrentLanguageId(java.lang.String languageId) {
        _announcement.setContentCurrentLanguageId(languageId);
    }

    /**
    * Sets the localized contents of this announcement from the map of locales and localized contents.
    *
    * @param contentMap the locales and localized contents of this announcement
    */
    @Override
    public void setContentMap(
        java.util.Map<java.util.Locale, java.lang.String> contentMap) {
        _announcement.setContentMap(contentMap);
    }

    /**
    * Sets the localized contents of this announcement from the map of locales and localized contents, and sets the default locale.
    *
    * @param contentMap the locales and localized contents of this announcement
    * @param defaultLocale the default locale
    */
    @Override
    public void setContentMap(
        java.util.Map<java.util.Locale, java.lang.String> contentMap,
        java.util.Locale defaultLocale) {
        _announcement.setContentMap(contentMap, defaultLocale);
    }

    /**
    * Returns the status of this announcement.
    *
    * @return the status of this announcement
    */
    @Override
    public int getStatus() {
        return _announcement.getStatus();
    }

    /**
    * Sets the status of this announcement.
    *
    * @param status the status of this announcement
    */
    @Override
    public void setStatus(int status) {
        _announcement.setStatus(status);
    }

    /**
    * Returns the status by user ID of this announcement.
    *
    * @return the status by user ID of this announcement
    */
    @Override
    public long getStatusByUserId() {
        return _announcement.getStatusByUserId();
    }

    /**
    * Sets the status by user ID of this announcement.
    *
    * @param statusByUserId the status by user ID of this announcement
    */
    @Override
    public void setStatusByUserId(long statusByUserId) {
        _announcement.setStatusByUserId(statusByUserId);
    }

    /**
    * Returns the status by user uuid of this announcement.
    *
    * @return the status by user uuid of this announcement
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getStatusByUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcement.getStatusByUserUuid();
    }

    /**
    * Sets the status by user uuid of this announcement.
    *
    * @param statusByUserUuid the status by user uuid of this announcement
    */
    @Override
    public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
        _announcement.setStatusByUserUuid(statusByUserUuid);
    }

    /**
    * Returns the status by user name of this announcement.
    *
    * @return the status by user name of this announcement
    */
    @Override
    public java.lang.String getStatusByUserName() {
        return _announcement.getStatusByUserName();
    }

    /**
    * Sets the status by user name of this announcement.
    *
    * @param statusByUserName the status by user name of this announcement
    */
    @Override
    public void setStatusByUserName(java.lang.String statusByUserName) {
        _announcement.setStatusByUserName(statusByUserName);
    }

    /**
    * Returns the status date of this announcement.
    *
    * @return the status date of this announcement
    */
    @Override
    public java.util.Date getStatusDate() {
        return _announcement.getStatusDate();
    }

    /**
    * Sets the status date of this announcement.
    *
    * @param statusDate the status date of this announcement
    */
    @Override
    public void setStatusDate(java.util.Date statusDate) {
        _announcement.setStatusDate(statusDate);
    }

    /**
    * Returns the country ID of this announcement.
    *
    * @return the country ID of this announcement
    */
    @Override
    public long getCountryId() {
        return _announcement.getCountryId();
    }

    /**
    * Sets the country ID of this announcement.
    *
    * @param countryId the country ID of this announcement
    */
    @Override
    public void setCountryId(long countryId) {
        _announcement.setCountryId(countryId);
    }

    /**
    * Returns the region ID of this announcement.
    *
    * @return the region ID of this announcement
    */
    @Override
    public long getRegionId() {
        return _announcement.getRegionId();
    }

    /**
    * Sets the region ID of this announcement.
    *
    * @param regionId the region ID of this announcement
    */
    @Override
    public void setRegionId(long regionId) {
        _announcement.setRegionId(regionId);
    }

    /**
    * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
    */
    @Override
    public boolean getApproved() {
        return _announcement.getApproved();
    }

    /**
    * Returns <code>true</code> if this announcement is approved.
    *
    * @return <code>true</code> if this announcement is approved; <code>false</code> otherwise
    */
    @Override
    public boolean isApproved() {
        return _announcement.isApproved();
    }

    /**
    * Returns <code>true</code> if this announcement is denied.
    *
    * @return <code>true</code> if this announcement is denied; <code>false</code> otherwise
    */
    @Override
    public boolean isDenied() {
        return _announcement.isDenied();
    }

    /**
    * Returns <code>true</code> if this announcement is a draft.
    *
    * @return <code>true</code> if this announcement is a draft; <code>false</code> otherwise
    */
    @Override
    public boolean isDraft() {
        return _announcement.isDraft();
    }

    /**
    * Returns <code>true</code> if this announcement is expired.
    *
    * @return <code>true</code> if this announcement is expired; <code>false</code> otherwise
    */
    @Override
    public boolean isExpired() {
        return _announcement.isExpired();
    }

    /**
    * Returns <code>true</code> if this announcement is inactive.
    *
    * @return <code>true</code> if this announcement is inactive; <code>false</code> otherwise
    */
    @Override
    public boolean isInactive() {
        return _announcement.isInactive();
    }

    /**
    * Returns <code>true</code> if this announcement is incomplete.
    *
    * @return <code>true</code> if this announcement is incomplete; <code>false</code> otherwise
    */
    @Override
    public boolean isIncomplete() {
        return _announcement.isIncomplete();
    }

    /**
    * Returns <code>true</code> if this announcement is pending.
    *
    * @return <code>true</code> if this announcement is pending; <code>false</code> otherwise
    */
    @Override
    public boolean isPending() {
        return _announcement.isPending();
    }

    /**
    * Returns <code>true</code> if this announcement is scheduled.
    *
    * @return <code>true</code> if this announcement is scheduled; <code>false</code> otherwise
    */
    @Override
    public boolean isScheduled() {
        return _announcement.isScheduled();
    }

    @Override
    public boolean isNew() {
        return _announcement.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _announcement.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _announcement.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _announcement.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _announcement.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _announcement.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _announcement.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _announcement.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _announcement.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _announcement.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _announcement.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.String[] getAvailableLanguageIds() {
        return _announcement.getAvailableLanguageIds();
    }

    @Override
    public java.lang.String getDefaultLanguageId() {
        return _announcement.getDefaultLanguageId();
    }

    @Override
    public void prepareLocalizedFieldsForImport()
        throws com.liferay.portal.LocaleException {
        _announcement.prepareLocalizedFieldsForImport();
    }

    @Override
    public void prepareLocalizedFieldsForImport(
        java.util.Locale defaultImportLocale)
        throws com.liferay.portal.LocaleException {
        _announcement.prepareLocalizedFieldsForImport(defaultImportLocale);
    }

    @Override
    public java.lang.Object clone() {
        return new AnnouncementWrapper((Announcement) _announcement.clone());
    }

    @Override
    public int compareTo(Announcement announcement) {
        return _announcement.compareTo(announcement);
    }

    @Override
    public int hashCode() {
        return _announcement.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Announcement> toCacheModel() {
        return _announcement.toCacheModel();
    }

    @Override
    public Announcement toEscapedModel() {
        return new AnnouncementWrapper(_announcement.toEscapedModel());
    }

    @Override
    public Announcement toUnescapedModel() {
        return new AnnouncementWrapper(_announcement.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _announcement.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _announcement.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _announcement.persist();
    }

    @Override
    public void setAnnouncementImages(
        java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> announcementImages) {
        _announcement.setAnnouncementImages(announcementImages);
    }

    @Override
    public boolean isFavorite(long userId) {
        return _announcement.isFavorite(userId);
    }

    @Override
    public boolean isValidAgreement() {
        return _announcement.isValidAgreement();
    }

    @Override
    public void setValidAgreement(boolean isValidAgreement) {
        _announcement.setValidAgreement(isValidAgreement);
    }

    @Override
    public java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> getAnnouncementImages() {
        return _announcement.getAnnouncementImages();
    }

    @Override
    public java.util.List<com.gleo.plugins.hexiagon.model.AnnouncementImage> getImages() {
        return _announcement.getImages();
    }

    @Override
    public com.gleo.plugins.hexiagon.model.AnnouncementImage getImage() {
        return _announcement.getImage();
    }

    @Override
    public com.gleo.plugins.hexiagon.model.Type getType() {
        return _announcement.getType();
    }

    @Override
    public java.lang.String getSummary(java.util.Locale locale) {
        return _announcement.getSummary(locale);
    }

    @Override
    public int getMessagesCount() {
        return _announcement.getMessagesCount();
    }

    /**
    * @return
    */
    @Override
    public int getRatingsCount() {
        return _announcement.getRatingsCount();
    }

    /**
    * @return
    */
    @Override
    public java.lang.String getCurrencySymbol() {
        return _announcement.getCurrencySymbol();
    }

    /**
    * @param locale
    * @return
    */
    @Override
    public java.lang.String getStatus(java.util.Locale locale) {
        return _announcement.getStatus(locale);
    }

    /**
    * @param locale
    * @return
    */
    @Override
    public java.lang.String getCountry(java.util.Locale locale) {
        return _announcement.getCountry(locale);
    }

    /**
    * @param liferayPortletRequest
    * @param liferayPortletResponse
    * @return
    * @throws WindowStateException
    */
    @Override
    public java.lang.String getAnnouncementUrl(
        com.liferay.portal.kernel.portlet.LiferayPortletRequest liferayPortletRequest,
        com.liferay.portal.kernel.portlet.LiferayPortletResponse liferayPortletResponse)
        throws java.lang.Exception {
        return _announcement.getAnnouncementUrl(liferayPortletRequest,
            liferayPortletResponse);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AnnouncementWrapper)) {
            return false;
        }

        AnnouncementWrapper announcementWrapper = (AnnouncementWrapper) obj;

        if (Validator.equals(_announcement, announcementWrapper._announcement)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _announcement.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Announcement getWrappedAnnouncement() {
        return _announcement;
    }

    @Override
    public Announcement getWrappedModel() {
        return _announcement;
    }

    @Override
    public void resetOriginalValues() {
        _announcement.resetOriginalValues();
    }
}
