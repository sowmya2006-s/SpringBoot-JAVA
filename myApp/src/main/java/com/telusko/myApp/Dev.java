package com.telusko.myApp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    @Qualifier("Desktop")
    Computer c;

    public void build() {
        c.compile();
        
        System.out.println("Sowwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
    }

}