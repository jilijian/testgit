package com.neuedu.chapter06.���ģʽ;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//��������ö��ֵ
		SeansonInfo seson = SeansonInfo.FALL;
		System.out.println(seson.getName()+" :"+seson.getDesc());
		
		//��ȡ���е�ö��ֵ
		SeansonInfo[] info = SeansonInfo.values();
		for (SeansonInfo seansonInfo : info) {
			System.out.println(seansonInfo.getName()+" "+seansonInfo.getDesc());
		}
	}

}
