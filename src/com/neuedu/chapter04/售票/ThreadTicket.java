package com.neuedu.chapter04.��Ʊ;

public class ThreadTicket extends Thread {

	private int num = 50;
	
	@Override
	public void run(){
		while(num>0){
			System.out.println("��ƱԱ��"+Thread.currentThread().getName()+"�����۳���ƱNO."+num);
			num --;
		}
	}
}
