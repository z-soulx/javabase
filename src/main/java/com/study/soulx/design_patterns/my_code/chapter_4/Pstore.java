package com.study.soulx.design_patterns.my_code.chapter_4;

/**
 * @program: java-base
 * @description: 方法工厂模式
 * @author: soulx
 * @create: 2019-08-13 15:54
 **/
public  abstract class Pstore {

    /**
    * @Description: 抽象方法，来创建具体实现，
     * 把具体实现推迟到子类，似的客户端只依赖抽象类Pstore
    * @Author: soulx
    */
    public abstract void create();

}
