package com.study.soulx.algorithm.me_learn.algo_base;

import org.junit.Test;

/**
 * @program: java-base
 * @description: 各种排序
 * @author: soulx
 * @create: 2020-08-12 09:25
 **/
public class Sort {
    @Test
    public void test(){
        int[] num = {4,5,2,3,7,1,6};
//        maopao(num);// 冒泡排序
//          xuanzhe(num); //选着排序
//        charu(num);// 插入排序
//    kuaipai(num,0,num.length-1);//快排序
    kuaipai(num,4,0,num.length-1);//找第k大
        printAll(num);
    }

    private void kuaipai(int[] num, int k, int lo, int hi) {
        if(lo>=hi){
            return;
        }
        int p =partion(num,lo,hi);
        if(p+1==k) System.out.println(num[p]);
        if(p+1>k) {
            kuaipai(num, k,lo, p - 1);
        }else {
            kuaipai(num, k,p + 1, hi);
        }
    }

    private void kuaipai(int[] num, int lo, int hi) {
        if(lo>=hi){
            return;
        }
        int p =partion(num,lo,hi);
        kuaipai(num,lo,p-1);
        kuaipai(num,p+1,hi);
    }

    private int partion(int[] num, int lo, int hi) {
       int i = lo;
       int tmp = num[lo];
       int j= hi+1;
       while (true) {
           while (num[++i]<tmp){
               if(i==hi) break;
           }
           while (num[--j]>tmp){
               if(j==lo) break;
           }
           if(i<j){
               swap(num,i,j);
           }
           else {
               break;
           }

       }
       swap(num,lo,j);
        return j;
    }

    private void charu(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int tmp = num[i];
            int j = i;
            for (; j > 0; j--) {
                if(tmp<num[j-1]){
                    num[j] = num[j-1];
                }else {
                    break;
                }
            }
            num[j]=tmp;
        }

    }

    private void xuanzhe(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int min = i;
            for (int j = i+1; j < num.length; j++) {
                if(num[j]<num[min]){
                    min = j;
                }
            }
            swap(num,i,min);

        }
        printAll(num);
    }

    private void maopao(int[] num) {
        for(int i =0;i<num.length;i++){
            for (int j = 1; j <num.length-i ; j++) {
                if(num[j]< num[j-1]){
                    swap(num,j-1,j);
                }
            }
        }
        printAll(num);

    }

    private void printAll(int[] num) {
        for(int n:num){
            System.out.print(n);
        }
        System.out.println();
    }

    private void swap(int[] num, int i, int j) {
        int tmp = num[i];
        num[i]= num[j];
        num[j]=tmp;
    }


}
