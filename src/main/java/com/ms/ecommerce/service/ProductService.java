package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Product;

public interface ProductService {
    public Product addProduct(Product product);
    public Product[] getAllProduct();
    public Product getProductById(int id);
    public String deleteProductById(int id);
    public Product updateProductById(int id,Product product);
}
