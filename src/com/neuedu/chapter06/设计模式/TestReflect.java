package com.neuedu.chapter06.���ģʽ;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class TestReflect {

	
	//����ָ���ķ���
	@Test
	public void test4() throws Exception{
		Class clazz = Class.forName("com.neuedu.chapter06.���ģʽ.Person");
		Object obj = clazz.newInstance();
		Person p = (Person)obj;
		
		//���÷�public�ķ���
		Method m1 = clazz.getDeclaredMethod("getAge");
		m1.setAccessible(true);
		int age = (Integer)m1.invoke(p);
		System.out.println(age);
		
		//����public�ķ���
		Method m2 = clazz.getMethod("show", String.class);
		//p.show("�ط�����")
		Object returnVal = m2.invoke(p,"�ط�����");
		System.out.println(returnVal);
		//����static�ķ���
		Method m3 = clazz.getDeclaredMethod("info");
		m3.setAccessible(true);
//		m3.invoke(Person.class);
//		m3.invoke(p);
		m3.invoke(null);
		Object returnVal1 = m3.invoke("�ط�����");
		System.out.println("m3���ؽ����"+returnVal1);
	}
	
	
	/*@Test
	public void test2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException{
		Class lazz = Class.forName("com.neuedu.chapter06.���ģʽ.Person");
		Object obj = lazz.newInstance();
		Person p = (Person) obj;
		
		//����private����
		Field f1 = lazz.getDeclaredField("name");
		f1.setAccessible(true);
		f1.set(p, "����");
		
		//����public����
		Field f2 = lazz.getField("age");
		f2.set(p, 16);
		System.out.println(p);
		
		//����static����
		Field f3 = lazz.getDeclaredField("desc");
		f3.set(p, "�����й���");
		System.out.println(p.desc);
	}*/
			

	/*@Test
	public void test2() throws Exception{
		Class clazz = Person.class;
		Constructor cons = clazz.getDeclaredConstructor(String.class,int.class);
		cons.setAccessible(true);
		Person p = (Person) cons.newInstance("Tom",20);
		System.out.println(p.getName());
		System.out.println(p.age);
		
	}*/
}
