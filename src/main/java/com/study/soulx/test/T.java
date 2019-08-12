package com.study.soulx.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: java-base
 * @description:
 * @author: soulx
 * @create: 2019-08-11 18:29
 **/
public class T {

    public static void main(String[] args) {
        AtomicInteger a =new AtomicInteger();

        Lock lock =new ReentrantLock();
        lock.lock();
     Thread t =    new Thread(()->{
            System.out.println("sss");
         try {
             lock.lockInterruptibly();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println("jiesu");

        });

     t.start();
        System.out.println("ss");
     t.interrupt();
        System.out.println("sssss");
    }
}
