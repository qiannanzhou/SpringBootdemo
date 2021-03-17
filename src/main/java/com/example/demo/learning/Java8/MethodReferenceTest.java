package com.example.demo.learning.Java8;

import com.example.demo.Dao.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author zhouqiannan
 * @date 23:00 2020/6/22
 * @description
 */
public class MethodReferenceTest {

    public String getString(Supplier<String> supplier){
        return supplier.get()+"test";

    }

    public String getString1(String str, Function<String,String> function){
        return function.apply(str);
    }

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(123,345);
//      list.forEach(item->System.out.println(item));
//
//      list.forEach(System.out::println);
//        list.sort((item1,item2)->item1-item2);
//        list.forEach(System.out::println);
        System.out.println("------------以下是方法引用练习-------------");

        //方法引用练习

        Student student1=new Student("zhangsan",90);
        Student student2=new Student("lisi",10);
        Student student3=new Student("wangwu",20);
        Student student4=new Student("zhaoliu",80);

        List<Student> students=Arrays.asList(student1,student2,student3,student4);
//        System.out.println("------------第一种方法-------------");

//        System.out.println("使用普通lamda表达式排序");
//        students.sort((studentparam1,studentparam2)->Student.compareStudentByname(studentparam1,studentparam2));
//        students.forEach(item->System.out.println(item.getName()));
//        System.out.println("使用类名::静态方法表达式排序");
//        students.sort(Student::compareStudentByname);
//        students.forEach(item->System.out.println(item.getName()));


//        System.out.println("------------第二种方法-------------");
//
//        StudentCompare studentCompare=new StudentCompare();
//        System.out.println("使用普通lamda表达式排序");
//
//        students.sort((studentparam1,studentparam2)->studentCompare.compareByname(studentparam1,studentparam2));
//
//        students.forEach(item->System.out.println(item.getName()));
//
//        System.out.println("使用引用名::实例方法名表达式排序");
//
//        students.sort(studentCompare::compareByname);
//        students.forEach(item->System.out.println(item.getName()));

        System.out.println("------------第三种方法-------------");
        System.out.println("使用类名::实例方法名表达式排序");
//
//        students.sort(Student::compareByname);
//        students.forEach(item->System.out.println(item.getName()));


//        List<String> citys=Arrays.asList("chongqing","shanghai","guangzhou");
//        Collections.sort(citys,(param1,param2)->param1.compareToIgnoreCase(param2));
//        citys.forEach(item->System.out.println(item));
//        System.out.println("使用类名::实例方法名表达式排序");
//        Collections.sort(citys,String::compareToIgnoreCase);
//        citys.forEach(item->System.out.println(item));

        System.out.println("------------第四种方法-------------");

        MethodReferenceTest methodReferenceTest= new MethodReferenceTest();
        System.out.println(methodReferenceTest.getString(()->"hello"));

        System.out.println("使用构造方法引用：类名::引用后");
        System.out.println(methodReferenceTest.getString(String::new));

        System.out.println(methodReferenceTest.getString1("world",(str1)->str1+"wc"));
        System.out.println("使用构造方法引用：类名::引用后");
        System.out.println(methodReferenceTest.getString1("word",String::new));
























    }

}
