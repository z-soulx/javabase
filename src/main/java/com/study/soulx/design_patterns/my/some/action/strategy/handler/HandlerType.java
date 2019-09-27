package com.study.soulx.design_patterns.my.some.action.strategy.handler;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

import java.lang.annotation.*;

/**
 * @program: java-base
 * @description: 类型注解
 * @author: soulx
 * @create: 2019-09-27 09:00
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerType {
    String value();
}
