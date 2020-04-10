package com.giapnt.shoppingcart.postgresql.mapper;

import com.giapnt.shoppingcart.postgresql.model.UserRole;
import java.util.List;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_role
     *
     * @mbg.generated
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_role
     *
     * @mbg.generated
     */
    UserRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_role
     *
     * @mbg.generated
     */
    List<UserRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserRole record);
}