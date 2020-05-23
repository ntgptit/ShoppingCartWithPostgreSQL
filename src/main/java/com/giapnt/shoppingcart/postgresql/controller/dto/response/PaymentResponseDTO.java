/**
 * 
 */
package com.giapnt.shoppingcart.postgresql.controller.dto.response;

import java.util.List;

import com.giapnt.shoppingcart.postgresql.model.Payment;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author GiapNT
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class PaymentResponseDTO extends ResponseDTO {
	/**
	 * List of payment
	 */
	List<Payment> payments;
}
