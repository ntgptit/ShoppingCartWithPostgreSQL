package com.giapnt.shoppingcart.postgresql.mapper;

import java.util.List;

import com.giapnt.shoppingcart.postgresql.model.Supplier;
import com.giapnt.shoppingcart.postgresql.model.SupplierDynamic;

public interface SupplierMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table core_data.suppliers
	 *
	 * @param id the id
	 * @return the int
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table core_data.suppliers
	 *
	 * @param record the record
	 * @return the int
	 * @mbg.generated
	 */
	int insert(Supplier record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table core_data.suppliers
	 *
	 * @param id the id
	 * @return the supplier
	 * @mbg.generated
	 */
	Supplier selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table core_data.suppliers
	 *
	 * @return the list
	 * @mbg.generated
	 */
	List<Supplier> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table core_data.suppliers
	 *
	 * @param record the record
	 * @return the int
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Supplier record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table core_data.suppliers
	 *
	 * @param isActive the is active
	 * @return the list
	 * @mbg.generated
	 */
	List<Supplier> selectListIsActive(int isActive);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table core_data.suppliers
	 *
	 * @param record the record
	 * @return the int
	 * @mbg.generated
	 */
	int updateCurrentStatusByPrimaryKey(Supplier record);

	/**
	 * Find supplier dynamic.
	 *
	 * @param supplier the supplier
	 * @return the list
	 */
	List<Supplier> findSupplierDynamic(SupplierDynamic supplierDynamic);
}