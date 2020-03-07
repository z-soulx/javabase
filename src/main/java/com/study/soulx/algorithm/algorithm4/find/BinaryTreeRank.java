package com.study.soulx.algorithm.algorithm4.find;

import edu.princeton.cs.algs4.BST;
import edu.princeton.cs.algs4.Stack;

import java.util.LinkedList;

/**
 * @program: java-base
 * @description: 二叉树的遍历
 * @author: soulx
 * @create: 2020-03-03 09:19
 **/
public class BinaryTreeRank <Key extends Comparable<Key>, Value> {
    private BinaryTreeRank.Node root;             // root of BST

    private class Node {
        private Value data;         // associated data
        private BinaryTreeRank.Node left, right;  // left and right subtrees
        private int size;          // number of nodes in subtree

        public Node( Value val, int size) {
            this.data = val;
            this.size = size;
        }
        public Node( ) {

        }
    }


    //中序遍历

    /**
     * .中序遍历。   非递归中序遍历的思路如下：
     *     1.先将根节点入栈
     *     2.将当前节点的所有左孩子入栈，直到左孩子为空
     *     3.访问栈顶元素，如果栈顶元素存在右孩子，则继续第2步
     *     4.重复第2、3步，直到栈为空并且所有的节点都被访问
     * @param root
     */
    void middleTravelWithoutRecursion(Node root){
        if(root==null) {
            System.out.println("空树");
            return;
        }
        Node tmp=root;
        Stack<Node> s=new Stack<Node>();
        while(tmp!=null || !s.isEmpty()) {
            //1.将根节点入栈
            //2.将所有左孩子入栈
            while(tmp!=null) {
                s.push(tmp);
                tmp=tmp.left;
            }
            //3.访问栈顶元素
            tmp=s.pop();
            System.out.print(tmp.data+" ");
            //4.如果栈顶元素存在右孩子，则将右孩子赋值给tmp，也就是将右孩子入栈
            if(tmp.right!=null) {
                tmp=tmp.right;
            }
            //否则，将tmp置为null，表示下次要访问的是栈顶元素
            else {
                tmp=null;
            }
        }
        System.out.println();

    }
    //

    /**
     * 先序遍历。非递归先序遍历的思路如下：
     *     1.先将根节点入栈
     *     2.访问根节点
     *     3.如果根节点存在右孩子，则将右孩子入栈
     *     4.如果根节点存在左孩子，则将左孩子入栈（注意：一定是右孩子先入栈，然后左孩子入栈）
     *     5.重复2-4
     * @param root
     */
     void beforeTravelWithoutRecursion(Node root){

         if(root==null) {
             System.out.println("空树");
             return;
         }
         Node tmp=root;
         Stack<Node> s=new Stack<Node>();
         s.push(tmp);  //根节点入栈
         while(!s.isEmpty()) {
             //1.访问根节点
             Node p=s.pop();
             System.out.print(p.data+" ");
             //2.如果根节点存在右孩子，则将右孩子入栈
             if(p.right!=null) {
                 s.push(p.right);
             }
             //3.如果根节点存在左孩子，则将左孩子入栈
             if(p.left!=null) {
                 s.push(p.left);
             }
         }
         System.out.println();


    }

    /**
     * 后序遍历。     后续遍历的非递归实现思路：
     *     1.根节点入栈
     *     2.将根节点的左子树入栈，直到最左，没有左孩子为止
     *     3.得到栈顶元素的值，先不访问，判断栈顶元素是否存在右孩子，如果存在并且没有被访问，则将右孩子入栈，否则，就访问栈顶元素
     * @param Root
     */
    public void postOrder(Node Root) {
        if(Root==null) {
            System.out.println("空树");
            return;
        }
        Node tmp=Root;  //当前节点
        Node prev=null; //上一次访问的节点
        Stack<Node> s=new Stack<Node>();
        while(tmp!=null || !s.isEmpty()) {
            //1.将根节点及其左孩子入栈
            while(tmp!=null) {
                s.push(tmp);
                tmp=tmp.left;
            }

            if(!s.isEmpty()) {
                //2.获取栈顶元素值
                tmp=s.peek();
                //3.没有右孩子，或者右孩子已经被访问过
                if(tmp.right==null || tmp.right==prev) {
                    //则可以访问栈顶元素
                    tmp=s.pop();
                    System.out.print(tmp.data+" ");
                    //标记上一次访问的节点
                    prev=tmp;
                    tmp=null;
                }
                //4.存在没有被访问的右孩子
                else {
                    tmp=tmp.right;
                }
            }
        }
        System.out.println();
    }
    //后续2
    public void postOrderTraverse(Node root) {
        Node cur, pre = null;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            cur = stack.peek();
            if ((cur.left == null && cur.right == null) || (pre != null && (pre == cur.left || pre == cur.right))) {
                System.out.print(cur.data + "->");
                stack.pop();
                pre = cur;
            } else {
                if (cur.right != null)
                    stack.push(cur.right);
                if (cur.left != null)
                    stack.push(cur.left);
            }
        }
    }

    /**
     * 层次遍历
     *
     *     与树的前中后序遍历的DFS思想不同，层次遍历用到的是BFS思想。一般DFS用递归去实现（也可以用栈实现），BFS需要用队列去实现。
     * 层次遍历的步骤是：
     *     1.对于不为空的结点，先把该结点加入到队列中
     *     2.从队中拿出结点，如果该结点的左右结点不为空，就分别把左右结点加入到队列中
     *
     *     3.重复以上操作直到队列为空
     * @param biTree
     */
    public  void levelOrder(Node biTree)
    {//层次遍历
        if(biTree == null)
            return;
        LinkedList<Node> list = new LinkedList<Node>();
        list.add(biTree);
        Node currentNode;
        while(!list.isEmpty())
        {
            currentNode = list.poll();
            System.out.println(currentNode.data);
            if(currentNode.left != null)
                list.add(currentNode.left);
            if(currentNode.right != null)
                list.add(currentNode.right);
        }
    }




}
