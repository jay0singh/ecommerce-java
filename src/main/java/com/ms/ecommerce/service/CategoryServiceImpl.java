package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Category;
import com.ms.ecommerce.repository.CategoryRepositoryImpl;

public class CategoryServiceImpl implements CategoryService{
    private CategoryServiceImpl() {}

    private CategoryRepositoryImpl categoryRepository = CategoryRepositoryImpl.getInstance();
    private static CategoryServiceImpl categoryService; //customerService follows camel naming Convention.


    public static CategoryServiceImpl getInstance() {
        if (categoryService == null) {
            System.out.println("inside the if condition");
            categoryService = new CategoryServiceImpl();
            return categoryService;
        }
        return categoryService;
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.addCategory(category);
    }

    @Override
    public Category[] getAllCategory() {
        return categoryRepository.getAllCategory();
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryRepository.getCategoryById(id);
    }

    @Override
    public String deleteCategoryById(int id) {
        return categoryRepository.deleteCategoryById(id);
    }

    @Override
    public Category updateCategoryById(int id, Category category) {
        return categoryRepository.updateCategoryById(id, category);
    }
}
