<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@include file="/jsp/init.jsp" %>

<c:set var="portletNamespace">
	<portlet:namespace/>
</c:set>

<portlet:actionURL name="saveAgreement" var="saveAgreementURL">

</portlet:actionURL>

<aui:form action="<%= saveAgreementURL %>" method="post" name="fm">

	<liferay-ui:error key="fileEntryId-required" message="this-field-is-required" />
	<aui:field-wrapper>
		<aui:input inlineField="true" label="Agreement" name="Title" readonly="readonly" type="text" value="${title}">
				<aui:validator name="required" />
		</aui:input>
	
		<aui:button-row>
			<aui:button id="fileEntryId" value="select" />
	
			<aui:button onClick="window['${portletNamespace}clearFileEntry']();" value="clear" />
		</aui:button-row>
	
		<aui:input name="fileEntryId" type="hidden" value="${fileEntryId}"/>
	
	</aui:field-wrapper>

	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>
<aui:script>
	window['${portletNamespace}clearFileEntry'] = function() {
		window['${portletNamespace}setFileEntry']('', '', '', '', '');
	};

	Liferay.provide(
		window,
		'${portletNamespace}setFileEntry',
		function(url, uuid, groupId, title, version) {
			var A = AUI();

			var inputNode = A.one('#${portletNamespace}fileEntryId');

			if (inputNode) {
				if (uuid) {
					Liferay.Service(
						'/dlfileentry/get-file-entry-by-uuid-and-group-id',
						{
						  uuid: uuid,
						  groupId: groupId,
						  p_auth : Liferay.authToken
						},
						function(obj) {
						  inputNode.val(obj.fileEntryId);
						}
					);
				}
				else {
					inputNode.val('');
				}
			}

			var titleNode = A.one('#${portletNamespace}Title');

			if (titleNode) {
				titleNode.val(title);
			}
		},
		['json']
	);
</aui:script>

<aui:script use="liferay-portlet-url">
	var namespacedField = A.one('#fileEntryId');

	if (namespacedField) {
		namespacedField.on(
			'click',
			function(event) {
				var portletURL = Liferay.PortletURL.createURL('<%= PortletURLFactoryUtil.create(request, "166", themeDisplay.getPlid(), "RENDER_PHASE") %>');

				portletURL.setParameter('groupId', <%= themeDisplay.getScopeGroupId() %>);
				portletURL.setParameter('struts_action', '/dynamic_data_mapping/select_document_library');

				portletURL.setPlid(<%= PortalUtil.getControlPanelPlid(themeDisplay.getCompanyId())%>);

				portletURL.setPortletId('166');

				portletURL.setWindowState('pop_up');

				Liferay.Util.openWindow(
					{
						id: '${portletNamespace}selectDocumentLibrary',
						uri: portletURL.toString()
					}
				);

				window['<%= PortalUtil.getPortletNamespace("166") %>selectDocumentLibrary'] = window['${portletNamespace}setFileEntry'];
			}
		);
	}
</aui:script>