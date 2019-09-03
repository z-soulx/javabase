package com.study.soulx.design_patterns.my_code.chapter_11;

import java.lang.reflect.Proxy;

/**
 * @program: java-base
 * @description: 代理模式测试
 * @author: soulx
 * @create: 2019-08-16 14:28
 **/
public class Test {

    public static void main(String[] args) {
        Say say = new RealPerson();

        Object o = Proxy.newProxyInstance(say.getClass().getClassLoader(), say.getClass().getInterfaces(), new SayInvokHandler(say));
        Say o1 = (Say) o;
        o1.say().say();


    }
}
