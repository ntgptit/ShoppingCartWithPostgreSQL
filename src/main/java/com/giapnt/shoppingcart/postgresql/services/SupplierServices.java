package com.giapnt.shoppingcart.postgresql.services;

import com.giapnt.shoppingcart.postgresql.model.Category;
import com.giapnt.shoppingcart.postgresql.model.Suppliers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

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
