package com.study.soulx.algorithm.algorithm4.base;

import edu.princeton.cs.algs4.*;

/**
 * @program: javabase
 * @description: 归并-查找  动态连通性问题
 * @see  UF 官方案例
 * @author: soulx
 * @create: 2020-02-22 17:05
 **/
interface UFInterFace{
    void union(int p,int q);//p,q连接
    int find(int p);//找到p所在分量标识
    boolean connected(int p,int q);//判断pq是否连通
    int cont();//连通分量个数
}
public class UnionFind implements UFInterFace{
    /**
    * {@link QuickUnionUF}, {@link QuickFindUF}, and {@link WeightedQuickUnionUF}.
    */
    public static void main(String[] args) {
      //有三种不同的实现
        //1 所有同一连通分量的标识值相同，快查 会扫描整个表
        //2 快速归并 直接改连通标识值为对方即可 等于本身截止
        //3 在快速归并的基础上修改 加权快并 添加数组记录树中节点数
        //UF 是路径压缩的加权快并 其中union方法的实现和书中的不一样，但个人推荐3的实现
    }
  private int[] id;//分量id
    private int count;//分量个数
    @Override
    public void union(int p, int q) {

    }

    @Override
    public int find(int p) {
        return 0;
    }

    @Override
    public boolean connected(int p, int q) {
        return false;
    }

    @Override
    public int cont() {
        return 0;
    }
}
