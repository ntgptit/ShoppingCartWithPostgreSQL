package com.giapnt.shoppingcart.postgresql.mapper;

import com.giapnt.shoppingcart.postgresql.model.Product;

import java.util.List;

public interface ProductMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.products
     *
     * @param id the id
     * @return the int
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.products
     *
     * @param record the record
     * @return the int
     * @mbg.generated
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.products
     *
     * @param id the id
     * @return the product
     * @mbg.generated
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.products
     *
     * @return the list
     * @mbg.generated
     */
    List<Product> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.products
     *
     * @param record the record
     * @return the int
     * @mbg.generated
     */
    int updateByPrimaryKey(Product record);
}