package com.example.demo.learning.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ParallelStreamTest {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>(500000);

        for (int i = 0; i <500000 ; i++) {
            list.add(UUID.randomUUID().toString());

        }

        System.out.println("开始排序");
        Long starttime=System.nanoTime();
        //list.stream().sorted().count();
        //多线程，在底层生成多个线程，把一个任务拆分成若干个小任务，一起执行
        list.parallelStream().sorted().count();
        Long endtime=System.nanoTime();
        Long millis= TimeUnit.NANOSECONDS.toMillis(endtime-starttime);
        System.out.println("排序耗时"+millis);


    }


}
