package com.human.ex;

public class JavaStart012 {
	//함수 속에 함수 호출
	public static void functiona() {
		System.out.println("a함수 시작");
		functionb();
		System.out.println("a함수 종료");
	}
	public static void functionb() {
		System.out.println("b함수 시작");
		System.out.println("b함수 종료");
	}
	public static void functionc() {
		System.out.println("c함수 시작");
		System.out.println("c함수 종료");
	}
	public static void functiond() {
		System.out.println("d함수 시작");
		System.out.println("d함수 종료");
	}

	public static void main(String[] args) {
		functiona();
		functionc();
		functiond();
		
		
		
		
	}


}
