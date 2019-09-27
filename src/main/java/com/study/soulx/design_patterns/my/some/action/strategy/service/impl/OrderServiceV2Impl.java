package com.study.soulx.design_patterns.my.some.action.strategy.service.impl;

import com.study.soulx.design_patterns.my.some.action.strategy.handler.AbstractHandler;
import com.study.soulx.design_patterns.my.some.action.strategy.handler.HandlerContext;
import com.study.soulx.design_patterns.my.some.action.strategy.model.OrderDTO;
import com.study.soulx.design_patterns.my.some.action.strategy.service.IOrderService;
import com.sun.tools.corba.se.idl.constExpr.Or;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: soulx
 * @Description:
 * @Date: Created in 9:54 2019/2/2
 */
@Service
public class OrderServiceV2Impl implements IOrderService {

    @Autowired
    private HandlerContext handlerContext;

    @Override
    public String handle(OrderDTO dto) {
        AbstractHandler handler = handlerContext.getInstance(dto.getType());
        return handler.handle(dto);
    }


}
