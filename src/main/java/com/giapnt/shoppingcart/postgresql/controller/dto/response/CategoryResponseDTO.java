package com.giapnt.shoppingcart.postgresql.controller.dto.response;

import java.util.List;

import com.giapnt.shoppingcart.postgresql.model.Category;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author GiapNT
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CategoryResponseDTO {
	/**
	 * List of category
	 */
	List<Category> categories;
}
