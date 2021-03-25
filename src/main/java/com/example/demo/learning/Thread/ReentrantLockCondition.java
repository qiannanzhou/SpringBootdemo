package com.example.demo.learning.Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockCondition extends Thread{
    private volatile boolean fire=false;
    private Lock lock=new ReentrantLock();
    private Condition condition= lock.newCondition();

    @Override
    public void run() {
        lock.lock();
        try{
            while (!fire){
                System.out.println("await before...");
                condition.await();
                System.out.println("await after...");


            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }


    public void  fire(){

        lock.lock();
        try {
            this.fire=true;
            condition.signal();
            System.out.println("signal...");

        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ReentrantLockCondition reentrantLockCondition=new ReentrantLockCondition();
        reentrantLockCondition.start();
        Thread.sleep(5000);
        reentrantLockCondition.fire();

    }

}
