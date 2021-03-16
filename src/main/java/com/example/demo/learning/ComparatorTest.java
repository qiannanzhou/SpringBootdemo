package com.example.demo.learning;

import com.alibaba.fastjson.JSONObject;

import java.util.*;

public class ComparatorTest {

    public static void main(String[] args) {
      //  List<String>  list = Arrays.asList("nihao", "hello", "world", "welcome");

      //  Collections.sort(list);

      //  Collections.sort(list,(item1,item2)->item1.length()-item2.length());
      //  Collections.sort(list, Comparator.comparingInt(String::length));
       //  list.sort(Comparator.comparingInt(String::length).reversed());

//     先按照长度排序，再按照字符串的ASCII码比较（第一个单词第一个字母与第二个单词第一个字母ASCII比，大的话，就是第一个单词大）排序 thencomparing 是前一个比较器有相等结果的，才执行，如果没有相等的结果，thencomparing不执行
   //     list.sort(Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));


//        Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));
//        System.out.println( list);







    }
}
