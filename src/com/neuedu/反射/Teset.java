package com.neuedu.反射;

import java.lang.reflect.Field;

import org.junit.Test;

public class Teset {
  @Test
  public void test3() throws Exception{
    Class clazz = Class.forName("com.neuedu.反射.Employee");
    Object obj = clazz.newInstance();
    Employee p = (Employee)obj;
    
    //调用非public的属性
    //getDeclaredField(name)方法的参数是属性名字
    Field f1 = clazz.getDeclaredField("name");
    f1.setAccessible(true);
    
    //给对象p的name属性赋值，相当于p.setName("张三")
    f1.set(p, "张三");
    System.out.println(f1.get(p));
    System.out.println("！！！！！");
}}