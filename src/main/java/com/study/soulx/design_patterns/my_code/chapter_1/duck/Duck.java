package com.study.soulx.design_patterns.my_code.chapter_1.duck;


/**
 * @program: java-base
 * @description: 鸭子类
 *  设计原则： 面向接口，面向组合has-a，变换事物封装和不变的区分
 * @author: soulx
 * @create: 2019-08-12 16:58
 **/
public class Duck {
    /**
    * @Description: 可以多种实现以便随时跟换。
    * @Author: soulx
    * @Date: 2019-08-12
    */
    private FlyBehavior flyBehavior;

    /**
    * @Description:  设置或跟换行为具体能力
    * @Author: soulx
    * @Date: 2019-08-12
    */
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    /**
     * 执行飞行的行为
     */
    public void exFly(){
        flyBehavior.fly();
    }

}
