package com.neuedu.homework0702;

import java.util.Scanner;

public class �ַ������м������ַ��� {

	public static void main(String[] args) {
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
