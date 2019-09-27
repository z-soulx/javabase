package com.study.soulx.design_patterns.my.some.action.strategy.handler.biz;


import com.study.soulx.design_patterns.my.some.action.strategy.handler.AbstractHandler;
import com.study.soulx.design_patterns.my.some.action.strategy.handler.HandlerType;
import com.study.soulx.design_patterns.my.some.action.strategy.model.OrderDTO;
import org.springframework.stereotype.Component;

/**
 * @Author: soulx
 * @Description: 促销订单处理器
 * @Date: Created in 10:17 2019/2/2
 */
@Component
@HandlerType("3")
public class PromotionHandler extends AbstractHandler {

    @Override
    public String handle(OrderDTO dto) {
        return "处理促销订单";
    }

}
