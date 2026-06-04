package com.telusko.simpleWebApp;

import com.telusko.simpleWebApp.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @RequestMapping("/product")
    public List<Product> getProduct() {

        return List.of(
                new Product(1, "Laptop", 400000),
                new Product(2, "Mobile", 50000),
                new Product(3, "Watch", 1500),
               \
        );
    }
}