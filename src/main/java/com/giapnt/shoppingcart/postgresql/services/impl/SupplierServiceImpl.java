package com.giapnt.shoppingcart.postgresql.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giapnt.shoppingcart.postgresql.mapper.SupplierMapper;
import com.giapnt.shoppingcart.postgresql.model.Supplier;
import com.giapnt.shoppingcart.postgresql.model.SupplierDynamic;
import com.giapnt.shoppingcart.postgresql.services.SupplierService;
import com.giapnt.shoppingcart.postgresql.ulltis.constant.AppServiceContants;

/**
 * The Class SupplierServiceImpl.
 *
 * @author GiapNT
 */
@Service("SupplierService")
public class SupplierServiceImpl implements SupplierService {

    /**
     * The supplier mapper.
     */
    @Autowired
    SupplierMapper supplierMapper;

    /**
     * Gets the all list suppliers.
     *
     * @return the all list suppliers
     */
    @Override
    public List<Supplier> getAllListSuppliers() {
        return supplierMapper.selectAll();
    }

    /**
     * Gets the list suppliers active.
     *
     * @return the list suppliers active
     */
    @Override
    public List<Supplier> getListSuppliersActive() {
        return supplierMapper.selectListIsActive(AppServiceContants.ACTIVE);
    }

    /**
     * Gets the list suppliers deactivate.
     *
     * @return the list suppliers deactivate
     */
    @Override
    public List<Supplier> getListSuppliersDeactivate() {
        return supplierMapper.selectListIsActive(AppServiceContants.INACTIVE);
    }

    /**
     * Gets the suppliers by id.
     *
     * @param id the id
     * @return the suppliers by id
     */
    @Override
    public Supplier getSuppliersById(String id) {
        return supplierMapper.selectByPrimaryKey(id);
    }

    /**
     * Update current status by primary key.
     *
     * @param supplier the supplier
     * @param action   the action
     * @return the integer
     */
    @Override
    public Integer updateCurrentStatusByPrimaryKey(Supplier supplier, int action) {
        return supplierMapper.updateCurrentStatusByPrimaryKey(supplier);
    }

    /**
     * Modify suppliers by primary key.
     *
     * @param supplier the supplier
     * @return the integer
     */
    @Override
    public Integer modifySuppliersByPrimaryKey(Supplier supplier) {
        return supplierMapper.updateByPrimaryKey(supplier);
    }

    /**
     * Adds the new suppliers.
     *
     * @param supplier the supplier
     * @return the integer
     */
    @Override
    public Integer addNewSuppliers(Supplier supplier) {
        return supplierMapper.insert(supplier);
    }

    /**
     * Removes the suppliers.
     *
     * @param id the id
     * @return the integer
     */
    @Override
    public Integer removeSuppliers(String id) {
        return supplierMapper.deleteByPrimaryKey(id);
    }

	/**
	 * Find supplier dynamic.
	 *
	 * @param supplier the supplier
	 * @return the list
	 */
	@Override
	public List<Supplier> findSupplierDynamic(SupplierDynamic supplierDynamic) {
		return supplierMapper.findSupplierDynamic(supplierDynamic);
	}
}
