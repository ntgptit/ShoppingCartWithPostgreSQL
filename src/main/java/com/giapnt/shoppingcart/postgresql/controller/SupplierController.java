package com.giapnt.shoppingcart.postgresql.controller;

import com.giapnt.shoppingcart.postgresql.model.Suppliers;
import com.giapnt.shoppingcart.postgresql.services.SupplierServices;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/rest")
public class SupplierController {
    /**
     * Supplier Service.
     */
    @Autowired
    private SupplierServices supplierServices;

    @GetMapping(value = "/list-all-suppliers-with/page-no={pageNo}&page-size={pageSize}")
    public ResponseEntity<Object> getAllListSuppliers(@PathVariable(value = "pageNo") @Valid int pageNo,
                                                      @PathVariable(value = "pageSize") @Valid int pageSize) {

        List<Suppliers> suppliers = new ArrayList<>();
        PageHelper.startPage(pageNo, pageSize);
        suppliers = supplierServices.getAllListSuppliers();

        if (suppliers == null || suppliers.isEmpty()) {

            return new ResponseEntity<Object>(suppliers, HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Object>(new PageInfo<Suppliers>(suppliers), HttpStatus.OK);
    }
}
