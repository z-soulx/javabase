package com.study.soulx.design_patterns.my_code.chapter_3;

/**
 * @program: java-base
 * @description: 饮料的具体：浓咖啡
 * @author: soulx
 * @create: 2019-08-13 09:46
 **/
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso"; }
    @Override
    public double cost() {
        return 0.85;
    }
}
