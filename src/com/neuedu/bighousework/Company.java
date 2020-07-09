package com.neuedu.bighousework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {

	//存放员工的容器
	public List<Employee> list = new ArrayList<>();
	
	//存放考勤日期及打卡信息的容器
	public Map<String,List<DakaInfo>> map = new HashMap<String,List<DakaInfo>>();
	
	//新增员工
	public void addEmp(Employee emp){
		list.add(emp);
		System.out.println("添加信息成功！！！");
	}
	//删除人员
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
	//查找人员
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
	//显示员工信息
	public void printEmp(){
		for(Employee e:list){
			System.out.println(e);
		}
	}
	
}
