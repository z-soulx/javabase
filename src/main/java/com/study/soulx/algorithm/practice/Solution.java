package com.study.soulx.algorithm.practice;

import org.junit.Test;

/**
 * @program: smjj
 * @description:
 * @author: soulx
 * @create: 2020-09-03 17:21
 **/
public class Solution {
    @Test
    public void testfor(){
        int i = 0;
        int j = 0;
        for (; i < 5; i++) {
            if(i==2)
           continue;
        }
        while (j<5){
            j++;
            if(j==1) continue;

        }
        System.out.println(i);
        System.out.println(j);
    }
    @Test
    public void test(){
        ListNode node1 = new ListNode(1,new ListNode(4,new ListNode(5)));
        ListNode node2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode node3 = new ListNode(2,new ListNode(6));
        ListNode[] lists = new ListNode[]{node1,node2,node3};
        ListNode node = mergeKLists(lists);
        pr(node);
    }
    @Test
    public void test2(){
//        ListNode node1 = new ListNode(1,new ListNode(4,new ListNode(5)));
//        ListNode node2 = new ListNode(1,new ListNode(3,new ListNode(4)));
//        ListNode node3 = new ListNode(0);
        ListNode node3 = null;
        ListNode node4 = new ListNode(1);
        ListNode[] lists = new ListNode[]{node3,node4};
        ListNode node = mergeKLists(lists);
        pr(node);
    }

    private void pr(ListNode node) {
        while (node!=null){
            System.out.print(node.val+" ->");
            node=node.next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode   r= null;
        ListNode head = r;
        int node = 0;
        int n = 0;
        while(n<lists.length){
            for(int i = 0; i< lists.length;i++){
                if(lists[node]==null){
                   node = i;
//                    i++;
                    continue;
                }
                if(lists[i]!=null&& (lists[node].val> lists[i].val)){
                    node = i;
                }
            }
            if(lists[node] ==null){
                n++;
                continue;
            }
            if(r==null){
                r= new ListNode(lists[node].val);
                head =r;
            }else{
                r.next=new ListNode(lists[node].val);
                r=r.next;
            }

            lists[node] = lists[node].next;


        }
        return head;
    }

     public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
