package com.neuedu.chapter04.����;

public class DeadLockDemo {
	public static void main(String[] args) {
		Thread_1 t1 = new Thread_1();
		t1.start();
		Thread_2 t2 = new Thread_2();
		t2.start();
	}

	
}
class Thread_1 extends Thread{
	@Override 
	public void run(){
		while(true){
			synchronized ("a") {
				System.out.println("Thread_1�õ���a��");
				synchronized ("b") {
					System.out.println("Thread_1�õ���b��");
				}
			}
		}
	}
}

class Thread_2 extends Thread
{
	@Override
	public void run(){
		while(true){
			synchronized ("b") {
				System.out.println("Thread_2�õ���b��");
				synchronized ("a") {
					System.out.println("Thread_2�õ���a��");
				}
			}
		}
	}
}
