package com.example.demo.Dao;

public class CloneModel2 implements Cloneable{

    private  String model2property1;

    private  Integer model2property2;


    public String getModel2property1() {
        return model2property1;
    }

    public void setModel2property1(String model2property1) {
        this.model2property1 = model2property1;
    }

    public Integer getModel2property2() {
        return model2property2;
    }

    public void setModel2property2(Integer model2property2) {
        this.model2property2 = model2property2;
    }

    public CloneModel2(String model2property1, Integer model2property2) {
        this.model2property1 = model2property1;
        this.model2property2 = model2property2;
    }

    @Override
    public String toString() {
        return "CloneModel2{" +
                "model2property1='" + model2property1 + '\'' +
                ", model2property2=" + model2property2 +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {


        return super.clone();
    }
}
