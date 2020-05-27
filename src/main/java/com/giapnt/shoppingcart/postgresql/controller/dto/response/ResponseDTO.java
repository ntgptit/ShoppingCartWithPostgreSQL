package com.giapnt.shoppingcart.postgresql.controller.dto.response;

import lombok.Data;

/**
 * The Class ResponseDTO.
 *
 * @author GiapNT
 */
@Data
public class ResponseDTO {

    /**
     * The status.
     */
    private String status;

    /**
     * The status message content.
     */
    private String statusMessageContent;

    /**
     * The developer message content.
     */
    private String developerMessageContent;

}
