package com.neuedu.seralizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjctStream {

	public static void main(String[] args) {

		//serialize();

		reserialize();
	}

	private static void reserialize() {
		ObjectInputStream input = null;
		try {
			//对象输入流
			FileInputStream in = new FileInputStream("d:/io/person.txt");
			input = new ObjectInputStream(in);
			
			//读取对象
	/*		Person jinquanClone = (Person)input.readObject();
			System.out.println(jinquanClone.toString());*/
			//使用反序列化流利用循环来打印文件中的内容
	        while (in.available() > 0){//代表文件中还有内容
	            Object obj = input.readObject();
	            Person p = (Person) obj;
	            System.out.println(p.toString());
	        }

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			try {
				if(input != null)
				{
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void serialize() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			
			fos = new FileOutputStream("d:/io/person.txt");
			oos = new ObjectOutputStream(fos);
			
			//定义两个person对象
			Person pe = new Person("tom", 18, "男");
			Person pe2 = new Person("mary", 20, "女");
			
			//调用ObjectOutPutStream的writeObject方法，进行序列化
			oos.writeObject(pe);
			oos.writeObject(pe2);
			
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(oos!=null){
					
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
