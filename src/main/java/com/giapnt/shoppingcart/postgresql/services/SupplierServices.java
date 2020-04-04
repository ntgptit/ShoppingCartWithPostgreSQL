package com.giapnt.shoppingcart.postgresql.services;

import com.giapnt.shoppingcart.postgresql.model.Suppliers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public interface SupplierServices {

    List<Suppliers> getAllListSuppliers();

    List<Suppliers> getListSuppliersActive();

    List<Suppliers> getListSuppliersDeactivate();

    Suppliers getSuppliersById(long id);

    Map<Integer, Object> modifySuppliersByPrimaryKey(Suppliers suppliers);

    Map<Integer, Object> addNewSuppliers(Suppliers suppliers);

    Map<Integer, Object> removeSuppliers(Suppliers suppliers);
}
