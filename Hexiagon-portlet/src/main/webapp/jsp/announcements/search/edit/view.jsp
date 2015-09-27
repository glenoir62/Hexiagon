<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@include file="/jsp/init.jsp" %>

<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>


<liferay-ui:success key="your-request-completed-successfully" message="your-request-completed-successfully" />
<portlet:actionURL var="saveVocabularyPreferencesURL" windowState="normal" name="saveVocabularyPreferences">
	<portlet:param name="redirect" value='<%=redirect %>'/>
</portlet:actionURL>

<aui:form action="${saveVocabularyPreferencesURL}" method="POST" name="fm">
	<aui:fieldset>
		<aui:input type="hidden" name="redirect" value="<%=redirect %>" />

		<aui:input name="delta" value="${delta}"></aui:input>
		
		<aui:input type="checkbox" name="isUserAnnouncements" label="User's announcements" value="${isUserAnnouncements}" checked="${isUserAnnouncements eq true}"/>

		<aui:input type="checkbox" name="isFavoriteUserAnnouncements" label="User's favorite announcements" value="${isFavoriteUserAnnouncements}" checked="${isFavoriteUserAnnouncements eq true}"/>
	</aui:fieldset>
	
	<aui:button-row>
		<aui:button type="submit" />

		<aui:button type="cancel" onClick="<%= redirect %>" />
	</aui:button-row>
</aui:form>