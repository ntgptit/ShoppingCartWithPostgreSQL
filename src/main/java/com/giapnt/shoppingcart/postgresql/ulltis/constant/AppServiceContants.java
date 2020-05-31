package com.giapnt.shoppingcart.postgresql.ulltis.constant;

import java.text.SimpleDateFormat;
import java.util.Date;

// TODO: Auto-generated Javadoc

/**
 * The Class AppServiceContants.
 *
 * @author GiapNT
 */
public final class AppServiceContants {

    /**
     * The Constant STATUS.
     */
    public final static String STATUS = "status";

    /**
     * The Constant SUCCESS.
     */
    public final static String SUCCESS = "success";

    /**
     * The Constant WARNING.
     */
    public final static String WARNING = "warning";

    /**
     * The Constant ERROR.
     */
    public final static String ERROR = "error";

    /**
     * The Constant DATA_NOT_FOUND.
     */
    public final static String DATA_NOT_FOUND = "DATA_NOT_FOUND";

    /**
     * The Constant DUPLICATE_NAME.
     */
    public final static int DUPLICATE_NAME = -1;

    /**
     * The Constant DATA_NOT_MODIFIED.
     */
    public final static int DATA_NOT_MODIFIED = 0;

    /**
     * The Constant ACTION_ADD.
     */
    public final static int ACTION_ADD = 1;

    /**
     * The Constant ACTION_DELETE.
     */
    public final static int ACTION_DELETE = 2;

    /**
     * The Constant ACTIVE.
     */
    public final static int ACTIVE = 1;

    /**
     * The Constant INACTIVE.
     */
    public final static int INACTIVE = 0;

    /**
     * The Constant CURRENT_TIMESTAMP.
     */
    public final static String CURRENT_TIMESTAMP = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    /**
     * The Constant CURRENT_USER_LOGIN.
     */
    public final static String CURRENT_USER_LOGIN = "";
}
