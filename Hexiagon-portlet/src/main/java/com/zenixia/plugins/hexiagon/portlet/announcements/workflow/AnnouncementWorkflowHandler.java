
package com.zenixia.plugins.hexiagon.portlet.announcements.workflow;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.service.ServiceContext;
import com.zenixia.plugins.hexiagon.model.Announcement;
import com.zenixia.plugins.hexiagon.service.AnnouncementLocalServiceUtil;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

/**
 * Announcement workflow handler
 *
 */
public class AnnouncementWorkflowHandler extends BaseWorkflowHandler {

	/**
	 * Get className
	 * 
	 * @return classname
	 */
	public String getClassName() {

		return CLASS_NAME;
	}

	/**
	 * Get Type
	 * 
	 * @param locale
	 * @return type
	 */
	public String getType(Locale locale) {

		return LanguageUtil.get(locale, "model.resource." + CLASS_NAME);

	}

	/**
	 * Update status
	 * 
	 * @param status
	 * @param workflowContext
	 * @return announcement updated
	 * @throws PortalException
	 * @throws SystemException
	 */
	public Object updateStatus(int status, Map<String, Serializable> workflowContext)
		throws PortalException, SystemException {

		long userId = GetterUtil.getLong((String) workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
		long resourcePrimKey = GetterUtil.getLong((String) workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));

		ServiceContext serviceContext = (ServiceContext) workflowContext.get("serviceContext");

		return AnnouncementLocalServiceUtil.updateStatus(userId, resourcePrimKey, status, serviceContext);
	}

	/**
	 * Classname
	 */
	public static final String CLASS_NAME = Announcement.class.getName();

}
