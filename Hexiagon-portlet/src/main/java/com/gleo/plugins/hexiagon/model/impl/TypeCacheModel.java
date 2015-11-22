package com.gleo.plugins.hexiagon.model.impl;

import com.gleo.plugins.hexiagon.model.Type;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Type in entity cache.
 *
 * @author guillaumelenoir
 * @see Type
 * @generated
 */
public class TypeCacheModel implements CacheModel<Type>, Externalizable {
    public long typeId;
    public String name;
    public long groupId;
    public long companyId;
    public int order;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{typeId=");
        sb.append(typeId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", order=");
        sb.append(order);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Type toEntityModel() {
        TypeImpl typeImpl = new TypeImpl();

        typeImpl.setTypeId(typeId);

        if (name == null) {
            typeImpl.setName(StringPool.BLANK);
        } else {
            typeImpl.setName(name);
        }

        typeImpl.setGroupId(groupId);
        typeImpl.setCompanyId(companyId);
        typeImpl.setOrder(order);

        typeImpl.resetOriginalValues();

        return typeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        typeId = objectInput.readLong();
        name = objectInput.readUTF();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        order = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(typeId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeInt(order);
    }
}
