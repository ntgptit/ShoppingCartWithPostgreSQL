package com.giapnt.shoppingcart.postgresql.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giapnt.shoppingcart.postgresql.controller.dto.response.SupplierResponseDTO;
import com.giapnt.shoppingcart.postgresql.exception.ShoppingCartNotFoundException;
import com.giapnt.shoppingcart.postgresql.model.Supplier;
import com.giapnt.shoppingcart.postgresql.model.SupplierDynamic;
import com.giapnt.shoppingcart.postgresql.services.SupplierService;
import com.giapnt.shoppingcart.postgresql.ulltis.constant.AppServiceContants;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * The Class SupplierController.
 *
 * @author GiapNT
 */
@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/rest")
public class SupplierController extends PageHelper {
    /**
     * Supplier service
     */
    @Autowired
    private SupplierService supplierService;

    /**
     * Gets the all list suppliers.
     *
     * @param pageNo   the page no
     * @param pageSize the page size
     * @return the all list suppliers
     */
    @GetMapping(value = "/list-all-suppliers-with/page-no={pageNo}&page-size={pageSize}")
    public SupplierResponseDTO getAllListSuppliers(@PathVariable(value = "pageNo") @Valid Integer pageNo,
                                                   @PathVariable(value = "pageSize") @Valid Integer pageSize) {
        // Initialize initial value
        SupplierResponseDTO supplierResponseDTO = new SupplierResponseDTO();
        // Pagging list of supplier
        startPage(pageNo, pageSize);
        List<Supplier> suppliers = supplierService.getAllListSuppliers();
        PageInfo<Supplier> pageInfo = new PageInfo<>(suppliers);
        // Check null or blank list of supplier
        if (null == suppliers || suppliers.isEmpty()) {
            throw new ShoppingCartNotFoundException();
        }
        // Set status response
        supplierResponseDTO.setStatus(AppServiceContants.SUCCESS);
        // Set list suppliers after pagging
        supplierResponseDTO.setPageInfo(pageInfo);
        // return result
        return supplierResponseDTO;
    }

    /**
     * Gets the suppliers by id.
     *
     * @param id the id
     * @return the suppliers by id
     */
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

    /**
     * Find supplier dynamic.
     *
     * @param pageNo   the page no
     * @param pageSize the page size
     * @return the supplier response DTO
     */
    @GetMapping(value = "/find-supplier-dynamic-with/page-no={pageNo}&page-size={pageSize}")
    public SupplierResponseDTO findSupplierDynamic(@PathVariable(value = "pageNo") @Valid Integer pageNo,
                                                   @PathVariable(value = "pageSize") @Valid Integer pageSize, @RequestBody SupplierDynamic supplierDynamic) {
        // Initialize initial value
        SupplierResponseDTO supplierResponseDTO = new SupplierResponseDTO();
        // Pagging list of supplier
        startPage(pageNo, pageSize);
        List<Supplier> suppliers = supplierService.findSupplierDynamic(supplierDynamic);
        PageInfo<Supplier> pageInfo = new PageInfo<>(suppliers);
        // Check null or blank list of supplier
        if (null == suppliers || suppliers.isEmpty()) {
            throw new ShoppingCartNotFoundException();
        }
        // Set status response
        supplierResponseDTO.setStatus(AppServiceContants.SUCCESS);
        // Set list suppliers after pagging
        supplierResponseDTO.setPageInfo(pageInfo);
        // return result
        return supplierResponseDTO;
    }
}
