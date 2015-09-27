<%@page import="com.zenixia.plugins.hexiagon.constants.PortletKeys"%>
<%@page import="com.zenixia.plugins.hexiagon.permission.HexiagonPermission"%>
<%@include file="/jsp/init.jsp" %>
<%@page import="javax.portlet.PortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>

<liferay-ui:success key="announcement-added" message="announcement-added-successfully" />
<liferay-ui:success key="announcement-updated" message="announcement-updated-successfully" />
<liferay-ui:success key="announcement-deleted" message="announcement-deleted-successfully" />

<liferay-ui:error key="announcement-errors" message="announcement-errors" />

<liferay-ui:search-container  searchContainer="${searchAnnouncementContainer}" var="searchAnnouncementContainer">
	<liferay-ui:search-container-results
		results="${searchAnnouncementContainer.results}"
		total="${searchAnnouncementContainer.total}"
	/>

	<liferay-ui:search-container-row
		className="com.zenixia.plugins.hexiagon.model.Announcement"
		keyProperty="announcementId"
		modelVar="announcement" escapedModel="true" 
	>
		<liferay-ui:search-container-column-text
			name="name"
			value="${announcement.getTitle(locale)}" 
		/>

		<liferay-ui:search-container-column-text
			name="price"
			property="price"
		/>
		
		<liferay-ui:search-container-column-text
			name="email-address"
			property="emailAddress"
		/>

		<liferay-ui:search-container-column-text
			name="phone-number"
			property="phoneNumber"
		/>
		
		<liferay-ui:search-container-column-text
			name="type"
			value="${announcement.getType().getName(locale)}"
		/>
		
		<liferay-ui:search-container-column-text
			name="Status"
			value="${announcement.getStatus(locale)}"
		/>
		
		<liferay-ui:search-container-column-text
			name="Country"
			value="${announcement.getCountry(locale)}"
		/>

		<liferay-ui:search-container-column-jsp
			name="Actions"
			path="/jsp/announcements/actions.jsp"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator paginate="true" searchContainer="${searchAnnouncementContainer}"/>
</liferay-ui:search-container>