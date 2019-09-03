package com.study.soulx.design_patterns.my_code.chapter_10;

/**
 * @program: java-base
 * @description: 停止状态
 * @author: soulx
 * @create: 2019-08-16 10:57
 **/
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}


