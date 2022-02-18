package com.codekul.Java14OctSpring.aop;

import org.springframework.stereotype.Component;

@Component
public class BoyStudent {

    public int study(){
        System.out.println("Boys study");
        return 1;
    }
}
