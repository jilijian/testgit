package com.neuedu.bighousework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {

	//���Ա��������
	public List<Employee> list = new ArrayList<>();
	
	//��ſ������ڼ�����Ϣ������
	public Map<String,List<DakaInfo>> map = new HashMap<String,List<DakaInfo>>();
	
	//����Ա��
	public void addEmp(Employee emp){
		list.add(emp);
		System.out.println("�����Ϣ�ɹ�������");
	}
	//ɾ����Ա
	public void deleteEmp(int id){
		int index = -1;
		int i=0;
		for(Employee e:list){
			index = i;
			if(e.getId()==id){
				list.remove(index);
				break;
			}
			i++;
		}
	}
	//������Ա
	public Employee searchEmp(int id){
		int index = -1;
		int i=0;
		for(Employee e:list){
			index = i;
			if(e.getId()==id){
				return list.get(index);
			}
			i++;
		}
		return null;
	}
	//��ʾԱ����Ϣ
	public void printEmp(){
		for(Employee e:list){
			System.out.println(e);
		}
	}
	
}
