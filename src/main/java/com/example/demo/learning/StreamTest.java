package com.example.demo.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author juebing
 * @date 21:56 2020/6/28
 * @description
 */
public class StreamTest {
    public static void main(String[] args) {
        //创建stream 对象的三种方式
        System.out.println("第一种方式");
        Stream stream=Stream.of("hello","world");

        System.out.println("第二种方式");
        String[] arrays=new String[]{"hello","world"};
        Stream stream1=Stream.of(arrays);

        System.out.println("第三种方式");

        Stream stream2= Arrays.stream(arrays);
        System.out.println("第四种方式最最常用");

        List<String> list=Arrays.asList("hello","world");
        Stream stream3=list.stream();
        System.out.println("stream3"+stream3);


        System.out.println("----------------------");

        List<Integer> integerList=Arrays.asList(1,2,3,4);
        System.out.println(integerList.stream().map(item->item*2).reduce(0,(integer, integer2) ->integer+integer2 ));
        System.out.println(integerList.stream().map(item->item*2).reduce(0,Integer::sum));

        System.out.println("----------------------");
        System.out.println("stram转换成list");

        Stream<String> stringStream=Stream.of("hello","world","123");
        String[] strings=stringStream.toArray(length->new String[length]);

        Arrays.asList(strings).forEach(System.out::println);

        List<String> list1=stringStream.collect(Collectors.toList());

        List<String> list2=stringStream.collect(()->new ArrayList<String>(),(thelist,item)->thelist.add(item),(list1,lis2)->list1.addAll(list2))
//list2等同于
        List<String> list3=stringStream.collect(ArrayList::new,ArrayList::add,ArrayList::addAll);












    }
}
