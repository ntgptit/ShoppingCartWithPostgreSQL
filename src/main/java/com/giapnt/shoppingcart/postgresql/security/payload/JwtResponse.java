package com.giapnt.shoppingcart.postgresql.security.payload;

import java.io.Serializable;

import lombok.Data;

/**
 * The Class JwtResponse.
 *
 * @author GiapNT
 */
@Data
public class JwtResponse implements Serializable {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = -8091879091924046844L;

    /**
     * The jwttoken.
     */
    private final String jwttoken;

}
