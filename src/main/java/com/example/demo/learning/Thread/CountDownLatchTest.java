package com.example.demo.learning.Thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    static class  Racer extends Thread{

        CountDownLatch countDownLatch;

        public Racer(CountDownLatch latch){
            this.countDownLatch=latch;
        }

        @Override
        public void run() {
            try {
                this.countDownLatch.await();
                System.out.println(getName()+"start run"+ System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    public static void main(String[] args) {

        int num=10;
        CountDownLatch countDownLatch=new CountDownLatch(1);
        Thread[] threads=new Thread[num];

        for (int i = 0; i < num ; i++) {
            threads[i]=new Racer(countDownLatch);
            threads[i].start();


        }
        System.out.println("countDown之前的countDownLatch"+countDownLatch.getCount());
        countDownLatch.countDown();
        System.out.println("countDown之后的countDownLatch"+countDownLatch.getCount());



    }


}
