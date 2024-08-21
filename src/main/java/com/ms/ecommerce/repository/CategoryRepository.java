package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Category;

public interface CategoryRepository {
    public Category addCategory(Category category);
    public Category[] getAllCategory();
    public Category getCategoryById(int id);
    public String deleteCategoryById(int id);
    public Category updateCategoryById(int id,Category category);
}
