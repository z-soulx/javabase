package com.study.soulx.java.thread.java8_completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @program: java-base
 * @description: 经典的最佳价格查询器
 * 每个商店都提供的对外访问的API
 * @author: soulx
 * @create: 2019-08-02 16:33
 **/
public class Shop {
    /**
     * 商店名称
     */
    private String name;


    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * (阻塞式)通过名称查询价格
     * 很明显，这个API的使用者（这个例子中为最佳价格查询器）调用该方法时，它会被
     * 阻塞。为等待同步事件完成而等待1秒钟，这是无法接受的，尤其是考虑到最佳价格查询器对
     * 网络中的所有商店都要重复这种操作。
     *
     * @param product
     * @return
     */
    public double getPrice(String product) {
        return calculatePrice(product);
    }

    /**
     * (非阻塞式)异步获取价格
     *
     * @param product
     * @return
     */
    public Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> future = new CompletableFuture<>();
        new Thread(() -> {
            double price = calculatePrice(product);
            //需要长时间计算的任务结束并返回结果时,设置Future返回值
            future.complete(price);
        }).start();

        //无需等待还没结束的计算,直接返回Future对象
        return future;
    }
    /**
     * 使用静态工厂supplyAsync(非阻塞式)异步获取价格
     * 默认生产者方法会交由 ForkJoinPool
     * 池中的某个执行线程（ Executor ）运行，也可使用重载传入第二个参数
     * @param product
     * @return
     */
    public Future<Double> getPriceAsync2(String product){
        CompletableFuture<Double> future = CompletableFuture.supplyAsync(() -> calculatePrice(product));

        //无需等待还没结束的计算,直接返回Future对象
        return future;
    }

        /**
         * 计算价格
         * @param product
         * @return
         */
        private double calculatePrice(String product){
            delay();
            //数字*字符=数字
            return 10*product.charAt(0);

        }


        /**
         * 模拟耗时操作,阻塞1秒
         */
        private void delay(){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


}
