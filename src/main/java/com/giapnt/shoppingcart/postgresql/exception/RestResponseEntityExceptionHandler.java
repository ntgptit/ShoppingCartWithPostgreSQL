package com.giapnt.shoppingcart.postgresql.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.giapnt.shoppingcart.postgresql.controller.dto.response.ResponseDTO;

/**
 * @author GiapNT
 *
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * 
	 */
//	private static final Logger logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);

	public RestResponseEntityExceptionHandler() {
		super();
	}

	@ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class })
	protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
		String bodyOfResponse = "This should be application specific";
		return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.CONFLICT, request);
	}

	/**
	 * All non-declared exceptions will be handled here
	 */
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorMessage handleAllException(Exception ex, WebRequest request) {
		// Error checking process takes place here
		return new ErrorMessage(10000, ex.getLocalizedMessage());
	}

	/**
	 * IndexOutOfBoundsException will be handled here individually
	 */
	@ExceptionHandler(IndexOutOfBoundsException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ErrorMessage toDoIndexOutOfBoundsException(Exception ex, WebRequest request) {
		return new ErrorMessage(10100, "Object does not exist");
	}

	/**
	 * ShoppingCartNotFoundException will be handled here individually
	 */
	@ExceptionHandler(ShoppingCartNotFoundException.class)
	public ResponseEntity<Object> toDoNotFoundException(RuntimeException ex, WebRequest request) {
		ResponseDTO responseDTO = message(HttpStatus.NOT_FOUND, ex);
		return handleExceptionInternal(ex, responseDTO, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}

	private ResponseDTO message(final HttpStatus httpStatus, final Exception ex) {
//		final String message = ex.getMessage() == null ? ex.getClass().getSimpleName() : ex.getMessage();
//		final String devMessage = ex.getClass().getSimpleName();

		return null;
	}
}
