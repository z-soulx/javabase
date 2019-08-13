package com.study.soulx.design_patterns.my_code.chapter_3;

/**
 * @program: java-base
 * @description: 装饰的调料
 * @author: soulx
 * @create: 2019-08-13 09:48
 **/
public class Mocha extends CondimentDecorator {
    //基础饮料的引用
   private Beverage beverage;

    Mocha(Beverage beverage ){
       this.beverage = beverage;
   }

    @Override
    public String getDescription() {
        return "HouseBlend" + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 1.0 + beverage.cost();
    }
}
