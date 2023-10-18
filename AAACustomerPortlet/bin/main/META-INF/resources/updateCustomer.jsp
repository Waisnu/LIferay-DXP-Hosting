<%@ include file="init.jsp" %>

<%
	Customer customer = null;
	long customerId = ParamUtil.getLong(request, "customerId");

	if (customerId > 0) {
		customer = CustomerLocalServiceUtil.getCustomer(customerId);

	}
	String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= customer %>" model="<%= Customer.class %>" />
<portlet:renderURL var="viewCustomerURL" />
<portlet:actionURL name='updateCustomer' var="updateCustomerURL" windowState="normal" />

<liferay-ui:header
	backURL="<%= viewCustomerURL %>"
	title='<%= customer.getCustomerName()%>'
/>

<aui:form action="<%= updateCustomerURL %>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

		<aui:input name="customerId" type="hidden" value='<%= customer.getCustomerId()%>'/>

		<aui:input name="customerName" label="Name"/>

		<aui:input name="customerEmail" label="Email"/>

		<aui:input name="customerAddress" label="Address"/>
		
		<aui:input name="customerNRIC" label="National ID"/>
		
		<aui:input name="customerContact" label="Contact Number"/>
		
		<aui:select label="Services" name="service" showEmptyOption="<%= false %>">
			<aui:option value="Domain Name Service">Domain Name Service</aui:option>
			<aui:option value="Shared Hosting Service">Shared Hosting Service</aui:option>
			<aui:option value="Reseller Hosting Service">Reseller Hosting Service</aui:option>
			<aui:option value="Cloud Hosting Service">Cloud Hosting Service</aui:option>
			<aui:option value="VPS Hosting Service">VPS Hosting Service</aui:option>
			<aui:option value="Dedicated Hosting Service">Dedicated Hosting Service</aui:option>
			<aui:option value="Colocation Service">Colocation Service</aui:option>
		</aui:select>

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />

		<aui:button onClick="<%= viewCustomerURL %>"  type="cancel" />
	</aui:button-row>
</aui:form>