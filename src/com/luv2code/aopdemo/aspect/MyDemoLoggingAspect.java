package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Aspect
@Component
@Order(123)
public class MyDemoLoggingAspect {

    // this is where we add all our related advices for logging

    // let's start with a @Before advice
    @Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackage()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) { // joinPoint has metadata about method
        System.out.println("\n=======>>> Executing @Before Advice");

        // display the method signature
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method: " + methodSignature);

        // display method arguments
        Object[] args = joinPoint.getArgs();

        System.out.println("Printing Argument List...");
        Arrays.asList(args).forEach(System.out::println);
    }

}
