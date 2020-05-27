package com.giapnt.shoppingcart.postgresql.exception;

import lombok.Data;

@Data
public class ErrorMessage {
    private int statusCode;
    private String message;
    public ErrorMessage(int i, String localizedMessage) {
        // TODO Auto-generated constructor stub
    }
}
