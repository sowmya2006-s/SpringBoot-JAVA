package com.telusko.simpleWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo rpo;

    public List<Product> getProducts() {
        return rpo.findAll();
    }

    public Product getProductById(int prodId) {
        return rpo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product) {
        rpo.save(product);
    }

    public void updateProduct(Product product) {
        rpo.save(product);
    }

    public void deleteProduct(int id) {
        rpo.deleteById(id);
    }
}