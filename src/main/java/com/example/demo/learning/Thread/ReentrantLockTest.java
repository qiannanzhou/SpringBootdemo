package com.example.demo.learning.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    private final Lock lock=new ReentrantLock();

    private volatile int count=0;

    public void incr(){
        lock.lock();
        try {
            count++;
        }finally {
            lock.unlock();

        }


    }

    public int getCount(){
        return count;
    }


}
