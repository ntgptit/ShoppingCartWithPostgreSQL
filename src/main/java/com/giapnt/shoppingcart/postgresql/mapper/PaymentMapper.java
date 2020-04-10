package com.giapnt.shoppingcart.postgresql.mapper;

import com.giapnt.shoppingcart.postgresql.model.Payment;
import java.util.List;

public interface PaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated
     */
    int insert(Payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated
     */
    Payment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated
     */
    List<Payment> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Payment record);
}