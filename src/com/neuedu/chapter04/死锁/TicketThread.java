package com.neuedu.chapter04.����;

public class TicketThread implements Runnable{
	  private int num=50;
	  
	  public synchronized void saleTicket() {
	    
	    if(num >0) {
	      System.out.println(Thread.currentThread().getName());
	      num--;
	      
	      try {
	        Thread.sleep(100);
	      } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	  }
	  
	  public void run() {
	    while(true) {
	      
	      if(num >0) {
	        this.saleTicket();
	      }else {
	        break;
	      }
	    }
	  }

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub

	  }

	}
