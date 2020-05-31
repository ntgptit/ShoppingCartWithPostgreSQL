package com.giapnt.shoppingcart.postgresql.mapper;

import com.giapnt.shoppingcart.postgresql.model.UserRole;

import java.util.List;

public interface UserRoleMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.user_role
     *
     * @param id the id
     * @return the int
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.user_role
     *
     * @param record the record
     * @return the int
     * @mbg.generated
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.user_role
     *
     * @param id the id
     * @return the user role
     * @mbg.generated
     */
    UserRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.user_role
     *
     * @return the list
     * @mbg.generated
     */
    List<UserRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.user_role
     *
     * @param record the record
     * @return the int
     * @mbg.generated
     */
    int updateByPrimaryKey(UserRole record);
}