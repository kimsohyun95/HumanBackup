package com.human.ex;

public class JavaStart008 {

	
	public static int function1(int a, int b) {
		int sum=a*b;
		return sum;
	}
	public static void main(String[] args) {
		//아래표를 이용해서 요금 계산하는 프로그램 구현
		String strAge="";
		String type="";
		int num1=0;
		int price=0;
		int totalPrice=0;
		for(;;) {
			System.out.print("나이>> ");
			int age=Integer.parseInt(new java.util.Scanner(System.in)
					.nextLine());
			if(age>19 &&age<65) {
				strAge="대인";
			}else if(age>12&&age<20) {
				strAge="청소년";
			}else {
				strAge="소인/경로";
			}
			System.out.print("인원 수 >>");
			num1=Integer.parseInt(new java.util.Scanner(System.in)
					.nextLine());
			
			System.out.println("이용권 종류\n주간권(1일권), 오후권(오후3시~), 윈터야간권(오후5시~), 2일권");
			java.util.Scanner str=new java.util.Scanner(System.in);
			type=str.next();
			if(strAge=="대인") {
				if(type.equals("주간권")) {
					price=function1(num1,46000);
				}else if(type.equals("오후권")){
					price=function1(num1,38000);
				}else if(type.equals("윈터야간권")) {
					price=function1(num1,20000);
				}else {
					price=function1(num1,74000);
				}
			}else if(strAge=="청소년") {
				if(type.equals("주간권")) {
					price=function1(num1,39000);
				}else if(type.equals("오후권")){
					price=function1(num1,32000);
				}else if(type.equals("윈터야간권")) {
					price=function1(num1,17000);
				}else {
					price=function1(num1,62000);
				}
			}else {
				if(type.equals("주간권")) {
					price=function1(num1,36000);
				}else if(type.equals("오후권")){
					price=function1(num1,29000);
				}else if(type.equals("윈터야간권")) {
					price=function1(num1,16000);
				}else {
					price=function1(num1,58000);
				}
			}
			System.out.println(strAge+" "+ num1+"명 "+type+"\n총 "+price+"원");
			System.out.print("종료 시 0 계속 구매시 1>>");
			int a=Integer.parseInt(new java.util.Scanner(System.in)
					.nextLine());
			totalPrice+=price;
			if(a==0) {
				System.out.println("총 금액 "+totalPrice+"원");
				break;
			}

		}

	}

}
