package com.giapnt.shoppingcart.postgresql.ulltis.constant;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Class AppServiceContants.
 *
 * @author GiapNT
 */
public final class AppServiceContants {
    /**
     * The Constant STATUS.
     */
    public static final String STATUS = "status";
    /**
     * The Constant SUCCESS.
     */
    public static final String SUCCESS = "success";
    /**
     * The Constant WARNING.
     */
    public static final String WARNING = "warning";
    /**
     * The Constant ERROR.
     */
    public static final String ERROR = "error";
    /**
     * The Constant DATA_NOT_FOUND.
     */
    public static final String DATA_NOT_FOUND = "DATA_NOT_FOUND";
    /**
     * The Constant DUPLICATE_NAME.
     */
    public static final int DUPLICATE_NAME = -1;
    /**
     * The Constant DATA_NOT_MODIFIED.
     */
    public static final int DATA_NOT_MODIFIED = 0;
    /**
     * The Constant ACTION_ADD.
     */
    public static final int ACTION_ADD = 1;
    /**
     * The Constant ACTION_DELETE.
     */
    public static final int ACTION_DELETE = 2;
    /**
     * The Constant ACTIVE.
     */
    public static final int ACTIVE = 1;
    /**
     * The Constant INACTIVE.
     */
    public static final int INACTIVE = 0;
    /**
     * The Constant CURRENT_TIMESTAMP.
     */
    public static final String CURRENT_TIMESTAMP = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    /**
     * The Constant CURRENT_USER_LOGIN.
     */
    public static final String CURRENT_USER_LOGIN = "";

    private AppServiceContants() {
        //not called
    }
}
