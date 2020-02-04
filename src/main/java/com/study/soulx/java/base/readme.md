# java概念基础
 笔记：有道云内笔记-补充
### 内部类

- 公共类和借口只有public和default两种修饰
- 内部类和镶嵌类区别
  - 内部类没有static，镶嵌全都可以。
- private static意义
  - 只有自己能使用这个jvm启动的时候就加载进来的方法或者变量。
### RTTI运行时类型信息
- 类字面常量and 编译期常量都是会加载类，链接和初始化没有执行。
  - 注意(坑点)：测试如果直接控制台输出，一些基本类型会触发初始化。
  ```
  System.out.println(XxClass.i);//i是int 会触发初始化
  int i = XxClass.i；
  System.out.println(i) //这样就没事
  ```
- 反射
  - 反射修改final域，不会报错但是不会发生改变
### 范型  
- 类型擦除带来的一些问题
  - p380
- 捕获类型参数 需要?的未知参数，T表示确切类型
  - p399  
### I/O
- io的缓冲区和nio的缓冲区区别？
  - 这些类在不同时间为不同的包写入。如果您正在使用java.io包中的类，请使用BufferedInputStream。如果您使用的是java.nio，请使用ByteBuffer。
  - io在适用缓冲区情况下，nio并没有**明显**速度上的优势。(特别是io重写后)
  - 性能 p564
- 序列化
  - static序列化必须手动实现。p584 