package com.zenixia.plugins.hexiagon.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.zenixia.plugins.hexiagon.service.AnnouncementImageLocalServiceUtil;
import com.zenixia.plugins.hexiagon.service.AnnouncementLocalServiceUtil;
import com.zenixia.plugins.hexiagon.service.AnnouncementServiceUtil;
import com.zenixia.plugins.hexiagon.service.ClpSerializer;
import com.zenixia.plugins.hexiagon.service.CurrencyLocalServiceUtil;
import com.zenixia.plugins.hexiagon.service.CurrencyServiceUtil;
import com.zenixia.plugins.hexiagon.service.FavoriteLocalServiceUtil;
import com.zenixia.plugins.hexiagon.service.TypeLocalServiceUtil;
import com.zenixia.plugins.hexiagon.service.TypeServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            AnnouncementLocalServiceUtil.clearService();

            AnnouncementServiceUtil.clearService();
            AnnouncementImageLocalServiceUtil.clearService();

            CurrencyLocalServiceUtil.clearService();

            CurrencyServiceUtil.clearService();
            FavoriteLocalServiceUtil.clearService();

            TypeLocalServiceUtil.clearService();

            TypeServiceUtil.clearService();
        }
    }
}
