package com.example.demo.learning.Thread;

public class ThreadTestReentrantLock extends Thread{

    ReentrantLockTest reentrantLockTest;

    public ThreadTestReentrantLock(ReentrantLockTest reentrantLockTest) {
        this.reentrantLockTest = reentrantLockTest;
    }

    @Override
    public void run() {
        reentrantLockTest.incr();

    }


    public static void main(String[] args) {
        ReentrantLockTest reentrantLockTest=new ReentrantLockTest();

        Thread[] threads=new Thread[10];
        for (int i = 0; i <10 ; i++) {

            threads[i]=new ThreadTestReentrantLock(reentrantLockTest);
            threads[i].start();

        }
        System.out.println(reentrantLockTest.getCount());




    }
}
