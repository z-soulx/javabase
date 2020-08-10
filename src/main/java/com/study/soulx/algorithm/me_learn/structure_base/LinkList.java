package com.study.soulx.algorithm.me_learn.structure_base;

import org.junit.Test;

/**
 * @program: javabase
 * @description: 自己实现链表结构
 * 单链表反转
 * 链表中环的检测
 * 两个有序的链表合并
 * 删除链表倒数第n个结点
 * 求链表的中间结点
 * @author: soulx
 * @create: 2020-08-09 13:16
 **/
public class LinkList {
    public static void main(String[] args) {

    }
    @Test
public void Test(){
    for(int i = 0; i<5;i++) {
        insert(i);
    }
    printAll();

        printAll(fanzhuan(head));
}
    /**
    * @Description: 单链表翻转
    * @Author: soulx
    */
  public Node fanzhuan(Node list){
      Node curt = list.next;
      Node pre = list;
      pre.next = null;
      while (curt!=null){
          Node next = curt.next;
          curt.next = pre;
          pre = curt;
          curt = next;
      }
      return pre;
  }

  private Node head;
//尾部插入
private void insert(int val){
    Node newNode = new Node(null,val);
  if(head == null){
      head = newNode;
  }else {
      Node q = head;
      while(q.next != null){
          q = q.next;
      }
      newNode.next = q.next;
      q.next = newNode;
  }

}
public void printAll() {
        Node p = head;
        while (p != null) {
            System.out.print(p.value + " ");
            p = p.next;
        }
        System.out.println();
    }
    public void printAll(Node node) {
        Node p = node;
        while (p != null) {
            System.out.print(p.value + " ");
            p = p.next;
        }
        System.out.println();
    }
    class Node{
        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }

        private Node next;
        private int value;
    }
}
