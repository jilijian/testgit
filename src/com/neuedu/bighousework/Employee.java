package com.neuedu.bighousework;
/**
 * Ա����
 * @author jilijian
 *
 */
public class Employee {

	private int id;
	private String ename;
	
	
	public Employee(int id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}


	public Employee() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	@Override
	public String toString() {
		return "����" + this.id + ", ����=" + this.ename + "]";
	}
	
	
	
}
