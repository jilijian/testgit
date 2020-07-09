package com.neuedu.bighousework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * ������
 * @author jilijian
 *
 */
public class Main {

	static Company c = new Company();
	
	//ǩ��
	public static void qianDao(int id){
		Employee e = c.searchEmp(id);
		if(e!=null){
			//��ȡ��ǰ��ϵͳʱ��
			Date d  = new Date();
			String strDate = new SimpleDateFormat("yyyy-MM-dd").format(d);
			//��ȡ������Ϣ
			List<DakaInfo> list = c.map.get(strDate);
			
			//�жϸ�Ա���Ƿ��Ѿ������
			if(list!=null && list.isEmpty() == false){
				for(DakaInfo dk: list){
					if(dk.id == id){
						System.out.println("�����Ѿ��������");
						return;
					}
				}
				//��ʼ������Ϣ
				DakaInfo dk = new DakaInfo();
				dk.id = e.getId();
				dk.qdTime = d;
				list.add(dk);
			}else{
				//��¼����Ϣ
				DakaInfo dk = new DakaInfo();
				dk.id = e.getId();
				dk.qdTime = d;
				list = new ArrayList<DakaInfo>();
				list.add(dk);
				c.map.put(strDate, list);
			}
			System.out.println("���ţ�"+id+"�򿨳ɹ�");
		}else{
			System.out.println("�޴�IDԱ��");
		}
	}
	
	//ǩ��
	public static void qianTui(int id){
		Employee e = c.searchEmp(id);
		if(e!=null){
			//��ȡϵͳ��ǰʱ��
			Date d = new Date();
			String strDate = new SimpleDateFormat("yyyy-MM-dd").format(d);
			List<DakaInfo> list = c.map.get(strDate);
			if(list !=null && list.isEmpty() == false){
				boolean flag = true;
				//�ж�Ա���Ƿ���ǩ��
				for(DakaInfo dk:list){
					if(dk.id == id){
						dk.qtTime = d;
						flag = false;
						break;
					}
				}
				if(flag == false){
					System.out.println("ǩ�˳ɹ�");
				}else{
					System.out.println("���컹û��ǩ�����޷�ǩ��");
				}
			}else{
				System.out.println("���컹û��ǩ�����޷�ǩ��");
			}
		}else{
			System.out.println("�޴�IDԱ��");
		}
	}
	
	//�鿴
	public static void showInfo(){
		Date d = new Date();
		String strDate = new SimpleDateFormat("yyyy-MM-dd").format(d);
		List<DakaInfo> list = c.map.get(strDate);
		if(list !=null && list.isEmpty() == false){
			for(DakaInfo dk :list){
				int id = dk.id;
				Employee e = c.searchEmp(id);
				System.out.println("����Ϊ��"+e.getId()+"������"+e.getEname());
				System.out.println("ǩ��ʱ��Ϊ��"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dk.qdTime));
				try {
					System.out.println("ǩ��ʱ��Ϊ��"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dk.qtTime));
				} catch (NullPointerException e2) {
					System.out.println("ǩ��ʱ��Ϊ�޼�¼");
				}
				
			}
		}else{
			System.out.println("������ʱû�д���Ϣ��");
		}
	}
	public static void main(String[] args) {
		c.addEmp(new Employee(1111,"����"));
		c.addEmp(new Employee(1112,"����"));
		c.addEmp(new Employee(1113,"����"));
		c.addEmp(new Employee(1114,"����"));
		c.addEmp(new Employee(1115,"����"));
		
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.println("-------------Ա����ϵͳ-------------");
			System.out.println("0-------------�˳�");
			System.out.println("1-------------ǩ��");
			System.out.println("2-------------ǩ��");
			System.out.println("3-------------�鿴ǩ����Ϣ");
			System.out.println("��������ִ�еĲ�����");
			int n = scan.nextInt();
			
			if(n==0){
				System.out.println("���˳�");
				break;
			}
			
			switch(n){
			case 1:
				System.out.println("������ǩ����Ա��ID:");
				int id1 = scan.nextInt();
				qianDao(id1);
				break;
			case 2:
				System.out.println("������ǩ����Ա��ID:");
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
