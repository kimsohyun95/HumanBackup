package com.human.ex;

import java.util.Arrays;

import com.human.dto.Human;

public class JavaStart005_2 {
	
	//�⺻�ڷ��� ����
	public static void function1(int a) {	
		a=10;
	}
	
	public static int function2(int a) {
		a=10;
		return a;
	}

	
	//�����ڷ��� ����
	//�迭�� �Ű������� ������ �Լ�
	public static void function3(int a[]) {
		a[0]=10;
		
	}
	
	public static int[] function4(int a[]) {
		a[0]=11;
		return a;
		// == ����
//		int rValue[]=a;
//		rValue[0]=12;
//		return rValue;

	}

	public static int[] function5(int a[]) {
		int rValue[]=new int[a.length];
		rValue[0]=a[0];
		rValue[1]=a[1];
		rValue[1]=21;
		a[1]=22;
		return rValue;
	}
	
	public static Human function6(Human h) {
		Human rHuman=h;
		rHuman.age=31;
		return rHuman;
	}
	
	public static Human function7(Human h) {
		Human rHuman=new Human("ȫ�泲",11,11.1);
		rHuman.age=32;
		return rHuman;
	}

	
//---------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		int a=5;
		int arr[]= {1,2};
		
		function1(a); // 1�� �Լ�
		System.out.println(a); //5
		//int a=5�� �������� ���� a=10�� ��������
		
		int rValue=function2(a); //2�� �Լ�
		System.out.println(a); //5
		System.out.println(rValue); //10
		
		function3(arr); //3�� �Լ�
		System.out.println(Arrays.toString(arr)); //10,2
		//�����ڷ����� ���� ���� ������ �Լ����� �ٲٸ� ���ο��� �ٲ��� ��� ��.
		
		int rArr[]=function4(arr); //4�� �Լ�
		System.out.println(Arrays.toString(arr)); //11,2
		System.out.println(Arrays.toString(rArr)); //11,2
		rArr[1]=9;
		System.out.println(Arrays.toString(arr)); //11,9
		System.out.println(Arrays.toString(rArr)); //11,9
		
		
		
//		public static int[] function5(int a[]) {
//			int rValue[]=new int[a.length]; //���� ����.
//			rValue[0]=a[0];
//			rValue[1]=a[1];
//			rValue[1]=21;
//			a[1]=22;
//			return rValue;
//		}

		int b[]= {10,11};
		int rB[]=function5(b);
		System.out.println(Arrays.toString(b)); //10,22
		System.out.println(Arrays.toString(rB)); //10,21
		rB[0]=1;
		System.out.println(Arrays.toString(b)); //10,22
		System.out.println(Arrays.toString(rB)); //1,21
		function5(b);
		System.out.println(Arrays.toString(b)); //10,22
		System.out.println(Arrays.toString(rB)); //1,21
		
//		public static Human function6(Human h) { //h�� �ּ� 0x01
//			Human rHuman=h;
//			rHuman.age=31;
//			return rHuman;
//		}
		
		Human h=new Human("ȫ�浿",11,11.1); //h�� �ּ� 0x01
		Human rH;
		rH=function6(h);
		System.out.println(h); //ȫ�浿,31,11.1
		System.out.println(rH); // "
		h.age=50;
		System.out.println(h); //ȫ�浿,50,11.1
		System.out.println(rH); //"
		
//		public static Human function7(Human h) {
//			Human rHuman=new Human("ȫ�泲",11.1,11);
//			rHuman.age=32;
//			return rHuman;
//		}
		
		Human h2=new Human("ȫ�浿",11,11.1);
		Human rH2;
		rH2=function7(h2);
		System.out.println(h2); //ȫ�浿, 11, 11.1
		System.out.println(rH2);//ȫ�泲, 32, 11.1
		h2.age=50;
		System.out.println(h2); //ȫ�浿, 50, 11.1
		System.out.println(rH2); //ȫ�泲, 32, 11.1
		
		
		
	}

}
