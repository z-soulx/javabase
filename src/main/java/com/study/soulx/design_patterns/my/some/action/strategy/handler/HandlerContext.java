package com.study.soulx.design_patterns.my.some.action.strategy.handler;

import com.study.soulx.design_patterns.my.some.action.strategy.util.BeanTool;

import java.util.Map;

/**
 * @program: java-base
 * @description:
 * @author: soulx
 * @create: 2019-09-27 09:44
 **/
public class HandlerContext {
    private Map<String,Class> handlerMap;

    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }
    public AbstractHandler getInstance(String type){
        Class clazz = handlerMap.get(type);
        if(clazz == null){
            throw  new IllegalArgumentException("not found handler for type: "+type);
        }
        return (AbstractHandler) BeanTool.getBean(clazz);
    }
}
