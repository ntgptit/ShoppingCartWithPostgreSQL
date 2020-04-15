package com.giapnt.shoppingcart.postgresql.controller;

import com.giapnt.shoppingcart.postgresql.model.Payment;
import com.giapnt.shoppingcart.postgresql.services.PaymentServices;
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
public class PaymentController {
    /**
     * Payment Service.
     */
    @Autowired
    private PaymentServices paymentServices;

    @GetMapping(value = "/list-all-payments")
    public ResponseEntity<Object> getAllListPayments() {

        List<Payment> payments = new ArrayList<>();

        try {
            payments = paymentServices.getAllListPayments();

            if (payments != null && !payments.isEmpty()) {

                return new ResponseEntity<Object>(payments, HttpStatus.OK);
            }

        } catch (Exception e) {
            payments = Collections.emptyList();
        }

        return new ResponseEntity<Object>(payments, HttpStatus.NOT_FOUND);
    }

}
