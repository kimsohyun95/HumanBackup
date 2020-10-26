package com.human.ex;

public class JavaStart005_1 { //선언부
	//리턴값이 없고 매개변수도 없는 함수
	public static void function1() { //()에 매개변수 없으면 void를 써도 됨.
		System.out.println("안녕하세요");
		//return; 리턴값이 없으면 생략할 수 있다.
	}
	
	//리턴값이 없고 매개변수가 있는 함수
	public static void function2(int a) {
		System.out.println("함수 매개변수 a값은:"+a);
		return; //리턴값이 없으면 생략가능(리턴값이 없기때문에 생략 가능하다)
	}
	
	//리턴값이 있고 매개변수가 없는 함수
	public static int function3() {
		int returnValue=10;
		returnValue+=11;
		return returnValue;
		
	}
	
	//리턴값도 있고 매개변수도 있는 함수
	public static int function4(int i, int j, int k) {
		int result=0;
		result=i+j-k;
		return result;
		
	}

	public static void main(String[] args) { //호출부
		function1();
		function1();
		
		function2(10);
		function2(12);
		
		int a=function3();
		System.out.println(a); //21
		System.out.println(function3()); //위와 같은 내용이 출력 된다.
		
		int b=function4(1,2,3);
		System.out.println(b); //0
		System.out.println(function4(3,4,5)); //2
	

	}

}
