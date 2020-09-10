package com.giapnt.shoppingcart.postgresql.controller.dto.response;

import java.util.List;

import com.giapnt.shoppingcart.postgresql.model.Category;

import lombok.Data;

/**
 * The Class CategoryResponseDTO.
 *
 * @author GiapNT
 */

/**
 * Instantiates a new category response DTO.
 */
@Data
public class CategoryResponseDTO {

    /**
     * List of category.
     */
    List<Category> categories;
}
