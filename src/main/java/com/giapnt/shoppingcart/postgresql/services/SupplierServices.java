package com.giapnt.shoppingcart.postgresql.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface SupplierServices {

    List<Suppliers> findAllSupplier();

    Suppliers findBySupplierId();

    Map<Integer, Object> activeSupplier(Suppliers suppliers);

    Map<Integer, Object> deactiveSupplier(Suppliers suppliers);

    Map<Integer, Object> addNewSupplier(Suppliers suppliers);

    Map<Integer, Object> removeSupplier(Suppliers suppliers);

}
