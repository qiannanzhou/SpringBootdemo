package com.example.demo.Handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DebugInvocationHandler implements InvocationHandler {

    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk before method" +method.getName());
        Object result=method.invoke(target,args);
        System.out.println("jdk after method "+method.getName());

        return result ;
    }
}
