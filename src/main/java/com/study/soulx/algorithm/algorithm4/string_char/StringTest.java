package com.study.soulx.algorithm.algorithm4.string_char;
import edu.princeton.cs.algs4.*;
/**
 * @program: javabase
 * @description: 字符串的处理
 * @author: soulx
 * @create: 2020-03-15 14:01
 **/
public class StringTest {
    /**
    * @Description:
     * @see Alphabet,LSD,MSD,Quick3string
     * @see TrieST,TST
    */
    public static void main(String[] args) {
      //键索引计数法
        String[] s={"she","sea","sells"};
        MD.sort(s);
        System.out.println(s);
    }
}
