package com.example.demo.learning.Thread;

public class ThreadTest5 {
    private int count;

    public ThreadTest5(int count) {
        this.count = count;
    }

    public synchronized void awit() throws InterruptedException {
        while (count>0){
            System.out.println("couut"+count);

            wait();
            System.out.println("wait"+Thread.currentThread().getName());
           // System.out.println(count);
        }
    }

    public synchronized void countDown(){
        count--;
        System.out.println(count);
        if(count<=0){
            notifyAll();
            System.out.println("notifyAll"+Thread.currentThread().getName());
        }
    }
}
