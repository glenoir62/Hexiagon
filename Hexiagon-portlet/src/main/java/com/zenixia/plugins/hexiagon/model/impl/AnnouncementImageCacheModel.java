package com.zenixia.plugins.hexiagon.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.zenixia.plugins.hexiagon.model.AnnouncementImage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AnnouncementImage in entity cache.
 *
 * @author guillaumelenoir
 * @see AnnouncementImage
 * @generated
 */
public class AnnouncementImageCacheModel implements CacheModel<AnnouncementImage>,
    Externalizable {
    public long announcementImageId;
    public long companyId;
    public long groupId;
    public long userId;
    public long announcementId;
    public long fileEntryId;
    public String description;
    public int order;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{announcementImageId=");
        sb.append(announcementImageId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", announcementId=");
        sb.append(announcementId);
        sb.append(", fileEntryId=");
        sb.append(fileEntryId);
        sb.append(", description=");
        sb.append(description);
        sb.append(", order=");
        sb.append(order);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public AnnouncementImage toEntityModel() {
        AnnouncementImageImpl announcementImageImpl = new AnnouncementImageImpl();

        announcementImageImpl.setAnnouncementImageId(announcementImageId);
        announcementImageImpl.setCompanyId(companyId);
        announcementImageImpl.setGroupId(groupId);
        announcementImageImpl.setUserId(userId);
        announcementImageImpl.setAnnouncementId(announcementId);
        announcementImageImpl.setFileEntryId(fileEntryId);

        if (description == null) {
            announcementImageImpl.setDescription(StringPool.BLANK);
        } else {
            announcementImageImpl.setDescription(description);
        }

        announcementImageImpl.setOrder(order);

        announcementImageImpl.resetOriginalValues();

        return announcementImageImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        announcementImageId = objectInput.readLong();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        userId = objectInput.readLong();
        announcementId = objectInput.readLong();
        fileEntryId = objectInput.readLong();
        description = objectInput.readUTF();
        order = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(announcementImageId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(announcementId);
        objectOutput.writeLong(fileEntryId);

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        objectOutput.writeInt(order);
    }
}
