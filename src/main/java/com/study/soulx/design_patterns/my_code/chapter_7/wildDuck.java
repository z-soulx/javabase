package com.study.soulx.design_patterns.my_code.chapter_7;

/**
 * @program: java-base
 * @description: 野鸭
 * @author: soulx
 * @create: 2019-08-14 17:18
 **/
public class wildDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("guguagua");
    }

    @Override
    public void fly() {
        System.out.println("i'm fly");

    }
}
