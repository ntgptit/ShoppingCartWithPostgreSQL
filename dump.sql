PGDMP     0    ;                x            shopping-cart    12.2    12.2 �    ,           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            -           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            .           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            /           1262    16393    shopping-cart    DATABASE     �   CREATE DATABASE "shopping-cart" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE "shopping-cart";
                postgres    false            0           0    0    DATABASE "shopping-cart"    COMMENT     `   COMMENT ON DATABASE "shopping-cart" IS 'Database for shopping cart.
Design by FPTジャップ';
                   postgres    false    3119                        2615    16566 	   core_data    SCHEMA        CREATE SCHEMA core_data;
    DROP SCHEMA core_data;
                postgres    false            �            1259    19168    category    TABLE     �  CREATE TABLE core_data.category (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    code character varying NOT NULL,
    name character varying NOT NULL,
    note character varying,
    picture bytea,
    is_active integer,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone
);
    DROP TABLE core_data.category;
    	   core_data         heap    postgres    false    6            �            1259    18294    category_id_seq    SEQUENCE        CREATE SEQUENCE core_data.category_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE core_data.category_id_seq;
    	   core_data          postgres    false    6            �            1259    18296    order_detail_id_seq    SEQUENCE     �   CREATE SEQUENCE core_data.order_detail_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE core_data.order_detail_id_seq;
    	   core_data          postgres    false    6            �            1259    19309    order_details    TABLE     �  CREATE TABLE core_data.order_details (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    order_subject character varying NOT NULL,
    price double precision,
    quanlity integer,
    discount double precision,
    total double precision,
    sizes integer,
    color character varying,
    fulfilled integer NOT NULL,
    ship_date date,
    bill_date date,
    note character varying,
    is_active integer,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone,
    product_id character varying,
    order_id character varying
);
 $   DROP TABLE core_data.order_details;
    	   core_data         heap    postgres    false    6            �            1259    18298    order_id_seq    SEQUENCE     |   CREATE SEQUENCE core_data.order_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE core_data.order_id_seq;
    	   core_data          postgres    false    6            �            1259    19245    orders    TABLE     �  CREATE TABLE core_data.orders (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    order_subject character varying NOT NULL,
    order_date date,
    ship_date date,
    required_date date,
    freight integer,
    sales_tax double precision,
    transaction_status character varying,
    error_message character varying,
    fulfilled integer,
    is_paid integer,
    payment_date date,
    is_active integer,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone,
    shipper_id character varying,
    payment_id character varying,
    user_id character varying
);
    DROP TABLE core_data.orders;
    	   core_data         heap    postgres    false    6            �            1259    19181    payment    TABLE     c  CREATE TABLE core_data.payment (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    type character varying NOT NULL,
    allowed integer NOT NULL,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone
);
    DROP TABLE core_data.payment;
    	   core_data         heap    postgres    false    6            �            1259    18300    payment_id_seq    SEQUENCE     ~   CREATE SEQUENCE core_data.payment_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE core_data.payment_id_seq;
    	   core_data          postgres    false    6            �            1259    18302    product_id_seq    SEQUENCE     ~   CREATE SEQUENCE core_data.product_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE core_data.product_id_seq;
    	   core_data          postgres    false    6            �            1259    19269    products    TABLE     2  CREATE TABLE core_data.products (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    code character varying,
    name character varying NOT NULL,
    product_available integer,
    unit_price double precision,
    quantity_per_unit integer,
    sizes integer,
    color character varying,
    unit_weight double precision,
    unit_in_stock bigint,
    unit_on_order integer,
    discount_available integer,
    discount double precision,
    picture bytea,
    ranking character varying,
    note character varying,
    is_active integer,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone,
    supplier_id character varying,
    category_id character varying
);
    DROP TABLE core_data.products;
    	   core_data         heap    postgres    false    6            �            1259    19190    role    TABLE     �  CREATE TABLE core_data.role (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    code character varying NOT NULL,
    name character varying NOT NULL,
    description character varying,
    created_by character varying,
    updated_by character varying,
    is_active bigint,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone
);
    DROP TABLE core_data.role;
    	   core_data         heap    postgres    false    6            �            1259    18304    role_id_seq    SEQUENCE     {   CREATE SEQUENCE core_data.role_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE core_data.role_id_seq;
    	   core_data          postgres    false    6            �            1259    18306    shipper_id_seq    SEQUENCE     ~   CREATE SEQUENCE core_data.shipper_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE core_data.shipper_id_seq;
    	   core_data          postgres    false    6            �            1259    19203    shippers    TABLE     �  CREATE TABLE core_data.shippers (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    code character varying NOT NULL,
    name character varying NOT NULL,
    phone character varying NOT NULL,
    description character varying,
    created_by character varying,
    updated_by character varying,
    is_active bigint,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone
);
    DROP TABLE core_data.shippers;
    	   core_data         heap    postgres    false    6            �            1259    18308    supplier_id_seq    SEQUENCE        CREATE SEQUENCE core_data.supplier_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE core_data.supplier_id_seq;
    	   core_data          postgres    false    6            �            1259    19216 	   suppliers    TABLE       CREATE TABLE core_data.suppliers (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    name character varying NOT NULL,
    code character varying NOT NULL,
    address character varying NOT NULL,
    city character varying,
    country character varying,
    phone character varying,
    email character varying,
    url character varying,
    payment_methods character varying,
    type_goods character varying,
    discount_type character varying,
    discount_available integer,
    current_order character varying,
    notes character varying,
    is_active integer,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone
);
     DROP TABLE core_data.suppliers;
    	   core_data         heap    postgres    false    6            �            1259    18310    user_id_seq    SEQUENCE     {   CREATE SEQUENCE core_data.user_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE core_data.user_id_seq;
    	   core_data          postgres    false    6            �            1259    19290 	   user_role    TABLE     `  CREATE TABLE core_data.user_role (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone,
    role_id character varying,
    user_id character varying
);
     DROP TABLE core_data.user_role;
    	   core_data         heap    postgres    false    6            �            1259    18312    user_role_id_seq    SEQUENCE     �   CREATE SEQUENCE core_data.user_role_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE core_data.user_role_id_seq;
    	   core_data          postgres    false    6            �            1259    19225    users    TABLE     �  CREATE TABLE core_data.users (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    code character varying NOT NULL,
    first_name character varying,
    last_name character varying,
    address character varying,
    city character varying,
    country character varying,
    phone character varying NOT NULL,
    email character varying NOT NULL,
    username character varying NOT NULL,
    password character varying NOT NULL,
    credit_card character varying,
    credit_card_type_id integer,
    card_exp_mo character varying,
    card_exp_yr character varying,
    billing_address character varying,
    billing_city character varying,
    billing_country character varying,
    ship_address character varying,
    ship_city character varying,
    ship_country character varying,
    date_entered date,
    is_active integer,
    login_failed_count integer DEFAULT 0,
    is_account_non_expired boolean,
    is_account_non_locked boolean,
    is_credentials_non_expired boolean,
    is_enabled boolean,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone
);
    DROP TABLE core_data.users;
    	   core_data         heap    postgres    false    6            �            1259    18670    category    TABLE     �  CREATE TABLE public.category (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    code character varying NOT NULL,
    name character varying NOT NULL,
    note character varying,
    picture bytea,
    is_active integer,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone
);
    DROP TABLE public.category;
       public         heap    postgres    false            �            1259    18650    category_id_seq    SEQUENCE     |   CREATE SEQUENCE public.category_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.category_id_seq;
       public          postgres    false            �            1259    18652    order_detail_id_seq    SEQUENCE     �   CREATE SEQUENCE public.order_detail_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.order_detail_id_seq;
       public          postgres    false            �            1259    18692    order_details    TABLE     �  CREATE TABLE public.order_details (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    order_subject character varying NOT NULL,
    price double precision,
    quanlity integer,
    discount double precision,
    total double precision,
    sizes integer,
    color character varying,
    fulfilled integer NOT NULL,
    ship_date date,
    bill_date date,
    note character varying,
    is_active integer,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone,
    product_id character varying NOT NULL,
    order_id character varying NOT NULL
);
 !   DROP TABLE public.order_details;
       public         heap    postgres    false            �            1259    18654    order_id_seq    SEQUENCE     y   CREATE SEQUENCE public.order_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.order_id_seq;
       public          postgres    false            �            1259    18683    orders    TABLE     �  CREATE TABLE public.orders (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    order_subject character varying NOT NULL,
    order_date date,
    ship_date date,
    required_date date,
    freight integer,
    sales_tax double precision,
    transaction_status character varying,
    error_message character varying,
    fulfilled integer,
    is_paid integer,
    payment_date date,
    is_active integer,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone,
    shipper_id character varying NOT NULL,
    payment_id character varying NOT NULL,
    user_id character varying NOT NULL
);
    DROP TABLE public.orders;
       public         heap    postgres    false            �            1259    18701    payment    TABLE     `  CREATE TABLE public.payment (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    type character varying NOT NULL,
    allowed integer NOT NULL,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone
);
    DROP TABLE public.payment;
       public         heap    postgres    false            �            1259    18656    payment_id_seq    SEQUENCE     {   CREATE SEQUENCE public.payment_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.payment_id_seq;
       public          postgres    false            �            1259    18658    product_id_seq    SEQUENCE     {   CREATE SEQUENCE public.product_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.product_id_seq;
       public          postgres    false            �            1259    18710    products    TABLE     A  CREATE TABLE public.products (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    code character varying,
    name character varying NOT NULL,
    product_available integer,
    unit_price double precision,
    quantity_per_unit integer,
    sizes integer,
    color character varying,
    unit_weight double precision,
    unit_in_stock bigint,
    unit_on_order integer,
    discount_available integer,
    discount double precision,
    picture bytea,
    ranking character varying,
    note character varying,
    is_active integer,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone,
    supplier_id character varying NOT NULL,
    category_id character varying NOT NULL
);
    DROP TABLE public.products;
       public         heap    postgres    false            �            1259    18721    role    TABLE     �  CREATE TABLE public.role (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    code character varying NOT NULL,
    name character varying NOT NULL,
    description character varying,
    created_by character varying,
    updated_by character varying,
    is_active bigint,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone
);
    DROP TABLE public.role;
       public         heap    postgres    false            �            1259    18660    role_id_seq    SEQUENCE     x   CREATE SEQUENCE public.role_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.role_id_seq;
       public          postgres    false            �            1259    18662    shipper_id_seq    SEQUENCE     {   CREATE SEQUENCE public.shipper_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.shipper_id_seq;
       public          postgres    false            �            1259    18734    shippers    TABLE     �  CREATE TABLE public.shippers (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    code character varying NOT NULL,
    name character varying NOT NULL,
    phone character varying NOT NULL,
    description character varying,
    created_by character varying,
    updated_by character varying,
    is_active bigint,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone
);
    DROP TABLE public.shippers;
       public         heap    postgres    false            �            1259    18664    supplier_id_seq    SEQUENCE     |   CREATE SEQUENCE public.supplier_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.supplier_id_seq;
       public          postgres    false            �            1259    18747 	   suppliers    TABLE       CREATE TABLE public.suppliers (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    name character varying NOT NULL,
    code character varying NOT NULL,
    address character varying NOT NULL,
    city character varying,
    country character varying,
    phone character varying,
    email character varying,
    url character varying,
    payment_methods character varying,
    type_goods character varying,
    discount_type character varying,
    discount_available integer,
    current_order character varying,
    notes character varying,
    is_active integer,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone
);
    DROP TABLE public.suppliers;
       public         heap    postgres    false            �            1259    18666    user_id_seq    SEQUENCE     x   CREATE SEQUENCE public.user_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.user_id_seq;
       public          postgres    false            �            1259    18773 	   user_role    TABLE     o  CREATE TABLE public.user_role (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone,
    role_id character varying NOT NULL,
    user_id character varying NOT NULL
);
    DROP TABLE public.user_role;
       public         heap    postgres    false            �            1259    18668    user_role_id_seq    SEQUENCE     }   CREATE SEQUENCE public.user_role_id_seq
    START WITH 10000
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.user_role_id_seq;
       public          postgres    false            �            1259    18756    users    TABLE     �  CREATE TABLE public.users (
    id character varying DEFAULT 'uuid_generate_v1()'::character varying NOT NULL,
    code character varying NOT NULL,
    first_name character varying,
    last_name character varying,
    address character varying,
    city character varying,
    country character varying,
    phone character varying NOT NULL,
    email character varying NOT NULL,
    password character varying NOT NULL,
    credit_card character varying,
    credit_card_type_id integer,
    card_exp_mo character varying,
    card_exp_yr character varying,
    billing_address character varying,
    billing_city character varying,
    billing_country character varying,
    ship_address character varying,
    ship_city character varying,
    ship_country character varying,
    date_entered date,
    is_active integer,
    created_by character varying,
    updated_by character varying,
    created_timestamp timestamp without time zone,
    updated_timestamp timestamp without time zone,
    username character varying NOT NULL,
    login_failed_count integer DEFAULT 0,
    is_account_non_expired boolean,
    is_account_non_locked boolean,
    is_credentials_non_expired boolean,
    is_enabled boolean
);
    DROP TABLE public.users;
       public         heap    postgres    false                       0    19168    category 
   TABLE DATA           �   COPY core_data.category (id, code, name, note, picture, is_active, created_by, updated_by, created_timestamp, updated_timestamp) FROM stdin;
 	   core_data          postgres    false    233   ��       )          0    19309    order_details 
   TABLE DATA           �   COPY core_data.order_details (id, order_subject, price, quanlity, discount, total, sizes, color, fulfilled, ship_date, bill_date, note, is_active, created_by, updated_by, created_timestamp, updated_timestamp, product_id, order_id) FROM stdin;
 	   core_data          postgres    false    242   ��       &          0    19245    orders 
   TABLE DATA             COPY core_data.orders (id, order_subject, order_date, ship_date, required_date, freight, sales_tax, transaction_status, error_message, fulfilled, is_paid, payment_date, is_active, created_by, updated_by, created_timestamp, updated_timestamp, shipper_id, payment_id, user_id) FROM stdin;
 	   core_data          postgres    false    239   ��       !          0    19181    payment 
   TABLE DATA           u   COPY core_data.payment (id, type, allowed, created_by, updated_by, created_timestamp, updated_timestamp) FROM stdin;
 	   core_data          postgres    false    234   ��       '          0    19269    products 
   TABLE DATA           9  COPY core_data.products (id, code, name, product_available, unit_price, quantity_per_unit, sizes, color, unit_weight, unit_in_stock, unit_on_order, discount_available, discount, picture, ranking, note, is_active, created_by, updated_by, created_timestamp, updated_timestamp, supplier_id, category_id) FROM stdin;
 	   core_data          postgres    false    240   :�       "          0    19190    role 
   TABLE DATA           �   COPY core_data.role (id, code, name, description, created_by, updated_by, is_active, created_timestamp, updated_timestamp) FROM stdin;
 	   core_data          postgres    false    235   W�       #          0    19203    shippers 
   TABLE DATA           �   COPY core_data.shippers (id, code, name, phone, description, created_by, updated_by, is_active, created_timestamp, updated_timestamp) FROM stdin;
 	   core_data          postgres    false    236   t�       $          0    19216 	   suppliers 
   TABLE DATA              COPY core_data.suppliers (id, name, code, address, city, country, phone, email, url, payment_methods, type_goods, discount_type, discount_available, current_order, notes, is_active, created_by, updated_by, created_timestamp, updated_timestamp) FROM stdin;
 	   core_data          postgres    false    237   ��       (          0    19290 	   user_role 
   TABLE DATA           z   COPY core_data.user_role (id, created_by, updated_by, created_timestamp, updated_timestamp, role_id, user_id) FROM stdin;
 	   core_data          postgres    false    241   �       %          0    19225    users 
   TABLE DATA           �  COPY core_data.users (id, code, first_name, last_name, address, city, country, phone, email, username, password, credit_card, credit_card_type_id, card_exp_mo, card_exp_yr, billing_address, billing_city, billing_country, ship_address, ship_city, ship_country, date_entered, is_active, login_failed_count, is_account_non_expired, is_account_non_locked, is_credentials_non_expired, is_enabled, created_by, updated_by, created_timestamp, updated_timestamp) FROM stdin;
 	   core_data          postgres    false    238   "�                 0    18670    category 
   TABLE DATA           �   COPY public.category (id, code, name, note, picture, is_active, created_by, updated_by, created_timestamp, updated_timestamp) FROM stdin;
    public          postgres    false    223   ?�                 0    18692    order_details 
   TABLE DATA           �   COPY public.order_details (id, order_subject, price, quanlity, discount, total, sizes, color, fulfilled, ship_date, bill_date, note, is_active, created_by, updated_by, created_timestamp, updated_timestamp, product_id, order_id) FROM stdin;
    public          postgres    false    225   \�                 0    18683    orders 
   TABLE DATA             COPY public.orders (id, order_subject, order_date, ship_date, required_date, freight, sales_tax, transaction_status, error_message, fulfilled, is_paid, payment_date, is_active, created_by, updated_by, created_timestamp, updated_timestamp, shipper_id, payment_id, user_id) FROM stdin;
    public          postgres    false    224   y�                 0    18701    payment 
   TABLE DATA           r   COPY public.payment (id, type, allowed, created_by, updated_by, created_timestamp, updated_timestamp) FROM stdin;
    public          postgres    false    226   ��                 0    18710    products 
   TABLE DATA           6  COPY public.products (id, code, name, product_available, unit_price, quantity_per_unit, sizes, color, unit_weight, unit_in_stock, unit_on_order, discount_available, discount, picture, ranking, note, is_active, created_by, updated_by, created_timestamp, updated_timestamp, supplier_id, category_id) FROM stdin;
    public          postgres    false    227   ��                 0    18721    role 
   TABLE DATA           �   COPY public.role (id, code, name, description, created_by, updated_by, is_active, created_timestamp, updated_timestamp) FROM stdin;
    public          postgres    false    228   ��                 0    18734    shippers 
   TABLE DATA           �   COPY public.shippers (id, code, name, phone, description, created_by, updated_by, is_active, created_timestamp, updated_timestamp) FROM stdin;
    public          postgres    false    229   �                 0    18747 	   suppliers 
   TABLE DATA           �   COPY public.suppliers (id, name, code, address, city, country, phone, email, url, payment_methods, type_goods, discount_type, discount_available, current_order, notes, is_active, created_by, updated_by, created_timestamp, updated_timestamp) FROM stdin;
    public          postgres    false    230   .�                 0    18773 	   user_role 
   TABLE DATA           w   COPY public.user_role (id, created_by, updated_by, created_timestamp, updated_timestamp, role_id, user_id) FROM stdin;
    public          postgres    false    232   ��                 0    18756    users 
   TABLE DATA           �  COPY public.users (id, code, first_name, last_name, address, city, country, phone, email, password, credit_card, credit_card_type_id, card_exp_mo, card_exp_yr, billing_address, billing_city, billing_country, ship_address, ship_city, ship_country, date_entered, is_active, created_by, updated_by, created_timestamp, updated_timestamp, username, login_failed_count, is_account_non_expired, is_account_non_locked, is_credentials_non_expired, is_enabled) FROM stdin;
    public          postgres    false    231   ��       1           0    0    category_id_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('core_data.category_id_seq', 10000, false);
       	   core_data          postgres    false    203            2           0    0    order_detail_id_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('core_data.order_detail_id_seq', 10000, false);
       	   core_data          postgres    false    204            3           0    0    order_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('core_data.order_id_seq', 10000, false);
       	   core_data          postgres    false    205            4           0    0    payment_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('core_data.payment_id_seq', 10000, false);
       	   core_data          postgres    false    206            5           0    0    product_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('core_data.product_id_seq', 10000, false);
       	   core_data          postgres    false    207            6           0    0    role_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('core_data.role_id_seq', 10000, false);
       	   core_data          postgres    false    208            7           0    0    shipper_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('core_data.shipper_id_seq', 10000, false);
       	   core_data          postgres    false    209            8           0    0    supplier_id_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('core_data.supplier_id_seq', 10000, false);
       	   core_data          postgres    false    210            9           0    0    user_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('core_data.user_id_seq', 10000, false);
       	   core_data          postgres    false    211            :           0    0    user_role_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('core_data.user_role_id_seq', 10000, false);
       	   core_data          postgres    false    212            ;           0    0    category_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.category_id_seq', 10000, false);
          public          postgres    false    213            <           0    0    order_detail_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.order_detail_id_seq', 10000, false);
          public          postgres    false    214            =           0    0    order_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.order_id_seq', 10000, false);
          public          postgres    false    215            >           0    0    payment_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.payment_id_seq', 10000, false);
          public          postgres    false    216            ?           0    0    product_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.product_id_seq', 10000, false);
          public          postgres    false    217            @           0    0    role_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.role_id_seq', 10000, false);
          public          postgres    false    218            A           0    0    shipper_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.shipper_id_seq', 10000, false);
          public          postgres    false    219            B           0    0    supplier_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.supplier_id_seq', 10000, false);
          public          postgres    false    220            C           0    0    user_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.user_id_seq', 10000, false);
          public          postgres    false    221            D           0    0    user_role_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.user_role_id_seq', 10000, false);
          public          postgres    false    222            G           2606    19178    category category_code_key 
   CONSTRAINT     X   ALTER TABLE ONLY core_data.category
    ADD CONSTRAINT category_code_key UNIQUE (code);
 G   ALTER TABLE ONLY core_data.category DROP CONSTRAINT category_code_key;
    	   core_data            postgres    false    233            I           2606    19180    category category_name_key 
   CONSTRAINT     X   ALTER TABLE ONLY core_data.category
    ADD CONSTRAINT category_name_key UNIQUE (name);
 G   ALTER TABLE ONLY core_data.category DROP CONSTRAINT category_name_key;
    	   core_data            postgres    false    233            K           2606    19176    category category_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY core_data.category
    ADD CONSTRAINT category_pkey PRIMARY KEY (id);
 C   ALTER TABLE ONLY core_data.category DROP CONSTRAINT category_pkey;
    	   core_data            postgres    false    233            q           2606    19317     order_details order_details_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY core_data.order_details
    ADD CONSTRAINT order_details_pkey PRIMARY KEY (id);
 M   ALTER TABLE ONLY core_data.order_details DROP CONSTRAINT order_details_pkey;
    	   core_data            postgres    false    242            i           2606    19253    orders orders_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY core_data.orders
    ADD CONSTRAINT orders_pkey PRIMARY KEY (id);
 ?   ALTER TABLE ONLY core_data.orders DROP CONSTRAINT orders_pkey;
    	   core_data            postgres    false    239            M           2606    19189    payment payment_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY core_data.payment
    ADD CONSTRAINT payment_pkey PRIMARY KEY (id);
 A   ALTER TABLE ONLY core_data.payment DROP CONSTRAINT payment_pkey;
    	   core_data            postgres    false    234            k           2606    19279    products products_name_key 
   CONSTRAINT     X   ALTER TABLE ONLY core_data.products
    ADD CONSTRAINT products_name_key UNIQUE (name);
 G   ALTER TABLE ONLY core_data.products DROP CONSTRAINT products_name_key;
    	   core_data            postgres    false    240            m           2606    19277    products products_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY core_data.products
    ADD CONSTRAINT products_pkey PRIMARY KEY (id);
 C   ALTER TABLE ONLY core_data.products DROP CONSTRAINT products_pkey;
    	   core_data            postgres    false    240            O           2606    19200    role role_code_key 
   CONSTRAINT     P   ALTER TABLE ONLY core_data.role
    ADD CONSTRAINT role_code_key UNIQUE (code);
 ?   ALTER TABLE ONLY core_data.role DROP CONSTRAINT role_code_key;
    	   core_data            postgres    false    235            Q           2606    19202    role role_name_key 
   CONSTRAINT     P   ALTER TABLE ONLY core_data.role
    ADD CONSTRAINT role_name_key UNIQUE (name);
 ?   ALTER TABLE ONLY core_data.role DROP CONSTRAINT role_name_key;
    	   core_data            postgres    false    235            S           2606    19198    role role_pkey 
   CONSTRAINT     O   ALTER TABLE ONLY core_data.role
    ADD CONSTRAINT role_pkey PRIMARY KEY (id);
 ;   ALTER TABLE ONLY core_data.role DROP CONSTRAINT role_pkey;
    	   core_data            postgres    false    235            U           2606    19213    shippers shippers_code_key 
   CONSTRAINT     X   ALTER TABLE ONLY core_data.shippers
    ADD CONSTRAINT shippers_code_key UNIQUE (code);
 G   ALTER TABLE ONLY core_data.shippers DROP CONSTRAINT shippers_code_key;
    	   core_data            postgres    false    236            W           2606    19215    shippers shippers_name_key 
   CONSTRAINT     X   ALTER TABLE ONLY core_data.shippers
    ADD CONSTRAINT shippers_name_key UNIQUE (name);
 G   ALTER TABLE ONLY core_data.shippers DROP CONSTRAINT shippers_name_key;
    	   core_data            postgres    false    236            Y           2606    19211    shippers shippers_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY core_data.shippers
    ADD CONSTRAINT shippers_pkey PRIMARY KEY (id);
 C   ALTER TABLE ONLY core_data.shippers DROP CONSTRAINT shippers_pkey;
    	   core_data            postgres    false    236            [           2606    19224    suppliers suppliers_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY core_data.suppliers
    ADD CONSTRAINT suppliers_pkey PRIMARY KEY (id);
 E   ALTER TABLE ONLY core_data.suppliers DROP CONSTRAINT suppliers_pkey;
    	   core_data            postgres    false    237            o           2606    19298    user_role user_role_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY core_data.user_role
    ADD CONSTRAINT user_role_pkey PRIMARY KEY (id);
 E   ALTER TABLE ONLY core_data.user_role DROP CONSTRAINT user_role_pkey;
    	   core_data            postgres    false    241            ]           2606    19236    users users_code_key 
   CONSTRAINT     R   ALTER TABLE ONLY core_data.users
    ADD CONSTRAINT users_code_key UNIQUE (code);
 A   ALTER TABLE ONLY core_data.users DROP CONSTRAINT users_code_key;
    	   core_data            postgres    false    238            _           2606    19238    users users_email_key 
   CONSTRAINT     T   ALTER TABLE ONLY core_data.users
    ADD CONSTRAINT users_email_key UNIQUE (email);
 B   ALTER TABLE ONLY core_data.users DROP CONSTRAINT users_email_key;
    	   core_data            postgres    false    238            a           2606    19242    users users_password_key 
   CONSTRAINT     Z   ALTER TABLE ONLY core_data.users
    ADD CONSTRAINT users_password_key UNIQUE (password);
 E   ALTER TABLE ONLY core_data.users DROP CONSTRAINT users_password_key;
    	   core_data            postgres    false    238            c           2606    19244    users users_phone_key 
   CONSTRAINT     T   ALTER TABLE ONLY core_data.users
    ADD CONSTRAINT users_phone_key UNIQUE (phone);
 B   ALTER TABLE ONLY core_data.users DROP CONSTRAINT users_phone_key;
    	   core_data            postgres    false    238            e           2606    19234    users users_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY core_data.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
 =   ALTER TABLE ONLY core_data.users DROP CONSTRAINT users_pkey;
    	   core_data            postgres    false    238            g           2606    19240    users users_username_key 
   CONSTRAINT     Z   ALTER TABLE ONLY core_data.users
    ADD CONSTRAINT users_username_key UNIQUE (username);
 E   ALTER TABLE ONLY core_data.users DROP CONSTRAINT users_username_key;
    	   core_data            postgres    false    238                       2606    18680    category category_code_key 
   CONSTRAINT     U   ALTER TABLE ONLY public.category
    ADD CONSTRAINT category_code_key UNIQUE (code);
 D   ALTER TABLE ONLY public.category DROP CONSTRAINT category_code_key;
       public            postgres    false    223                       2606    18682    category category_name_key 
   CONSTRAINT     U   ALTER TABLE ONLY public.category
    ADD CONSTRAINT category_name_key UNIQUE (name);
 D   ALTER TABLE ONLY public.category DROP CONSTRAINT category_name_key;
       public            postgres    false    223            !           2606    18678    category category_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.category
    ADD CONSTRAINT category_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.category DROP CONSTRAINT category_pkey;
       public            postgres    false    223            %           2606    18700     order_details order_details_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.order_details
    ADD CONSTRAINT order_details_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.order_details DROP CONSTRAINT order_details_pkey;
       public            postgres    false    225            #           2606    18691    orders orders_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.orders DROP CONSTRAINT orders_pkey;
       public            postgres    false    224            '           2606    18709    payment payment_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.payment
    ADD CONSTRAINT payment_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.payment DROP CONSTRAINT payment_pkey;
       public            postgres    false    226            )           2606    18720    products products_name_key 
   CONSTRAINT     U   ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_name_key UNIQUE (name);
 D   ALTER TABLE ONLY public.products DROP CONSTRAINT products_name_key;
       public            postgres    false    227            +           2606    18718    products products_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.products DROP CONSTRAINT products_pkey;
       public            postgres    false    227            -           2606    18731    role role_code_key 
   CONSTRAINT     M   ALTER TABLE ONLY public.role
    ADD CONSTRAINT role_code_key UNIQUE (code);
 <   ALTER TABLE ONLY public.role DROP CONSTRAINT role_code_key;
       public            postgres    false    228            /           2606    18733    role role_name_key 
   CONSTRAINT     M   ALTER TABLE ONLY public.role
    ADD CONSTRAINT role_name_key UNIQUE (name);
 <   ALTER TABLE ONLY public.role DROP CONSTRAINT role_name_key;
       public            postgres    false    228            1           2606    18729    role role_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.role
    ADD CONSTRAINT role_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.role DROP CONSTRAINT role_pkey;
       public            postgres    false    228            3           2606    18744    shippers shippers_code_key 
   CONSTRAINT     U   ALTER TABLE ONLY public.shippers
    ADD CONSTRAINT shippers_code_key UNIQUE (code);
 D   ALTER TABLE ONLY public.shippers DROP CONSTRAINT shippers_code_key;
       public            postgres    false    229            5           2606    18746    shippers shippers_name_key 
   CONSTRAINT     U   ALTER TABLE ONLY public.shippers
    ADD CONSTRAINT shippers_name_key UNIQUE (name);
 D   ALTER TABLE ONLY public.shippers DROP CONSTRAINT shippers_name_key;
       public            postgres    false    229            7           2606    18742    shippers shippers_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.shippers
    ADD CONSTRAINT shippers_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.shippers DROP CONSTRAINT shippers_pkey;
       public            postgres    false    229            9           2606    18755    suppliers suppliers_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.suppliers
    ADD CONSTRAINT suppliers_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.suppliers DROP CONSTRAINT suppliers_pkey;
       public            postgres    false    230            E           2606    18781    user_role user_role_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.user_role
    ADD CONSTRAINT user_role_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.user_role DROP CONSTRAINT user_role_pkey;
       public            postgres    false    232            ;           2606    18766    users users_code_key 
   CONSTRAINT     O   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_code_key UNIQUE (code);
 >   ALTER TABLE ONLY public.users DROP CONSTRAINT users_code_key;
       public            postgres    false    231            =           2606    18770    users users_email_key 
   CONSTRAINT     Q   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_email_key UNIQUE (email);
 ?   ALTER TABLE ONLY public.users DROP CONSTRAINT users_email_key;
       public            postgres    false    231            ?           2606    18772    users users_password_key 
   CONSTRAINT     W   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_password_key UNIQUE (password);
 B   ALTER TABLE ONLY public.users DROP CONSTRAINT users_password_key;
       public            postgres    false    231            A           2606    18768    users users_phone_key 
   CONSTRAINT     Q   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_phone_key UNIQUE (phone);
 ?   ALTER TABLE ONLY public.users DROP CONSTRAINT users_phone_key;
       public            postgres    false    231            C           2606    18764    users users_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    231            �           2606    19318 )   order_details order_details_order_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY core_data.order_details
    ADD CONSTRAINT order_details_order_id_fkey FOREIGN KEY (order_id) REFERENCES public.orders(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 V   ALTER TABLE ONLY core_data.order_details DROP CONSTRAINT order_details_order_id_fkey;
    	   core_data          postgres    false    2851    242    224            �           2606    19323 +   order_details order_details_product_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY core_data.order_details
    ADD CONSTRAINT order_details_product_id_fkey FOREIGN KEY (product_id) REFERENCES public.products(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 X   ALTER TABLE ONLY core_data.order_details DROP CONSTRAINT order_details_product_id_fkey;
    	   core_data          postgres    false    242    227    2859            {           2606    19254    orders orders_payment_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY core_data.orders
    ADD CONSTRAINT orders_payment_id_fkey FOREIGN KEY (payment_id) REFERENCES public.payment(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 J   ALTER TABLE ONLY core_data.orders DROP CONSTRAINT orders_payment_id_fkey;
    	   core_data          postgres    false    239    2855    226            |           2606    19259    orders orders_shipper_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY core_data.orders
    ADD CONSTRAINT orders_shipper_id_fkey FOREIGN KEY (shipper_id) REFERENCES public.shippers(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 J   ALTER TABLE ONLY core_data.orders DROP CONSTRAINT orders_shipper_id_fkey;
    	   core_data          postgres    false    2871    229    239            }           2606    19264    orders orders_user_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY core_data.orders
    ADD CONSTRAINT orders_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 G   ALTER TABLE ONLY core_data.orders DROP CONSTRAINT orders_user_id_fkey;
    	   core_data          postgres    false    239    2883    231            ~           2606    19280 "   products products_category_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY core_data.products
    ADD CONSTRAINT products_category_id_fkey FOREIGN KEY (category_id) REFERENCES public.category(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 O   ALTER TABLE ONLY core_data.products DROP CONSTRAINT products_category_id_fkey;
    	   core_data          postgres    false    2849    240    223                       2606    19285 "   products products_supplier_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY core_data.products
    ADD CONSTRAINT products_supplier_id_fkey FOREIGN KEY (supplier_id) REFERENCES public.suppliers(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 O   ALTER TABLE ONLY core_data.products DROP CONSTRAINT products_supplier_id_fkey;
    	   core_data          postgres    false    2873    230    240            �           2606    19299     user_role user_role_role_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY core_data.user_role
    ADD CONSTRAINT user_role_role_id_fkey FOREIGN KEY (role_id) REFERENCES public.role(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 M   ALTER TABLE ONLY core_data.user_role DROP CONSTRAINT user_role_role_id_fkey;
    	   core_data          postgres    false    2865    241    228            �           2606    19304     user_role user_role_user_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY core_data.user_role
    ADD CONSTRAINT user_role_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 M   ALTER TABLE ONLY core_data.user_role DROP CONSTRAINT user_role_user_id_fkey;
    	   core_data          postgres    false    241    231    2883            u           2606    18787 )   order_details order_details_order_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.order_details
    ADD CONSTRAINT order_details_order_id_fkey FOREIGN KEY (order_id) REFERENCES public.orders(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 S   ALTER TABLE ONLY public.order_details DROP CONSTRAINT order_details_order_id_fkey;
       public          postgres    false    224    2851    225            v           2606    18797 +   order_details order_details_product_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.order_details
    ADD CONSTRAINT order_details_product_id_fkey FOREIGN KEY (product_id) REFERENCES public.products(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 U   ALTER TABLE ONLY public.order_details DROP CONSTRAINT order_details_product_id_fkey;
       public          postgres    false    225    227    2859            r           2606    18792    orders orders_payment_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_payment_id_fkey FOREIGN KEY (payment_id) REFERENCES public.payment(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 G   ALTER TABLE ONLY public.orders DROP CONSTRAINT orders_payment_id_fkey;
       public          postgres    false    2855    226    224            s           2606    18807    orders orders_shipper_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_shipper_id_fkey FOREIGN KEY (shipper_id) REFERENCES public.shippers(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 G   ALTER TABLE ONLY public.orders DROP CONSTRAINT orders_shipper_id_fkey;
       public          postgres    false    2871    224    229            t           2606    18817    orders orders_user_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 D   ALTER TABLE ONLY public.orders DROP CONSTRAINT orders_user_id_fkey;
       public          postgres    false    224    231    2883            w           2606    18782 "   products products_category_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_category_id_fkey FOREIGN KEY (category_id) REFERENCES public.category(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 L   ALTER TABLE ONLY public.products DROP CONSTRAINT products_category_id_fkey;
       public          postgres    false    223    227    2849            x           2606    18812 "   products products_supplier_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_supplier_id_fkey FOREIGN KEY (supplier_id) REFERENCES public.suppliers(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 L   ALTER TABLE ONLY public.products DROP CONSTRAINT products_supplier_id_fkey;
       public          postgres    false    2873    227    230            y           2606    18802     user_role user_role_role_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.user_role
    ADD CONSTRAINT user_role_role_id_fkey FOREIGN KEY (role_id) REFERENCES public.role(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 J   ALTER TABLE ONLY public.user_role DROP CONSTRAINT user_role_role_id_fkey;
       public          postgres    false    228    232    2865            z           2606    18822     user_role user_role_user_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.user_role
    ADD CONSTRAINT user_role_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(id) ON UPDATE RESTRICT ON DELETE RESTRICT;
 J   ALTER TABLE ONLY public.user_role DROP CONSTRAINT user_role_user_id_fkey;
       public          postgres    false    2883    232    231                   x������ � �      )      x������ � �      &      x������ � �      !   3   x�3��,N�4����".#N����"�Ģ$qcN���$�=... ϼ�      '      x������ � �      "      x������ � �      #      x������ � �      $   d  x����n�@�ד��/@��ˊ�q:��cO� ��J,���;�H���좪�ʂ�-�q���7�:Pj;-X���D��=�::1�S���*>���B����m���0U���}>!,Y�P񧀌�����5��Sj$�O�̓��ɑ�=��d2�M��뽗!~�OtT'\p�=i�ֺ��4�h��͑�W1��K��BJ����"<�����j�\�����,���m��5V����ll���� �|��Nvײ��<`��j�B�Ȱ��u��A�,3-���J����a�dN������,{�0$��Ů�\�oH�y�s%Ig��q�~[�Y�¸�K*h�+`ɫ�#���t���p:Y-T��X-��b�Y1��(5J�i���X�A�*�b*>s��m��km�H_���h��í��fa��%[��o�x��s4�.Q^��n{�ll"v�_ڼ�e5�
��*��PTZ����ɸ�~H��=�(��4\i�<�xa������Yw���Ҭ.�����ZYa�F�7��!��������d0R�9j^_���Y[EK|dy�c�_W9��)����p�B=G!-��NK[��.����;�y��/�����*��O]o�O      (      x������ � �      %      x������ � �            x������ � �            x������ � �            x������ � �         1   x�3��,N�4��#.#N����"�Ģ49cN���4�=... �w�            x������ � �            x������ � �            x������ � �         d  x����n�@�ד��/@��ˊ�q2��cO� ��J-�B)Rw!�X�R���RXT*V���Q�cބ�D@���`�����;�����L�D�0U|.Sѥ�1m�2�{a���1�}>!,Y�P񧀌�����5��Sj$�O_̃����=��d:�M���W!~��&:�.�ܞ�k]ӌ�4����۫��`L!%�{�A�K���a�H����,���m��V���[�lb���� �|��Nwײ��<`��j�B��h ��u���A�-3-���I����a�dN������,{�0$��Ů�\�oH�y�s%Ig��q�~W�Y�¸�K*h�+`���#���t���p:Y-T|�v��n1ͬ�Fa�%�4oe" Qn1��0�6�~�F@[02m�5�w�p+��Y�fɖh�2��M��+Ԃ��#�۞�������6�jYM� �JzC5��z~�5G2��:*��9J& W>�G*^��7�<��{���'�4�� t�VV��:��rr}cl�.�3�U|�����%~�Vђ[�����U��L���p�B=G!-��NK[��.����{�y��/���O�*��O�a�/            x������ � �         t   x�3��+I/(�,�I,Qp�L,��K/�L��t)��KW,M�����
~���a��%y@�������������������\NC#c�?Ȑ3h_^	�����c���+F��� �1�     