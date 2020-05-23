package com.giapnt.shoppingcart.postgresql.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giapnt.shoppingcart.postgresql.mapper.PaymentMapper;
import com.giapnt.shoppingcart.postgresql.model.Payment;
import com.giapnt.shoppingcart.postgresql.services.PaymentService;

import lombok.Data;

@Data
@Transactional
@Service("PaymentServices")
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public List<Payment> getAllListPayments() {
        return paymentMapper.selectAll();
    }
}
