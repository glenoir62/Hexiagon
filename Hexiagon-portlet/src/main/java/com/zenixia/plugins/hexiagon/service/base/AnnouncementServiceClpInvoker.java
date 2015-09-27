package com.zenixia.plugins.hexiagon.service.base;

import com.zenixia.plugins.hexiagon.service.AnnouncementServiceUtil;

import java.util.Arrays;

/**
 * @author guillaumelenoir
 * @generated
 */
public class AnnouncementServiceClpInvoker {
    private String _methodName64;
    private String[] _methodParameterTypes64;
    private String _methodName65;
    private String[] _methodParameterTypes65;
    private String _methodName70;
    private String[] _methodParameterTypes70;
    private String _methodName71;
    private String[] _methodParameterTypes71;
    private String _methodName72;
    private String[] _methodParameterTypes72;
    private String _methodName73;
    private String[] _methodParameterTypes73;
    private String _methodName74;
    private String[] _methodParameterTypes74;
    private String _methodName75;
    private String[] _methodParameterTypes75;

    public AnnouncementServiceClpInvoker() {
        _methodName64 = "getBeanIdentifier";

        _methodParameterTypes64 = new String[] {  };

        _methodName65 = "setBeanIdentifier";

        _methodParameterTypes65 = new String[] { "java.lang.String" };

        _methodName70 = "addAnnouncement";

        _methodParameterTypes70 = new String[] {
                "com.zenixia.plugins.hexiagon.model.Announcement",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName71 = "updateAnnouncement";

        _methodParameterTypes71 = new String[] {
                "com.zenixia.plugins.hexiagon.model.Announcement",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName72 = "deleteAnnouncement";

        _methodParameterTypes72 = new String[] { "long" };

        _methodName73 = "getAnnouncement";

        _methodParameterTypes73 = new String[] { "long" };

        _methodName74 = "getAnnouncementsByGroupId";

        _methodParameterTypes74 = new String[] { "long", "int", "int" };

        _methodName75 = "getAnnouncementsCountByGroupId";

        _methodParameterTypes75 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName64.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
            return AnnouncementServiceUtil.getBeanIdentifier();
        }

        if (_methodName65.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
            AnnouncementServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName70.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
            return AnnouncementServiceUtil.addAnnouncement((com.zenixia.plugins.hexiagon.model.Announcement) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName71.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
            return AnnouncementServiceUtil.updateAnnouncement((com.zenixia.plugins.hexiagon.model.Announcement) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName72.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
            return AnnouncementServiceUtil.deleteAnnouncement(((Long) arguments[0]).longValue());
        }

        if (_methodName73.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
            return AnnouncementServiceUtil.getAnnouncement(((Long) arguments[0]).longValue());
        }

        if (_methodName74.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
            return AnnouncementServiceUtil.getAnnouncementsByGroupId(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName75.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
            return AnnouncementServiceUtil.getAnnouncementsCountByGroupId(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
