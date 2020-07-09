package com.neuedu.chapter06.设计模式;

public class Person {

	private String name;
	public  int age;
	static String desc="我是中国人";
	
	public static void info(){
		System.out.println("我是我返回值的方法info：我打印出中国人");
	}
	
	public void show(String desc){
		System.out.println("我是：" + desc);
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	public Person() {
		super();
	}


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
}
