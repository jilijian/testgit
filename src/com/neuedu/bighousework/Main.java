package com.neuedu.bighousework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 主程序
 * @author jilijian
 *
 */
public class Main {

	static Company c = new Company();
	
	//签到
	public static void qianDao(int id){
		Employee e = c.searchEmp(id);
		if(e!=null){
			//获取当前的系统时间
			Date d  = new Date();
			String strDate = new SimpleDateFormat("yyyy-MM-dd").format(d);
			//获取考勤信息
			List<DakaInfo> list = c.map.get(strDate);
			
			//判断该员工是否已经打过卡
			if(list!=null && list.isEmpty() == false){
				for(DakaInfo dk: list){
					if(dk.id == id){
						System.out.println("今天已经打过卡了");
						return;
					}
				}
				//初始化打卡信息
				DakaInfo dk = new DakaInfo();
				dk.id = e.getId();
				dk.qdTime = d;
				list.add(dk);
			}else{
				//记录打卡信息
				DakaInfo dk = new DakaInfo();
				dk.id = e.getId();
				dk.qdTime = d;
				list = new ArrayList<DakaInfo>();
				list.add(dk);
				c.map.put(strDate, list);
			}
			System.out.println("工号："+id+"打卡成功");
		}else{
			System.out.println("无此ID员工");
		}
	}
	
	//签退
	public static void qianTui(int id){
		Employee e = c.searchEmp(id);
		if(e!=null){
			//获取系统当前时间
			Date d = new Date();
			String strDate = new SimpleDateFormat("yyyy-MM-dd").format(d);
			List<DakaInfo> list = c.map.get(strDate);
			if(list !=null && list.isEmpty() == false){
				boolean flag = true;
				//判断员工是否有签退
				for(DakaInfo dk:list){
					if(dk.id == id){
						dk.qtTime = d;
						flag = false;
						break;
					}
				}
				if(flag == false){
					System.out.println("签退成功");
				}else{
					System.out.println("今天还没有签到，无法签退");
				}
			}else{
				System.out.println("今天还没有签到，无法签退");
			}
		}else{
			System.out.println("无此ID员工");
		}
	}
	
	//查看
	public static void showInfo(){
		Date d = new Date();
		String strDate = new SimpleDateFormat("yyyy-MM-dd").format(d);
		List<DakaInfo> list = c.map.get(strDate);
		if(list !=null && list.isEmpty() == false){
			for(DakaInfo dk :list){
				int id = dk.id;
				Employee e = c.searchEmp(id);
				System.out.println("工号为："+e.getId()+"姓名："+e.getEname());
				System.out.println("签到时间为："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dk.qdTime));
				try {
					System.out.println("签退时间为："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dk.qtTime));
				} catch (NullPointerException e2) {
					System.out.println("签退时间为无记录");
				}
				
			}
		}else{
			System.out.println("今天暂时没有打卡信息。");
		}
	}
	public static void main(String[] args) {
		c.addEmp(new Employee(1111,"张三"));
		c.addEmp(new Employee(1112,"李四"));
		c.addEmp(new Employee(1113,"王五"));
		c.addEmp(new Employee(1114,"赵六"));
		c.addEmp(new Employee(1115,"田七"));
		
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.println("-------------员工打卡系统-------------");
			System.out.println("0-------------退出");
			System.out.println("1-------------签到");
			System.out.println("2-------------签退");
			System.out.println("3-------------查看签到信息");
			System.out.println("请输入想执行的操作：");
			int n = scan.nextInt();
			
			if(n==0){
				System.out.println("已退出");
				break;
			}
			
			switch(n){
			case 1:
				System.out.println("请输入签到的员工ID:");
				int id1 = scan.nextInt();
				qianDao(id1);
				break;
			case 2:
				System.out.println("请输入签到的员工ID:");
				int id2 = scan.nextInt();
				qianTui(id2);
				break;
			case 3:
				showInfo();
				break;
			default:
				break;
			}
		}
	}

}
