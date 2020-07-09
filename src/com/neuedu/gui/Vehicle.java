package com.neuedu.gui;

public class Vehicle {

	private String  brand="benz";
	private String color;
	private double speed=0;
	
	
	public Vehicle(String  brand,String color,double speed){
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}
	
	public void run(){
		System.out.println("这是一台"+brand+"轿车"+"颜色是："+color);
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
	
}
