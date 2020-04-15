package com.giapnt.shoppingcart.postgresql.mapper;

import com.giapnt.shoppingcart.postgresql.model.Shippers;

import java.util.List;

public interface ShippersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.shippers
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.shippers
     *
     * @mbg.generated
     */
    int insert(Shippers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.shippers
     *
     * @mbg.generated
     */
    Shippers selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.shippers
     *
     * @mbg.generated
     */
    List<Shippers> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.shippers
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Shippers record);
}