package com.neuedu.chapter06.设计模式;

public class TestWorker {

	private String name;
	public  int age;
	static String desc="我是中国人";
	
	
	public TestWorker(String name, int age) {
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
