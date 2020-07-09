package com.neuedu.homework0702;

import java.util.Scanner;

public class 字符串中有几个子字符串 {

	public static void main(String[] args) {
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
