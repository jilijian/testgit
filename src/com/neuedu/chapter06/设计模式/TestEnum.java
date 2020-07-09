package com.neuedu.chapter06.设计模式;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//单个引用枚举值
		SeansonInfo seson = SeansonInfo.FALL;
		System.out.println(seson.getName()+" :"+seson.getDesc());
		
		//获取所有的枚举值
		SeansonInfo[] info = SeansonInfo.values();
		for (SeansonInfo seansonInfo : info) {
			System.out.println(seansonInfo.getName()+" "+seansonInfo.getDesc());
		}
	}

}
