package com.neuedu.chapter06.设计模式;

interface Target{
	public void request();
}
//适配者接口
class Adapter{
	public void specificRequest(){
		System.out.println("适配者中的业务代码被调用！");
	}
}

//适配器类
class ClassAdapter extends Adapter implements Target{
	public void request(){
		specificRequest();
	}
}


public class ClassAdapterTest {
	public static void main(String[] args) {
		System.out.println("类适配器模式测试：");
		Target target = new ClassAdapter();
		target.request();
	}
}
