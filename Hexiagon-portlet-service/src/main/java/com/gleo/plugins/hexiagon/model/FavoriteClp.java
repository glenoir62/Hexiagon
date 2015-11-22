package com.gleo.plugins.hexiagon.model;

import com.gleo.plugins.hexiagon.service.ClpSerializer;
import com.gleo.plugins.hexiagon.service.FavoriteLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class FavoriteClp extends BaseModelImpl<Favorite> implements Favorite {
    private long _favoriteId;
    private long _announcementId;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private String _userUuid;
    private BaseModel<?> _favoriteRemoteModel;

    public FavoriteClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Favorite.class;
    }

    @Override
    public String getModelClassName() {
        return Favorite.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _favoriteId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setFavoriteId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _favoriteId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("favoriteId", getFavoriteId());
        attributes.put("announcementId", getAnnouncementId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("userId", getUserId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long favoriteId = (Long) attributes.get("favoriteId");

        if (favoriteId != null) {
            setFavoriteId(favoriteId);
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
    }

    @Override
    public long getFavoriteId() {
        return _favoriteId;
    }

    @Override
    public void setFavoriteId(long favoriteId) {
        _favoriteId = favoriteId;

        if (_favoriteRemoteModel != null) {
            try {
                Class<?> clazz = _favoriteRemoteModel.getClass();

                Method method = clazz.getMethod("setFavoriteId", long.class);

                method.invoke(_favoriteRemoteModel, favoriteId);
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

        if (_favoriteRemoteModel != null) {
            try {
                Class<?> clazz = _favoriteRemoteModel.getClass();

                Method method = clazz.getMethod("setAnnouncementId", long.class);

                method.invoke(_favoriteRemoteModel, announcementId);
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

        if (_favoriteRemoteModel != null) {
            try {
                Class<?> clazz = _favoriteRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_favoriteRemoteModel, companyId);
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

        if (_favoriteRemoteModel != null) {
            try {
                Class<?> clazz = _favoriteRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_favoriteRemoteModel, groupId);
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

        if (_favoriteRemoteModel != null) {
            try {
                Class<?> clazz = _favoriteRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_favoriteRemoteModel, userId);
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

    public BaseModel<?> getFavoriteRemoteModel() {
        return _favoriteRemoteModel;
    }

    public void setFavoriteRemoteModel(BaseModel<?> favoriteRemoteModel) {
        _favoriteRemoteModel = favoriteRemoteModel;
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

        Class<?> remoteModelClass = _favoriteRemoteModel.getClass();

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

        Object returnValue = method.invoke(_favoriteRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            FavoriteLocalServiceUtil.addFavorite(this);
        } else {
            FavoriteLocalServiceUtil.updateFavorite(this);
        }
    }

    @Override
    public Favorite toEscapedModel() {
        return (Favorite) ProxyUtil.newProxyInstance(Favorite.class.getClassLoader(),
            new Class[] { Favorite.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        FavoriteClp clone = new FavoriteClp();

        clone.setFavoriteId(getFavoriteId());
        clone.setAnnouncementId(getAnnouncementId());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setUserId(getUserId());

        return clone;
    }

    @Override
    public int compareTo(Favorite favorite) {
        long primaryKey = favorite.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FavoriteClp)) {
            return false;
        }

        FavoriteClp favorite = (FavoriteClp) obj;

        long primaryKey = favorite.getPrimaryKey();

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
        StringBundler sb = new StringBundler(11);

        sb.append("{favoriteId=");
        sb.append(getFavoriteId());
        sb.append(", announcementId=");
        sb.append(getAnnouncementId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.gleo.plugins.hexiagon.model.Favorite");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>favoriteId</column-name><column-value><![CDATA[");
        sb.append(getFavoriteId());
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

        sb.append("</model>");

        return sb.toString();
    }
}
