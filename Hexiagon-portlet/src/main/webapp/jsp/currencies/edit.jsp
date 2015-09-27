<%@page import="com.zenixia.plugins.hexiagon.model.Currency"%>
<%@page import="com.zenixia.plugins.hexiagon.service.CurrencyLocalServiceUtil"%>
<%@page import="com.zenixia.plugins.hexiagon.util.CurrencyUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@include file="/jsp/init.jsp" %>

<%

	String redirect = ParamUtil.getString(request, "redirect");
	
	long currencyId = ParamUtil.getLong(request, "currencyId");
	
	Currency currency = null;
	
	if (currencyId > 0) {
		currency = CurrencyLocalServiceUtil.getCurrency(currencyId);
	}
%>
<c:set  var="currencyEntrySet" value="<%= CurrencyUtil.getAllSymbols(themeDisplay.getLocale()).entrySet() %>"/>

<liferay-ui:header
	backURL='<%= redirect %>'
	title='<%= (currency != null) ? currency.getLabel() : "new-currency" %>'
/>

<aui:model-context bean="<%= currency %>" model="<%= Currency.class %>" />

<portlet:actionURL name='<%= (currency != null) ? "updateCurrency" : "addCurrency" %>' var="addCurrencyURL" />

<liferay-ui:error key="currency-errors" message="currency-errors" />

<aui:form action="${addCurrencyURL}" method="POST" name="fm">
	<aui:fieldset>
		<aui:input type="hidden" name="redirect" value="<%= redirect %>" />

		<aui:input type="hidden" name="currencyId" />

		<liferay-ui:error key="label-required" message="label-required" />
		<aui:select name="label" label="Label" showEmptyOption="true" >
			<c:forEach var="currencyEntry" items="${currencyEntrySet}">
				<aui:option label="${currencyEntry.key}" value="${currencyEntry.value}"></aui:option>
			</c:forEach>
		</aui:select>
		
		<liferay-ui:error key="symbol-required" message="symbol-required" />
		<aui:input name="symbol" label="Symbol">
			<aui:validator name="required"/>
		</aui:input>

		<aui:input name="order" label="Order">
			<aui:validator name="digits"/>
		</aui:input>

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />

		<aui:button type="cancel"  onClick="<%= redirect %>" />
	</aui:button-row>
</aui:form>

<aui:script use="aui-base,aui-event,aui-node">

	var rules = {
			<portlet:namespace />label: {
		 	required: true
		}
	};
	
	var validator1 = new A.FormValidator({
		boundingBox: document.<portlet:namespace />fm,
		rules: rules
	});
	
</aui:script>
