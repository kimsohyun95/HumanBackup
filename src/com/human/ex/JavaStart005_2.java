package com.human.ex;

import java.util.Arrays;

public class JavaStart005_2 {
	
	//�迭�� �Ű������� ������ �Լ�
	public static void function1(int a) {	
		a=10;
	}
	
	public static int function2(int a) {
		a=10;
		return a;
	}
	
	public static void function3(int a[]) {
		a[0]=10;
		
	}
	
	public static int[] function4(int a[]) {
		a[0]=10;
		return a;
	}
	

	public static void main(String[] args) {
		int a=5;
		int arr[]= {1,2};
		
		function1(a); // 1�� �Լ�
		System.out.println(a);
		
		int rValue=function2(a); //2�� �Լ�
		System.out.println(a);
		System.out.println(rValue);
		
		function3(arr); //3�� �Լ�
		System.out.println(Arrays.toString(arr));
		
		int rArr[]=function4(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));
		rArr[1]=9;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));

		
		
	}

}
