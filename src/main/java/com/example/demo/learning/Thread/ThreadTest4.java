package com.example.demo.learning.Thread;

public class ThreadTest4 {

    static class TheadTest4_1 extends Thread{
        ThreadTest3 threadTest3;

        public TheadTest4_1(ThreadTest3 threadTest3){
            this.threadTest3=threadTest3;
        }

        @Override
        public void run() {
            try {
                threadTest3.await();
                System.out.println("arrived"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }

    public static void main(String[] args) {
        int num=10;
        TheadTest4_1[] theadTest4_1s=new TheadTest4_1[num];
        ThreadTest3 threadTest3=new ThreadTest3(num);

        for (int i = 0; i <num ; i++) {
            theadTest4_1s[i]=new TheadTest4_1(threadTest3);
            theadTest4_1s[i].start();

        }
    }


}
