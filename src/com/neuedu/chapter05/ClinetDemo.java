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
			//连接服务器
			s = new Socket("127.0.0.1",8888);
			System.out.println("连接服务器："+s.getInetAddress()+"port："+s.getPort());
			
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			while(true){
				//给服务端发送消息
				Scanner scanner = new Scanner(System.in);
				System.out.println("客户端，请输入：");
				String sendMessage = scanner.nextLine();
				writer.println(sendMessage);
				writer.flush();
				
				//判断如果客户端输入“exit",表示客户端准备退出
				if("exit".equals(sendMessage)){
					break;
				}
				
				//接收服务器消息
				String message = reader.readLine();
				System.out.println("服务端说："+message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//关闭资源，释放资源
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
