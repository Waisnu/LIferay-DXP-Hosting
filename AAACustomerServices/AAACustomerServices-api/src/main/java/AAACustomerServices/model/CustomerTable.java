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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;FOO_Customer&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Customer
 * @generated
 */
public class CustomerTable extends BaseTable<CustomerTable> {

	public static final CustomerTable INSTANCE = new CustomerTable();

	public final Column<CustomerTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, Long> customerId = createColumn(
		"customerId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CustomerTable, String> customerName = createColumn(
		"customerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, String> customerEmail = createColumn(
		"customerEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, String> customerAddress = createColumn(
		"customerAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, String> customerContact = createColumn(
		"customerContact", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, String> customerNRIC = createColumn(
		"customerNRIC", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CustomerTable, String> service = createColumn(
		"service", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private CustomerTable() {
		super("FOO_Customer", CustomerTable::new);
	}

}