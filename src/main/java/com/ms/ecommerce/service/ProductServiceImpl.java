package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Product;
import com.ms.ecommerce.repository.ProductRepository;
import com.ms.ecommerce.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {
    private ProductServiceImpl() {
    }
    private static ProductServiceImpl productService;

    private ProductRepository productRepository = ProductRepositoryImpl.getInstance();

    public static ProductServiceImpl getInstance() {
        if (productService == null) {
            System.out.println("inside the if condition");
            productService = new ProductServiceImpl();
            return productService;
        }
        return productService;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.addProduct(product);
    }

    @Override
    public Product[] getAllProduct() {
        return productRepository.getAllProduct();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }

    @Override
    public String deleteProductById(int id) {
        return productRepository.deleteProductById(id);
    }

    @Override
    public Product updateProductById(int id, Product product) {
        return productRepository.updateProductById(id, product);
    }
}
