package com.neuedu.chapter06.���ģʽ;

public enum SeansonInfo {

	//���е�ʾ����Ҫ���ŷֿ�����βʱ�÷ֺš�
	SPRING("����","�����"),
	SUMMER("����","�����"),
	FALL("����","����ã�"),
	WINTER("����","�����");
	
	private final String name;
	@Deprecated
	private final String desc;
	
	@Deprecated//���췽����˽�е�
	private SeansonInfo(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
	
	
}
