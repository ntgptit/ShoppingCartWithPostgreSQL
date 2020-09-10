package com.giapnt.shoppingcart.postgresql.controller.dto.response;

import com.giapnt.shoppingcart.postgresql.model.Supplier;
import com.github.pagehelper.PageInfo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The Class SupplierResponseDTO.
 *
 * @author GiapNT
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SupplierResponseDTO extends ResponseDTO {

    /**
     * List of supplier.
     */
    private PageInfo<Supplier> pageInfo;

    /**
     * The supplier.
     */
    private Supplier supplier;
}
