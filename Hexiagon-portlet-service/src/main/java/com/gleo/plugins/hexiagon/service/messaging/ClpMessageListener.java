package com.gleo.plugins.hexiagon.service.messaging;

import com.gleo.plugins.hexiagon.service.AnnouncementImageLocalServiceUtil;
import com.gleo.plugins.hexiagon.service.AnnouncementLocalServiceUtil;
import com.gleo.plugins.hexiagon.service.AnnouncementServiceUtil;
import com.gleo.plugins.hexiagon.service.ClpSerializer;
import com.gleo.plugins.hexiagon.service.CurrencyLocalServiceUtil;
import com.gleo.plugins.hexiagon.service.CurrencyServiceUtil;
import com.gleo.plugins.hexiagon.service.FavoriteLocalServiceUtil;
import com.gleo.plugins.hexiagon.service.TypeLocalServiceUtil;
import com.gleo.plugins.hexiagon.service.TypeServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


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
