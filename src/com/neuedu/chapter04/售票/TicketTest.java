package com.neuedu.chapter04.ÊÛÆ±;

public class TicketTest {

	public static void main(String[] args) {
		/*ThreadTicket t1 = new ThreadTicket();
		t1.setName("ÄÈÄÈ");
		t1.start();
		ThreadTicket t2 = new ThreadTicket();
		t2.setName("ÀöÀö");
		t2.start();*/
		
		RunableTicket ticket = new RunableTicket();
		Thread t3 = new Thread(ticket);
		t3.setName("jiji");
		t3.start();
		
		Thread t4 = new Thread(ticket);
		t4.setName("xiaohua");
		t4.start();
		

	}

}
