package com.neuedu.utiltest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set set = new HashSet();//…œÀ›‘Ï–Õ
		set.add(123);
		set.add(456);
		set.add("abc");
		
		Person p = new Person("tom");
		set.add(p);
		set.add("abc");
		/*System.out.println(set);*/
		
		set.remove(p);//remove
		/*System.out.println(set);
		
		System.out.println(set.size());//size
		
		System.out.println(set.isEmpty());//isEmpty()
		
		System.out.println(set.contains(p));//contains()
*/		
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object  o = it.next();
			System.out.println(o);
		}
		
	}
}
