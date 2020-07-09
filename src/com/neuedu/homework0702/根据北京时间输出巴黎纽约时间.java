package com.neuedu.homework0702;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class 根据北京时间输出巴黎纽约时间 {

	
	public static void method1() throws ParseException{

		Scanner sc=new Scanner(System.in);

		System.out.println("请输入北京时间");

		String a=sc.nextLine();

		//字符串转化日期格式

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH-mm-ss");

		Date d = sdf.parse(a);

		//获取Calendar对象实例

		Calendar c = Calendar.getInstance();

		c.setTime(d);

		//巴黎

		c.add(Calendar.HOUR_OF_DAY,-7);

		System.out.println("巴黎时间："+c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日    "+c.get(Calendar.HOUR_OF_DAY)+"-"+c.get(Calendar.MINUTE)+"-"+c.get(Calendar.SECOND));

		//纽约

		c.add(Calendar.HOUR_OF_DAY,-5);

		System.out.println("纽约时间："+c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日    "+c.get(Calendar.HOUR_OF_DAY)+"-"+c.get(Calendar.MINUTE)+"-"+c.get(Calendar.SECOND));

		}
	
	public static void main(String[] args) throws ParseException {
		method1();

	}

}
