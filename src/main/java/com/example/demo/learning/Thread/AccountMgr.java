package com.example.demo.learning.Thread;

import com.example.demo.Dao.Account;

public class AccountMgr {

    public static void transfer(Account from ,Account to,Double amount){
        from.trylock();
        try {
            to.trylock();
            try {
                if(from.getAmount()>amount){
                    from.reduce(amount);
                    to.add(amount);

                }else {
                    System.out.println("没钱了");
                }
            }finally {
                to.unlock();
            }

        }finally {
            from.unlock();
        }

    }



}
