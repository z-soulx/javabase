package com.study.soulx.algorithm.algorithm4.find;

/**
 * @program: java-base
 * @description: 符号表
 * @author: soulx
 * @create: 2020-02-27 21:23
 **/
import edu.princeton.cs.algs4.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
* @Description: 查找相关
 * @see BinarySearchST //二分查找(基于有序)
 * @see BST
* @Author: soulx
*/
public class ST {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(null,"s");
        HashSet set = new HashSet();
        set.add(null);
        System.out.println();
        Hashtable hashtable = new Hashtable();
        hashtable.put(null,""); //源码报错
        //重点接口 BST的put和delete get
    }
}
