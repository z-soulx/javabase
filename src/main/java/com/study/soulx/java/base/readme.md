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
- 类型擦除带来的一些问题
  - 可在15.8 擦除的补偿中详看。