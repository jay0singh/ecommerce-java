package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Category;

public interface CategoryService {
    public Category addCategory(Category category);
    public Category[] getAllCategory();
    public Category getCategoryById(int id);
    public String deleteCategoryById(int id);
    public Category updateCategoryById(int id,Category category);
}
