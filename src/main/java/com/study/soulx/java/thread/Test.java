package com.study.soulx.java.thread;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: java-base
 * @description:
 * @author: soulx
 * @create: 2020-02-09 11:28
 **/
public class Test {
    public static void main(String[] args) {
        FutureTask<String> task = new FutureTask<>(() -> {
            return "ss";
        });


    }
}
