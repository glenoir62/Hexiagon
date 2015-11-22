package com.gleo.plugins.hexiagon.model.impl;

import com.gleo.plugins.hexiagon.model.Currency;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Currency in entity cache.
 *
 * @author guillaumelenoir
 * @see Currency
 * @generated
 */
public class CurrencyCacheModel implements CacheModel<Currency>, Externalizable {
    public long currencyId;
    public long companyId;
    public String label;
    public String symbol;
    public int order;
    public long rate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{currencyId=");
        sb.append(currencyId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", label=");
        sb.append(label);
        sb.append(", symbol=");
        sb.append(symbol);
        sb.append(", order=");
        sb.append(order);
        sb.append(", rate=");
        sb.append(rate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Currency toEntityModel() {
        CurrencyImpl currencyImpl = new CurrencyImpl();

        currencyImpl.setCurrencyId(currencyId);
        currencyImpl.setCompanyId(companyId);

        if (label == null) {
            currencyImpl.setLabel(StringPool.BLANK);
        } else {
            currencyImpl.setLabel(label);
        }

        if (symbol == null) {
            currencyImpl.setSymbol(StringPool.BLANK);
        } else {
            currencyImpl.setSymbol(symbol);
        }

        currencyImpl.setOrder(order);
        currencyImpl.setRate(rate);

        currencyImpl.resetOriginalValues();

        return currencyImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        currencyId = objectInput.readLong();
        companyId = objectInput.readLong();
        label = objectInput.readUTF();
        symbol = objectInput.readUTF();
        order = objectInput.readInt();
        rate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(currencyId);
        objectOutput.writeLong(companyId);

        if (label == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(label);
        }

        if (symbol == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(symbol);
        }

        objectOutput.writeInt(order);
        objectOutput.writeLong(rate);
    }
}
