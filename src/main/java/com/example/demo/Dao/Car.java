package com.example.demo.Dao;

import com.example.demo.learning.Reflect.AnnotationsTest1;

import java.util.Date;

public class Car {

    @AnnotationsTest1.Label("车源")
    private Integer clueId;
    @AnnotationsTest1.Label("曝光时间")
    @AnnotationsTest1.Format(pattern = "yyyy/MM/dd")
    private Date showTime;

    public Car(Integer clueId, Date showTime) {
        this.clueId = clueId;
        this.showTime = showTime;
    }

    public Integer getClueId() {
        return clueId;
    }

    public void setClueId(Integer clueId) {
        this.clueId = clueId;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }
}
