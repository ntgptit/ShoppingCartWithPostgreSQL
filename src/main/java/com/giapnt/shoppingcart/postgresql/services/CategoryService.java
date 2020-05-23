package com.giapnt.shoppingcart.postgresql.services;

import com.giapnt.shoppingcart.postgresql.model.Category;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public interface CategoryService {

    List<Category> getAllListCategory();

    Map<Integer, Object> modifyCategoryByPrimaryKey(Category category);

    Map<Integer, Object> addNewCategory(Category category);

    Map<Integer, Object> removeCategory(Category category);
}
