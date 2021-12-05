package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {

    // Using a common pointcut expression, @Pointcut used to declare a pointcut
    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    public void forDaoPackage() {
        // pointcut expression
    }

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
    public void setterMethod() {
        // pointcut expression
    }

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
    public void getterMethod() {
        // pointcut expression
    }

}
