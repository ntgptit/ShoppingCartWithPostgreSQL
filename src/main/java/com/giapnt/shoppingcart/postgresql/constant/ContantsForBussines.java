package com.giapnt.shoppingcart.postgresql.constant;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ContantsForBussines {
   /**
    * DUPLICATE_NAME.
    */
   public final static int DUPLICATE_NAME = -1;
   /**
    * DATA_NOT_MODIFIED.
    */
   public final static int DATA_NOT_MODIFIED = 0;
   /**
    * ACTION_ADD.
    */
   public final static int ACTION_ADD = 1;
   /**
    * ACTION_DELETE.
    */
   public final static int ACTION_DELETE = 2;
   /**
    * ACTIVE.
    */
   public final static int ACTIVE = 1;
   /**
    * INACTIVE.
    */
   public final static int INACTIVE = 0;
   /**
    * CURRENT_TIMESTAMP.
    */
   public final static String CURRENT_TIMESTAMP = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
   /**
    * CURRENT_USER_LOGIN.
    */
   public final static String CURRENT_USER_LOGIN = "";
}
