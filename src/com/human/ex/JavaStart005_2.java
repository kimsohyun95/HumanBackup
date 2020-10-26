package com.human.ex;

import java.util.Arrays;

import com.human.dto.Human;

public class JavaStart005_2 {
	
	//기본자료형 리턴
	public static void function1(int a) {	
		a=10;
	}
	
	public static int function2(int a) {
		a=10;
		return a;
	}

	
	//참조자료형 리턴
	//배열을 매개변수로 가지는 함수
	public static void function3(int a[]) {
		a[0]=10;
		
	}
	
	public static int[] function4(int a[]) {
		a[0]=11;
		return a;
		// == 같음
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
		Human rHuman=new Human("홍길남",11,11.1);
		rHuman.age=32;
		return rHuman;
	}

	
//---------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		int a=5;
		int arr[]= {1,2};
		
		function1(a); // 1번 함수
		System.out.println(a); //5
		//int a=5도 지역변수 위의 a=10도 지역변수
		
		int rValue=function2(a); //2번 함수
		System.out.println(a); //5
		System.out.println(rValue); //10
		
		function3(arr); //3번 함수
		System.out.println(Arrays.toString(arr)); //10,2
		//참조자료형은 힙에 남기 때문에 함수에서 바꾸면 메인에서 바껴서 출력 됨.
		
		int rArr[]=function4(arr); //4번 함수
		System.out.println(Arrays.toString(arr)); //11,2
		System.out.println(Arrays.toString(rArr)); //11,2
		rArr[1]=9;
		System.out.println(Arrays.toString(arr)); //11,9
		System.out.println(Arrays.toString(rArr)); //11,9
		
		
		
//		public static int[] function5(int a[]) {
//			int rValue[]=new int[a.length]; //새로 만듦.
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
		
//		public static Human function6(Human h) { //h의 주소 0x01
//			Human rHuman=h;
//			rHuman.age=31;
//			return rHuman;
//		}
		
		Human h=new Human("홍길동",11,11.1); //h의 주소 0x01
		Human rH;
		rH=function6(h);
		System.out.println(h); //홍길동,31,11.1
		System.out.println(rH); // "
		h.age=50;
		System.out.println(h); //홍길동,50,11.1
		System.out.println(rH); //"
		
//		public static Human function7(Human h) {
//			Human rHuman=new Human("홍길남",11.1,11);
//			rHuman.age=32;
//			return rHuman;
//		}
		
		Human h2=new Human("홍길동",11,11.1);
		Human rH2;
		rH2=function7(h2);
		System.out.println(h2); //홍길동, 11, 11.1
		System.out.println(rH2);//홍길남, 32, 11.1
		h2.age=50;
		System.out.println(h2); //홍길동, 50, 11.1
		System.out.println(rH2); //홍길남, 32, 11.1
		
		
		
	}

}
