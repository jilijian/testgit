package com.neuedu.gui;

import java.util.Scanner;

public class TestInter {
	public static void main(String[] args) {
		/*int a1 = 10;
		int a2 =10;
		System.out.println(a1==a2);
		
		Integer b1 = 10;
		Integer b2 =10;
		System.out.println(b1 ==b2);
		
		Integer c1 = new Integer(10);
		Integer c2 = new Integer(10);
		
		System.out.println(c1 == c2);*/
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("请输入一个字符串(中间能加空格或符号)");
		String a = input.nextLine();
		System.out.println(a);
		
		try {
			Integer.parseInt(a);
			System.out.println("可以！");
		} catch (NumberFormatException e) {
			System.out.println("不可以");

		}	*/
		
		
		/*StringBuffer sb = new StringBuffer();
		sb.append("tom");
		
		System.out.println(sb.hashCode());
		
		sb.append("123");
		
		System.out.println(sb.hashCode());*/
		
		
		
		/*for(int i=0;i<5;i++){
			Double a = Math.random()*50;
			System.out.println(Math.round(a));
		}*/
		
		/*Calendar c =  Calendar.getInstance();
		System.out.println("今天是："+c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
		
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = new Date();
		System.out.println(sm.format(date));*/
		
	        Scanner sc=new Scanner(System.in);
	        System.out.println("请输入字符串：");
	        String s=sc.next();
	        System.out.println("请输入子字符串：");
	        String t=sc.next();
	        
	        int i0=s.length();//字符串的长度
	        
	        int i1=s.replace(t, "").length();//字符串被子字符串使用空替换后剩余字符串的长度
	        
	        int num=(i0-i1)/t.length();//用字符串减去没被替换的字符串的长度，求出被替换的字符串的总长度，再除每个子字符串的长度，求出有多少个子字符。
	        System.out.println("子字符串个数为："+num);
	        sc.close();
	}
}
