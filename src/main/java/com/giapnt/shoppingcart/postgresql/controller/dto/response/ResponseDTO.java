package com.giapnt.shoppingcart.postgresql.controller.dto.response;

import lombok.Data;

/**
 * @author GiapNT
 *
 */
@Data
public class ResponseDTO {

	/**
	 * 
	 */
	private String status;
	/**
	 * 
	 */
	private String statusMessageContent;

	/**
	 * 
	 */
	private String developerMessageContent;

	/**
	 * 
	 */
	public ResponseDTO() {
		super();
	}

	/**
	 * @param string
	 * @param message
	 * @param devMessage
	 */
	public ResponseDTO(String status, String statusMessageContent, String developerMessageContent) {
		// TODO Auto-generated constructor stub
	}

}
