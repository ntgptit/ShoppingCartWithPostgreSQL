
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

DROP SEQUENCE IF EXISTS category_id_seq;
DROP SEQUENCE IF EXISTS order_detail_id_seq;
DROP SEQUENCE IF EXISTS order_id_seq;
DROP SEQUENCE IF EXISTS payment_id_seq;
DROP SEQUENCE IF EXISTS product_id_seq;
DROP SEQUENCE IF EXISTS role_id_seq;
DROP SEQUENCE IF EXISTS shipper_id_seq;
DROP SEQUENCE IF EXISTS supplier_id_seq;
DROP SEQUENCE IF EXISTS user_id_seq;
DROP SEQUENCE IF EXISTS user_role_id_seq;




/* Create Sequences */

CREATE SEQUENCE category_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE order_detail_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE order_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE payment_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE product_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE role_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE shipper_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE supplier_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE user_id_seq INCREMENT 1 MINVALUE 1 START 10000;
CREATE SEQUENCE user_role_id_seq INCREMENT 1 MINVALUE 1 START 10000;



/* Create Tables */

CREATE TABLE category
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


CREATE TABLE orders
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


CREATE TABLE order_details
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


CREATE TABLE payment
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


CREATE TABLE products
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
	isActice bigint,
	supplier_id bigint NOT NULL,
	category_id bigint NOT NULL,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE role
(
	id bigint DEFAULT nextval('role_id_seq') NOT NULL UNIQUE,
	name varchar NOT NULL UNIQUE,
	description varchar,
	created_by varchar,
	updated_by varchar,
	isActive bigint,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE shippers
(
	id bigint DEFAULT nextval('shipper_id_seq') NOT NULL UNIQUE,
	name varchar NOT NULL UNIQUE,
	phone varchar NOT NULL,
	description varchar,
	created_by varchar,
	updated_by varchar,
	isActive bigint,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE suppliers
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
	isActive bigint,
	created_by varchar,
	updated_by varchar,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE users
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
	isActive int,
	created_by varchar,
	updated_by varchar,
	created_timestamp timestamp,
	updated_timestamp timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE user_role
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

ALTER TABLE products
	ADD FOREIGN KEY (category_id)
	REFERENCES category (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE order_details
	ADD FOREIGN KEY (order_id)
	REFERENCES orders (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE orders
	ADD FOREIGN KEY (payment_id)
	REFERENCES payment (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE order_details
	ADD FOREIGN KEY (product_id)
	REFERENCES products (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE user_role
	ADD FOREIGN KEY (role_id)
	REFERENCES role (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE orders
	ADD FOREIGN KEY (shipper_id)
	REFERENCES shippers (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE products
	ADD FOREIGN KEY (supplier_id)
	REFERENCES suppliers (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE orders
	ADD FOREIGN KEY (user_id)
	REFERENCES users (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE user_role
	ADD FOREIGN KEY (user_id)
	REFERENCES users (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



