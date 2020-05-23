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
	 * 
	 */
	public ShoppingCartNotFoundException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ShoppingCartNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ShoppingCartNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public ShoppingCartNotFoundException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ShoppingCartNotFoundException(Throwable cause) {
		super(cause);
	}

}
