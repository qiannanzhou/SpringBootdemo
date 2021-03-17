package com.example.demo.learning.Java8;

import com.example.demo.Dao.Student;
import com.example.demo.Dao.Student1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author juebing
 * @date 0:12 2020/11/24
 * @description
 */
public class StudentLamdaTest {

    public static void main(String[] args) {
        Student1 student1=new Student1(1,"zhou",1,80.52);
        Student1 student2=new Student1(1,"zhou",2,90.00);
        Student1 student3=new Student1(2,"li",2,89.00);
        Student1 student4=new Student1(2,"li",1,60.00);
        Student1 student5=new Student1(3,"zhao",2,79.00);
        Student1 student6=new Student1(3,"zhao",1,69.00);




        List<Student1> students= Arrays.asList(student1,student2,student3,student4,student5,student6);
        System.out.println(students.stream().collect(Collectors.averagingDouble(Student1::getScoure)));
        Map<Integer,List<Student1>> map=students.stream().collect(Collectors.groupingBy(Student1::getId));

        Map<Integer, Double> result = students.stream().collect(Collectors.groupingBy(Student1::getId))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, x -> x.getValue().stream().mapToDouble(Student1::getScoure).sum()));
        Map<Integer, Double> result1=  students.stream().collect(Collectors.groupingBy(Student1::getId,Collectors.summingDouble(Student1::getScoure)));
        System.out.println("ok");

    }
}
