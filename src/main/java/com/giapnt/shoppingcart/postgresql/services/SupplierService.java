package com.giapnt.shoppingcart.postgresql.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giapnt.shoppingcart.postgresql.model.Supplier;

@Service
@Transactional
public interface SupplierService {

    /**
     * @return
     */
    List<Supplier> getAllListSuppliers();

    /**
     * @return
     */
    List<Supplier> getListSuppliersActive();

    /**
     * @return
     */
    List<Supplier> getListSuppliersDeactivate();

    /**
     * @param id
     * @return
     */
    Supplier getSuppliersById(String id);

    /**
     * @param supplier
     * @return
     */
    Integer modifySuppliersByPrimaryKey(Supplier supplier);

    /**
     * @param supplier
     * @param action
     * @return
     */
    Integer updateCurrentStatusByPrimaryKey(Supplier supplier, int action);

    /**
     * @param supplier
     * @return
     */
    Integer addNewSuppliers(Supplier supplier);

    /**
     * @param id
     * @return
     */
    Integer removeSuppliers(String id);

}
