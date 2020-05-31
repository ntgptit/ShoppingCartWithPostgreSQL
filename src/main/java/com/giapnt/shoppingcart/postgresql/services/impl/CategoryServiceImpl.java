package com.giapnt.shoppingcart.postgresql.services.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giapnt.shoppingcart.postgresql.mapper.CategoryMapper;
import com.giapnt.shoppingcart.postgresql.model.Category;
import com.giapnt.shoppingcart.postgresql.services.CategoryService;
import com.giapnt.shoppingcart.postgresql.ulltis.constant.AppServiceContants;

/**
 * The Class CategoryServiceImpl.
 *
 * @author GiapNT
 */
@Service("CategoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {

    /**
     * The Constant logger.
     */
    private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * Gets the all list category.
     *
     * @return categories
     */
    @Override
    @Transactional(readOnly = true)
    public List<Category> getAllListCategory() {
        List<Category> categories = null;
        try {
            categories = categoryMapper.selectAll();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return categories;
    }

    /**
     * Modify category by primary key.
     *
     * @param category Input From UI
     * @return result
     */
    @Override
    @Transactional(readOnly = true)
    public Map<Integer, Object> modifyCategoryByPrimaryKey(Category category) {
        Map<Integer, Object> result = null;
        List<Category> categories;
        HashMap<Integer, Object> mapCategory = new HashMap<>();
        try {
            if (categoryMapper.selectCheckName(category.getName()) == 0) {
                int checkUpdate = categoryMapper.updateByPrimaryKey(category);
                categories = categoryMapper.selectAll();
                if (checkUpdate != 0) {
                    mapCategory.put(checkUpdate, categories);
                } else {
                    mapCategory.put(AppServiceContants.DATA_NOT_MODIFIED, categories);
                }
            } else {
                categories = categoryMapper.selectAll();
                mapCategory.put(AppServiceContants.DUPLICATE_NAME, categories);
            }
            result = mapCategory;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }

    /**
     * Adds the new category.
     *
     * @param category Input From UI
     * @return result
     */
    @Override
    public Map<Integer, Object> addNewCategory(Category category) {
        Map<Integer, Object> result = null;
        List<Category> categories;
        HashMap<Integer, Object> mapCategory = new HashMap<>();
        try {
            if (categoryMapper.selectCheckName(category.getName()) == 0) {
                int checkInsert = categoryMapper.insert(category);
                categories = categoryMapper.selectAll();
                if (checkInsert != 0) {
                    mapCategory.put(checkInsert, categories);
                } else {
                    mapCategory.put(AppServiceContants.DATA_NOT_MODIFIED, categories);
                }
            } else {
                categories = categoryMapper.selectAll();
                mapCategory.put(AppServiceContants.DUPLICATE_NAME, categories);
            }
            result = mapCategory;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }

    /**
     * Removes the category.
     *
     * @param category Input From UI
     * @return result
     */
    @Override
    public Map<Integer, Object> removeCategory(Category category) {
        Map<Integer, Object> result = null;
        HashMap<Integer, Object> mapCategory = new HashMap<>();
        int checkDelete;
        try {
            checkDelete = categoryMapper.deleteByPrimaryKey(category.getId());
            List<Category> categories = categoryMapper.selectAll();
            if (checkDelete != 0) {
                mapCategory.put(checkDelete, categories);
            } else {
                mapCategory.put(AppServiceContants.DATA_NOT_MODIFIED, categories);
            }
            result = mapCategory;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }
}
