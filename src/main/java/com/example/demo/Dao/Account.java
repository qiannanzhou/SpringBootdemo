package com.example.demo.Dao;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private Lock lock=new ReentrantLock();

    private volatile double amount;


    public Account(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void add(Double amount){
        lock.lock();
        try {
            this.amount+=amount;
        }finally {
            lock.unlock();
        }

    }

    public void reduce(Double amount){
        lock.lock();
        try {
            this.amount-=amount;
        }finally {
            lock.unlock();
        }

    }

    public void lock(){
        lock.lock();
    }

    public void unlock(){
        lock.unlock();
    }

    public void trylock(){
        lock.tryLock();
    }

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                '}';
    }
}
