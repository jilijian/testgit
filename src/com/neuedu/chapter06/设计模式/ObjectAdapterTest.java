package com.neuedu.chapter06.���ģʽ;

public class ObjectAdapterTest {

	public static void main(String[] args) {
		System.out.println("����������ģʽ���ԣ�");
		Adapter adapter = new Adapter();
		Target target = new ObjectAdapter(adapter);
		target.request();
	}

}
