package com.giapnt.shoppingcart.postgresql.services.impl;

import com.giapnt.shoppingcart.postgresql.constant.ContantsForBussines;
import com.giapnt.shoppingcart.postgresql.mapper.SuppliersMapper;
import com.giapnt.shoppingcart.postgresql.model.Suppliers;
import com.giapnt.shoppingcart.postgresql.services.SupplierServices;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Service("SupplierServices")
@Transactional
public class SupplierServicesImpl implements SupplierServices {

    private static final Logger logger = LoggerFactory.getLogger(SupplierServices.class);

    @Autowired
    SuppliersMapper suppliersMapper;

    @Override
    public List<Suppliers> getAllListSuppliers() {
        return suppliersMapper.selectAll();
    }

    @Override
    public List<Suppliers> getListSuppliersActive() {
        return suppliersMapper.selectListIsActive(ContantsForBussines.ACTIVE);
    }

    @Override
    public List<Suppliers> getListSuppliersDeactivate() {
        return suppliersMapper.selectListIsActive(ContantsForBussines.INACTIVE);
    }

    @Override
    public Suppliers getSuppliersById(long id) {
        return suppliersMapper.selectByPrimaryKey(id);
    }

    @Override
    public Map<Integer, Object> updateCurrentStatusByPrimaryKey(Suppliers suppliers, int action) {

        try {
            List<Suppliers> suppliersList;

            Map<Integer, Object> objectMap = null;

            if (action == ContantsForBussines.ACTIVE) {
                suppliers.setIsActive(ContantsForBussines.ACTIVE);
            } else {
                suppliers.setIsActive(ContantsForBussines.INACTIVE);
            }
            suppliers.setUpdatedBy(ContantsForBussines.CURRENT_USER_LOGIN);
            suppliers.setUpdatedTimestamp(ContantsForBussines.CURRENT_TIMESTAMP);

            int result = suppliersMapper.updateCurrentStatusByPrimaryKey(suppliers);

            if (action == ContantsForBussines.ACTIVE) {
                suppliersList = suppliersMapper.selectListIsActive(ContantsForBussines.ACTIVE);
            } else {
                suppliersList = suppliersMapper.selectListIsActive(ContantsForBussines.INACTIVE);
            }

            objectMap.put(result, suppliersList);

            return objectMap;

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }

    @Override
    public Map<Integer, Object> modifySuppliersByPrimaryKey(Suppliers suppliers) {
        Map<Integer, List<Suppliers>> listMapSuppliers = new HashMap<>();

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
