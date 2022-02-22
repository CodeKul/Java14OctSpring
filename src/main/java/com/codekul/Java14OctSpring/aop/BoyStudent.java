package com.codekul.Java14OctSpring.aop;

import org.springframework.stereotype.Component;

@Component
public class BoyStudent {

    public int study(int i){
        System.out.println("Boys study");
        return 100;
    }

    public MyException exce() throws MyException {
        throw new MyException("My Exception");
    }
}
