package com.example.demo.Proxy;

import com.example.demo.Interface.SendMsgService;
import com.example.demo.Interface.SendMsgServiceImpl;

public class SmxStaticProxy implements SendMsgService {
    private SendMsgService sendMsgService;

    public SmxStaticProxy(SendMsgService sendMsgService) {
        this.sendMsgService = sendMsgService;
    }

    @Override
    public String sendmsg(String message) {
        System.out.println("before send msg");
        sendMsgService.sendmsg(message);
        System.out.println("aftet send msg");
        return null;
    }


    public static void main(String[] args) {
        SendMsgService sendMsgService=new SendMsgServiceImpl() ;
        SmxStaticProxy smxStaticProxy =new SmxStaticProxy(sendMsgService);
        smxStaticProxy.sendmsg("哈哈哈");

    }
}
