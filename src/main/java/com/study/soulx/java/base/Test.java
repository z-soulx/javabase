package com.study.soulx.java.base;

import java.util.*;

/**
 * @program: javabase
 * @description:
 * @author: soulx
 * @create: 2020-01-31 14:51
 **/


public class Test {

    public static void main(String[] args) {
        new Test().Fx(new Test());

    }
  public <T>void Fx(T t){
        if( t instanceof Test){
            System.out.println("test");
        }
      System.out.println("ss");
  }


}


