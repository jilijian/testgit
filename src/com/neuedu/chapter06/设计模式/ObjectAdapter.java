package com.neuedu.chapter06.���ģʽ;

public class ObjectAdapter implements Target {

	private Adapter adapter;
	public ObjectAdapter(Adapter adapter){
		this.adapter = adapter;
	}
	@Override
	public void request() {
		adapter.specificRequest();
	}

}
