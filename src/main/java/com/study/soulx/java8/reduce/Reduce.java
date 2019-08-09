package com.study.soulx.java8.reduce;

import org.junit.Test;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @program: java-base
 * @description: java8流式合并计算
 * @author: soulx
 * @create: 2019-08-09 12:16
 **/
public class Reduce {

    //1.1 一个参数的Reduce
    @Test
    public void redeuceOne() {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);
/**
 * 求和，也可以写成Lambda语法：  1+2的结果+3···
 * Integer sum = s.reduce((a, b) -> a + b).get();
 */
        Integer sum = s.reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        }).get();

/**
 * 求最大值，也可以写成Lambda语法：
 * Integer max = s.reduce((a, b) -> a >= b ? a : b).get();
 */
        Integer max = s.reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer >= integer2 ? integer : integer2;
            }
        }).get();

    }





    //1.2 两个参数的Reduce
    public void reduceTwo() {
        Stream<String> s = Stream.of("test", "t1", "t2", "teeeee", "aaaa", "taaa");
/**
 * 以下结果将会是：　[value]testt1t2teeeeeaaaataaa
 * 也可以使用Lambda语法：    初始值开始加
 * System.out.println(s.reduce("[value]", (s1, s2) -> s1.concat(s2)));
 */
        System.out.println(s.reduce("[value]", new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return s.concat(s2);
            }
        }));

    }


    /**
     * 1.3 三个参数的Reduce
     * 非并行
     * 如果Stream是非并行的，combiner不生效；其计算过程与两个参数时的Reduce基本是一致的。
     * 当Stream是并行时，
     * 第三个参数就有意义了，它会将不同线程计算的结果调用combiner做汇总后返回。
     */
    public void reduceThree() {
/**
 * 以下reduce生成的List将会是[aa, ab, c, ad]
 * Lambda语法：
 *  System.out.println(s1.reduce(new ArrayList<String>(), (r, t) -> {r.add(t); return r; }, (r1, r2) -> r1));
 */
        Stream<String> s1 = Stream.of("aa", "ab", "c", "ad");
        System.out.println(s1.reduce(new ArrayList<String>(),
                new BiFunction<ArrayList<String>, String, ArrayList<String>>() {
                    @Override
                    public ArrayList<String> apply(ArrayList<String> u, String s) {
                        u.add(s);
                        return u;
                    }
                }, new BinaryOperator<ArrayList<String>>() {
                    @Override
                    public ArrayList<String> apply(ArrayList<String> strings, ArrayList<String> strings2) {
                        return strings;
                    }
                }));


        /**
         * lambda语法：
         * System.out.println(Stream.of(1, 2, 3).parallel().reduce(4, (s1, s2) -> s1 + s2
         , (s1, s2) -> s1 + s2));
         *并行时的计算结果是18，而非并行时的计算结果是10！
         此计算过程现在是这样的：线程1：1 + 4 = 5；线程2：2 + 4 = 6；线程3：3 + 4 = 7；Combiner函数： 5 + 6 + 7 = 18！
         **/
        System.out.println(Stream.of(1, 2, 3).parallel().reduce(4, new BiFunction<Integer, Integer, Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                }
                , new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }

    }));

}

}
