package com.neuedu.chapter04.ËÀËø;

public class TestTicket {
	  public static void main(String[] args) {
	    TicketThread tt = new TicketThread();
	    
	    Thread t1 = new Thread(tt);
	    Thread t2 = new Thread(tt);
	    Thread t3 = new Thread(tt);
	    
	    t1.start();
	    t2.start();
	    t3.start();
	  }
	  

	}