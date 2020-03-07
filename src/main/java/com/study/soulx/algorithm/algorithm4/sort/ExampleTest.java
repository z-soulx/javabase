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
 * @see Selection,Insertion,Shell,
 * @see Merge,MergeBU,//原地归并 --c++内存交换容易实现
 *             自低向上
 * @see Quick,Quick3way,QuickX //3选择 中位数+插入优化
 *             三项切分(重复多)
 * @see MaxPQ,IndexMinPQ,IndexMaxPQ,Heap
 *       完全二叉树只用数组而不需要用指针就可以表示。
* @Author: soulx
*/
public class ExampleTest {
    public static void main(String[] args) {

        Integer[] a ={5,1,2,3,4};
        Quick.sort(a);

    }
}
