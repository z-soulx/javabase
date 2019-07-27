package com.study.soulx.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * soulx
 * 反射demo
 * 1 获取class的三种方式：类,class  实例类.getClass  Class.forName()
 * 2 Class.forName(name, initialize, loader)带参函数也可控制是否加载static块。
 *     详情see笔记java基础中jvm 类加载
 */
public class Demo  {
    private int id;
    private String dd;

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        new Demo().tes();
    }
    /**
    * @Description: 测试反射
    * @Param:
    * @return:
    * @Author: soulx
    * @Date: 2019/7/27
    */
   public void tes() throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
       Class<Demo> demoClass = Demo.class;
       //反射获取字段
       Field[] fields = demoClass.getDeclaredFields();
       //设立实际类型对象，对其进行赋值。
       Object o = new Integer(1);
       Object o2 = new String("1");
       // 通过反射获取所有的方法。
       Method[] declaredMethods = demoClass.getDeclaredMethods();
       //通过方法名获取
       Method declaredMethod = demoClass.getDeclaredMethod("setId",fields[0].getType());
       for(Field field : fields){
           String name = field.getName();
           Method method = demoClass.getMethod("set" + name.substring(0, 1).toUpperCase()+name.substring(1),field.getType());
          if(field.getName().equals("id")){
              method.invoke(this,o );
          }else {
              method.invoke(this,o2);
          }

       }

//       ConvertUtils.convert(o,type);

       System.out.println(getId()+"===="+getDd());
   }
    public int getId() {
        return id;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public void setId(int id) {
        this.id =  id;
    }
}
