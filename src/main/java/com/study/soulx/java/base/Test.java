package com.study.soulx.java.base;


import javax.annotation.Resource;

/**
 * @program: javabase
 * @description:
 * @author: soulx
 * @create: 2020-01-31 14:51
 **/


public class Test {

    public static void main(String[] args) {
       String a ="";
       switch (a){
           case "ss":
               System.out.println("ss");
           case "s":
               System.out.println("s");
           default:

       }

    }

  public <T>void Fx(T t){
        if( t instanceof Test){
            System.out.println("test");
        }
      System.out.println("ss");
  }


}


