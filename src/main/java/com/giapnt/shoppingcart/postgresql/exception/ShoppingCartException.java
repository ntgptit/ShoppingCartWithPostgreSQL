package com.giapnt.shoppingcart.postgresql.exception;

/**
 * The Class ShoppingCartException.
 *
 * @author GiapNT
 */
public class ShoppingCartException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new shopping cart exception.
     */
    public ShoppingCartException() {
        super();
    }

    /**
     * Instantiates a new shopping cart exception.
     *
     * @param message the message
     * @param cause the cause
     * @param enableSuppression the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public ShoppingCartException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * Instantiates a new shopping cart exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public ShoppingCartException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new shopping cart exception.
     *
     * @param message the message
     */
    public ShoppingCartException(String message) {
        super(message);
    }

    /**
     * Instantiates a new shopping cart exception.
     *
     * @param cause the cause
     */
	public ShoppingCartException(Throwable cause) {
        super(cause);
    }
}
