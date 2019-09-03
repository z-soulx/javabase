package com.study.soulx.design_patterns.my_code.chapter_10;

/**
 * @program: java-base
 * @description: 上下文环境
 * @author: soulx
 * @create: 2019-08-16 10:54
 **/
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public void doAction(){
        state.doAction(this);

    }


}
