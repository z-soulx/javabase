package com.study.soulx.algorithm.me_learn.structure_base;

import java.util.Random;

/**
 * @program: javabase
 * @description: 跳跃表
 * leetcode 1206. 设计跳表 [https://leetcode-cn.com/problems/design-skiplist/]
 * @author: soulx
 * @create: 2020-08-02 11:30
 **/
//版本1 c++
// 1.首先定义节点SkipNode,他应该具有以下成员：
//int val:节点的值；
//int level:节点的等级；
//SkipNode** next:用于保存下一节点的指针的数组；
//*

// java版
public class Skiplist {

    Node head = new Node(null, null, 0);

    public boolean search(int target) {
        // 先往右再往下，缩小区间，套路都是这个套路
        for (Node p = head; p != null; p = p.down) {
            while (p.right != null && p.right.val < target) {
                p = p.right;
            }
            if (p.right != null && p.right.val == target) {
                return true;
            }
        }
        return false;
    }

    Random rand = new Random();

    // 2^64 已经相当大了
    Node[] stack = new Node[64];

    public void add(int num) {
        int lv = -1;
        for (Node p = head; p != null; p = p.down) {
            while (p.right != null && p.right.val < num) {
                p = p.right;
            }
            stack[++lv] = p;
        }
        boolean insertUp = true;
        Node downNode = null;
        while (insertUp && lv >= 0) {
            Node insert = stack[lv--];
            insert.right = new Node(insert.right, downNode, num);
            downNode = insert.right;
            insertUp = (rand.nextInt() & 1) == 0;
        }
        if (insertUp) {
            head = new Node(new Node(null, downNode, num), head, 0);
        }
    }

    public boolean erase(int num) {
        boolean exists = false;
        for (Node p = head; p != null; p = p.down) {
            while (p.right != null && p.right.val < num) {
                p = p.right;
            }
            if (p.right != null && p.right.val <= num) {
                exists = true;
                p.right = p.right.right;
            }
        }
        return exists;
    }

    static class Node {
        int val;
        Node right, down;

        public Node(Node r, Node d, int val) {
            right = r;
            down = d;
            this.val = val;
        }
    }
}


