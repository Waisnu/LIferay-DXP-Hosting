create table FOO_Customer (
	uuid_ VARCHAR(75) null,
	customerId LONG not null primary key,
	customerName VARCHAR(75) null,
	customerEmail VARCHAR(75) null,
	customerAddress VARCHAR(75) null,
	customerContact VARCHAR(75) null,
	customerNRIC VARCHAR(75) null,
	service VARCHAR(75) null
);