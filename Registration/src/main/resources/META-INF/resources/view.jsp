<%@ include file="init.jsp" %>

<portlet:renderURL var="viewCustomerURL"/>
<liferay-ui:header backURL="<%= viewCustomerURL%>" title="New Customer"/>

<portlet:actionURL name="registerCustomer" var="registerActionURL"/>

<aui:form action="<%= registerActionURL %>" method="POST">
	<aui:fieldset>
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
	</aui:button-row>
</aui:form>