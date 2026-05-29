package com.telusko.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class laptop implements Computer{

    public void compile() {
        System.out.println("Baby L I am compiling");
    }
}