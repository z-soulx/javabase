package com.study.soulx.java.thread.art_concurrent_book.chapter03;

import java.util.Random;

class VolatileExample {

    int              a    = 1;
    volatile boolean flag = false;

    public void writer() {
        a += 2; //1
       //可做任何事
        flag = true; //2
        a += 1;
    }

    public void reader() {
//        System.out.println( a +"  x "+b13);
        if (flag) { //3
            int i = a; //4
            System.out.println(i);
            //
        }

    }
    //第一个数字为3，后面才是4, 把a+=1放上面则全是4
    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();
        Thread thread2 = new Thread(() -> {
            while (true) {
                example.reader();
            }
        });
        thread2.start();
           new Thread(() -> {
               example.writer();
            }).start();



    }
}
