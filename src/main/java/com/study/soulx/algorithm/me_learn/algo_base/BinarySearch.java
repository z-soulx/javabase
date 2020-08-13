package com.study.soulx.algorithm.me_learn.algo_base;

import org.junit.Test;

/**
 * @program: javabase
 * @description: 二分查找
 * @author: soulx
 * @create: 2020-08-13 19:53
 **/
public class BinarySearch {
    @Test
    public void test(){
//        int[] num = {1,2,3,4,7,8,8,8,9};
//        binarySearch3(num,6);
//        binarySearch2(num,6);
//        int[] nums = {4,5,6,7,8,1,2,3};//升序
        int[] nums = {1};//升序
        System.out.println(search(nums,0));
    }
   /** 
   * @Description:   搜索旋转排序数组
   * @Author: soulx 
   */
    public int search(int[] nums, int target) {
        int hight = nums.length-1;
        int low = 0;
        while(low<=hight){
            int mid = low + ((hight-low)>>1);
            int m = nums[mid];
            int l = nums[low];
            int h = nums[hight];

            if(m== target) return mid;
            if(l== target) return low;
            if(h== target) return hight;

                if(m>l){
                    if(target<m&&target>l){
                        hight = mid-1;
                    }else {
                        low = mid+1;
                    }
                } else{
                    if(target>m&&target<h){
                        low = mid+1;
                    }else {
                        hight = mid-1;
                    }
                }
        }
        return -1;
    }
    /**
     * @Description: 二分查找 最后一次次大于等于n
     * @Author: soulx
     */
    private void binarySearch3(int[] num, int n) {
        int low = 0;
        int high = num.length-1;
        while(low<=high){
            int mid = low + ((high-low)>>1);
            if(num[mid]>=n){
                if(mid==num.length-1||num[mid+1]<n){
                    System.out.println(mid);
                    return;
                }else {
                    low = mid+1;
                }

            }
            if(num[mid]<n){
                low = mid+1;
            }
        }

    }
    /**
     * @Description: 二分查找 第一次大于等于n
     * @Author: soulx
     */
    private void binarySearch2(int[] num, int n) {
        int low = 0;
        int high = num.length-1;
        while(low<=high){
            int mid = low + ((high-low)>>1);
            if(num[mid]>=n){
                if(mid==0||num[mid-1]<n){
                    System.out.println(mid);
                    return;
                }else {
                    high = mid-1;

                }

            }
            if(num[mid]<n){
                low = mid+1;
            }
        }

    }

    /**
    * @Description: 普通二分查找
    * @Author: soulx
    */
    private void binarySearch(int[] num, int n) {
        int low = 0;
        int high = num.length-1;
        while(low<=high){
            int mid = low + ((high-low)>>1);
            if(num[mid]== n) {
                System.out.println(mid);
                return;
            }
            if(num[mid]>n) high = mid-1;
            if(num[mid]<n) low = mid+1;
        }

    }


}
