package com.neuedu.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//�ͻ���
public class B_Client {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			//3.���ӷ�����
			socket = new Socket("127.0.0.1",8888);//localhost 127.0.0.1��ʾ����    Ҳ����д�����IP��ַ
		
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));           //�ַ���  һ��һ���������
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //�ַ���  һ��һ�ж�ȡ����
			while(true)
			{
				//4.��������������Ϣ
				Scanner scanner = new Scanner(System.in);
				System.out.println("�ͻ��ˣ������룺");
				String sendMessage = scanner.nextLine();
				
				writer.println(sendMessage);
				writer.flush();
				
				//�ж�����ͻ�������"exit"����ͻ���׼���˳�
				if("exit".equals(sendMessage))
				{
					break;
				}
				
				//7.���շ�������Ϣ
				String message = reader.readLine();
				System.out.println("�����˵��" + message);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//8.�ر���Դ���ͷ���Դ
			try {
				if(socket != null)
				{
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

