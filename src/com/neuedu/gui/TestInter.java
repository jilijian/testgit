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
		System.out.println("������һ���ַ���(�м��ܼӿո�����)");
		String a = input.nextLine();
		System.out.println(a);
		
		try {
			Integer.parseInt(a);
			System.out.println("���ԣ�");
		} catch (NumberFormatException e) {
			System.out.println("������");

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
		System.out.println("�����ǣ�"+c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+c.get(Calendar.DAY_OF_MONTH)+"��");
		
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = new Date();
		System.out.println(sm.format(date));*/
		
	        Scanner sc=new Scanner(System.in);
	        System.out.println("�������ַ�����");
	        String s=sc.next();
	        System.out.println("���������ַ�����");
	        String t=sc.next();
	        
	        int i0=s.length();//�ַ����ĳ���
	        
	        int i1=s.replace(t, "").length();//�ַ��������ַ���ʹ�ÿ��滻��ʣ���ַ����ĳ���
	        
	        int num=(i0-i1)/t.length();//���ַ�����ȥû���滻���ַ����ĳ��ȣ�������滻���ַ������ܳ��ȣ��ٳ�ÿ�����ַ����ĳ��ȣ�����ж��ٸ����ַ���
	        System.out.println("���ַ�������Ϊ��"+num);
	        sc.close();
	}
}
