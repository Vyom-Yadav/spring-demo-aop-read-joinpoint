package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-12)
public class MyCloudLogAsyncAspect {

    // combining pointcut expressions
    @Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackage()" +
            " && !(com.luv2code.aopdemo.aspect.LuvAopExpressions.getterMethod()" +
            " || com.luv2code.aopdemo.aspect.LuvAopExpressions.setterMethod())")
    public void logToCloud() {
        System.out.println("\n=======>> Some Advice");
    }
}
