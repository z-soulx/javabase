package com.study.soulx.design_patterns.my.some.action.strategy.handler;

import com.study.soulx.design_patterns.my.some.action.strategy.model.OrderDTO;

/**
 * @program: java-base
 * @description: 抽象处理器
 * @author: soulx
 * @create: 2019-09-27 09:02
 **/
public abstract class AbstractHandler {
    abstract public String handle(OrderDTO dto);
}
