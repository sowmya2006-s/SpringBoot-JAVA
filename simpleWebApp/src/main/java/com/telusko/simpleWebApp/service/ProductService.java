package com.telusko.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.telusko.simpleWebApp.model.Product;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(1, "Laptop", 50000),
        new Product(2, "Phone", 30000),
        new Product(3, "Mouse", 1000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getId() == prodId)
                .findFirst()
                .orElse(null);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {

        int index = 0;

        for(int i = 0; i < products.size(); i++) {

            if(products.get(i).getId() == product.getId()) {
                index = i;
                break;
            }
        }

        products.set(index, product);
    }

    public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }
}