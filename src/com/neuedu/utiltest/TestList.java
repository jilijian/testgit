package com.neuedu.utiltest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List list = new ArrayList();//上溯造型
		list.add(123);
		list.add(456);
		list.add("abc");
		
		Person p = new Person("tom");
		list.add(p.getName());
		list.add("abc");
		/*System.out.println(list);*/
		
		list.add(0, "hello");
		list.remove(p.getName());//remove
		/*System.out.println(list);
		
		System.out.println(list.size());//size
		
		System.out.println(list.isEmpty());//isEmpty()
		
		System.out.println(list.contains(p));//contains()
		
		System.out.println(list.get(2));//按照下标来获取
*/
		Iterator it = list.iterator();
		
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}
	}

}
