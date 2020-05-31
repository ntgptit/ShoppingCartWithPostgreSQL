package com.giapnt.shoppingcart.postgresql.services;

import com.giapnt.shoppingcart.postgresql.model.Supplier;
import com.giapnt.shoppingcart.postgresql.model.SupplierDynamic;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The Interface SupplierService.
 *
 * @author GiapNT
 */
@Service
@Transactional
public interface SupplierService {

	/**
	 * Gets the all list suppliers.
	 *
	 * @return the all list suppliers
	 */
	List<Supplier> getAllListSuppliers();

	/**
	 * Gets the list suppliers active.
	 *
	 * @return the list suppliers active
	 */
	List<Supplier> getListSuppliersActive();

	/**
	 * Gets the list suppliers deactivate.
	 *
	 * @return the list suppliers deactivate
	 */
	List<Supplier> getListSuppliersDeactivate();

	/**
	 * Gets the suppliers by id.
	 *
	 * @param id the id
	 * @return the suppliers by id
	 */
	Supplier getSuppliersById(String id);

	/**
	 * Modify suppliers by primary key.
	 *
	 * @param supplier the supplier
	 * @return the integer
	 */
	Integer modifySuppliersByPrimaryKey(Supplier supplier);

	/**
	 * Update current status by primary key.
	 *
	 * @param supplier the supplier
	 * @param action   the action
	 * @return the integer
	 */
	Integer updateCurrentStatusByPrimaryKey(Supplier supplier, int action);

	/**
	 * Adds the new suppliers.
	 *
	 * @param supplier the supplier
	 * @return the integer
	 */
	Integer addNewSuppliers(Supplier supplier);

	/**
	 * Removes the suppliers.
	 *
	 * @param id the id
	 * @return the integer
	 */
	Integer removeSuppliers(String id);

	/**
	 * Find supplier dynamic.
	 *
	 * @param supplier the supplier
	 * @return the list
	 */
	List<Supplier> findSupplierDynamic(SupplierDynamic supplierDynamic);
}
