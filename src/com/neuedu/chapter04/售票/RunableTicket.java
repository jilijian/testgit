package com.neuedu.chapter04.售票;

public class RunableTicket implements Runnable{

	private int num = 50;
	@Override
	public void run() {
		while(num>0){
			synchronized (this) {
				if(num>0){
					System.out.println("售票员【"+Thread.currentThread().getName()+"】，售出了票NO."+num);
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
