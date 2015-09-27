package com.zenixia.plugins.hexiagon.model;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.zenixia.plugins.hexiagon.service.AnnouncementImageLocalServiceUtil;
import com.zenixia.plugins.hexiagon.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class AnnouncementImageClp extends BaseModelImpl<AnnouncementImage>
    implements AnnouncementImage {
    private long _announcementImageId;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private String _userUuid;
    private long _announcementId;
    private long _fileEntryId;
    private String _description;
    private String _descriptionCurrentLanguageId;
    private int _order;
    private BaseModel<?> _announcementImageRemoteModel;
    private Class<?> _clpSerializerClass = com.zenixia.plugins.hexiagon.service.ClpSerializer.class;

    public AnnouncementImageClp() {
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
    public long getPrimaryKey() {
        return _announcementImageId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setAnnouncementImageId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _announcementImageId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getAnnouncementImageId() {
        return _announcementImageId;
    }

    @Override
    public void setAnnouncementImageId(long announcementImageId) {
        _announcementImageId = announcementImageId;

        if (_announcementImageRemoteModel != null) {
            try {
                Class<?> clazz = _announcementImageRemoteModel.getClass();

                Method method = clazz.getMethod("setAnnouncementImageId",
                        long.class);

                method.invoke(_announcementImageRemoteModel, announcementImageId);
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

        if (_announcementImageRemoteModel != null) {
            try {
                Class<?> clazz = _announcementImageRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_announcementImageRemoteModel, companyId);
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

        if (_announcementImageRemoteModel != null) {
            try {
                Class<?> clazz = _announcementImageRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_announcementImageRemoteModel, groupId);
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

        if (_announcementImageRemoteModel != null) {
            try {
                Class<?> clazz = _announcementImageRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_announcementImageRemoteModel, userId);
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
    public long getAnnouncementId() {
        return _announcementId;
    }

    @Override
    public void setAnnouncementId(long announcementId) {
        _announcementId = announcementId;

        if (_announcementImageRemoteModel != null) {
            try {
                Class<?> clazz = _announcementImageRemoteModel.getClass();

                Method method = clazz.getMethod("setAnnouncementId", long.class);

                method.invoke(_announcementImageRemoteModel, announcementId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFileEntryId() {
        return _fileEntryId;
    }

    @Override
    public void setFileEntryId(long fileEntryId) {
        _fileEntryId = fileEntryId;

        if (_announcementImageRemoteModel != null) {
            try {
                Class<?> clazz = _announcementImageRemoteModel.getClass();

                Method method = clazz.getMethod("setFileEntryId", long.class);

                method.invoke(_announcementImageRemoteModel, fileEntryId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public String getDescription(Locale locale) {
        String languageId = LocaleUtil.toLanguageId(locale);

        return getDescription(languageId);
    }

    @Override
    public String getDescription(Locale locale, boolean useDefault) {
        String languageId = LocaleUtil.toLanguageId(locale);

        return getDescription(languageId, useDefault);
    }

    @Override
    public String getDescription(String languageId) {
        return LocalizationUtil.getLocalization(getDescription(), languageId);
    }

    @Override
    public String getDescription(String languageId, boolean useDefault) {
        return LocalizationUtil.getLocalization(getDescription(), languageId,
            useDefault);
    }

    @Override
    public String getDescriptionCurrentLanguageId() {
        return _descriptionCurrentLanguageId;
    }

    @Override
    public String getDescriptionCurrentValue() {
        Locale locale = getLocale(_descriptionCurrentLanguageId);

        return getDescription(locale);
    }

    @Override
    public Map<Locale, String> getDescriptionMap() {
        return LocalizationUtil.getLocalizationMap(getDescription());
    }

    @Override
    public void setDescription(String description) {
        _description = description;

        if (_announcementImageRemoteModel != null) {
            try {
                Class<?> clazz = _announcementImageRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_announcementImageRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public void setDescription(String description, Locale locale) {
        setDescription(description, locale, LocaleUtil.getDefault());
    }

    @Override
    public void setDescription(String description, Locale locale,
        Locale defaultLocale) {
        String languageId = LocaleUtil.toLanguageId(locale);
        String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

        if (Validator.isNotNull(description)) {
            setDescription(LocalizationUtil.updateLocalization(
                    getDescription(), "Description", description, languageId,
                    defaultLanguageId));
        } else {
            setDescription(LocalizationUtil.removeLocalization(
                    getDescription(), "Description", languageId));
        }
    }

    @Override
    public void setDescriptionCurrentLanguageId(String languageId) {
        _descriptionCurrentLanguageId = languageId;
    }

    @Override
    public void setDescriptionMap(Map<Locale, String> descriptionMap) {
        setDescriptionMap(descriptionMap, LocaleUtil.getDefault());
    }

    @Override
    public void setDescriptionMap(Map<Locale, String> descriptionMap,
        Locale defaultLocale) {
        if (descriptionMap == null) {
            return;
        }

        ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        try {
            if (contextClassLoader != portalClassLoader) {
                currentThread.setContextClassLoader(portalClassLoader);
            }

            setDescription(LocalizationUtil.updateLocalization(descriptionMap,
                    getDescription(), "Description",
                    LocaleUtil.toLanguageId(defaultLocale)));
        } finally {
            if (contextClassLoader != portalClassLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
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

        if (_announcementImageRemoteModel != null) {
            try {
                Class<?> clazz = _announcementImageRemoteModel.getClass();

                Method method = clazz.getMethod("setOrder", int.class);

                method.invoke(_announcementImageRemoteModel, order);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public void setActive(java.lang.Boolean isActive) {
        try {
            String methodName = "setActive";

            Class<?>[] parameterTypes = new Class<?>[] { java.lang.Boolean.class };

            Object[] parameterValues = new Object[] { isActive };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.Boolean isActive() {
        try {
            String methodName = "isActive";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.Boolean returnObj = (java.lang.Boolean) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.io.InputStream getInputStream() {
        try {
            String methodName = "getInputStream";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.io.InputStream returnObj = (java.io.InputStream) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void setInputStream(java.io.InputStream inputStream) {
        try {
            String methodName = "setInputStream";

            Class<?>[] parameterTypes = new Class<?>[] { java.io.InputStream.class };

            Object[] parameterValues = new Object[] { inputStream };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getImageURL(
        com.liferay.portal.theme.ThemeDisplay themeDisplay) {
        try {
            String methodName = "getImageURL";

            Class<?>[] parameterTypes = new Class<?>[] {
                    com.liferay.portal.theme.ThemeDisplay.class
                };

            Object[] parameterValues = new Object[] { themeDisplay };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public BaseModel<?> getAnnouncementImageRemoteModel() {
        return _announcementImageRemoteModel;
    }

    public void setAnnouncementImageRemoteModel(
        BaseModel<?> announcementImageRemoteModel) {
        _announcementImageRemoteModel = announcementImageRemoteModel;
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

        Class<?> remoteModelClass = _announcementImageRemoteModel.getClass();

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

        Object returnValue = method.invoke(_announcementImageRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AnnouncementImageLocalServiceUtil.addAnnouncementImage(this);
        } else {
            AnnouncementImageLocalServiceUtil.updateAnnouncementImage(this);
        }
    }

    @Override
    public String[] getAvailableLanguageIds() {
        Set<String> availableLanguageIds = new TreeSet<String>();

        Map<Locale, String> descriptionMap = getDescriptionMap();

        for (Map.Entry<Locale, String> entry : descriptionMap.entrySet()) {
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
        String xml = getDescription();

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

        String description = getDescription(defaultLocale);

        if (Validator.isNull(description)) {
            setDescription(getDescription(modelDefaultLanguageId), defaultLocale);
        } else {
            setDescription(getDescription(defaultLocale), defaultLocale,
                defaultLocale);
        }
    }

    @Override
    public AnnouncementImage toEscapedModel() {
        return (AnnouncementImage) ProxyUtil.newProxyInstance(AnnouncementImage.class.getClassLoader(),
            new Class[] { AnnouncementImage.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AnnouncementImageClp clone = new AnnouncementImageClp();

        clone.setAnnouncementImageId(getAnnouncementImageId());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setUserId(getUserId());
        clone.setAnnouncementId(getAnnouncementId());
        clone.setFileEntryId(getFileEntryId());
        clone.setDescription(getDescription());
        clone.setOrder(getOrder());

        return clone;
    }

    @Override
    public int compareTo(AnnouncementImage announcementImage) {
        int value = 0;

        if (getOrder() < announcementImage.getOrder()) {
            value = -1;
        } else if (getOrder() > announcementImage.getOrder()) {
            value = 1;
        } else {
            value = 0;
        }

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

        if (!(obj instanceof AnnouncementImageClp)) {
            return false;
        }

        AnnouncementImageClp announcementImage = (AnnouncementImageClp) obj;

        long primaryKey = announcementImage.getPrimaryKey();

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
        StringBundler sb = new StringBundler(17);

        sb.append("{announcementImageId=");
        sb.append(getAnnouncementImageId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", announcementId=");
        sb.append(getAnnouncementId());
        sb.append(", fileEntryId=");
        sb.append(getFileEntryId());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", order=");
        sb.append(getOrder());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.zenixia.plugins.hexiagon.model.AnnouncementImage");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>announcementImageId</column-name><column-value><![CDATA[");
        sb.append(getAnnouncementImageId());
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
            "<column><column-name>announcementId</column-name><column-value><![CDATA[");
        sb.append(getAnnouncementId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
        sb.append(getFileEntryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>order</column-name><column-value><![CDATA[");
        sb.append(getOrder());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
