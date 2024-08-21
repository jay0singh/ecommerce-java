package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Category;

import java.util.ArrayList;

public class CategoryRepositoryImpl implements CategoryRepository {
    private ArrayList<Category> categoryArrayList = new ArrayList<>();
    private CategoryRepositoryImpl(){};
    private static CategoryRepositoryImpl categoryRepository;

    public static CategoryRepositoryImpl getInstance() {
        if (categoryRepository==null){
            categoryRepository = new CategoryRepositoryImpl();
            return categoryRepository;
        }
        return categoryRepository;
    }

    @Override
    public Category addCategory(Category category) {
        Category category1 = null;
        if(categoryArrayList.add(category)){
            category1 = category;
        }
        return category1;
    }

    @Override
    public Category[] getAllCategory() {
        Category[] array = categoryArrayList.toArray(new Category[categoryArrayList.size()]);
        return array;
    }

    @Override
    public Category getCategoryById(int id) {
        for (Category category : categoryArrayList){
            if(category.getCategoryId() == id){
                return category;
            }
        }
        return null;
    }

    @Override
    public String deleteCategoryById(int id) {
        Category category = new Category();
        if(category != null){
            if(categoryArrayList.remove(category)){
                return "Done";
            }
            else{
                return "Failed";
            }
        }
        return "Category not found";
    }

    @Override
    public Category updateCategoryById(int id, Category category) {
        for(Category category1 : categoryArrayList){
            if(category1.getCategoryId() == id){
                category1 = category;
            }
        }
        return null;
    }
}
