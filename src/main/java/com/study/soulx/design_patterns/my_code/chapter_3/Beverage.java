package com.study.soulx.design_patterns.my_code.chapter_3;

/**
 * @program: java-base
 * @description: 饮料
 * @author: soulx
 * @create: 2019-08-13 09:43
 **/
public abstract class Beverage {

    String description = "Unknown Beverage";
    public String getDescription() {
        return description; }
    public abstract double cost();
}
