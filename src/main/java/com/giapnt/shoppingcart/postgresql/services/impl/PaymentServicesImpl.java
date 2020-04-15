package com.giapnt.shoppingcart.postgresql.services.impl;

import com.giapnt.shoppingcart.postgresql.mapper.PaymentMapper;
import com.giapnt.shoppingcart.postgresql.model.Payment;
import com.giapnt.shoppingcart.postgresql.services.PaymentServices;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Data
@Transactional
@Service("PaymentServices")
public class PaymentServicesImpl implements PaymentServices {

    private static final Logger logger = LoggerFactory.getLogger(PaymentServices.class);

    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public List<Payment> getAllListPayments() {
        try {
            List<Payment> payments = paymentMapper.selectAll();

            return payments;

        } catch (Exception e) {
            logger.error(e.getMessage());

        }
        return null;
    }
}
