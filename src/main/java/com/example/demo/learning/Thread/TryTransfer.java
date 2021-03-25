package com.example.demo.learning.Thread;

import com.example.demo.Dao.Account;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class TryTransfer extends Thread{
    Account accountfrom;
    Account accountto;
    Double amount;

    public TryTransfer(Account accountfrom ,Account accountto,double amount){
        this.accountfrom=accountfrom;
        this.accountto=accountto;
        this.amount=amount;
    }



    @Override
    public void run() {

        AccountMgr.transfer(accountfrom,accountto,amount);
        log.info("线程名{},from账户{},to账户{},转账{}",Thread.currentThread().getName(),accountfrom.toString(),accountto.toString(),amount);


    }

    public static void main(String[] args) {

        int num=10;
        Account[] accounts=new Account[num];
        Random random=new Random();
        for (int i = 0; i <10 ; i++) {
            accounts[i]=new Account(random.nextInt(1000));

        }

        Thread[] threads=new Thread[100];

        for (int i = 0; i <10 ; i++) {

            for (int j=0;j<10;j++){
                for (int k = 0; k <10 ; k++) {
                    if (j!=k){
                        threads[i]=new TryTransfer(accounts[j],accounts[k],random.nextInt(100));
                        threads[i].start();

                    }


                }


            }






        }


    }





}
