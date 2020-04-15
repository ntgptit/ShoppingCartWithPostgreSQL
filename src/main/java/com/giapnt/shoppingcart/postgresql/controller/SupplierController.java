package com.giapnt.shoppingcart.postgresql.controller;

import com.giapnt.shoppingcart.postgresql.model.Suppliers;
import com.giapnt.shoppingcart.postgresql.services.SupplierServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
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

    @GetMapping(value = "/list-all-suppliers")
    public ResponseEntity<Object> getAllListSuppliers() {

        List<Suppliers> suppliers = new ArrayList<Suppliers>();

        try {
            suppliers = supplierServices.getAllListSuppliers();

            if (suppliers != null || !suppliers.isEmpty()) {

                return new ResponseEntity<Object>(suppliers, HttpStatus.OK);
            }

        } catch (Exception e) {
            suppliers = Collections.emptyList();
        }

        return new ResponseEntity<Object>(suppliers, HttpStatus.NOT_FOUND);
    }
}
