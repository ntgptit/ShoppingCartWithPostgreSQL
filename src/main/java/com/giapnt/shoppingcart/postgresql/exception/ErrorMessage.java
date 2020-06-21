package com.giapnt.shoppingcart.postgresql.exception;

import lombok.Data;

/**
 * The Class ErrorMessage.
 *
 * @author GiapNT
 */
@Data
public class ErrorMessage {

	/** The status code. */
	private int statusCode;

	/** The message. */
	private String message;

	/**
	 * Instantiates a new error message.
	 *
	 * @param i                the i
	 * @param localizedMessage the localized message
	 */
	public ErrorMessage(int i, String localizedMessage) {
	}
}
