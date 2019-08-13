package com.study.soulx.design_patterns.my_code.chapter_5;

/**
 * @program: java-base
 * @description: 单例模式
 * @author: soulx
 * @create: 2019-08-13 16:29
 **/
public class Singleton {


private int a = 2;
    private volatile static Singleton singleton ;

    /**
    * @Description: 私有化构造器，使得只能重方法中实例化
    * @Author: soulx
    */
     private Singleton(){

     }



    /**
    * @Description: 静态方法去获取，可以延迟实例话
     * 双重加锁
    * @Author: soulx
    */
    public static Singleton getInstance(){
            if(singleton == null){
                synchronized (Singleton.class){
                    if(singleton == null){
                        singleton = new Singleton();
                    }
                }
            }

        return singleton;

    }



    /**
    * @Description: 线程安全且不会提前创建浪费内存
    * @Author: soulx
    */
    public static Singleton2 getInstance2(){
        return Singleton2.getINstance();

    }


    //内部类不能有静态变量，除非静态类

     static class Singleton2{
        private   static Singleton2 singleton2 = new Singleton2();

        public static Singleton2 getINstance(){
            return singleton2;
        }


    }
}
