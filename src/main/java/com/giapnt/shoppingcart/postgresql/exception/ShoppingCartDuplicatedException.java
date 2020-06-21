package com.giapnt.shoppingcart.postgresql.exception;

/**
 * The Class ShoppingCartDuplicatedException.
 *
 * @author GiapNT
 */
public class ShoppingCartDuplicatedException extends RuntimeException {

	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = -3964410146677038139L;

	/**
	 * Instantiates a new shopping cart duplicated exception.
	 */
	public ShoppingCartDuplicatedException() {
		super();
	}

	/**
	 * Instantiates a new shopping cart duplicated exception.
	 *
	 * @param message            the message
	 * @param cause              the cause
	 * @param enableSuppression  the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public ShoppingCartDuplicatedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Instantiates a new shopping cart duplicated exception.
	 *
	 * @param message the message
	 * @param cause   the cause
	 */
	public ShoppingCartDuplicatedException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new shopping cart duplicated exception.
	 *
	 * @param message the message
	 */
	public ShoppingCartDuplicatedException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new shopping cart duplicated exception.
	 *
	 * @param cause the cause
	 */
	public ShoppingCartDuplicatedException(Throwable cause) {
		super(cause);
	}
}
