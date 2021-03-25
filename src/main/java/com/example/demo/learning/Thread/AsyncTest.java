package com.example.demo.learning.Thread;

import java.util.Random;
import java.util.concurrent.*;

public class AsyncTest implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sleepSeconds=new Random().nextInt(10);
        System.out.println("执行异步任务"+sleepSeconds);
        Thread.sleep(sleepSeconds);



        return sleepSeconds;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService=Executors.newSingleThreadExecutor();
        Future<Integer> future=executorService.submit(new AsyncTest());
        System.out.println("执行其他任务");

        System.out.println(future.get());
    }
}
