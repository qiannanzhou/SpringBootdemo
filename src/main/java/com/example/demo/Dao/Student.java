package com.example.demo.Dao;

/**
 * @author juebing
 * @date 23:54 2020/6/22
 * @description
 */
public class Student {
    private String name;
    private Integer score;

    public String getName() {
        return name;
    }

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public  static int compareByname(Student student1,Student student2){
        return student1.getName().compareTo(student2.getName());
    }

    public   static int compareByscore(Student student1,Student student2){
        return student1.getScore()-student2.getScore();
    }
}
