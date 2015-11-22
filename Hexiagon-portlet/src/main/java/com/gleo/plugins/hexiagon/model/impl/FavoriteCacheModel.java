package com.gleo.plugins.hexiagon.model.impl;

import com.gleo.plugins.hexiagon.model.Favorite;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Favorite in entity cache.
 *
 * @author guillaumelenoir
 * @see Favorite
 * @generated
 */
public class FavoriteCacheModel implements CacheModel<Favorite>, Externalizable {
    public long favoriteId;
    public long announcementId;
    public long companyId;
    public long groupId;
    public long userId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{favoriteId=");
        sb.append(favoriteId);
        sb.append(", announcementId=");
        sb.append(announcementId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Favorite toEntityModel() {
        FavoriteImpl favoriteImpl = new FavoriteImpl();

        favoriteImpl.setFavoriteId(favoriteId);
        favoriteImpl.setAnnouncementId(announcementId);
        favoriteImpl.setCompanyId(companyId);
        favoriteImpl.setGroupId(groupId);
        favoriteImpl.setUserId(userId);

        favoriteImpl.resetOriginalValues();

        return favoriteImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        favoriteId = objectInput.readLong();
        announcementId = objectInput.readLong();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        userId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(favoriteId);
        objectOutput.writeLong(announcementId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(userId);
    }
}
