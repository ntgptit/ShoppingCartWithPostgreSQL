package com.giapnt.shoppingcart.postgresql.controller;

import com.giapnt.shoppingcart.postgresql.model.Payment;
import com.giapnt.shoppingcart.postgresql.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class PaymentController.
 *
 * @author GiapNT
 */
@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/rest")
public class PaymentController {

    /**
     * The payment service.
     */
    @Autowired
    private PaymentService paymentService;

    /**
     * Gets the all list payments.
     *
     * @return the all list payments
     */
    @GetMapping(value = "/list-all-payments")
    public ResponseEntity<Object> getAllListPayments() {

        List<Payment> payments = new ArrayList<>();
        payments = paymentService.getAllListPayments();
        return new ResponseEntity<Object>(payments, HttpStatus.OK);
    }

}
