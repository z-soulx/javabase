package com.study.soulx.java.thread.java8_completablefuture;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @program: java-base
 * @description: Futru测试
 * （⚠️）异常的处理没有测试，但是可以处理
 * @author: soulx
 * @create: 2019-08-02 16:37
 **/
public class FutureDemoTest {

    /**
     * 测试同步API
     */
    @Test
    public void testgetPrice(){
        Shop shop = new Shop("Best Shop");
        long start = System.nanoTime();
        double price = shop.getPrice("mac book pro");
        System.out.printf(shop.getName()+" Price is %.2f%n",price);
        long invocationTime = (System.nanoTime()-start)/1_000_000;
        System.out.println("同步方法调用花费时间:--- "+invocationTime+" --- msecs");
        //...其他操作
        doSomethingElse();
        long retrievalTime = (System.nanoTime()-start)/1_000_000;
        System.out.println("同步方法返回价格所需时间: --- "+retrievalTime+" ---msecs");

    }

    /**
     * 测试异步API
     */
    @Test
    public void testAsync(){
        Shop shop = new Shop("Best Shop");
        long start = System.nanoTime();
        Future<Double> futurePrice = shop.getPriceAsync("mac book pro");
        long invocationTime = (System.nanoTime()-start)/1_000_000;
        System.out.println("异步方法调用花费时间: --- "+invocationTime+" --- msecs");
        //...其他操作
        doSomethingElse();
        //从future对象中读取价格,如果价格未知,则发生阻塞.
        try {
            // 获取任务结果，如果没有完成会一直阻塞等待
            Double price = futurePrice.get();
            System.out.printf(shop.getName()+" Price is %.2f%n",price);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        long retrievalTime = (System.nanoTime()-start)/1_000_000;
        System.out.println("异步方法返回价格所需时间: --- "+retrievalTime+" ---msecs");

    }

/**
 * 如果顺序去查询可能会阻塞，但是并行流进行并行操作不在乎顺序
 * parallelStream()
 */




    /**
     * 其它操作
     */
    private static void doSomethingElse(){
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
