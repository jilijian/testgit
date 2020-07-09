package com.neuedu.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		try {
			 ss = new ServerSocket(8888);
			System.out.println("��������������������������������");
			 s = ss.accept();
			System.out.println("");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			
			
			while(true){
				//���տͻ��˷��͵���Ϣ
				String message = reader.readLine();
				System.out.println("�ͻ���˵��"+message);
				
				//�жϿͻ����Ƿ�����
				if("exit".equals(message)){
					System.out.println("-------------[���棺�ͻ���������]");
				}
				
				//���ͻ��˷�����Ϣ
				Scanner scanner = new Scanner(System.in);
				System.out.println("����ˣ������룺");
				String sendMessage = scanner.nextLine();
				writer.println(sendMessage);
				writer.flush();
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
			
			try {
				if(ss!=null){
					ss.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
