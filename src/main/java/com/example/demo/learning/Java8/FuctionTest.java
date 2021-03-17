package com.example.demo.learning.Java8;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FuctionTest {

    public static void main(String[] args) {
        FuctionTest fuctionTest=new FuctionTest();
        System.out.println(fuctionTest.compute(5,value->value+5));

        System.out.println(fuctionTest.compute1(2,value->value*2,value->value*value));
        System.out.println(fuctionTest.compute2(2,value->value*2,value->value*value));

        //加减乘除接受两个参数返回值可应用bifunction
        System.out.println(fuctionTest.compute3(1,2,(value1,value2)->value1+value2));
        System.out.println(fuctionTest.compute3(1,2,(value1,value2)->value1-value2));
        System.out.println(fuctionTest.compute3(1,2,(value1,value2)->value1*value2));
        System.out.println(fuctionTest.compute3(1,2,(value1,value2)->value1/value2));

        //加减混合运算
        System.out.println(fuctionTest.compute4(2,3,(value1,value2)->value1+value2,value->value*value));

        System.out.println(str2Num("123", value1 -> Integer.valueOf(value1)));

        System.out.println(strSplice("abc","fgr",(value1,value2)->value1+value2));

        Person person=new Person("zhangsan",6);

        Person person1 = refresh(person, p -> {
            p.setAge(9999);
            p.setName("lisi");
            return p;
        });

        System.out.println(person1.toString());


    }
    public int compute(int a, Function<Integer,Integer> function){
        int result=function.apply(a);
        return result;

    }


    public int compute1(int a, Function<Integer,Integer> fuction1, Function<Integer,Integer> function2){

        return fuction1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer,Integer> fuction1, Function<Integer,Integer> function2){
        return fuction1.andThen(function2).apply(a);
    }

    //加减乘除接受两个参数返回值可应用bifunction
    public int compute3(int a, int b, BiFunction<Integer,Integer,Integer> biFunction){
        return biFunction.apply(a,b);
    }

    public int compute4(int a,int b,BiFunction<Integer,Integer,Integer> biFunction,Function<Integer,Integer> fuction){
        return biFunction.andThen(fuction).apply(a,b);
    }

    public static int str2Num(String str, Function<String, Integer> function) {
        return  function.apply(str);
    }

    public static String strSplice(String a,String b,BiFunction<String,String,String> biFunction){
        return biFunction.apply(a,b);
    }

    public static Person refresh(Person person, UnaryOperator<Person> operator) {
        return operator.apply(person);
    }

}
