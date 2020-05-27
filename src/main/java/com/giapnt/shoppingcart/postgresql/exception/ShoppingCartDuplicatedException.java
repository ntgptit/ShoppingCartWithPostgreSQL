package com.giapnt.shoppingcart.postgresql.exception;

/**
 * @author GiapNT
 *
 */
public class ShoppingCartDuplicatedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3964410146677038139L;

	/**
	 * 
	 */
	public ShoppingCartDuplicatedException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ShoppingCartDuplicatedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ShoppingCartDuplicatedException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public ShoppingCartDuplicatedException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ShoppingCartDuplicatedException(Throwable cause) {
		super(cause);
	}
}
