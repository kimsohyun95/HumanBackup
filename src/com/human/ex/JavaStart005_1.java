package com.human.ex;

public class JavaStart005_1 { //�����
	//���ϰ��� ���� �Ű������� ���� �Լ�
	public static void function1() { //()�� �Ű����� ������ void�� �ᵵ ��.
		System.out.println("�ȳ��ϼ���");
		//return; ���ϰ��� ������ ������ �� �ִ�.
	}
	
	//���ϰ��� ���� �Ű������� �ִ� �Լ�
	public static void function2(int a) {
		System.out.println("�Լ� �Ű����� a����:"+a);
		return; //���ϰ��� ������ ��������(���ϰ��� ���⶧���� ���� �����ϴ�)
	}
	
	//���ϰ��� �ְ� �Ű������� ���� �Լ�
	public static int function3() {
		int returnValue=10;
		returnValue+=11;
		return returnValue;
		
	}
	
	//���ϰ��� �ְ� �Ű������� �ִ� �Լ�
	public static int function4(int i, int j, int k) {
		int result=0;
		result=i+j-k;
		return result;
		
	}

	public static void main(String[] args) { //ȣ���
		function1();
		function1();
		
		function2(10);
		function2(12);
		
		int a=function3();
		System.out.println(a); //21
		System.out.println(function3()); //���� ���� ������ ��� �ȴ�.
		
		int b=function4(1,2,3);
		System.out.println(b); //0
		System.out.println(function4(3,4,5)); //2
	

	}

}
