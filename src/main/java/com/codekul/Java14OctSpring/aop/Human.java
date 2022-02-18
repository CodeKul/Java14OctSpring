package com.codekul.Java14OctSpring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

    //advice
    @After("execution(public * study*())")
    public void wakeUp(){
        System.out.println("Wake up");
    }
}
