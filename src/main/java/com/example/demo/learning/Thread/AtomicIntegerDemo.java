package com.example.demo.learning.Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
    private static AtomicInteger counter=new AtomicInteger(0);

    static class ThreadTest7 extends Thread{

        @Override
        public void run() {
            for (int i = 0; i <10 ; i++) {
                System.out.println(counter.incrementAndGet()) ;

            }
        }
    }

    public static void main(String[] args) {
        int num=10;
        Thread[] threads=new Thread[num];
        for (int i = 0; i < num ; i++) {
            threads[i] =new ThreadTest7();
            threads[i].start();

        }

        System.out.println(counter.get());



    }

}
