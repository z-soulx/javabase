package com.study.soulx.design_patterns.my.some.action.strategy.handler.biz;


import com.study.soulx.design_patterns.my.some.action.strategy.handler.AbstractHandler;
import com.study.soulx.design_patterns.my.some.action.strategy.handler.HandlerType;
import com.study.soulx.design_patterns.my.some.action.strategy.model.OrderDTO;
import org.springframework.stereotype.Component;

/**
 * @Author: soulx
 * @Description: 普通订单处理器
 * @Date: Created in 10:17 2019/2/2
 */
@Component
@HandlerType("1")
public class NormalHandler extends AbstractHandler {

    @Override
    public String handle(OrderDTO dto) {
        return "处理普通订单";
    }



}
