package com.example.demo.learning.Java8;

import java.util.*;
import java.util.function.Consumer;

public class jdk8Test {

    public static void main(String args[]){
        //----------------遍历
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
//        for(int i=0; i<list.size();i++){
//            System.out.println(list.get(i));
//
//        }
//        System.out.println("--------------");
//
//        for(Integer i:list){
//            System.out.println(i);
//        }
//        System.out.println("--------------");
//
//        list.forEach(new Consumer<Integer>() {
//           @Override
//           public void accept(Integer integer) {
//               System.out.println(integer);
//           }
//        });
//
//        //运用lamda表达式创建函数式接口的实现
//        list.forEach((Integer i)->{
//            System.out.println(i);
//        });
//
//        //运用方法方法引用创建函数式接口的实现
//        list.forEach(System.out::println);

 //-------------------小写转换成大写

        //普通方法
//        List<String> list2=Arrays.asList("hello","wo","thank","you");
//        for (int i = 0; i <list2.size(); i++) {
//           System.out.println(list2.get(i).toUpperCase());
//
//        }
//        //lamda表达式
//        list2.forEach(item->System.out.println(item.toUpperCase()));
//
//
//        List<String> list3=new ArrayList<>();
//        list2.forEach(item->list3.add(item.toUpperCase()));
//        list3.forEach(item->System.out.println(item));
//
//        //Stream
//        list2.stream().map(item->item.toUpperCase()).forEach(item->System.out.println(item));
//
//        list2.stream().map(String::toUpperCase).forEach(item->System.out.println(item));

        //-------------字符串比较

        List<String> list4=Arrays.asList("hello","wo","thank","you");
        Collections.sort(list4, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list4);

        Collections.sort(list4,(o1, o2) -> o1.compareTo(o2));









    }

}
