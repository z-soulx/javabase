package com.study.soulx.java.thread.art_concurrent_book.chapter08;import java.util.concurrent.Exchanger;import java.util.concurrent.ExecutorService;import java.util.concurrent.Executors;/** *  * @author tengfei.fangtf * @version $Id: ExchangerTest.java, v 0.1 2015-8-1 ����12:10:37 tengfei.fangtf Exp $ */public class ExchangerTest {    private static final Exchanger<String> exgr       = new Exchanger<String>();    private static ExecutorService         threadPool = Executors.newFixedThreadPool(2);    public static void main(String[] args) {        threadPool.execute(new Runnable() {            @Override            public void run() {                try {                    String A = "ssss";// A¼��������ˮ����                    String exchange = exgr.exchange(A);                    System.out.println("先"+exchange);                } catch (InterruptedException e) {                }            }        });        threadPool.execute(new Runnable() {            @Override            public void run() {                try {                    String B = "ffffff";// B¼��������ˮ����                    String A = exgr.exchange("123");                    System.out.println("Boolean:" + A.equals(B) + "A:" + A + "B:" + B);                } catch (InterruptedException e) {                }            }        });        threadPool.shutdown();    }}