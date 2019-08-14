package com.study.soulx.test;

import com.study.soulx.design_patterns.my_code.chapter_6.NoCommand;

import java.io.FileNotFoundException;
import java.util.stream.Stream;


/**
 * @program: java-base
 * @description:
 * @author: soulx
 * @create: 2019-08-11 18:29
 **/
public class T {
    public static void main(String[] args) {

        Stream.iterate(0, n->n+1).limit(7).forEach(r-> System.out.println(r));
    }


}
