package com.giapnt.shoppingcart.postgresql.controller.dto.response;

import java.util.List;

import com.giapnt.shoppingcart.postgresql.model.Payment;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The Class PaymentResponseDTO.
 *
 * @author GiapNT
 */

/**
 * Instantiates a new payment response DTO.
 */
@Data

/**
 * Hash code.
 *
 * @return the int
 */
@EqualsAndHashCode(callSuper = false)
public class PaymentResponseDTO extends ResponseDTO {

    /**
     * List of payment.
     */
    List<Payment> payments;
}
