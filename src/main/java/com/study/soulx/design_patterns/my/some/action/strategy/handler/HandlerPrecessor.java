package com.study.soulx.design_patterns.my.some.action.strategy.handler;

import com.google.common.collect.Maps;
import com.study.soulx.design_patterns.my.some.action.strategy.util.ClassScaner;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: java-base
 * @description: 处理上下文
 * @author: soulx
 * @create: 2019-09-27 09:36
 **/
@Component
@SuppressWarnings("unchecked")
public class HandlerPrecessor implements BeanFactoryPostProcessor {

   private static final String HANDLER_PACKAGE = "com.study.soulx.design_patterns.my.some.action.strategy.handler.biz";
    /**
     * @Description:
     *扫描@HandlerType，初始化HandlerContext，将其注册到spring容器中
     * @Param: [beanFactory]  bean工厂
     * @see  HandlerType
     * @see  HandlerContext
     * @return: void
     * @Author: soulx
     * @Date: 2019-09-27
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Map<String,Class> handlerMap = Maps.newHashMapWithExpectedSize(3);
        ClassScaner.scan(HANDLER_PACKAGE, HandlerType.class).forEach(clazz->{
            //获取注解中的类型值
            String type = clazz.getAnnotation(HandlerType.class).value();
            //将注解中的类型值作为key，对应的类做为value，保存在Map中
            handlerMap.put(type,clazz);
        });
       //初始化HandlerContext，将其注册到spring容器中
        HandlerContext context = new HandlerContext(handlerMap);
        beanFactory.registerSingleton(HandlerContext.class.getName(),context);

    }
}
