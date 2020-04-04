package com.giapnt.shoppingcart.postgresql.services.impl;

import com.giapnt.shoppingcart.postgresql.mapper.SuppliersMapper;
import com.giapnt.shoppingcart.postgresql.model.Suppliers;
import com.giapnt.shoppingcart.postgresql.services.SupplierServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service("SupplierServices")
@Transactional
public class SupplierServicesImpl implements SupplierServices {

    private static final Logger logger = LoggerFactory.getLogger(SupplierServices.class);

    @Autowired
    SuppliersMapper suppliersMapper;

    @Override
    public List<Suppliers> getAllListSuppliers() {

        List<Suppliers> suppliers = null;

        try {
            suppliers = suppliersMapper.selectAll();

            return suppliers;

        } catch (Exception e) {
            logger.error(e.getMessage());

        }
        return null;
    }

    @Override
    public List<Suppliers> getListSuppliersActive() {
        return null;
    }

    @Override
    public List<Suppliers> getListSuppliersDeactivate() {
        return null;
    }

    @Override
    public Suppliers getSuppliersById(long id) {
        return null;
    }

    @Override
    public Map<Integer, Object> modifySuppliersByPrimaryKey(Suppliers suppliers) {
        return null;
    }

    @Override
    public Map<Integer, Object> addNewSuppliers(Suppliers suppliers) {
        return null;
    }

    @Override
    public Map<Integer, Object> removeSuppliers(Suppliers suppliers) {
        return null;
    }
}
