package com.example.demo.Dao;

public class CloneModel1 implements Cloneable {

    private String property1;
    private Integer property2;

    CloneModel2 cloneModel2;


    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public Integer getProperty2() {
        return property2;
    }



    public void setProperty2(Integer property2) {
        this.property2 = property2;
    }

    public CloneModel2 getCloneModel2() {
        return cloneModel2;
    }

    public void setCloneModel2(CloneModel2 cloneModel2) {
        this.cloneModel2 = cloneModel2;
    }

    public CloneModel1(String property1, Integer property2) {
        this.property1 = property1;
        this.property2 = property2;
    }

    public CloneModel1(String property1, Integer property2, CloneModel2 cloneModel2) {
        this.property1 = property1;
        this.property2 = property2;
        this.cloneModel2 = cloneModel2;
    }

    @Override
    public String toString() {
        return "CloneModel1{" +
                "property1='" + property1 + '\'' +
                ", property2=" + property2 +
                ", cloneModel2=" + cloneModel2 +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        CloneModel1 c=(CloneModel1)super.clone();
        c.cloneModel2=(CloneModel2) this.cloneModel2.clone();
        return c;
    }
}
