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

package AAACustomerServices.model.impl;

import AAACustomerServices.model.Customer;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Customer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CustomerCacheModel
	implements CacheModel<Customer>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CustomerCacheModel)) {
			return false;
		}

		CustomerCacheModel customerCacheModel = (CustomerCacheModel)object;

		if (customerId == customerCacheModel.customerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, customerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", customerId=");
		sb.append(customerId);
		sb.append(", customerName=");
		sb.append(customerName);
		sb.append(", customerEmail=");
		sb.append(customerEmail);
		sb.append(", customerAddress=");
		sb.append(customerAddress);
		sb.append(", customerContact=");
		sb.append(customerContact);
		sb.append(", customerNRIC=");
		sb.append(customerNRIC);
		sb.append(", service=");
		sb.append(service);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Customer toEntityModel() {
		CustomerImpl customerImpl = new CustomerImpl();

		if (uuid == null) {
			customerImpl.setUuid("");
		}
		else {
			customerImpl.setUuid(uuid);
		}

		customerImpl.setCustomerId(customerId);

		if (customerName == null) {
			customerImpl.setCustomerName("");
		}
		else {
			customerImpl.setCustomerName(customerName);
		}

		if (customerEmail == null) {
			customerImpl.setCustomerEmail("");
		}
		else {
			customerImpl.setCustomerEmail(customerEmail);
		}

		if (customerAddress == null) {
			customerImpl.setCustomerAddress("");
		}
		else {
			customerImpl.setCustomerAddress(customerAddress);
		}

		if (customerContact == null) {
			customerImpl.setCustomerContact("");
		}
		else {
			customerImpl.setCustomerContact(customerContact);
		}

		if (customerNRIC == null) {
			customerImpl.setCustomerNRIC("");
		}
		else {
			customerImpl.setCustomerNRIC(customerNRIC);
		}

		if (service == null) {
			customerImpl.setService("");
		}
		else {
			customerImpl.setService(service);
		}

		customerImpl.resetOriginalValues();

		return customerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		customerId = objectInput.readLong();
		customerName = objectInput.readUTF();
		customerEmail = objectInput.readUTF();
		customerAddress = objectInput.readUTF();
		customerContact = objectInput.readUTF();
		customerNRIC = objectInput.readUTF();
		service = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(customerId);

		if (customerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerName);
		}

		if (customerEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerEmail);
		}

		if (customerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerAddress);
		}

		if (customerContact == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerContact);
		}

		if (customerNRIC == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerNRIC);
		}

		if (service == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(service);
		}
	}

	public String uuid;
	public long customerId;
	public String customerName;
	public String customerEmail;
	public String customerAddress;
	public String customerContact;
	public String customerNRIC;
	public String service;

}