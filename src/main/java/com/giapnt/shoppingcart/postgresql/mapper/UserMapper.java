package com.giapnt.shoppingcart.postgresql.mapper;

import com.giapnt.shoppingcart.postgresql.model.User;

import java.util.List;

public interface UserMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @param id the id
     * @return the int
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @param record the record
     * @return the int
     * @mbg.generated
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @param id the id
     * @return the user
     * @mbg.generated
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @return the list
     * @mbg.generated
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.users
     *
     * @param record the record
     * @return the int
     * @mbg.generated
     */
    int updateByPrimaryKey(User record);
}