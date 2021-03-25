package com.example.demo.learning.Thread;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueueTest<E>{
     private Lock lock=new ReentrantLock();
     private Condition notfull=lock.newCondition();
     private Condition notEmpty =lock.newCondition();
     private int limit;
     private Queue<E> queue=null;

    public MyBlockingQueueTest(int limit) {
        queue=new ArrayDeque<>(limit);
    }

    public void put(E e){
        lock.tryLock();
        try {

            while (queue.size()==limit){
                notfull.await();
                System.out.println("队列满了。。。。");
            }
            System.out.println("放入---"+e.toString());
            queue.add(e);
            notEmpty.signal();

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } finally {
            lock.unlock();

        }
    }

    public E take(){
        lock.tryLock();
        try{
            while (queue.isEmpty()){
                notEmpty.await();
                System.out.println("队列空了。。。");

            }
           E e= queue.poll();
            notfull.signal();
            return e;

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }finally {
            lock.unlock();
        }
        return null;
    }

    public static void main(String[] args) throws InterruptedException {

        MyBlockingQueueTest myBlockingQueueTest=new MyBlockingQueueTest(10);
        Thread[] threads=new Thread[10];
        for (int i = 0; i <10 ; i++) {

            Random random=new Random();
            threads[i]=new Thread(){
                @Override
                public void run() {
                    myBlockingQueueTest.put(random.nextInt(10));


                }
            };
            threads[i].start();

        }
        Thread.sleep(5000);
        Thread[] threads1=new Thread[10];

        for (int i = 0; i <10 ; i++) {
            threads1[i]=new Thread(){
                @Override
                public void run() {
                    myBlockingQueueTest.take();


                }
            };
            threads1[i].start();

        }




    }

}
