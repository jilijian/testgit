package com.neuedu.chapter06.���ģʽ;

interface Target{
	public void request();
}
//�����߽ӿ�
class Adapter{
	public void specificRequest(){
		System.out.println("�������е�ҵ����뱻���ã�");
	}
}

//��������
class ClassAdapter extends Adapter implements Target{
	public void request(){
		specificRequest();
	}
}


public class ClassAdapterTest {
	public static void main(String[] args) {
		System.out.println("��������ģʽ���ԣ�");
		Target target = new ClassAdapter();
		target.request();
	}
}
