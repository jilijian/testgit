package com.neuedu.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClinetDemo {

	public static void main(String[] args) {
		Socket s = null;
		try {
			//���ӷ�����
			s = new Socket("127.0.0.1",8888);
			System.out.println("���ӷ�������"+s.getInetAddress()+"port��"+s.getPort());
			
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			while(true){
				//������˷�����Ϣ
				Scanner scanner = new Scanner(System.in);
				System.out.println("�ͻ��ˣ������룺");
				String sendMessage = scanner.nextLine();
				writer.println(sendMessage);
				writer.flush();
				
				//�ж�����ͻ������롰exit",��ʾ�ͻ���׼���˳�
				if("exit".equals(sendMessage)){
					break;
				}
				
				//���շ�������Ϣ
				String message = reader.readLine();
				System.out.println("�����˵��"+message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//�ر���Դ���ͷ���Դ
			try {
				if(s!=null){
					s.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
