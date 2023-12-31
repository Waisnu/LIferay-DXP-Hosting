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
import AAACustomerServices.model.CustomerModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Customer service. Represents a row in the &quot;FOO_Customer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CustomerModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CustomerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomerImpl
 * @generated
 */
public class CustomerModelImpl
	extends BaseModelImpl<Customer> implements CustomerModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a customer model instance should use the <code>Customer</code> interface instead.
	 */
	public static final String TABLE_NAME = "FOO_Customer";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"customerId", Types.BIGINT},
		{"customerName", Types.VARCHAR}, {"customerEmail", Types.VARCHAR},
		{"customerAddress", Types.VARCHAR}, {"customerContact", Types.VARCHAR},
		{"customerNRIC", Types.VARCHAR}, {"service", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("customerId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("customerName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("customerEmail", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("customerAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("customerContact", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("customerNRIC", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("service", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table FOO_Customer (uuid_ VARCHAR(75) null,customerId LONG not null primary key,customerName VARCHAR(75) null,customerEmail VARCHAR(75) null,customerAddress VARCHAR(75) null,customerContact VARCHAR(75) null,customerNRIC VARCHAR(75) null,service VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table FOO_Customer";

	public static final String ORDER_BY_JPQL =
		" ORDER BY customer.customerId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY FOO_Customer.customerId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CUSTOMERID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public CustomerModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _customerId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCustomerId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _customerId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Customer.class;
	}

	@Override
	public String getModelClassName() {
		return Customer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Customer, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Customer, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Customer, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Customer)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Customer, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Customer, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Customer)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Customer, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Customer, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<Customer, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Customer, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Customer, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Customer, Object>>();
		Map<String, BiConsumer<Customer, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Customer, ?>>();

		attributeGetterFunctions.put("uuid", Customer::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Customer, String>)Customer::setUuid);
		attributeGetterFunctions.put("customerId", Customer::getCustomerId);
		attributeSetterBiConsumers.put(
			"customerId", (BiConsumer<Customer, Long>)Customer::setCustomerId);
		attributeGetterFunctions.put("customerName", Customer::getCustomerName);
		attributeSetterBiConsumers.put(
			"customerName",
			(BiConsumer<Customer, String>)Customer::setCustomerName);
		attributeGetterFunctions.put(
			"customerEmail", Customer::getCustomerEmail);
		attributeSetterBiConsumers.put(
			"customerEmail",
			(BiConsumer<Customer, String>)Customer::setCustomerEmail);
		attributeGetterFunctions.put(
			"customerAddress", Customer::getCustomerAddress);
		attributeSetterBiConsumers.put(
			"customerAddress",
			(BiConsumer<Customer, String>)Customer::setCustomerAddress);
		attributeGetterFunctions.put(
			"customerContact", Customer::getCustomerContact);
		attributeSetterBiConsumers.put(
			"customerContact",
			(BiConsumer<Customer, String>)Customer::setCustomerContact);
		attributeGetterFunctions.put("customerNRIC", Customer::getCustomerNRIC);
		attributeSetterBiConsumers.put(
			"customerNRIC",
			(BiConsumer<Customer, String>)Customer::setCustomerNRIC);
		attributeGetterFunctions.put("service", Customer::getService);
		attributeSetterBiConsumers.put(
			"service", (BiConsumer<Customer, String>)Customer::setService);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@Override
	public long getCustomerId() {
		return _customerId;
	}

	@Override
	public void setCustomerId(long customerId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_customerId = customerId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCustomerId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("customerId"));
	}

	@Override
	public String getCustomerName() {
		if (_customerName == null) {
			return "";
		}
		else {
			return _customerName;
		}
	}

	@Override
	public void setCustomerName(String customerName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_customerName = customerName;
	}

	@Override
	public String getCustomerEmail() {
		if (_customerEmail == null) {
			return "";
		}
		else {
			return _customerEmail;
		}
	}

	@Override
	public void setCustomerEmail(String customerEmail) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_customerEmail = customerEmail;
	}

	@Override
	public String getCustomerAddress() {
		if (_customerAddress == null) {
			return "";
		}
		else {
			return _customerAddress;
		}
	}

	@Override
	public void setCustomerAddress(String customerAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_customerAddress = customerAddress;
	}

	@Override
	public String getCustomerContact() {
		if (_customerContact == null) {
			return "";
		}
		else {
			return _customerContact;
		}
	}

	@Override
	public void setCustomerContact(String customerContact) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_customerContact = customerContact;
	}

	@Override
	public String getCustomerNRIC() {
		if (_customerNRIC == null) {
			return "";
		}
		else {
			return _customerNRIC;
		}
	}

	@Override
	public void setCustomerNRIC(String customerNRIC) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_customerNRIC = customerNRIC;
	}

	@Override
	public String getService() {
		if (_service == null) {
			return "";
		}
		else {
			return _service;
		}
	}

	@Override
	public void setService(String service) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_service = service;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Customer.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Customer toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Customer>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CustomerImpl customerImpl = new CustomerImpl();

		customerImpl.setUuid(getUuid());
		customerImpl.setCustomerId(getCustomerId());
		customerImpl.setCustomerName(getCustomerName());
		customerImpl.setCustomerEmail(getCustomerEmail());
		customerImpl.setCustomerAddress(getCustomerAddress());
		customerImpl.setCustomerContact(getCustomerContact());
		customerImpl.setCustomerNRIC(getCustomerNRIC());
		customerImpl.setService(getService());

		customerImpl.resetOriginalValues();

		return customerImpl;
	}

	@Override
	public Customer cloneWithOriginalValues() {
		CustomerImpl customerImpl = new CustomerImpl();

		customerImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		customerImpl.setCustomerId(
			this.<Long>getColumnOriginalValue("customerId"));
		customerImpl.setCustomerName(
			this.<String>getColumnOriginalValue("customerName"));
		customerImpl.setCustomerEmail(
			this.<String>getColumnOriginalValue("customerEmail"));
		customerImpl.setCustomerAddress(
			this.<String>getColumnOriginalValue("customerAddress"));
		customerImpl.setCustomerContact(
			this.<String>getColumnOriginalValue("customerContact"));
		customerImpl.setCustomerNRIC(
			this.<String>getColumnOriginalValue("customerNRIC"));
		customerImpl.setService(this.<String>getColumnOriginalValue("service"));

		return customerImpl;
	}

	@Override
	public int compareTo(Customer customer) {
		int value = 0;

		if (getCustomerId() < customer.getCustomerId()) {
			value = -1;
		}
		else if (getCustomerId() > customer.getCustomerId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Customer)) {
			return false;
		}

		Customer customer = (Customer)object;

		long primaryKey = customer.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Customer> toCacheModel() {
		CustomerCacheModel customerCacheModel = new CustomerCacheModel();

		customerCacheModel.uuid = getUuid();

		String uuid = customerCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			customerCacheModel.uuid = null;
		}

		customerCacheModel.customerId = getCustomerId();

		customerCacheModel.customerName = getCustomerName();

		String customerName = customerCacheModel.customerName;

		if ((customerName != null) && (customerName.length() == 0)) {
			customerCacheModel.customerName = null;
		}

		customerCacheModel.customerEmail = getCustomerEmail();

		String customerEmail = customerCacheModel.customerEmail;

		if ((customerEmail != null) && (customerEmail.length() == 0)) {
			customerCacheModel.customerEmail = null;
		}

		customerCacheModel.customerAddress = getCustomerAddress();

		String customerAddress = customerCacheModel.customerAddress;

		if ((customerAddress != null) && (customerAddress.length() == 0)) {
			customerCacheModel.customerAddress = null;
		}

		customerCacheModel.customerContact = getCustomerContact();

		String customerContact = customerCacheModel.customerContact;

		if ((customerContact != null) && (customerContact.length() == 0)) {
			customerCacheModel.customerContact = null;
		}

		customerCacheModel.customerNRIC = getCustomerNRIC();

		String customerNRIC = customerCacheModel.customerNRIC;

		if ((customerNRIC != null) && (customerNRIC.length() == 0)) {
			customerCacheModel.customerNRIC = null;
		}

		customerCacheModel.service = getService();

		String service = customerCacheModel.service;

		if ((service != null) && (service.length() == 0)) {
			customerCacheModel.service = null;
		}

		return customerCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Customer, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Customer, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Customer, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Customer)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Customer, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Customer, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Customer, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Customer)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Customer>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Customer.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _customerId;
	private String _customerName;
	private String _customerEmail;
	private String _customerAddress;
	private String _customerContact;
	private String _customerNRIC;
	private String _service;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Customer, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Customer)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("customerId", _customerId);
		_columnOriginalValues.put("customerName", _customerName);
		_columnOriginalValues.put("customerEmail", _customerEmail);
		_columnOriginalValues.put("customerAddress", _customerAddress);
		_columnOriginalValues.put("customerContact", _customerContact);
		_columnOriginalValues.put("customerNRIC", _customerNRIC);
		_columnOriginalValues.put("service", _service);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("customerId", 2L);

		columnBitmasks.put("customerName", 4L);

		columnBitmasks.put("customerEmail", 8L);

		columnBitmasks.put("customerAddress", 16L);

		columnBitmasks.put("customerContact", 32L);

		columnBitmasks.put("customerNRIC", 64L);

		columnBitmasks.put("service", 128L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Customer _escapedModel;

}