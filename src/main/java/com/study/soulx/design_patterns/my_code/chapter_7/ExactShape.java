package com.study.soulx.design_patterns.my_code.chapter_7;

/**
 * @program: java-base
 * @description: 图画接口的实现
 * @author: soulx
 * @create: 2019-08-14 18:04
 **/
public class ExactShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}