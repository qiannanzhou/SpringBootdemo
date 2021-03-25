package com.example.demo.learning.Thread;

import lombok.extern.slf4j.Slf4j;
import sun.tools.jconsole.Worker;

import java.util.concurrent.CountDownLatch;
@Slf4j
public class CountDownLatchTest1 {
    static class Work extends Thread{
        CountDownLatch countDownLatch;

        public Work(CountDownLatch latch){
            this.countDownLatch=latch;
        }

        @Override
        public void run() {

            try {
                if(Math.random()<0.2){

                    throw  new RuntimeException("bad luck");
                }

            }catch (Exception e){

            }finally {
                log.info("子线程之前{},countDown{}",getName(),countDownLatch.getCount());
                this.countDownLatch.countDown();
                log.info("子线程之后{},countDown{}",getName(),countDownLatch.getCount());

            }



            }
        }

    public static void main(String[] args) throws InterruptedException, NoSuchFieldException {

        CountDownLatch countDownLatch=new CountDownLatch(10);
//        Work[] works= new Work[10];
//
//        for (int i = 0; i <10 ; i++) {
//            works[i]=new Work(countDownLatch);
//            works[i].start();
//
//        }
//        log.info("主线程{},countDown{}",Thread.currentThread().getName(),countDownLatch.getCount());
//        countDownLatch.await();

        System.out.println(countDownLatch.getClass().getField("hashCode"));

    }


}

