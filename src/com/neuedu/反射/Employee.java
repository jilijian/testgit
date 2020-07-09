package com.neuedu.∑¥…‰;

public class Employee {
    private String ID;
    String name;
    
    
    
    public Employee() {
		super();
	}
	public Employee(String id,String nname) {
      this.ID=id;
      this.name=nname;
    }
    public String toString() {
      return "ID:"+ID+"name:"+name;
    }
	public String getID() {
	 return ID;
	}
	public void setID(String iD) {
	 ID = iD;
	}
	public String getName() {
	 return name;
	}
	public void setName(String name) {
	 this.name = name;
	}
}
