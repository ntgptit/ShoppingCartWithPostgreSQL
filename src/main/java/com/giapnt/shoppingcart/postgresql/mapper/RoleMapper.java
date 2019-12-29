package com.giapnt.shoppingcart.postgresql.mapper;

import com.giapnt.shoppingcart.postgresql.model.Role;
import java.util.List;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.role
     *
     * @mbg.generated
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.role
     *
     * @mbg.generated
     */
    Role selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.role
     *
     * @mbg.generated
     */
    List<Role> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Role record);
}