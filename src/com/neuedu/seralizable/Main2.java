package com.neuedu.seralizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("d:/io/1.txt");
			ois=new ObjectInputStream(fis);
			Object o=null;
			while((o=ois.readObject())!=null) {
				ColaEmployee c=(ColaEmployee) o;
				System.out.println(c.toString());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		try {
			if(fis!=null)
				fis.close();
			if(ois!=null)
				ois.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
	}
}
