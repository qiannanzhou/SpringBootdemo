package com.example.demo.learning;

import com.example.demo.Dao.Student;

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
        System.out.println("------创建stream 对象的三种方式------------");

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
//       System.out.println(integerList.stream().map(item->item*2).reduce(0,Integer::sum));
//
//        System.out.println("----------------------");
        System.out.println("------------stram转换成list-----------");
//
 //       Stream<String> stringStream=Stream.of("hello","world","123");
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
        System.out.println("-----------stram转换成不同类型的list练习终止操作collect----------");
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
        System.out.println("-------练习flatmap(把几个LIST中的数据打平),map------------");


//        List<String> list6=Arrays.asList("hello","world","zhouqiannan");
//        List<String> list7= list6.stream().map((item)->item.toUpperCase()).collect(Collectors.toList());
//        list7.forEach(System.out::println);
//
//        List<Integer> list8=Arrays.asList(1,2,3,4,5);
//        list8.stream().map(item->item*item).collect(Collectors.toList()).forEach(System.out::println);
//        list8.stream().map(item->item*item).forEach(System.out::println);
//
//        System.out.println(list8.stream().reduce(Integer::sum).orElse(0));
//
//        List<List<String>> list9 = new ArrayList<>();
//        list9.add(list6);
//        list9.add(list7);
//        //flatMap把几个LIST中的数据打平
//        list9.stream().flatMap(Collection::stream).map(String::toLowerCase).forEach(System.out::println);

//
//        List<String> list12=Arrays.asList("hello world","welcome world","hello welcome");
//        //下面为错误写法split返回的是数组，因此map后为stream<String[]>
//        // list12.stream().map(item->item.split(" ")).forEach(item->System.out.println(item));
//
//        list12.stream().map(item->item.split(" ")).forEach(item->Arrays.asList(item).forEach(System.out::println));
//        System.out.println("----------------------");
//
//        list12.stream().map(item->item.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);

        System.out.println("----------------------");
        System.out.println("-------练习iterate等操作（是将种子不断迭代，）------------");

//        Stream stream=Stream.iterate(1,item->item+2).limit(6);
//
//
//       int y = Stream.iterate(1,item->item+2).limit(6).filter(i->i>2).map(i1->i1*2).skip(2).limit(2).reduce(Integer::sum).get();
//       //使用maptoInt方法减少装箱拆箱，提升性能
//       int y1 = Stream.iterate(1,item->item+2).limit(6).filter(i->i>2).mapToInt(i1->i1*2).skip(2).limit(2).reduce(Integer::sum).getAsInt();
//       // 如果既想求和又想求最大最小值，那用summaryStatistics（终止函数）
//
//        System.out.println("-------练习summaryStatistics操作（终止函数）------------");
//
//        IntSummaryStatistics intSummaryStatistics=Stream.iterate(1,item->item+2).limit(6).filter(i->i>2).mapToInt(i1->i1*2).skip(2).limit(2).summaryStatistics();
//        System.out.println("最大值："+intSummaryStatistics.getMax());
//        System.out.println("最小值："+intSummaryStatistics.getMin());
//        System.out.println("总和"+intSummaryStatistics.getSum());

 //       System.out.println("yyyyyyy"+y);

        //流的每次中间操作都会产生一个新的流，并且一个流只能使用一次，不然会报错，所以下面例子第三个打印一定会报错，因此推荐使用链式写法
//        System.out.println(stream);
//        System.out.println(stream.skip(2));
//        System.out.println(stream.limit(1));
        System.out.println("----------------------");

        List<String> list10=Arrays.asList("hello","world","helloworld");
       // list10.stream().map(item->item.substring(0,1).toUpperCase()+item.substring(1)).forEach(System.out::println);

        System.out.println("----------------------");
        System.out.println("-------练习流的短路特性即如果找到一个元素符合条件，就不在执行下一个操作-------------");


        //打印出长度为五的第一个字符串的长度
      //  list10.stream().map(item->item.length()).filter(i->i==5).findFirst().ifPresent(System.out::println);


        //打印出长度为五的第一个字符串的长度 及该单词 是短路运算，如果找到第一个元素后，后面的操作不在执行
//        list10.stream().map(item->{
//            int length =item.length();
//            System.out.println(item);
//            return length;
//        }).filter(i->i==5).findFirst().ifPresent(System.out::println);
//
//        List<String> list11=Arrays.asList("hello1","world","helloworld");
//        list11.stream().map(item->{
//            int length =item.length();
//            System.out.println(item);
//            return length;
//        }).filter(i->i==5).findFirst().ifPresent(System.out::println);


        System.out.println("----------------------");

        System.out.println("-----------练习flatmap---------");


        List<String> listhi=Arrays.asList("hello","hi","你好");
        List<String> listPerson=Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");

        for (int i = 0; i < listhi.size(); i++) {
            for (int j=0;j<listPerson.size();j++){
                System.out.println(listhi.get(i)+" "+listPerson.get(j));

            }


        }
       listhi.stream().flatMap(item->listPerson.stream().map(item2->item+" "+item2)).forEach(System.out::println);

        System.out.println("----------------------");

        System.out.println("-----------练习grouping by 及partion by(分区是分组的一种，只能分成两组)---------");

        Student student1=new Student("zhangsan",20);
        Student student2=new Student("lisi",30);

        Student student3=new Student("zhangsan",80);
        Student student4=new Student("wangwu",30);

        List<Student> students=Arrays.asList(student1,student2,student3,student4);

       Map<String,List<Student>> map =students.stream().collect(Collectors.groupingBy(item->item.getName()));
       //根据name分组，并 返回分组后的数目
       Map<String,Long> map1=students.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting()));

        //根据name分组，并 返回分组后的平均数
      Map<String,Double> map2= students.stream().collect(Collectors.groupingBy(Student::getName,Collectors.averagingDouble(Student::getScore)));

      //  partion by(分区是分组的一种，只能分成两组) 返回Boolean

      Map<Boolean,Long> map3=  students.stream().collect(Collectors.partitioningBy(item->item.getScore()>80,Collectors.counting()));

      System.out.println("----------------------");

      System.out.println("count"+students.stream().collect(Collectors.counting()));
      System.out.println("count"+students.stream().count());





        System.out.println("----------------------");







    }























    }

