package com.giapnt.shoppingcart.postgresql.model;

import lombok.Data;

import java.util.Date;

/**
 * The Class User.
 *
 * @author GiapNT
 */
@Data
public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.first_name
     *
     * @mbg.generated
     */
    private String firstName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.last_name
     *
     * @mbg.generated
     */
    private String lastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.country
     *
     * @mbg.generated
     */
    private String country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.credit_card
     *
     * @mbg.generated
     */
    private String creditCard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.credit_card_type_id
     *
     * @mbg.generated
     */
    private Integer creditCardTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.card_exp_mo
     *
     * @mbg.generated
     */
    private String cardExpMo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.card_exp_yr
     *
     * @mbg.generated
     */
    private String cardExpYr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.billing_address
     *
     * @mbg.generated
     */
    private String billingAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.billing_city
     *
     * @mbg.generated
     */
    private String billingCity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.billing_country
     *
     * @mbg.generated
     */
    private String billingCountry;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.ship_address
     *
     * @mbg.generated
     */
    private String shipAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.ship_city
     *
     * @mbg.generated
     */
    private String shipCity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.ship_country
     *
     * @mbg.generated
     */
    private String shipCountry;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.date_entered
     *
     * @mbg.generated
     */
    private Date dateEntered;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.is_active
     *
     * @mbg.generated
     */
    private Integer isActive;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.created_by
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.updated_by
     *
     * @mbg.generated
     */
    private String updatedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.created_timestamp
     *
     * @mbg.generated
     */
    private String createdTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.users.updated_timestamp
     *
     * @mbg.generated
     */
    private String updatedTimestamp;

}