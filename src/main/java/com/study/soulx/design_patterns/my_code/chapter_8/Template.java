package com.study.soulx.design_patterns.my_code.chapter_8;

/**
 * @program: javabase
 * @description: 模板
 * 然后具体的action实现交给继承的子类
 * @author: soulx
 * @create: 2019-08-14 21:32
 **/
public abstract class Template {
    public abstract void action();

    public void test(){
        System.out.println("调用第一步");
        action();
        System.out.println("调用第三步");
    }

}
