
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
    id                int DEFAULT nextval('category_id_seq') NOT NULL UNIQUE,
    code              varchar                                NOT NULL UNIQUE,
    name              varchar                                NOT NULL UNIQUE,
    note              varchar,
    picture           bytea,
    is_active         int,
    created_by        varchar,
    updated_by        varchar,
    created_timestamp timestamp,
    updated_timestamp timestamp,
    PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE orders
(
    id                 int DEFAULT nextval('order_id_seq') NOT NULL UNIQUE,
    order_subject      varchar                             NOT NULL,
    order_date         date,
    ship_date          date,
    required_date      date,
    freight            int,
    sales_tax          float,
    transaction_status varchar,
    error_message      varchar,
    fulfilled          int,
    is_paid            int,
    payment_date       date,
    is_active          int,
    created_by         varchar,
    updated_by         varchar,
    created_timestamp  timestamp,
    updated_timestamp  timestamp,
    shipper_id         int                                 NOT NULL,
    payment_id         int                                 NOT NULL,
    user_id            int                                 NOT NULL,
    PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE order_details
(
    id                int DEFAULT nextval('order_detail_id_seq') NOT NULL UNIQUE,
    order_subject     varchar                                    NOT NULL,
    price             float,
    quanlity          int,
    discount          float,
    total             float,
    sizes             int,
    color             varchar,
    fulfilled         int                                        NOT NULL,
    ship_date         date,
    bill_date         date,
    note              varchar,
    is_active         int,
    created_by        varchar,
    updated_by        varchar,
    created_timestamp timestamp,
    updated_timestamp timestamp,
    product_id        int                                        NOT NULL,
    order_id          int                                        NOT NULL,
    PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE payment
(
    id                int DEFAULT nextval('payment_id_seq') NOT NULL UNIQUE,
    type              varchar                               NOT NULL,
    allowed           int                                   NOT NULL,
    created_by        varchar,
    updated_by        varchar,
    created_timestamp timestamp,
    updated_timestamp timestamp,
    PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE products
(
    id                 int DEFAULT nextval('product_id_seq') NOT NULL UNIQUE,
    code               varchar,
    name               varchar                               NOT NULL UNIQUE,
    product_available  int,
    unit_price         float,
    quantity_per_unit  int,
    sizes              int,
    color              varchar,
    unit_weight        float,
    unit_in_stock      bigint,
    unit_on_order      int,
    discount_available int,
    discount           float,
    picture            bytea,
    ranking            varchar,
    note               varchar,
    is_active          int,
    created_by         varchar,
    updated_by         varchar,
    created_timestamp  timestamp,
    updated_timestamp  timestamp,
    supplier_id        int                                   NOT NULL,
    category_id        int                                   NOT NULL,
    PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE role
(
    id                bigint DEFAULT nextval('role_id_seq') NOT NULL UNIQUE,
    code              varchar                               NOT NULL UNIQUE,
    name              varchar                               NOT NULL UNIQUE,
    description       varchar,
    created_by        varchar,
    updated_by        varchar,
    is_active         bigint,
    created_timestamp timestamp,
    updated_timestamp timestamp,
    PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE shippers
(
    id                int DEFAULT nextval('shipper_id_seq') NOT NULL UNIQUE,
    code              varchar                               NOT NULL UNIQUE,
    name              varchar                               NOT NULL UNIQUE,
    phone             varchar                               NOT NULL,
    description       varchar,
    created_by        varchar,
    updated_by        varchar,
    is_active         bigint,
    created_timestamp timestamp,
    updated_timestamp timestamp,
    PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE suppliers
(
    id                 int DEFAULT nextval('supplier_id_seq') NOT NULL UNIQUE,
    name               varchar                                NOT NULL,
    code               varchar                                NOT NULL,
    address            varchar                                NOT NULL,
    city               varchar,
    country            varchar,
    phone              varchar,
    email              varchar,
    url                varchar,
    payment_methods    varchar,
    type_goods         varchar,
    discount_type      varchar,
    discount_available int,
    current_order      varchar,
    notes              varchar,
    is_active          int,
    created_by         varchar,
    updated_by         varchar,
    created_timestamp  timestamp,
    updated_timestamp  timestamp,
    PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE users
(
    id                  int DEFAULT nextval('user_id_seq') NOT NULL UNIQUE,
    code                varchar                            NOT NULL UNIQUE,
    first_name          varchar,
    last_name           varchar,
    address             varchar,
    city                varchar,
    country             varchar,
    phone               varchar                            NOT NULL UNIQUE,
    email               varchar                            NOT NULL UNIQUE,
    password            varchar                            NOT NULL UNIQUE,
    credit_card         varchar,
    credit_card_type_id int,
    card_exp_mo         varchar,
    card_exp_yr         varchar,
    billing_address     varchar,
    billing_city        varchar,
    billing_country     varchar,
    ship_address        varchar,
    ship_city           varchar,
    ship_country        varchar,
    date_entered        date,
    is_active           int,
    created_by          varchar,
    updated_by          varchar,
    created_timestamp   timestamp,
    updated_timestamp   timestamp,
    PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE user_role
(
    id                bigint DEFAULT nextval('user_role_id_seq') NOT NULL UNIQUE,
    created_by        varchar,
    updated_by        varchar,
    created_timestamp timestamp,
    updated_timestamp timestamp,
    role_id           bigint                                     NOT NULL,
    user_id           int                                        NOT NULL,
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



