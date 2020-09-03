package com.study.soulx.algorithm.me_learn.practice;

import org.junit.Test;

import java.util.List;

/**
 * @program: java-base
 * @description:
 * @author: soulx
 * @create: 2020-09-02 08:36
 **/
public class Main {
    public static void main(String[] args) {

    }
    Solution solution = new Solution();
    @Test
    public void Test(){
//        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        int[] nums = new int[]{1,2,0};
        int i = solution.firstMissingPositive(nums);
        System.out.println(i);
    }
}
