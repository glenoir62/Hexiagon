package com.zenixia.plugins.hexiagon.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.zenixia.plugins.hexiagon.model.Type;
import com.zenixia.plugins.hexiagon.service.TypeLocalServiceUtil;

/**
 * The extended model base implementation for the Type service. Represents a row in the &quot;Hexiagon_Type&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TypeImpl}.
 * </p>
 *
 * @author guillaumelenoir
 * @see TypeImpl
 * @see com.zenixia.plugins.hexiagon.model.Type
 * @generated
 */
public abstract class TypeBaseImpl extends TypeModelImpl implements Type {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a type model instance should use the {@link Type} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TypeLocalServiceUtil.addType(this);
        } else {
            TypeLocalServiceUtil.updateType(this);
        }
    }
}
