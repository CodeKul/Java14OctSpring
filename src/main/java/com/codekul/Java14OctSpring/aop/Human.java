package com.codekul.Java14OctSpring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

    //advice
//    @Before("pointCut()")
//    public void wakeUp(JoinPoint joinPoint){
//        System.out.println("Wake up"+joinPoint.getSignature());
//    }

//    @After("pointCut()")
//    public void sleep(){
//        System.out.println("Sleep");
//    }

    @Pointcut("execution(public * study*(..))")
    public void pointCut(){
    }

    @AfterReturning(pointcut ="pointCut()",returning = "value")
    public void afterRet(int value){
        System.out.println("After returning "+value);
    }

    @AfterThrowing(pointcut ="execution(public MyException exce())",throwing = "value")
    public void afterThrow(MyException value){
        System.out.println("After throwing==> "+value);
    }


}
