package com.study.soulx.algorithm.algorithm4.map;
import edu.princeton.cs.algs4.*;
/**
 * @program: javabase
 * @description: 图的学习
 * @author: soulx
 * @create: 2020-03-07 17:34
 **/
public class MyGraph {
    /** 无向图
     * @see Graph,DepthFirstSearch,DepthFirstPaths,BreadthFirstPaths
     * @see CC //找出一幅图的所有连通分量(基于dfs)
     * @see SymbolGraph,DegreesOfSeparation
     *  有向图
     *  方法和无向基本相似
     * @see Digraph,SymbolDigraph,DirectedDFS,DepthFirstDirectedPaths,BreadthFirstDirectedPaths
     * @see DirectedCycle,Topological,DepthFirstOrder
     * @see KosarajuSharirSCC,TransitiveClosure
     *
     * 加权
     * @see EdgeWeightedGraph,LazyPrimMST,PrimMST,KruskalMST
     * @see DirectedEdge,EdgeWeightedDigraph,DijkstraSP,AcyclicSP,AcyclicLP,CPM
     */
    public static void main(String[] args) {

    }
    // 环检测
    private boolean[] marked; //标记是否访问过
    private boolean isCycle ;
    public void cycle(Graph G){
        marked = new boolean[G.V()];
        for(int s =0;s<G.V();s++){
            if(!marked[s]){
                cycleDFS(G,s,s);
            }
        }
    }
    private void cycleDFS(Graph G,int v,int pre){
        marked[v] = true;
        for(int w:G.adj(v)){
            if(!marked[w]){
                cycleDFS(G,w,v);
            }else {
                if(w!=pre) isCycle= true;
            }
        }
    }

    // 双色球
    private boolean isTwoColor = true;
    private boolean[] color;
    public void twoColor(Graph G){
        marked = new boolean[G.V()];
        color = new boolean[G.V()];
        for(int s =0;s<G.V();s++){
            if(!marked[s]){
                twoColorDFS(G,s);
            }
        }
    }
    private void twoColorDFS(Graph G, int v) {
        marked[v] = true;
        for(int w:G.adj(v) ){
            if(!marked[w]){
                color[w]=!color[v];
                twoColorDFS(G,w);
            }else {
                if(color[w]==color[v]) isTwoColor=false;
            }
        }
    }
}
