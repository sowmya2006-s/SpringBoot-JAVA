package com.telusko.simpleWebApp.model;
import lombok.Data;
import lombok.AllArgsConstructor;
@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private double price;
}