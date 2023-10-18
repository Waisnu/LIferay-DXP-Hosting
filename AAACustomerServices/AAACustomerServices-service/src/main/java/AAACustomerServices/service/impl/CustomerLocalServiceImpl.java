/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package AAACustomerServices.service.impl;

import AAACustomerServices.model.Customer;
import AAACustomerServices.exception.customerEmailException;
import AAACustomerServices.exception.customerNameException;
import AAACustomerServices.service.CustomerLocalServiceUtil;
import AAACustomerServices.service.base.CustomerLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=AAACustomerServices.model.Customer",
	service = AopService.class
)
public class CustomerLocalServiceImpl extends CustomerLocalServiceBaseImpl {
	
	public Customer addCustomer(String customerName, String customerEmail, String customerAddress,
			String customerContact, String customerNRIC, String service) throws PortalException, SystemException {
		System.out.println("Add customer impl: start");
		
		long customerId = counterLocalService.increment();
		
		Customer customer = CustomerLocalServiceUtil.createCustomer(customerId);
		
		customer.setCustomerName(customerName);
		customer.setCustomerEmail(customerEmail);
		customer.setCustomerAddress(customerAddress);
		customer.setCustomerContact(customerContact);
		customer.setCustomerNRIC(customerNRIC);
		customer.setService(service);
		
		super.addCustomer(customer);
		
		System.out.println("Add customer impl: end");
		
		return customer;
	}
	
	public Customer updateCustomer(long customerId, String customerName, String customerEmail, String customerAddress, String customerContact, String customerNRIC, String service) throws PortalException, SystemException {
		System.out.println("Update customer impl: start");
		
		Customer customer = CustomerLocalServiceUtil.fetchCustomer(customerId);
		
		customer.setCustomerName(customerName);
		customer.setCustomerEmail(customerEmail);
		customer.setCustomerAddress(customerAddress);
		customer.setCustomerContact(customerContact);
		customer.setCustomerNRIC(customerNRIC);
		customer.setService(service);
		
		super.updateCustomer(customer);
		
		System.out.println("Update customer impl: end");
		
		return customer;
	}
}