package com.neuedu.chapter04.��Ʊ;

public class RunableTicket implements Runnable{

	private int num = 50;
	@Override
	public void run() {
		while(num>0){
			synchronized (this) {
				if(num>0){
					System.out.println("��ƱԱ��"+Thread.currentThread().getName()+"�����۳���ƱNO."+num);
					num --;
				}
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
