package com.neuedu.chapter04;

public class RunableDemo implements Runnable{

	@Override
	public void run() {
		for (int i = 6; i <=10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
	
}
