package com.neuedu.chapter06.设计模式;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class TestReflect {

	
	//调用指定的方法
	@Test
	public void test4() throws Exception{
		Class clazz = Class.forName("com.neuedu.chapter06.设计模式.Person");
		Object obj = clazz.newInstance();
		Person p = (Person)obj;
		
		//调用非public的方法
		Method m1 = clazz.getDeclaredMethod("getAge");
		m1.setAccessible(true);
		int age = (Integer)m1.invoke(p);
		System.out.println(age);
		
		//调用public的方法
		Method m2 = clazz.getMethod("show", String.class);
		//p.show("守法公民")
		Object returnVal = m2.invoke(p,"守法公民");
		System.out.println(returnVal);
		//调用static的方法
		Method m3 = clazz.getDeclaredMethod("info");
		m3.setAccessible(true);
//		m3.invoke(Person.class);
//		m3.invoke(p);
		m3.invoke(null);
		Object returnVal1 = m3.invoke("守法公民");
		System.out.println("m3返回结果："+returnVal1);
	}
	
	
	/*@Test
	public void test2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException{
		Class lazz = Class.forName("com.neuedu.chapter06.设计模式.Person");
		Object obj = lazz.newInstance();
		Person p = (Person) obj;
		
		//调用private属性
		Field f1 = lazz.getDeclaredField("name");
		f1.setAccessible(true);
		f1.set(p, "张三");
		
		//调用public属性
		Field f2 = lazz.getField("age");
		f2.set(p, 16);
		System.out.println(p);
		
		//调用static属性
		Field f3 = lazz.getDeclaredField("desc");
		f3.set(p, "我是中国人");
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
