package com.example.demo.learning.Thread;

public class ThreadTest3 {

    private int n;

    public ThreadTest3(int n) {
        this.n = n;
    }

    public synchronized void await() throws InterruptedException {
        if (n >0) {
            n--;
            System.out.println("n="+n);
            if (n == 0) {
                notifyAll();

            }else {
                while (n !=0){
                    wait();
                }
            }

        }
    }


}
