package com.example.demo.learning.Java8;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> supplier=()->"hellowold";
        System.out.println(supplier.get());

        System.out.println("---------");

        Supplier<Person> supplier1=()->new Person();
        System.out.println(supplier1.get().getAge());
    }
}
