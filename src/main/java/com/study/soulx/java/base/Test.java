package com.study.soulx.java.base;


import javax.annotation.Resource;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @program: javabase
 * @description:
 * @author: soulx
 * @create: 2020-01-31 14:51
 **/


public class Test {

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        Path p = Paths.get("src").toAbsolutePath();
        System.out.println(Files.exists(p));
    }

  public <T>void Fx(T t){
        if( t instanceof Test){
            System.out.println("test");
        }
      System.out.println("ss");
  }


}


