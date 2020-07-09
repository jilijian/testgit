package com.neuedu.chapter05.student;


import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Socket s=null;
    try {
      s=new Socket("127.0.0.1",8888);
      System.out.println("����������"+s.getInetAddress().getHostAddress());
      System.out.println("�ͻ��˶˿ں�"+s.getPort());
      Scanner sc=new Scanner(System.in);
      System.out.println("������Ϣ��");
      String st=sc.nextLine();
      PrintWriter out =new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
      out.write(st);
      out.flush();
    } catch (UnknownHostException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}