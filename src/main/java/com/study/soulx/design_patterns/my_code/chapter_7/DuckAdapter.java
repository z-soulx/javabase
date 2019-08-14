package com.study.soulx.design_patterns.my_code.chapter_7;

/**
 * @program: java-base
 * @description: 鸭子适配器  转换接口
 * @author: soulx
 * @create: 2019-08-14 17:21
 **/
public class DuckAdapter implements Duck {
    //火鸡引用
    TurKey key;

    DuckAdapter(TurKey key) {
        this.key = key;
    }

    @Override
    public void quack() {
        key.gobble();
    }

    @Override
    public void fly() {
        key.fly();
    }
}
