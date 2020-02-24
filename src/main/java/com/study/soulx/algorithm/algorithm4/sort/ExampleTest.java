package com.study.soulx.algorithm.algorithm4.sort;

import edu.princeton.cs.algs4.*;

/**
 * @program: javabase
 * @description: 排序模板
 * @author: soulx
 * @create: 2020-02-23 14:29
 **/
interface Sort{ //排序的基本模板
    void sort(Comparable[] a);//排序
    boolean less(Comparable v,Comparable w);//比较 v<w true
    void exch(Comparable[] a,int i,int j);//交换
    void show(Comparable a);//打印
}
/**
* @Description: 官方排序 大致是性能递增 从shell开始就不是n^2级别了
 * @see Selection,Insertion,Shell,Merge,MergeBU,Quick,Heap
 *                                       自低向上
* @Author: soulx
*/
public class ExampleTest {
    public static void main(String[] args) {
        //原地归并 --c++内存交换容易实现

    }
}
