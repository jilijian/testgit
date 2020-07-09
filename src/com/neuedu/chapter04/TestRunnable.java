package com.neuedu.chapter04;

public class TestRunnable {

	public static void main(String[] args) {
	
		RunableDemo runnableDemo = new RunableDemo();
		
		Thread t3 = new Thread(runnableDemo);
		
		t3.start();
		
		Thread t4 = new Thread(runnableDemo);
		
		t4.start();
		
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}

	}

}
