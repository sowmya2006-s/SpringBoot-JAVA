package com.telusko.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.service.ProductService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {

        return service.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        service.addProduct(product);
        
        System.out.println("Product added: ");
        return product;
   }
   @PutMapping("/products")
   public String updateProduct(@RequestBody Product product) {
    service.updateProduct(product);
    System.out.println("Product updated: " + product);
    return "Product Updated ";
   }
   @DeleteMapping("/products/{id}")
   public String deleteProduct(@PathVariable int id) {
    service.deleteProduct(id);
    System.out.println("Product deleted: " + id);
    return "Product Deleted Successfully";
   }
}