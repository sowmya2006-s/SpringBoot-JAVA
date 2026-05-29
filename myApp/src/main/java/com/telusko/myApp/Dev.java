package com.telusko.myApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    @Qualifier("desktop")
    Computer c;

    public void build() {
        c.compile();
        
        System.out.println("Sowwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
    }

}