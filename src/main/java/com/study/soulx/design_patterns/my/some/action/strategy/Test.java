package com.study.soulx.design_patterns.my.some.action.strategy;

import com.study.soulx.design_patterns.my.some.action.strategy.model.OrderDTO;
import com.study.soulx.design_patterns.my.some.action.strategy.service.impl.OrderServiceV2Impl;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.lang.annotation.Retention;

/**
 * @program: java-base
 * @description:
 * @author: soulx
 * @create: 2019-09-27 12:31
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring.xml"})
public class Test {
    @Resource
    private OrderServiceV2Impl serviceV2;
    @org.junit.Test
    public void test(){
        OrderDTO da = new OrderDTO();
        da.setType("1");
        System.out.println(serviceV2.handle(da)); ;
    }
}
