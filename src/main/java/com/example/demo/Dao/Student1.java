package com.example.demo.Dao;

/**
 * @author juebing
 * @date 23:28 2020/11/23
 * @description
 */
public class Student1 {

    private Integer id;

    private String name ;

    //选修的课程id
    private Integer courseid;

    private Double scoure;

    public Student1(Integer id, String name, Integer courseid, Double scoure) {
        this.id = id;
        this.name = name;
        this.courseid = courseid;
        this.scoure = scoure;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Double getScoure() {
        return scoure;
    }

    public void setScoure(Double scoure) {
        this.scoure = scoure;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseid=" + courseid +
                ", scoure=" + scoure +
                '}';
    }
}
