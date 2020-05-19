package com.example.demo.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {

    public static void main(String[] args) {
        Person person1=new Person("zhangsan",20);
        Person person2=new Person("lisi",30);
        Person person3=new Person("wangwu",40);

        List<Person> personList= Arrays.asList(person1,person2,person3);
        PersonTest personTest=new PersonTest();

       List<Person> people=personTest.getPersonByUsername("zhangsan",personList);
       people.forEach(item->System.out.println(item.getName()));


       List<Person> person=personTest.getPersonByage(20,personList);
       person.forEach(item->System.out.println(item.getName()));

       List<Person> people1=personTest.getPersonByPara(20,personList,(age,personList1)->{return personList1.stream().filter(person4 -> person4.getAge()>age).collect(Collectors.toList());} );

        people1.forEach(item->System.out.println(item.getAge()));




    }

    public List<Person> getPersonByUsernameCommon(String name,List<Person> personList){
        List<Person> list=new ArrayList<>();
        for (Person item:personList) {
            if(item.getName().equals(name)){
                list.add(item);
            }

        }
        return list;
        //personList.forEach(item->item.getName().equals(name));

    }

    public List<Person> getPersonByUsername(String name,List<Person> personList){

        return personList.stream().filter(person->person.getName().equals(name)).collect(Collectors.toList());
    }




    public List<Person> getPersonByage(int age,List<Person> personList){
        BiFunction<Integer,List<Person>,List<Person>> biFunction=(agevalue,personvalue)->{
            return personvalue.stream().filter(person -> person.getAge()>agevalue).collect(Collectors.toList());
        };
        return biFunction.apply(age,personList);
    }

    public List<Person> getPersonByPara (int a,List<Person> personList,BiFunction<Integer,List<Person>,List<Person>> biFunction){
        return biFunction.apply(a,personList);
    }




}
