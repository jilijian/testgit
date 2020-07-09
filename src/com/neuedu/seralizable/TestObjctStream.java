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
			//����������
			FileInputStream in = new FileInputStream("d:/io/person.txt");
			input = new ObjectInputStream(in);
			
			//��ȡ����
	/*		Person jinquanClone = (Person)input.readObject();
			System.out.println(jinquanClone.toString());*/
			//ʹ�÷����л�������ѭ������ӡ�ļ��е�����
	        while (in.available() > 0){//�����ļ��л�������
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
			//�ر���Դ
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
			
			//��������person����
			Person pe = new Person("tom", 18, "��");
			Person pe2 = new Person("mary", 20, "Ů");
			
			//����ObjectOutPutStream��writeObject�������������л�
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
