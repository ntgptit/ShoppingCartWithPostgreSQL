
/* Drop Tables */

DROP TABLE IF EXISTS order_details;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS payment;
DROP TABLE IF EXISTS user_role;
DROP TABLE IF EXISTS role;
DROP TABLE IF EXISTS shippers;
DROP TABLE IF EXISTS suppliers;
DROP TABLE IF EXISTS users;



/* Drop Sequences */

DROP SEQUENCE IF EXISTS core_data.category_id_seq;
DROP SEQUENCE IF EXISTS core_data.order_detail_id_seq;
DROP SEQUENCE IF EXISTS core_data.order_id_seq;
DROP SEQUENCE IF EXISTS core_data.payment_id_seq;
DROP SEQUENCE IF EXISTS core_data.product_id_seq;
DROP SEQUENCE IF EXISTS core_data.role_id_seq;
DROP SEQUENCE IF EXISTS core_data.shipper_id_seq;
DROP SEQUENCE IF EXISTS core_data.supplier_id_seq;
DROP SEQUENCE IF EXISTS core_data.user_id_seq;
DROP SEQUENCE IF EXISTS core_data.user_role_id_seq;




/* Create Sequences */

CREATE SEQUENCE core_data.category_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE core_data.order_detail_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE core_data.order_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE core_data.payment_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE core_data.product_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE core_data.role_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE core_data.shipper_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE core_data.supplier_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE core_data.user_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE core_data.user_role_id_seq INCREMENT 1 MINVALUE 1 START 10000;



/* Create Tables */

CREATE TABLE core_data.category
(
	id bigint DEFAULT nextval('category_id_seq') NOT NULL UNIQUE,
	name varchar NOT NULL UNIQUE,
	description varchar,
	picture bytea,
	isActive int,
	created_by varchar,
	updated_by varchar,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE core_data.orders
(
	id bigint DEFAULT nextval('order_id_seq') NOT NULL UNIQUE,
	order_number varchar NOT NULL,
	order_date date,
	ship_date date,
	required_date date,
	freight int,
	sales_tax float,
	transaction_status varchar,
	error_loc varchar,
	error_message varchar,
	fulfilled int,
	isDeleted int,
	isPaid int,
	payment_date date,
	created_by varchar,
	updated_by varchar,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	shipper_id bigint NOT NULL,
	payment_id bigint NOT NULL,
	user_id bigint NOT NULL,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE core_data.order_details
(
	id bigint DEFAULT nextval('order_detail_id_seq') NOT NULL UNIQUE,
	order_number varchar,
	price float,
	quanlity int,
	discount float,
	total int,
	sku_id bigint,
	sizes int,
	color varchar,
	fulfilled int NOT NULL,
	ship_date date,
	bill_date date,
	created_by varchar,
	updated_by varchar,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	product_id bigint NOT NULL,
	order_id bigint NOT NULL,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE core_data.payment
(
	id bigint DEFAULT nextval('payment_id_seq') NOT NULL UNIQUE,
	type varchar NOT NULL,
	allowed int NOT NULL,
	created_by varchar,
	updated_by varchar,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE core_data.products
(
	id bigint DEFAULT nextval('product_id_seq') NOT NULL UNIQUE,
	sku bigint UNIQUE,
	sku_id bigint UNIQUE,
	vendor_product_id bigint,
	name varchar NOT NULL UNIQUE,
	quantity_per_unit int,
	unit_price float,
	msrp float,
	available_size int,
	available_color varchar,
	sizes int,
	color varchar,
	discount float,
	unit_weight float,
	unit_in_stock bigint,
	unit_on_order int,
	re_order_level int,
	product_available int,
	discount_available int,
	current_order varchar,
	picture bytea,
	ranking varchar,
	note varchar,
	created_by varchar,
	updated_by varchar,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	supplier_id bigint NOT NULL,
	category_id bigint NOT NULL,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE core_data.role
(
	id bigint DEFAULT nextval('role_id_seq') NOT NULL UNIQUE,
	name varchar NOT NULL UNIQUE,
	description varchar,
	created_by varchar,
	updated_by varchar,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE core_data.shippers
(
	id bigint DEFAULT nextval('shipper_id_seq') NOT NULL UNIQUE,
	name varchar NOT NULL UNIQUE,
	phone varchar NOT NULL,
	description varchar,
	created_by varchar,
	updated_by varchar,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE core_data.suppliers
(
	id bigint DEFAULT nextval('supplier_id_seq') NOT NULL UNIQUE,
	company_first_name varchar NOT NULL,
	contact_last_name varchar NOT NULL,
	contact_title varchar NOT NULL,
	address1 varchar NOT NULL,
	address2 varchar,
	address3 varchar,
	city varchar,
	country varchar,
	postal_code varchar,
	phone varchar,
	fax varchar,
	email varchar,
	url varchar,
	payment_methods varchar,
	discount_type varchar,
	type_goods varchar,
	notes varchar,
	discount_available int,
	current_order varchar,
	customer_id int,
	size_url int,
	created_by varchar,
	updated_by varchar,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE core_data.users
(
	id bigint DEFAULT nextval('user_id_seq') NOT NULL UNIQUE,
	first_name varchar,
	last_name varchar,
	address1 varchar,
	address2 varchar,
	address3 varchar,
	city varchar,
	country varchar,
	postal_code varchar,
	phone varchar NOT NULL UNIQUE,
	email varchar NOT NULL UNIQUE,
	voice_mail varchar,
	password varchar NOT NULL,
	credit_card varchar,
	credit_card_type_id int,
	card_exp_mo varchar,
	card_exp_yr varchar,
	billing_address varchar,
	billing_city varchar,
	billing_region varchar,
	billing_postal_code varchar,
	billing_country varchar,
	ship_address varchar,
	ship_city varchar,
	ship_region varchar,
	ship_postal_code varchar,
	ship_country varchar,
	date_entered date,
	created_by varchar,
	updated_by varchar,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE core_data.user_role
(
	id bigint DEFAULT nextval('user_role_id_seq') NOT NULL UNIQUE,
	created_by varchar,
	updated_by varchar,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	role_id bigint NOT NULL,
	user_id bigint NOT NULL,
	PRIMARY KEY (id)
) WITHOUT OIDS;



/* Create Foreign Keys */

ALTER TABLE core_data.products
	ADD FOREIGN KEY (category_id)
	REFERENCES core_data.category (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE core_data.order_details
	ADD FOREIGN KEY (order_id)
	REFERENCES core_data.orders (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE core_data.orders
	ADD FOREIGN KEY (payment_id)
	REFERENCES core_data.payment (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE core_data.order_details
	ADD FOREIGN KEY (product_id)
	REFERENCES core_data.products (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE core_data.user_role
	ADD FOREIGN KEY (role_id)
	REFERENCES core_data.role (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE core_data.orders
	ADD FOREIGN KEY (shipper_id)
	REFERENCES core_data.shippers (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE core_data.products
	ADD FOREIGN KEY (supplier_id)
	REFERENCES core_data.suppliers (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE core_data.orders
	ADD FOREIGN KEY (user_id)
	REFERENCES core_data.users (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE core_data.user_role
	ADD FOREIGN KEY (user_id)
	REFERENCES core_data.users (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



