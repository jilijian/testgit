package com.neuedu.chapter06.���ģʽ;

public class Person {

	private String name;
	public  int age;
	static String desc="�����й���";
	
	public static void info(){
		System.out.println("�����ҷ���ֵ�ķ���info���Ҵ�ӡ���й���");
	}
	
	public void show(String desc){
		System.out.println("���ǣ�" + desc);
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
