package com.neuedu.����;

import java.lang.reflect.Field;

import org.junit.Test;

public class Teset {
  @Test
  public void test3() throws Exception{
    Class clazz = Class.forName("com.neuedu.����.Employee");
    Object obj = clazz.newInstance();
    Employee p = (Employee)obj;
    
    //���÷�public������
    //getDeclaredField(name)�����Ĳ�������������
    Field f1 = clazz.getDeclaredField("name");
    f1.setAccessible(true);
    
    //������p��name���Ը�ֵ���൱��p.setName("����")
    f1.set(p, "����");
    System.out.println(f1.get(p));
    System.out.println("����������");
}}