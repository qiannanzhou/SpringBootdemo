package com.example.demo.learning.Thread;

public class ThreadTest6 extends Thread{
    ThreadTest5 threadTest5;

     public ThreadTest6(ThreadTest5 threadTest5){
         this.threadTest5=threadTest5;
     }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
       this.threadTest5.countDown();

    }

    public static void main(String[] args) throws InterruptedException {
        int num=10;
        ThreadTest5 threadTest5=new ThreadTest5(num);
        ThreadTest6[] threadTest6s=new ThreadTest6[num];
        for (int i = 0; i <num ; i++) {

            threadTest6s[i]=new ThreadTest6(threadTest5);
            System.out.println("start");
            threadTest6s[i].start();

        }
        threadTest5.awit();

    }
}
