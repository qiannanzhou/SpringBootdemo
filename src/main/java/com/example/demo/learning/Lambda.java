package com.example.demo.learning;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {


    public void mytest(MyFuctionInterfaceTest myFuctionInterfaceTest){
        System.out.println("before");
        myFuctionInterfaceTest.test();
        System.out.println("after");
    }

    public static void  main(String[] args){


      // 不用lamda表达式写法
        Lambda lambda =new Lambda();
        lambda.mytest(new MyFuctionInterfaceTest() {
            @Override
            public void test() {
                System.out.println("mytest");
            }
        });
        System.out.println("------------");

        //运用lamda表达式写法

        lambda.mytest(()->System.out.println("mytest"));

        System.out.println("------------");

       //??
        MyFuctionInterfaceTest myFuctionInterfaceTest=()-> {System.out.println("mytest");};





    }
}
