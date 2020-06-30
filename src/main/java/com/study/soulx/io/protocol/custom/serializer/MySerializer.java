package com.study.soulx.io.protocol.custom.serializer;

import java.io.Serializable;

/**
 * @program: java-base
 * @description: 自定义序列化
 * @author: soulx
 * @create: 2020-05-29 18:57
 **/
public interface MySerializer {


    /**
     * 序列化算法
     */
    byte getSerializerAlgorithm();

    /**
     * java对象转换成二进制
     */
    byte[] serialize(Object object);

    /**
     * 二进制转换成 java 对象
     */
    <T> T deserialize(Class<T> clazz, byte[] bytes);



}
