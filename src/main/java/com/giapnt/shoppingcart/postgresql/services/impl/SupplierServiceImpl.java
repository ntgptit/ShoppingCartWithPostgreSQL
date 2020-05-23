package com.giapnt.shoppingcart.postgresql.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giapnt.shoppingcart.postgresql.constant.AppServiceContants;
import com.giapnt.shoppingcart.postgresql.mapper.SupplierMapper;
import com.giapnt.shoppingcart.postgresql.model.Supplier;
import com.giapnt.shoppingcart.postgresql.services.SupplierService;

import lombok.Data;

@Data
@Service("SupplierServices")
@Transactional
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	SupplierMapper supplierMapper;

	@Override
	public List<Supplier> getAllListSuppliers() {
		return supplierMapper.selectAll();
	}

	@Override
	public List<Supplier> getListSuppliersActive() {
		return supplierMapper.selectListIsActive(AppServiceContants.ACTIVE);
	}

	@Override
	public List<Supplier> getListSuppliersDeactivate() {
		return supplierMapper.selectListIsActive(AppServiceContants.INACTIVE);
	}

	@Override
	public Supplier getSuppliersById(String id) {
		return supplierMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateCurrentStatusByPrimaryKey(Supplier supplier, int action) {
		return supplierMapper.updateCurrentStatusByPrimaryKey(supplier);
	}

	@Override
	public Integer modifySuppliersByPrimaryKey(Supplier supplier) {
		return supplierMapper.updateByPrimaryKey(supplier);
	}

	@Override
	public Integer addNewSuppliers(Supplier supplier) {
		return supplierMapper.insert(supplier);
	}

	@Override
	public Integer removeSuppliers(String id) {
		return supplierMapper.deleteByPrimaryKey(id);
	}
}
