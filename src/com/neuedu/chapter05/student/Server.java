package com.neuedu.chapter05.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    BufferedReader br = null;
    ServerSocket ss=null;
    Socket s= null;
    try {
    	ss = new ServerSocket(8888);
		System.out.println("服务器已启动。。。。。。。。。。");
		 s = ss.accept();
      System.out.println("客服端IP："+s.getInetAddress().getHostAddress());
      System.out.println("客户端接口："+s.getPort());
     /* br =new BufferedReader (
          new InputStreamReader(s.getInputStream()));
      String bbr=br.readLine();
      System.out.println("客户端发来消息："+bbr);*/
      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally {
      if(br!=null) {
        try {
          br.close();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      if(ss!=null) {
        try {
          ss.close();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    }

  }

}
