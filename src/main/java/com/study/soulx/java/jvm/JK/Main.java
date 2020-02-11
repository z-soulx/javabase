package com.study.soulx.java.jvm.JK;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @program: java-base
 * @description: 通过Unsafe类验证Java虚拟机对boolean类型的掩码操作
 * @author: soulx
 * @create: 2020-02-11 10:52
 **/
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);

        User user = new User();
        Field flagField = User.class.getDeclaredField("sex");


        unsafe.putByte(user, unsafe.objectFieldOffset(flagField), (byte) 2);
        System.out.println(user.isSex()); // false

        unsafe.putByte(user, unsafe.objectFieldOffset(flagField), (byte) 3);
        System.out.println(user.isSex()); // true
    }

}
