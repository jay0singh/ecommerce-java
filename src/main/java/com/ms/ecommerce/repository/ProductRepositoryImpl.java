package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Product;

import java.util.ArrayList;

public class ProductRepositoryImpl implements ProductRepository{
    private ProductRepositoryImpl() {
    }
    private static ProductRepositoryImpl productRepository;

    private ArrayList<Product> productArrayList = new ArrayList<>();

    public static ProductRepositoryImpl getInstance() {
        if (productRepository == null) {
            productRepository = new ProductRepositoryImpl();
            return productRepository;
        }
        return productRepository;
    }

    @Override
    public Product addProduct(Product product) {
        if(productArrayList.add(product)){
            return product;
        }
        return null;
    }

    @Override
    public Product[] getAllProduct() {
        Product[] array = productArrayList.toArray(new Product[productArrayList.size()]);
        return array;
    }

    @Override
    public Product getProductById(int id) {
        for(Product product : productArrayList){
            if(product.getProductId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public String deleteProductById(int id) {
        Product product = this.getProductById(id);
        if(product != null){
            if(productArrayList.remove(product)){
                return " Done";
            }
            else{
                return "Failed";
            }
        }
        return "Not found";
    }

    @Override
    public Product updateProductById(int id, Product product) {
        for(Product product1 : productArrayList){
            if(product1.getProductId() == id){
                product1 = product;
            }
        }
        return null;
    }
}

