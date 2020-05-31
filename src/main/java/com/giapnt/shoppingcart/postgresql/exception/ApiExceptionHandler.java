package com.giapnt.shoppingcart.postgresql.exception;

import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ApiExceptionHandler {
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
     * NotFoundException will be handled here individually
     */
    @ExceptionHandler(ShoppingCartNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorMessage toDoNotFoundException(Exception ex, WebRequest request) {
        return new ErrorMessage(10200, "Object does not found");
    }

}
