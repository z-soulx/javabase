package com.study.soulx.design_patterns.my_code.chapter_11;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: java-base
 * @description: 代理都到方法后，请求做实际工作的对象
 * @author: soulx
 * @create: 2019-08-16 14:21
 **/
public class SayInvokHandler implements InvocationHandler {
    private Say say;

    SayInvokHandler(Say say){
        this.say = say;

    }
    public Say getProxy(Say say){
        Say o1 = (Say)Proxy.newProxyInstance(say.getClass().getClassLoader(), say.getClass().getInterfaces(), new SayInvokHandler(say));
        return o1;
    }


    /**
    * @Description: 参数proxy的作用是可以返回真实的代理对象
    * @Author: soulx
    * @Date: 2019-08-16
    */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理对象开始");
        System.out.println(proxy.getClass().getName());
        System.out.println(this.say.getClass().getName());
        Object invoke = method.invoke(say, args);
        System.out.println(invoke.getClass().getName());
        System.out.println("代理对象结束");

        return proxy;
    }
}
