package com.study.soulx.design_patterns.my_code.chapter_10;

/**
 * @program: java-base
 * @description: 开始状态
 * @author: soulx
 * @create: 2019-08-16 10:54
 **/
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}


