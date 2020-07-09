package com.neuedu.chapter06.设计模式;

public enum SeansonInfo {

	//所有的示例都要逗号分开，结尾时用分号。
	SPRING("春天","春天好"),
	SUMMER("先天","夏天好"),
	FALL("秋天","秋天好！"),
	WINTER("冬天","冬天好");
	
	private final String name;
	@Deprecated
	private final String desc;
	
	@Deprecated//构造方法是私有的
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
