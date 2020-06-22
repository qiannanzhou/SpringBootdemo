package com.example.demo.Dao;

import java.util.List;

/**
 * @author zhouqiannan
 * @date 22:16 2020/6/22
 * @description
 */
public class Company {
    public String name;
    public List<Employee> employeeList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
