package com.example.demo.learning.Java8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {

        System.out.println(binaryOperator(4,5,(value1,value2)->value1+value2));
        System.out.println(minByParam("hello123","abc",(a,b)->a.length()-b.length()));


    }

    public static int binaryOperator(int a,int b,BinaryOperator<Integer> ab) {


        return ab.apply(a,b);
    }

    public static String minByParam(String a, String b, Comparator<String> comparator){
        return BinaryOperator.minBy(comparator).apply(a,b);
    }
}
