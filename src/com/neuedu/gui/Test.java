package com.neuedu.gui;

public class Test {

	
	public static void main(String[] args) {
		
		/*int i=3000;
		int a =0;
		
		while(i>=5){
			a++;
			i=i/2;
		}
		System.out.println(a);*/
		
		/*int[] a = new int[]{1,6,2,3,9,4,5,7,8};
		int t;
		for(int i=1;i<a.length;i++){
			for(int j=0;j<a.length-i;j++){
				if(a[j]>a[j+1]){
					t=a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
				System.out.println(a[j]);
			}
		}
		
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}*/
		
		/*在一个有8个整数（18，25，7，36，13，2，89，63）的数组中找出其中最大的数及其下标。
		（知识点：数组遍历、数组元素访问） [必做题]*/
		
		int[] num = new int[]{18,25,7,36,13,2,89,63};
		int max = 0;
		int flag = 0;
		for(int i=0;i<num.length;i++){
			if(num[i]>max){
				max = num[i];
				flag = i;
			}
		}
		
		System.out.println("最大的元素是："+max+"它的下标是："+flag);
	}
	
}
