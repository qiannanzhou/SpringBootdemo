package com.example.demo.Proxy;

import com.example.demo.Interceptor.DebugMethodInterceptor;
import com.example.demo.Interface.SendMsgService;
import com.example.demo.Interface.SendMsgServiceImpl;
import org.springframework.cglib.proxy.Enhancer;

public class CglibProxy {

    public static Object getProxy(Class<?> clazz) {
        //创建动态代理增强器
        Enhancer enhancer=new Enhancer();
        //设置类加载器
        enhancer.setClassLoader(clazz.getClassLoader());
        //设置被代理类
        enhancer.setSuperclass(clazz);
        //设置方法拦截器
        enhancer.setCallback(new DebugMethodInterceptor());

        return enhancer.create();
    }


    public static void main(String[] args) {
        SendMsgService sendMsgService=(SendMsgService) CglibProxy.getProxy(SendMsgServiceImpl.class);
        sendMsgService.sendmsg("测试cglib代理");
    }

}
