<%@ include file="init.jsp" %>

<liferay-ui:tabs names="Customers">
	<aui:button-row>
		<portlet:renderURL var="addCustomerURL">
			<portlet:param name="mvcPath" value="/register.jsp"/>
		</portlet:renderURL>
		
		<aui:button onClick="<%=addCustomerURL.toString() %>" value="New Customer"/>
	</aui:button-row>
	
	<liferay-ui:search-container>
		<liferay-ui:search-container-results results="<%=CustomerLocalServiceUtil.getCustomers(searchContainer.getStart(), searchContainer.getEnd()) %>"/>
			<liferay-ui:search-container-row className="AAACustomerServices.model.Customer" modelVar="Customer" keyProperty="customerId" escapedModel="<%= true %>">
				<liferay-ui:search-container-column-text name="Name" property="customerName"></liferay-ui:search-container-column-text>
				<liferay-ui:search-container-column-text name="Email" property="customerEmail"></liferay-ui:search-container-column-text>
				<liferay-ui:search-container-column-text name="Address" property="customerAddress"></liferay-ui:search-container-column-text>
				<liferay-ui:search-container-column-text name="Contact Number" property="customerContact"></liferay-ui:search-container-column-text>
				<liferay-ui:search-container-column-text name="National ID" property="customerNRIC"></liferay-ui:search-container-column-text>
				<liferay-ui:search-container-column-text name="Service" property="service"></liferay-ui:search-container-column-text>
				<liferay-ui:search-container-column-jsp align="right" path="/CustomerActions.jsp"/>
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator/>
	</liferay-ui:search-container>
</liferay-ui:tabs>