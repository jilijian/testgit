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
			System.out.println("服务器已启动。。。。。。。。。。");
			 s = ss.accept();
			System.out.println("");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			
			
			while(true){
				//接收客户端发送的消息
				String message = reader.readLine();
				System.out.println("客户端说："+message);
				
				//判断客户端是否下线
				if("exit".equals(message)){
					System.out.println("-------------[公告：客户端已下线]");
				}
				
				//给客户端发送消息
				Scanner scanner = new Scanner(System.in);
				System.out.println("服务端，请输入：");
				String sendMessage = scanner.nextLine();
				writer.println(sendMessage);
				writer.flush();
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
