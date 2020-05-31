package com.giapnt.shoppingcart.postgresql.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The Class SupplierDynamic.
 *
 * @author GiapNT
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SupplierDynamic extends Supplier {

	/**
	 * The name or code.
	 */
	private String nameOrCode;
}
