package com.human.ex;

public class JavaStart008 {

	
	public static int function1(int a, int b) {
		int sum=a*b;
		return sum;
	}
	public static void main(String[] args) {
		//�Ʒ�ǥ�� �̿��ؼ� ��� ����ϴ� ���α׷� ����
		String strAge="";
		String type="";
		int num1=0;
		int price=0;
		int totalPrice=0;
		for(;;) {
			System.out.print("����>> ");
			int age=Integer.parseInt(new java.util.Scanner(System.in)
					.nextLine());
			if(age>19 &&age<65) {
				strAge="����";
			}else if(age>12&&age<20) {
				strAge="û�ҳ�";
			}else {
				strAge="����/���";
			}
			System.out.print("�ο� �� >>");
			num1=Integer.parseInt(new java.util.Scanner(System.in)
					.nextLine());
			
			System.out.println("�̿�� ����\n�ְ���(1�ϱ�), ���ı�(����3��~), ���;߰���(����5��~), 2�ϱ�");
			java.util.Scanner str=new java.util.Scanner(System.in);
			type=str.next();
			if(strAge=="����") {
				if(type.equals("�ְ���")) {
					price=function1(num1,46000);
				}else if(type.equals("���ı�")){
					price=function1(num1,38000);
				}else if(type.equals("���;߰���")) {
					price=function1(num1,20000);
				}else {
					price=function1(num1,74000);
				}
			}else if(strAge=="û�ҳ�") {
				if(type.equals("�ְ���")) {
					price=function1(num1,39000);
				}else if(type.equals("���ı�")){
					price=function1(num1,32000);
				}else if(type.equals("���;߰���")) {
					price=function1(num1,17000);
				}else {
					price=function1(num1,62000);
				}
			}else {
				if(type.equals("�ְ���")) {
					price=function1(num1,36000);
				}else if(type.equals("���ı�")){
					price=function1(num1,29000);
				}else if(type.equals("���;߰���")) {
					price=function1(num1,16000);
				}else {
					price=function1(num1,58000);
				}
			}
			System.out.println(strAge+" "+ num1+"�� "+type+"\n�� "+price+"��");
			System.out.print("���� �� 0 ��� ���Ž� 1>>");
			int a=Integer.parseInt(new java.util.Scanner(System.in)
					.nextLine());
			totalPrice+=price;
			if(a==0) {
				System.out.println("�� �ݾ� "+totalPrice+"��");
				break;
			}

		}

	}

}
