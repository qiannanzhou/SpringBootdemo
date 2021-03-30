package com.example.demo.Proxy;

import com.example.demo.Handler.DebugInvocationHandler;
import com.example.demo.Interface.SendMsgService;
import com.example.demo.Interface.SendMsgServiceImpl;

import java.lang.reflect.Proxy;
import java.util.LinkedList;

public class JdkProxyFactory {

    public static Object getProxy(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new DebugInvocationHandler(target));
    }


    public static void main(String[] args) {
        SendMsgService sendMsgService=(SendMsgService) JdkProxyFactory.getProxy(new SendMsgServiceImpl());
        sendMsgService.sendmsg("周倩楠");

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        System.out.println(linkedList.get(0));


    }
}
