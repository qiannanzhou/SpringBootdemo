package com.example.demo.learning;

import com.example.demo.Dao.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectorsTest {

    public static void main(String[] args) {


        Student student1=new Student("zhangsan",20);
        Student student2=new Student("lisi",90);

        Student student3=new Student("zhangsan",80);
        Student student4=new Student("wangwu",30);
        Student student5=new Student("wangwu",30);




        List<Student> students= Arrays.asList(student1,student2,student3,student4);


        students.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);

        System.out.println(students.stream().collect(Collectors.averagingInt(Student::getScore)));

        System.out.println(students.stream().collect(Collectors.summarizingInt(Student::getScore)));

        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(", ")));


        System.out.println("--------------");

       System.out.println(students.stream().collect(groupingBy(Student::getScore)).toString());


        System.out.println(students.stream().collect(groupingBy(Student::getScore,groupingBy(Student::getName))).toString());


        System.out.println(students.stream().collect(partitioningBy(student -> student.getScore()>30)));

       System.out.println(students.stream().collect(partitioningBy(student -> student.getScore()>30,partitioningBy(student -> student.getScore()>80))).toString());

       System.out.println(students.stream().collect(partitioningBy(student -> student.getScore()>30,counting())));

    }


}
