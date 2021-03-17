package com.example.demo.learning.Thread;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadTest extends Thread{

    public static volatile int m=0;

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            m++;
            log.info("thread name{} , m{}",Thread.currentThread().getName(),m);


        }



    }

    public static void main(String[] args) {


        ThreadTest thread=new ThreadTest();
        thread.start();


//        Thread [] threads=new Thread[10];
//        for (int i = 0; i <10 ; i++) {
//            threads[i]=new ThreadTest();
//            log.info(threads[i].getName()+"start");
//            threads[i].start();
//            try {
//                threads[i].join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            log.info(threads[i].getName()+"join");
//
//        }



    }
}
