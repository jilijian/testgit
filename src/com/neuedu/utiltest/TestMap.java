package com.neuedu.utiltest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		Person p1 = new Person("nana");
		Person p2 = new Person("lili");
		Person p3 = new Person("xiaoming");
		Person p4 = new Person("xiaofang");
		/*List<String> list1 = new ArrayList();
		list1.add(2);*/
		map.put(null, "two");
		map.put(null, "three");
		map.put("1","one");
		System.out.println("map =="+map.get(null));
		System.out.println("map1 = "+map.get("1"));
		/*map.put("1", p1);
		map.put("2", p2);
		map.put("3", p3);
		map.put("4", p4);
		
		Set s1 = map.keySet();
		
		Iterator it = s1.iterator();
		while(it.hasNext()){
			Object o = it.next();
			//System.out.println(o);
			Person p = (Person) map.get(o);
			System.out.println(p.getName());
		}*/
		
		
		List<Person> list = new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		for(int i=0;i<list.size();i++){
			Person p = list.get(i);
			System.out.println(p.getName());
		}
	}

}
