package com.gleo.plugins.hexiagon.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AnnouncementImage}.
 * </p>
 *
 * @author guillaumelenoir
 * @see AnnouncementImage
 * @generated
 */
public class AnnouncementImageWrapper implements AnnouncementImage,
    ModelWrapper<AnnouncementImage> {
    private AnnouncementImage _announcementImage;

    public AnnouncementImageWrapper(AnnouncementImage announcementImage) {
        _announcementImage = announcementImage;
    }

    @Override
    public Class<?> getModelClass() {
        return AnnouncementImage.class;
    }

    @Override
    public String getModelClassName() {
        return AnnouncementImage.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("announcementImageId", getAnnouncementImageId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("userId", getUserId());
        attributes.put("announcementId", getAnnouncementId());
        attributes.put("fileEntryId", getFileEntryId());
        attributes.put("description", getDescription());
        attributes.put("order", getOrder());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long announcementImageId = (Long) attributes.get("announcementImageId");

        if (announcementImageId != null) {
            setAnnouncementImageId(announcementImageId);
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

        Long announcementId = (Long) attributes.get("announcementId");

        if (announcementId != null) {
            setAnnouncementId(announcementId);
        }

        Long fileEntryId = (Long) attributes.get("fileEntryId");

        if (fileEntryId != null) {
            setFileEntryId(fileEntryId);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        Integer order = (Integer) attributes.get("order");

        if (order != null) {
            setOrder(order);
        }
    }

    /**
    * Returns the primary key of this announcement image.
    *
    * @return the primary key of this announcement image
    */
    @Override
    public long getPrimaryKey() {
        return _announcementImage.getPrimaryKey();
    }

    /**
    * Sets the primary key of this announcement image.
    *
    * @param primaryKey the primary key of this announcement image
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _announcementImage.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the announcement image ID of this announcement image.
    *
    * @return the announcement image ID of this announcement image
    */
    @Override
    public long getAnnouncementImageId() {
        return _announcementImage.getAnnouncementImageId();
    }

    /**
    * Sets the announcement image ID of this announcement image.
    *
    * @param announcementImageId the announcement image ID of this announcement image
    */
    @Override
    public void setAnnouncementImageId(long announcementImageId) {
        _announcementImage.setAnnouncementImageId(announcementImageId);
    }

    /**
    * Returns the company ID of this announcement image.
    *
    * @return the company ID of this announcement image
    */
    @Override
    public long getCompanyId() {
        return _announcementImage.getCompanyId();
    }

    /**
    * Sets the company ID of this announcement image.
    *
    * @param companyId the company ID of this announcement image
    */
    @Override
    public void setCompanyId(long companyId) {
        _announcementImage.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this announcement image.
    *
    * @return the group ID of this announcement image
    */
    @Override
    public long getGroupId() {
        return _announcementImage.getGroupId();
    }

    /**
    * Sets the group ID of this announcement image.
    *
    * @param groupId the group ID of this announcement image
    */
    @Override
    public void setGroupId(long groupId) {
        _announcementImage.setGroupId(groupId);
    }

    /**
    * Returns the user ID of this announcement image.
    *
    * @return the user ID of this announcement image
    */
    @Override
    public long getUserId() {
        return _announcementImage.getUserId();
    }

    /**
    * Sets the user ID of this announcement image.
    *
    * @param userId the user ID of this announcement image
    */
    @Override
    public void setUserId(long userId) {
        _announcementImage.setUserId(userId);
    }

    /**
    * Returns the user uuid of this announcement image.
    *
    * @return the user uuid of this announcement image
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _announcementImage.getUserUuid();
    }

    /**
    * Sets the user uuid of this announcement image.
    *
    * @param userUuid the user uuid of this announcement image
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _announcementImage.setUserUuid(userUuid);
    }

    /**
    * Returns the announcement ID of this announcement image.
    *
    * @return the announcement ID of this announcement image
    */
    @Override
    public long getAnnouncementId() {
        return _announcementImage.getAnnouncementId();
    }

    /**
    * Sets the announcement ID of this announcement image.
    *
    * @param announcementId the announcement ID of this announcement image
    */
    @Override
    public void setAnnouncementId(long announcementId) {
        _announcementImage.setAnnouncementId(announcementId);
    }

    /**
    * Returns the file entry ID of this announcement image.
    *
    * @return the file entry ID of this announcement image
    */
    @Override
    public long getFileEntryId() {
        return _announcementImage.getFileEntryId();
    }

    /**
    * Sets the file entry ID of this announcement image.
    *
    * @param fileEntryId the file entry ID of this announcement image
    */
    @Override
    public void setFileEntryId(long fileEntryId) {
        _announcementImage.setFileEntryId(fileEntryId);
    }

    /**
    * Returns the description of this announcement image.
    *
    * @return the description of this announcement image
    */
    @Override
    public java.lang.String getDescription() {
        return _announcementImage.getDescription();
    }

    /**
    * Returns the localized description of this announcement image in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param locale the locale of the language
    * @return the localized description of this announcement image
    */
    @Override
    public java.lang.String getDescription(java.util.Locale locale) {
        return _announcementImage.getDescription(locale);
    }

    /**
    * Returns the localized description of this announcement image in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param locale the local of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized description of this announcement image. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
    */
    @Override
    public java.lang.String getDescription(java.util.Locale locale,
        boolean useDefault) {
        return _announcementImage.getDescription(locale, useDefault);
    }

    /**
    * Returns the localized description of this announcement image in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @return the localized description of this announcement image
    */
    @Override
    public java.lang.String getDescription(java.lang.String languageId) {
        return _announcementImage.getDescription(languageId);
    }

    /**
    * Returns the localized description of this announcement image in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized description of this announcement image
    */
    @Override
    public java.lang.String getDescription(java.lang.String languageId,
        boolean useDefault) {
        return _announcementImage.getDescription(languageId, useDefault);
    }

    @Override
    public java.lang.String getDescriptionCurrentLanguageId() {
        return _announcementImage.getDescriptionCurrentLanguageId();
    }

    @Override
    public java.lang.String getDescriptionCurrentValue() {
        return _announcementImage.getDescriptionCurrentValue();
    }

    /**
    * Returns a map of the locales and localized descriptions of this announcement image.
    *
    * @return the locales and localized descriptions of this announcement image
    */
    @Override
    public java.util.Map<java.util.Locale, java.lang.String> getDescriptionMap() {
        return _announcementImage.getDescriptionMap();
    }

    /**
    * Sets the description of this announcement image.
    *
    * @param description the description of this announcement image
    */
    @Override
    public void setDescription(java.lang.String description) {
        _announcementImage.setDescription(description);
    }

    /**
    * Sets the localized description of this announcement image in the language.
    *
    * @param description the localized description of this announcement image
    * @param locale the locale of the language
    */
    @Override
    public void setDescription(java.lang.String description,
        java.util.Locale locale) {
        _announcementImage.setDescription(description, locale);
    }

    /**
    * Sets the localized description of this announcement image in the language, and sets the default locale.
    *
    * @param description the localized description of this announcement image
    * @param locale the locale of the language
    * @param defaultLocale the default locale
    */
    @Override
    public void setDescription(java.lang.String description,
        java.util.Locale locale, java.util.Locale defaultLocale) {
        _announcementImage.setDescription(description, locale, defaultLocale);
    }

    @Override
    public void setDescriptionCurrentLanguageId(java.lang.String languageId) {
        _announcementImage.setDescriptionCurrentLanguageId(languageId);
    }

    /**
    * Sets the localized descriptions of this announcement image from the map of locales and localized descriptions.
    *
    * @param descriptionMap the locales and localized descriptions of this announcement image
    */
    @Override
    public void setDescriptionMap(
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap) {
        _announcementImage.setDescriptionMap(descriptionMap);
    }

    /**
    * Sets the localized descriptions of this announcement image from the map of locales and localized descriptions, and sets the default locale.
    *
    * @param descriptionMap the locales and localized descriptions of this announcement image
    * @param defaultLocale the default locale
    */
    @Override
    public void setDescriptionMap(
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        java.util.Locale defaultLocale) {
        _announcementImage.setDescriptionMap(descriptionMap, defaultLocale);
    }

    /**
    * Returns the order of this announcement image.
    *
    * @return the order of this announcement image
    */
    @Override
    public int getOrder() {
        return _announcementImage.getOrder();
    }

    /**
    * Sets the order of this announcement image.
    *
    * @param order the order of this announcement image
    */
    @Override
    public void setOrder(int order) {
        _announcementImage.setOrder(order);
    }

    @Override
    public boolean isNew() {
        return _announcementImage.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _announcementImage.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _announcementImage.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _announcementImage.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _announcementImage.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _announcementImage.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _announcementImage.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _announcementImage.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _announcementImage.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _announcementImage.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _announcementImage.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.String[] getAvailableLanguageIds() {
        return _announcementImage.getAvailableLanguageIds();
    }

    @Override
    public java.lang.String getDefaultLanguageId() {
        return _announcementImage.getDefaultLanguageId();
    }

    @Override
    public void prepareLocalizedFieldsForImport()
        throws com.liferay.portal.LocaleException {
        _announcementImage.prepareLocalizedFieldsForImport();
    }

    @Override
    public void prepareLocalizedFieldsForImport(
        java.util.Locale defaultImportLocale)
        throws com.liferay.portal.LocaleException {
        _announcementImage.prepareLocalizedFieldsForImport(defaultImportLocale);
    }

    @Override
    public java.lang.Object clone() {
        return new AnnouncementImageWrapper((AnnouncementImage) _announcementImage.clone());
    }

    @Override
    public int compareTo(AnnouncementImage announcementImage) {
        return _announcementImage.compareTo(announcementImage);
    }

    @Override
    public int hashCode() {
        return _announcementImage.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<AnnouncementImage> toCacheModel() {
        return _announcementImage.toCacheModel();
    }

    @Override
    public AnnouncementImage toEscapedModel() {
        return new AnnouncementImageWrapper(_announcementImage.toEscapedModel());
    }

    @Override
    public AnnouncementImage toUnescapedModel() {
        return new AnnouncementImageWrapper(_announcementImage.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _announcementImage.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _announcementImage.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _announcementImage.persist();
    }

    @Override
    public java.lang.Boolean isActive() {
        return _announcementImage.isActive();
    }

    @Override
    public void setActive(java.lang.Boolean isActive) {
        _announcementImage.setActive(isActive);
    }

    @Override
    public java.io.InputStream getInputStream() {
        return _announcementImage.getInputStream();
    }

    @Override
    public void setInputStream(java.io.InputStream inputStream) {
        _announcementImage.setInputStream(inputStream);
    }

    @Override
    public java.lang.String getImageURL(
        com.liferay.portal.theme.ThemeDisplay themeDisplay) {
        return _announcementImage.getImageURL(themeDisplay);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AnnouncementImageWrapper)) {
            return false;
        }

        AnnouncementImageWrapper announcementImageWrapper = (AnnouncementImageWrapper) obj;

        if (Validator.equals(_announcementImage,
                    announcementImageWrapper._announcementImage)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public AnnouncementImage getWrappedAnnouncementImage() {
        return _announcementImage;
    }

    @Override
    public AnnouncementImage getWrappedModel() {
        return _announcementImage;
    }

    @Override
    public void resetOriginalValues() {
        _announcementImage.resetOriginalValues();
    }
}
