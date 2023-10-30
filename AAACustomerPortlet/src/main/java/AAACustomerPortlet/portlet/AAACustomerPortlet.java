package AAACustomerPortlet.portlet;

import AAACustomerPortlet.constants.AAACustomerPortletKeys;
import AAACustomerServices.model.Customer;
import AAACustomerServices.service.CustomerLocalServiceUtil;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;


@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=AAACustomer",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AAACustomerPortletKeys.AAACUSTOMER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AAACustomerPortlet extends MVCPortlet {
	
	//add customer
	public void registerCustomer(ActionRequest actionRequest, ActionResponse actionResponse) {
		String customerName = ParamUtil.getString(actionRequest, "customerName");
		String customerEmail = ParamUtil.getString(actionRequest, "customerEmail");
		String customerAddress = ParamUtil.getString(actionRequest, "customerAddress");
		String customerContact = ParamUtil.getString(actionRequest, "customerContact");
		String customerNRIC = ParamUtil.getString(actionRequest, "customerNRIC");
		String service = ParamUtil.getString(actionRequest, "service");
		
		System.out.println("Name: " + customerName);
		System.out.println("Email: " + customerEmail);
		System.out.println("Contact Number: " + customerContact);
		
		long customerId = CounterLocalServiceUtil.increment();
		
		Customer customer = CustomerLocalServiceUtil.createCustomer(customerId);
		
		customer.setCustomerName(customerName);
		customer.setCustomerEmail(customerEmail);
		customer.setCustomerAddress(customerAddress);
		customer.setCustomerContact(customerContact);
		customer.setCustomerNRIC(customerNRIC);
		customer.setService(service);
		
		CustomerLocalServiceUtil.addCustomer(customer);
		
		System.out.println("User has been successfully registered");
	}
	
	//delete customer
	public void deleteCustomer(ActionRequest request, ActionResponse response) throws Exception {
		long customerId = ParamUtil.getLong(request, "customerId");
		
		CustomerLocalServiceUtil.deleteCustomer(customerId);
		
		sendRedirect(request, response);
	}
	
	//update customer
	public void updateCustomer(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException{
		long customerId = ParamUtil.getLong(actionRequest, "customerId");
		Customer customer = CustomerLocalServiceUtil.getCustomer(customerId);
		
		String customerName = ParamUtil.getString(actionRequest, "customerName");
		String customerEmail = ParamUtil.getString(actionRequest, "customerEmail");
		String customerAddress = ParamUtil.getString(actionRequest, "customerAddress");
		String customerContact = ParamUtil.getString(actionRequest, "customerContact");
		String customerNRIC = ParamUtil.getString(actionRequest, "customerNRIC");
		String service = ParamUtil.getString(actionRequest, "service");
		
		System.out.println("Name: " + customerName);
		System.out.println("Email: " + customerEmail);
		System.out.println("Contact Number: " + customerContact);
		
		customer.setCustomerName(customerName);
		customer.setCustomerEmail(customerEmail);
		customer.setCustomerAddress(customerAddress);
		customer.setCustomerContact(customerContact);
		customer.setCustomerNRIC(customerNRIC);
		customer.setService(service);
		
		CustomerLocalServiceUtil.getCustomer(customerId);
		CustomerLocalServiceUtil.updateCustomer(customer);
		
		System.out.println("User has been successfully updated");
	}
}
