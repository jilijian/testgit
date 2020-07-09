package com.neuedu.gui;

public class TestVehicle {

	public static void main(String[] args) {
		try{
			badMethod();
			System.out.println("a");
		}catch(RuntimeException ex){
			System.out.println("B");
		}catch(Exception ex){
			System.out.println("C");
		}finally{
			System.out.println("D");
		}
		System.out.println("E");
	}

	public static void badMethod(){
		throw new RuntimeException();
	}
}
