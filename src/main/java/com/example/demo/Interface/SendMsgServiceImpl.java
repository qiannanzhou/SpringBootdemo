package com.example.demo.Interface;

public class SendMsgServiceImpl implements SendMsgService{

    @Override
    public String sendmsg(String message) {
        System.out.println("send message :"+message);
        return message;
    }
}
