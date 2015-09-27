package com.zenixia.plugins.hexiagon.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Favorite}.
 * </p>
 *
 * @author guillaumelenoir
 * @see Favorite
 * @generated
 */
public class FavoriteWrapper implements Favorite, ModelWrapper<Favorite> {
    private Favorite _favorite;

    public FavoriteWrapper(Favorite favorite) {
        _favorite = favorite;
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

    /**
    * Returns the primary key of this favorite.
    *
    * @return the primary key of this favorite
    */
    @Override
    public long getPrimaryKey() {
        return _favorite.getPrimaryKey();
    }

    /**
    * Sets the primary key of this favorite.
    *
    * @param primaryKey the primary key of this favorite
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _favorite.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the favorite ID of this favorite.
    *
    * @return the favorite ID of this favorite
    */
    @Override
    public long getFavoriteId() {
        return _favorite.getFavoriteId();
    }

    /**
    * Sets the favorite ID of this favorite.
    *
    * @param favoriteId the favorite ID of this favorite
    */
    @Override
    public void setFavoriteId(long favoriteId) {
        _favorite.setFavoriteId(favoriteId);
    }

    /**
    * Returns the announcement ID of this favorite.
    *
    * @return the announcement ID of this favorite
    */
    @Override
    public long getAnnouncementId() {
        return _favorite.getAnnouncementId();
    }

    /**
    * Sets the announcement ID of this favorite.
    *
    * @param announcementId the announcement ID of this favorite
    */
    @Override
    public void setAnnouncementId(long announcementId) {
        _favorite.setAnnouncementId(announcementId);
    }

    /**
    * Returns the company ID of this favorite.
    *
    * @return the company ID of this favorite
    */
    @Override
    public long getCompanyId() {
        return _favorite.getCompanyId();
    }

    /**
    * Sets the company ID of this favorite.
    *
    * @param companyId the company ID of this favorite
    */
    @Override
    public void setCompanyId(long companyId) {
        _favorite.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this favorite.
    *
    * @return the group ID of this favorite
    */
    @Override
    public long getGroupId() {
        return _favorite.getGroupId();
    }

    /**
    * Sets the group ID of this favorite.
    *
    * @param groupId the group ID of this favorite
    */
    @Override
    public void setGroupId(long groupId) {
        _favorite.setGroupId(groupId);
    }

    /**
    * Returns the user ID of this favorite.
    *
    * @return the user ID of this favorite
    */
    @Override
    public long getUserId() {
        return _favorite.getUserId();
    }

    /**
    * Sets the user ID of this favorite.
    *
    * @param userId the user ID of this favorite
    */
    @Override
    public void setUserId(long userId) {
        _favorite.setUserId(userId);
    }

    /**
    * Returns the user uuid of this favorite.
    *
    * @return the user uuid of this favorite
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _favorite.getUserUuid();
    }

    /**
    * Sets the user uuid of this favorite.
    *
    * @param userUuid the user uuid of this favorite
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _favorite.setUserUuid(userUuid);
    }

    @Override
    public boolean isNew() {
        return _favorite.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _favorite.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _favorite.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _favorite.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _favorite.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _favorite.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _favorite.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _favorite.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _favorite.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _favorite.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _favorite.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FavoriteWrapper((Favorite) _favorite.clone());
    }

    @Override
    public int compareTo(Favorite favorite) {
        return _favorite.compareTo(favorite);
    }

    @Override
    public int hashCode() {
        return _favorite.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Favorite> toCacheModel() {
        return _favorite.toCacheModel();
    }

    @Override
    public Favorite toEscapedModel() {
        return new FavoriteWrapper(_favorite.toEscapedModel());
    }

    @Override
    public Favorite toUnescapedModel() {
        return new FavoriteWrapper(_favorite.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _favorite.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _favorite.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _favorite.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FavoriteWrapper)) {
            return false;
        }

        FavoriteWrapper favoriteWrapper = (FavoriteWrapper) obj;

        if (Validator.equals(_favorite, favoriteWrapper._favorite)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Favorite getWrappedFavorite() {
        return _favorite;
    }

    @Override
    public Favorite getWrappedModel() {
        return _favorite;
    }

    @Override
    public void resetOriginalValues() {
        _favorite.resetOriginalValues();
    }
}
