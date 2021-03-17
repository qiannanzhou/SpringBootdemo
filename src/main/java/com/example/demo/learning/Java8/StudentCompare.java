package com.example.demo.learning.Java8;

import com.example.demo.Dao.Student;

/**
 * @author juebing
 * @date 0:11 2020/6/23
 * @description
 */
public class StudentCompare {
    public int compareByname(Student student1,Student student2){
        return student1.getName().compareTo(student2.getName());
    }
    public int compareByScore(Student student1,Student student2){
        return student1.getScore()-student2.getScore();
    }
}
