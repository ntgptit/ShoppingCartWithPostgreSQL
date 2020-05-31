package com.giapnt.shoppingcart.postgresql.exception;

/**
 * @author GiapNT
 *
 */
public class ShoppingCartNotFoundException extends RuntimeException {

	/**
	 * Serial version uid
	 */
	private static final long serialVersionUID = -5057854754203792272L;

	/**
	 * Instantiates a new shopping cart not found exception.
	 */
	public ShoppingCartNotFoundException() {
		super();
	}

	/**
	 * Instantiates a new shopping cart not found exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public ShoppingCartNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Instantiates a new shopping cart not found exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public ShoppingCartNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new shopping cart not found exception.
	 *
	 * @param message the message
	 */
	public ShoppingCartNotFoundException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new shopping cart not found exception.
	 *
	 * @param cause the cause
	 */
	public ShoppingCartNotFoundException(Throwable cause) {
		super(cause);
	}

}
