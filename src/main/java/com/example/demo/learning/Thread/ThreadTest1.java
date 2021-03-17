package com.example.demo.learning.Thread;

public class ThreadTest1 implements Runnable {
    @Override
    public void run() {
        System.out.println("hello threadTest1");

    }

    public static void main(String[] args) {
        Thread thread=new Thread(new ThreadTest());
        thread.start();
//        ThreadTest1 threadTest1=new ThreadTest1();
//        threadTest;
    }
}
