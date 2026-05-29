package com.telusko.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    public void compile() {
        System.out.println("Baby D I am compiling");
    }
}