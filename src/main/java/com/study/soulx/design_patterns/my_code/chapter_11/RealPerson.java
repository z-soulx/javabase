package com.study.soulx.design_patterns.my_code.chapter_11;

/**
 * @program: java-base
 * @description: 真实对象-人
 * @author: soulx
 * @create: 2019-08-16 14:19
 **/
public class RealPerson implements Say {
    @Override
    public Say say() {
        System.out.println("Hello World");
        return this;
    }
}
