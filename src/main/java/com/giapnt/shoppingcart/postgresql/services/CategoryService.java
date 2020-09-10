package com.giapnt.shoppingcart.postgresql.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giapnt.shoppingcart.postgresql.model.Category;

/**
 * The Interface CategoryService.
 *
 * @author GiapNT
 */
@Service
@Transactional
public interface CategoryService {

    /**
     * Gets the all list category.
     *
     * @return the all list category
     */
    List<Category> getAllListCategory();

    /**
     * Modify category by primary key.
     *
     * @param category the category
     * @return the map
     */
    Map<Integer, Object> modifyCategoryByPrimaryKey(Category category);

    /**
     * Adds the new category.
     *
     * @param category the category
     * @return the map
     */
    Map<Integer, Object> addNewCategory(Category category);

    /**
     * Removes the category.
     *
     * @param category the category
     * @return the map
     */
    Map<Integer, Object> removeCategory(Category category);
}
