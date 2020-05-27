package com.giapnt.shoppingcart.postgresql.services;

import com.giapnt.shoppingcart.postgresql.model.Payment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The Interface PaymentService.
 *
 * @author GiapNT
 */
@Service
@Transactional
public interface PaymentService {
    List<Payment> getAllListPayments();
}
