package com.study.soulx.java.jvm;

/**
 * @program: java-base
 * @description: jvm测试
 * @author: soulx
 * @create: 2020-02-06 16:34
 **/
public class Test {


    public static void main(String[] args) {
        int value = SubClass.value;
        System.out.println(value);
    }
    /**
     * 非主动使用类字段演示
     **/
    @org.junit.Test
    public  void test_fzd() {
        int value = SubClass.value;
        System.out.println(value);
        }


}
