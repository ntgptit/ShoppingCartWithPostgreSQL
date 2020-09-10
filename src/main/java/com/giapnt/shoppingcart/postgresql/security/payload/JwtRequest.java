package com.giapnt.shoppingcart.postgresql.security.payload;

import java.io.Serializable;

import lombok.Data;

/**
 * The Class JwtRequest.
 *
 * @author GiapNT
 */
@Data
public class JwtRequest implements Serializable {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 5926468583005150707L;

    /**
     * The username.
     */
    private String username;

    /**
     * The password.
     */
    private String password;

}
