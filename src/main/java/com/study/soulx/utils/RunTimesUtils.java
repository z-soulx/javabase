package com.study.soulx.utils;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @program: java-base
 * @description: 一个测试函数运行时间的工具类
 * @author: soulx
 * @create: 2019-07-29 09:14
 **/
public class RunTimesUtils {
    /**
     * 一个用来被测试的方法，进行了一个比较耗时的循环
     */
    public   static   void  testMethod(int count){
        for ( int  i= 0 ; i< count ; i++){

        }
    }

    private    void  testTime(CallBack callBack) {
        //测试起始时间
        long  begin = System.currentTimeMillis();
        ///进行回调操作
        callBack.execute();
        //测试结束时间
        long  end = System.currentTimeMillis();
        //打印使用时间
        System.out.println("[use time]:"  + (end - begin));
    }
}

   interface  CallBack {
       /**
        * 执行回调操作的方法
        */
    void  execute();
}
