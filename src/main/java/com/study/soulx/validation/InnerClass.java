package com.study.soulx.validation;

import com.study.soulx.test.T;

import java.io.FileNotFoundException;

/**
 * @program: java-base
 * @description: 内部类参数为什么是final和fianl局部变量的区别 验证
 * @author: soulx
 * @create: 2019-08-14 12:50
 **/
public class InnerClass {

    B o;
    int sww = 7;
    final int ww = 5;
    public static void main(String[] args) throws FileNotFoundException {

        InnerClass t = new InnerClass();
        t.test();
        t.o.print();
    }



    public void test( ){
        int ss = 2;
        final int sss = 5;
        final int s = 200;     //两个s的内存地址不一样，一定要127以上的数字，因为以下做了常量池技术。
        System.out.println(System.identityHashCode(s));
        o = new B(){

            @Override
            void print() {
                System.out.println(System.identityHashCode(s));
            }
        };



    }

    abstract  class B{


        abstract void print( );


    }
}
