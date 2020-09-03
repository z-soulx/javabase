package com.study.soulx.algorithm.me_learn.practice;

import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @program: java-base
 * @description:
 * @author: soulx
 * @create: 2020-09-02 08:39
 **/
public class Solution {


    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        int count = 0;
        int min = 0x7fffffff;
        for (int num:nums
             ) {
            if(num>0){
                count++;
                if(min>num){
                    min = num;
                }
            }
        }

   if(count ==0){
       return 1;
   }
        for(int i =1;i<count+1;i++){
            int j = 0;
            for (; j < length; j++) {
                if(nums[j]==i){
                    break;
                }
            }
           if(j==length){
               return i;
           }
        }
        for(int i =min;i<min+count+1;i++){
            int j = 0;
            for (; j < length; j++) {
                if(nums[j]==i){
                    break;
                }
            }
            if(j==length){
                return i;
            }
        }
      return -1;
    }
}
