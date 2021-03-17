package com.example.demo.learning.Java8;

import com.example.demo.Dao.Company;
import com.example.demo.Dao.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author zhouqiannan
 * @date 21:39 2020/6/22
 * @description
 */
public class OptionalTest {
    public static void main(String[] args) {

        Optional<String> optional=Optional.of("hello");

        if(optional.isPresent()){
           System.out.println( optional.get());
        }
        System.out.println("-------------------");
       //推荐使用
        optional.ifPresent(item->System.out.println(item));
        System.out.println("-------------------");

        Optional<String> optional1=Optional.empty();
        System.out.println(optional1.orElse("world"));
        System.out.println("-------------------");

        System.out.println(optional1.orElseGet(()->"hhhh"));

        System.out.println("-------------------");

        Employee employee1=new Employee();
        employee1.setName("zhangsan");
        Employee employee2=new Employee();
        employee2.setName("Lisi");

        Company company=new Company();
        company.setName("baidu");
        List<Employee> employeeArrayList=new ArrayList<Employee>();
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        company.setEmployeeList(employeeArrayList);

        //传统
//        if(null !=company.getEmployeeList()){
//            System.out.println("不为空");
//
//        }

        Optional<Company> optionalCompany=Optional.ofNullable(company);
        System.out.println(optionalCompany.map(company1 ->company1.getEmployeeList()).orElse(new ArrayList<Employee>()));





    }

}
