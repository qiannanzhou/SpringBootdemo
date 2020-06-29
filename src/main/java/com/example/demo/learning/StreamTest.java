package com.example.demo.learning;

import java.util.*;
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
//        System.out.println("第一种方式");
//        Stream stream=Stream.of("hello","world");
//
//        System.out.println("第二种方式");
//        String[] arrays=new String[]{"hello","world"};
//        Stream stream1=Stream.of(arrays);
//
//        System.out.println("第三种方式");
//
//        Stream stream2= Arrays.stream(arrays);
//        System.out.println("第四种方式最最常用");
//
//        List<String> list=Arrays.asList("hello","world");
//        Stream stream3=list.stream();
//        System.out.println("stream3"+stream3);
//
//
//        System.out.println("----------------------");
//
//        List<Integer> integerList=Arrays.asList(1,2,3,4);
//        System.out.println(integerList.stream().map(item->item*2).reduce(0,(integer, integer2) ->integer+integer2 ));
//        System.out.println(integerList.stream().map(item->item*2).reduce(0,Integer::sum));
//
//        System.out.println("----------------------");
//        System.out.println("stram转换成list");
//
        Stream<String> stringStream=Stream.of("hello","world","123");
//        String[] strings=stringStream.toArray(length->new String[length]);
//
//        Arrays.asList(strings).forEach(System.out::println);
//
//        List<String> list1=stringStream.collect(Collectors.toList());
//
//        List<String> list2=stringStream.collect(()->new ArrayList<String>(),(thelist,item)->thelist.add(item),(l1,l2)->l1.addAll(l2));
////list2等同于
//        List<String> list3=stringStream.collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
//
//        System.out.println("----------------------");
//        System.out.println("stram转换成不同类型的list");
//
//        List<String> list4=stringStream.collect(Collectors.toCollection(ArrayList::new));
//        list4.forEach(System.out::println);
//
//        List<String> list5 =stringStream.collect(Collectors.toCollection(LinkedList::new));
//
//        Set<String> set1=stringStream.collect(Collectors.toCollection(TreeSet::new));
//        set1.forEach(System.out::println);
//
//        String s=stringStream.collect(Collectors.joining());
//
//        System.out.println("s:"+s);

        System.out.println("----------------------");


        List<String> list6=Arrays.asList("hello","world","zhouqiannan");
        List<String> list7= list6.stream().map((item)->item.toUpperCase()).collect(Collectors.toList());
        list7.forEach(System.out::println);

        List<Integer> list8=Arrays.asList(1,2,3,4,5);
//        list8.stream().map(item->item*item).collect(Collectors.toList()).forEach(System.out::println);
//        list8.stream().map(item->item*item).forEach(System.out::println);
//
//        System.out.println(list8.stream().reduce(Integer::sum).orElse(0));

        /*List<List<String>> list9 = new ArrayList<>();
        list9.add(list6);
        list9.add(list7);
        //flatMap把几个LIST中的数据打平
        list9.stream().flatMap(Collection::stream).map(String::toLowerCase).forEach(System.out::println);*/


       int y = Stream.iterate(1,item->item+2).limit(6).filter(i->i>2).map(i1->i1*2).skip(2).limit(2).reduce(Integer::sum).get();
       System.out.println("yyyyyyy"+y);



















    }
}
