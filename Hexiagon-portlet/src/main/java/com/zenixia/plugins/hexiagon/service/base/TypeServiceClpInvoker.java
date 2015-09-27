package com.zenixia.plugins.hexiagon.service.base;

import com.zenixia.plugins.hexiagon.service.TypeServiceUtil;

import java.util.Arrays;

/**
 * @author guillaumelenoir
 * @generated
 */
public class TypeServiceClpInvoker {
    private String _methodName38;
    private String[] _methodParameterTypes38;
    private String _methodName39;
    private String[] _methodParameterTypes39;
    private String _methodName44;
    private String[] _methodParameterTypes44;
    private String _methodName45;
    private String[] _methodParameterTypes45;
    private String _methodName46;
    private String[] _methodParameterTypes46;
    private String _methodName47;
    private String[] _methodParameterTypes47;

    public TypeServiceClpInvoker() {
        _methodName38 = "getBeanIdentifier";

        _methodParameterTypes38 = new String[] {  };

        _methodName39 = "setBeanIdentifier";

        _methodParameterTypes39 = new String[] { "java.lang.String" };

        _methodName44 = "addType";

        _methodParameterTypes44 = new String[] {
                "com.zenixia.plugins.hexiagon.model.Type",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName45 = "updateType";

        _methodParameterTypes45 = new String[] {
                "com.zenixia.plugins.hexiagon.model.Type"
            };

        _methodName46 = "deleteType";

        _methodParameterTypes46 = new String[] {
                "long", "com.liferay.portal.service.ServiceContext"
            };

        _methodName47 = "getTypesByGroupId";

        _methodParameterTypes47 = new String[] { "long", "int", "int" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName38.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
            return TypeServiceUtil.getBeanIdentifier();
        }

        if (_methodName39.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
            TypeServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName44.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
            return TypeServiceUtil.addType((com.zenixia.plugins.hexiagon.model.Type) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName45.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
            return TypeServiceUtil.updateType((com.zenixia.plugins.hexiagon.model.Type) arguments[0]);
        }

        if (_methodName46.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
            return TypeServiceUtil.deleteType(((Long) arguments[0]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName47.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
            return TypeServiceUtil.getTypesByGroupId(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        throw new UnsupportedOperationException();
    }
}
