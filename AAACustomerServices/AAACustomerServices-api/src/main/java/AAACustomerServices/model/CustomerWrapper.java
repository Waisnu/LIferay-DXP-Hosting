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

package AAACustomerServices.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Customer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Customer
 * @generated
 */
public class CustomerWrapper
	extends BaseModelWrapper<Customer>
	implements Customer, ModelWrapper<Customer> {

	public CustomerWrapper(Customer customer) {
		super(customer);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("customerId", getCustomerId());
		attributes.put("customerName", getCustomerName());
		attributes.put("customerEmail", getCustomerEmail());
		attributes.put("customerAddress", getCustomerAddress());
		attributes.put("customerContact", getCustomerContact());
		attributes.put("customerNRIC", getCustomerNRIC());
		attributes.put("service", getService());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		String customerName = (String)attributes.get("customerName");

		if (customerName != null) {
			setCustomerName(customerName);
		}

		String customerEmail = (String)attributes.get("customerEmail");

		if (customerEmail != null) {
			setCustomerEmail(customerEmail);
		}

		String customerAddress = (String)attributes.get("customerAddress");

		if (customerAddress != null) {
			setCustomerAddress(customerAddress);
		}

		String customerContact = (String)attributes.get("customerContact");

		if (customerContact != null) {
			setCustomerContact(customerContact);
		}

		String customerNRIC = (String)attributes.get("customerNRIC");

		if (customerNRIC != null) {
			setCustomerNRIC(customerNRIC);
		}

		String service = (String)attributes.get("service");

		if (service != null) {
			setService(service);
		}
	}

	@Override
	public Customer cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the customer address of this customer.
	 *
	 * @return the customer address of this customer
	 */
	@Override
	public String getCustomerAddress() {
		return model.getCustomerAddress();
	}

	/**
	 * Returns the customer contact of this customer.
	 *
	 * @return the customer contact of this customer
	 */
	@Override
	public String getCustomerContact() {
		return model.getCustomerContact();
	}

	/**
	 * Returns the customer email of this customer.
	 *
	 * @return the customer email of this customer
	 */
	@Override
	public String getCustomerEmail() {
		return model.getCustomerEmail();
	}

	/**
	 * Returns the customer ID of this customer.
	 *
	 * @return the customer ID of this customer
	 */
	@Override
	public long getCustomerId() {
		return model.getCustomerId();
	}

	/**
	 * Returns the customer name of this customer.
	 *
	 * @return the customer name of this customer
	 */
	@Override
	public String getCustomerName() {
		return model.getCustomerName();
	}

	/**
	 * Returns the customer nric of this customer.
	 *
	 * @return the customer nric of this customer
	 */
	@Override
	public String getCustomerNRIC() {
		return model.getCustomerNRIC();
	}

	/**
	 * Returns the primary key of this customer.
	 *
	 * @return the primary key of this customer
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the service of this customer.
	 *
	 * @return the service of this customer
	 */
	@Override
	public String getService() {
		return model.getService();
	}

	/**
	 * Returns the uuid of this customer.
	 *
	 * @return the uuid of this customer
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the customer address of this customer.
	 *
	 * @param customerAddress the customer address of this customer
	 */
	@Override
	public void setCustomerAddress(String customerAddress) {
		model.setCustomerAddress(customerAddress);
	}

	/**
	 * Sets the customer contact of this customer.
	 *
	 * @param customerContact the customer contact of this customer
	 */
	@Override
	public void setCustomerContact(String customerContact) {
		model.setCustomerContact(customerContact);
	}

	/**
	 * Sets the customer email of this customer.
	 *
	 * @param customerEmail the customer email of this customer
	 */
	@Override
	public void setCustomerEmail(String customerEmail) {
		model.setCustomerEmail(customerEmail);
	}

	/**
	 * Sets the customer ID of this customer.
	 *
	 * @param customerId the customer ID of this customer
	 */
	@Override
	public void setCustomerId(long customerId) {
		model.setCustomerId(customerId);
	}

	/**
	 * Sets the customer name of this customer.
	 *
	 * @param customerName the customer name of this customer
	 */
	@Override
	public void setCustomerName(String customerName) {
		model.setCustomerName(customerName);
	}

	/**
	 * Sets the customer nric of this customer.
	 *
	 * @param customerNRIC the customer nric of this customer
	 */
	@Override
	public void setCustomerNRIC(String customerNRIC) {
		model.setCustomerNRIC(customerNRIC);
	}

	/**
	 * Sets the primary key of this customer.
	 *
	 * @param primaryKey the primary key of this customer
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the service of this customer.
	 *
	 * @param service the service of this customer
	 */
	@Override
	public void setService(String service) {
		model.setService(service);
	}

	/**
	 * Sets the uuid of this customer.
	 *
	 * @param uuid the uuid of this customer
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected CustomerWrapper wrap(Customer customer) {
		return new CustomerWrapper(customer);
	}

}