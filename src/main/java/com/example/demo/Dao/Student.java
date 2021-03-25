package com.example.demo.Dao;

import java.security.SecureRandom;

/**
 * @author juebing
 * @date 23:54 2020/6/22
 * @description
 */
public class Student implements  Cloneable{
    private String name;
    private Integer score;

    public String getName() {
        return name;
    }

    public Student(){

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if (obj==null){
            return false;
        }
        if(obj instanceof Student){
          Student s= (Student) obj;

          if(s.getName()==this.getName()&&s.getScore()==this.getScore()){
              return true;
          }else

              return false;

        }
        return false;


    }

    public  static int compareStudentByname(Student student1, Student student2){


        return student1.getName().compareTo(student2.getName());
    }

    public   static int compareStudentByscore(Student student1,Student student2){
        return student1.getScore()-student2.getScore();
    }

    public int compareByname(Student student){
        return this.name.compareToIgnoreCase(student.getName());
    }

    public int compareByscore(Student student){
        return this.score-student.score;
    }




}
