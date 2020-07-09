package com.neuedu.chapter04;

public class TestThread {

	public static void main(String[] args) {
		
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		
		ThreadDemo t2 = new ThreadDemo();
		t2.start();
		
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
}
