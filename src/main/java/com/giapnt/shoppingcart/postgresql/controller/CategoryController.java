package com.giapnt.shoppingcart.postgresql.controller;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giapnt.shoppingcart.postgresql.constant.AppServiceContants;
import com.giapnt.shoppingcart.postgresql.model.Category;
import com.giapnt.shoppingcart.postgresql.services.CategoryService;

/**
 * The Class CategoryController.
 *
 * @author GiapNT
 */
@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/rest")
public class CategoryController {
    
    /** The category service. */
    @Autowired
    private CategoryService categoryService;

    /**
     * Gets the all category.
     *
     * @return result
     */
    @GetMapping(value = "/all-category")
    public ResponseEntity<Object> getAllCategory() {
        ResponseEntity<Object> result = null;
        List<Category> categories;
        try {
            categories = categoryService.getAllListCategory();
            if (categories != null && !categories.isEmpty()) {
                result = new ResponseEntity<>(categories, HttpStatus.OK);
            }
        } catch (Exception e) {
            categories = emptyList();
        }
        if (result == null) {
            result = new ResponseEntity<>(categories, HttpStatus.NOT_FOUND);
        }
        return result;
    }

    /**
     * Modify category infomation.
     *
     * @param category category
     * @return result
     */
    @PostMapping(value = "/modify-category-information")
    public ResponseEntity<Object> modifyCategoryInfomation(@Valid @RequestBody Category category) {
        ResponseEntity<Object> result = null;
        Map<Integer, Object> mapCategoryModify;
        try {
            mapCategoryModify = categoryService.modifyCategoryByPrimaryKey(category);
            for (Map.Entry<Integer, Object> entry : mapCategoryModify.entrySet())
                if (entry.getKey() == AppServiceContants.DATA_NOT_MODIFIED) {
                    result = new ResponseEntity<>(mapCategoryModify, HttpStatus.NOT_MODIFIED);
                    break;
                } else if (entry.getKey() == AppServiceContants.DUPLICATE_NAME) {
                    result = new ResponseEntity<>(mapCategoryModify, HttpStatus.CONFLICT);
                    break;
                } else {
                    result = new ResponseEntity<>(mapCategoryModify, HttpStatus.OK);
                    break;
                }
        } catch (Exception e) {
            mapCategoryModify = emptyMap();
        }
        if (result == null) {
            result = new ResponseEntity<>(mapCategoryModify, HttpStatus.BAD_REQUEST);
        }
        return result;
    }

    /**
     * Creates the new category.
     *
     * @param category category
     * @return result
     */
    @PostMapping(value = "/create-new-category")
    public ResponseEntity<Object> createNewCategory(@Valid @RequestBody Category category) {
        ResponseEntity<Object> result = null;
        Map<Integer, Object> mapCategoryCreate;
        try {
            mapCategoryCreate = categoryService.addNewCategory(category);
            for (Map.Entry<Integer, Object> entry : mapCategoryCreate.entrySet())
                if (entry.getKey() == AppServiceContants.DATA_NOT_MODIFIED) {
                    result = new ResponseEntity<>(mapCategoryCreate, HttpStatus.NOT_MODIFIED);
                    break;
                } else if (entry.getKey() == AppServiceContants.DUPLICATE_NAME) {
                    result = new ResponseEntity<>(mapCategoryCreate, HttpStatus.CONFLICT);
                    break;
                } else {
                    result = new ResponseEntity<>(mapCategoryCreate, HttpStatus.OK);
                    break;
                }
        } catch (Exception e) {
            mapCategoryCreate = emptyMap();
        }
        if (result == null) {
            result = new ResponseEntity<>(mapCategoryCreate, HttpStatus.BAD_REQUEST);
        }
        return result;
    }

    /**
     * Removes the category.
     *
     * @param category category
     * @return result
     */
    @PostMapping(value = "/remove-category")
    public ResponseEntity<Object> removeCategory(@Valid @RequestBody Category category) {
        ResponseEntity<Object> result = null;
        Map<Integer, Object> mapCategory;
        try {
            mapCategory = categoryService.removeCategory(category);
            for (Map.Entry<Integer, Object> entry : mapCategory.entrySet())
                if (entry.getKey() == AppServiceContants.DATA_NOT_MODIFIED) {
                    result = new ResponseEntity<>(mapCategory, HttpStatus.NOT_MODIFIED);
                    break;
                } else {
                    result = new ResponseEntity<>(mapCategory, HttpStatus.OK);
                    break;
                }
        } catch (Exception e) {
            mapCategory = emptyMap();
        }
        if (result == null) {
            result = new ResponseEntity<>(mapCategory, HttpStatus.BAD_REQUEST);
        }
        return result;
    }
}
