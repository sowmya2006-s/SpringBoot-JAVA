package com.telusko.simpleWebApp;
import com.telusko.simpleWebApp.model.Product;


import java.util.Arrays;


import java.util.List;

public class ProductService {
    List<Product> list = Arrays.asList(
        new Product(1, "Laptop", 400000),
        new Product(2, "phone", 200000)
    );
    public List<Product> getProducts() {
        return list;
    }
        
}

    