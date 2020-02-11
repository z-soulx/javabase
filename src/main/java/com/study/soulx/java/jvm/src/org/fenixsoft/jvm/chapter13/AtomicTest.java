package com.study.soulx.java.jvm.src.org.fenixsoft.jvm.chapter13;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * Atomic变量自增运算测试
 *
 * @author zzm
 */
public class AtomicTest {

    public static AtomicInteger race = new AtomicInteger(0);

    public static void increase() {
        race.incrementAndGet();
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) throws Exception {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        while (Thread.activeCount() > 1)
            Thread.yield();

        System.out.println(race);
    }
    /**
     * Atomically increment by one the current value.
     * @return the updated value
     */
//    public final int incrementAndGet() {
//        for (;;) {
//            int current = get();
//            int next = current + 1;
//            if (compareAndSet(current, next))
//                return next;
//        }
//    }


}

