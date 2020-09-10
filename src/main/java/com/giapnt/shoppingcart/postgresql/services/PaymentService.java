package com.giapnt.shoppingcart.postgresql.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giapnt.shoppingcart.postgresql.model.Payment;

/**
 * The Interface PaymentService.
 *
 * @author GiapNT
 */
@Service
@Transactional
public interface PaymentService {

    /**
     * Gets the all list payments.
     *
     * @return the all list payments
     */
    List<Payment> getAllListPayments();
}
