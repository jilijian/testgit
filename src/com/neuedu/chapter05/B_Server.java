package com.neuedu.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//������
public class B_Server {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		try {
			//1.����������
			ss = new ServerSocket(8888);
			System.out.println("������������....");
			
			//2.�ȴ��ͻ�������
			socket = ss.accept();//����ʽ��ʽ��ֱ���ͻ������ӽ���������������ܼ���ִ��
			System.out.println("���µĿͻ������ӽ���........" + socket.getInetAddress() + ":" + socket.getPort());
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));   //�ַ���  һ��һ�ж�ȡ����
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream())); //�ַ���  һ��һ���������
			while(true)
			{
				//5.���տͻ��˷��͵���Ϣ
				String message = reader.readLine();
				System.out.println("�ͻ���˵��" + message);
				
				//�жϿͻ����Ƿ�����
				if("exit".equals(message))
				{
					System.out.println("----------�����棺�ͻ��������ߡ�-----------------");
				}
				
				//6.���ͻ��˷�����Ϣ
				Scanner scanner = new Scanner(System.in);
				System.out.println("����ˣ������룺");
				String sendMessage = scanner.nextLine();
				
				writer.println(sendMessage);
				writer.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			//8.�ر���Դ���ͷ���Դ
			try {
				if(socket != null)
				{
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(ss != null)
				{
					ss.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
