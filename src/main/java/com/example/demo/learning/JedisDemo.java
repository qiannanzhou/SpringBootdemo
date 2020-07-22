package com.example.demo.learning;


import redis.clients.jedis.Jedis;

public class JedisDemo {

    public static void main(String[] args) {

        Jedis jedis=new Jedis("localhost");
        jedis.set("ceshikey","ceshivalue");

        System.out.println("ceshikey的值为"+jedis.get("ceshikey"));

    }

}
