package com.giapnt.shoppingcart.postgresql.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giapnt.shoppingcart.postgresql.mapper.PaymentMapper;
import com.giapnt.shoppingcart.postgresql.model.Payment;
import com.giapnt.shoppingcart.postgresql.services.PaymentService;

import lombok.Data;

/**
 * The Class PaymentServiceImpl.
 *
 * @author GiapNT
 */
@Data
@Transactional
@Service("PaymentService")
public class PaymentServiceImpl implements PaymentService {

    /**
     * The payment mapper.
     */
    @Autowired
    PaymentMapper paymentMapper;

    /**
     * Gets the all list payments.
     *
     * @return the all list payments
     */
    @Override
    public List<Payment> getAllListPayments() {
        return paymentMapper.selectAll();
    }
}
