package com.giapnt.shoppingcart.postgresql.controller;

import com.giapnt.shoppingcart.postgresql.constant.Contants;
import com.giapnt.shoppingcart.postgresql.model.Category;
import com.giapnt.shoppingcart.postgresql.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

import static java.util.Collections.*;

@RestController
@RequestMapping("/rest")
public class CategoryController {
    /**
     *
     */
    @Autowired
    private CategoryServices categoryServices;

    /**
     * @return result
     */
    @GetMapping(value = "/all-category")
    public ResponseEntity<Object> getAllCategory() {
        ResponseEntity<Object> result = null;
        List<Category> categories;
        try {
            categories = categoryServices.getAllListCategory();
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
     * @param category category
     * @return result
     */
    @PostMapping(value = "/modify-category-information")
    public ResponseEntity<Object> modifyCategoryInfomation(@Valid @RequestBody Category category) {
        ResponseEntity<Object> result = null;
        Map<Integer, Object> mapCategoryModify;
        try {
            mapCategoryModify = categoryServices.modifyCategoryByPrimaryKey(category);
            for (Map.Entry<Integer, Object> entry : mapCategoryModify.entrySet())
                if (entry.getKey() == Contants.DATA_NOT_MODIFIED) {
                    result = new ResponseEntity<>(mapCategoryModify, HttpStatus.NOT_MODIFIED);
                    break;
                } else if (entry.getKey() == Contants.DUPLICATE_NAME) {
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
     * @param category category
     * @return result
     */
    @PostMapping(value = "/create-new-category")
    public ResponseEntity<Object> createNewCategory(@Valid @RequestBody Category category) {
        ResponseEntity<Object> result = null;
        Map<Integer, Object> mapCategoryCreate;
        try {
            mapCategoryCreate = categoryServices.addNewCategory(category);
            for (Map.Entry<Integer, Object> entry : mapCategoryCreate.entrySet()) 
                if (entry.getKey() == Contants.DATA_NOT_MODIFIED) {
                    result = new ResponseEntity<>(mapCategoryCreate, HttpStatus.NOT_MODIFIED);
                    break;
                } else if (entry.getKey() == Contants.DUPLICATE_NAME) {
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
     * @param category category
     * @return result
     */
    @PostMapping(value = "/remove-category")
    public ResponseEntity<Object> removeCategory(@Valid @RequestBody Category category) {
        ResponseEntity<Object> result = null;
        Map<Integer, Object> mapCategory;
        try {
            mapCategory = categoryServices.removeCategory(category);
            for (Map.Entry<Integer, Object> entry : mapCategory.entrySet())
                if (entry.getKey() == Contants.DATA_NOT_MODIFIED) {
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
