package com.giapnt.shoppingcart.postgresql.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giapnt.shoppingcart.postgresql.constant.AppServiceContants;
import com.giapnt.shoppingcart.postgresql.controller.dto.response.SupplierResponseDTO;
import com.giapnt.shoppingcart.postgresql.exception.ShoppingCartNotFoundException;
import com.giapnt.shoppingcart.postgresql.model.Supplier;
import com.giapnt.shoppingcart.postgresql.services.SupplierService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/rest")
public class SupplierController {
	/**
	 * Supplier service
	 */
	@Autowired
	private SupplierService supplierService;

	@GetMapping(value = "/list-all-suppliers-with/page-no={pageNo}&page-size={pageSize}")
	public SupplierResponseDTO getAllListSuppliers(@PathVariable(value = "pageNo") @Valid Integer pageNo,
			@PathVariable(value = "pageSize") @Valid Integer pageSize) {
		// Initialize initial value
		SupplierResponseDTO supplierResponseDTO = new SupplierResponseDTO();
		List<Supplier> supplier = new ArrayList<>();
		// Pagging list of supplier
		PageHelper.startPage(pageNo, pageSize);
		supplier = supplierService.getAllListSuppliers();
		PageInfo<Supplier> pageInfo = new PageInfo<>(supplier);
		// Check null or blank list of supplier
		if (null == supplier || supplier.isEmpty()) {
			throw new ShoppingCartNotFoundException();
		}
		// Set status response
		supplierResponseDTO.setStatus(AppServiceContants.SUCCESS);
		// Set list suppliers after pagging
		supplierResponseDTO.setPageInfo(pageInfo);
		// return result
		return supplierResponseDTO;
	}

	@GetMapping(value = "/supplier-with-id/{id}")
	public SupplierResponseDTO getSuppliersById(@PathVariable(value = "id") @Valid String id) {
		// Initialize initial value
		SupplierResponseDTO supplierResponseDTO = new SupplierResponseDTO();
		Supplier supplier = supplierService.getSuppliersById(id);
		// Check null
		if (null == supplier) {
			throw new ShoppingCartNotFoundException();
		}
		// Set status response
		supplierResponseDTO.setStatus(AppServiceContants.SUCCESS);
		// Set supplier object response
		supplierResponseDTO.setSupplier(supplier);
		// return result
		return supplierResponseDTO;
	}
}
