package com.human.ex;
//���߹ݺ���
public class JavaStart006 {


	public static void main(String[] args) {
		//1.369���� �ش��� �����
		//3,6,9�� �ϳ��� ���� "¦"
		//33,36�� ���� �ΰ� ���� "¦¦"
		//10000����
		for(int i=1; i<=1000; i++) {
			int a=i%10; //1�� �ڸ� 369ã��
			int b=i/10; //10�� �ڸ� 369ã��
			int c=i/100; //100�� �ڸ�369ã��
			if(i>100) {
				b=(i/10)-(i/100)*10;
			}
			if((a==3||a==6||a==9)&&
					(b==3||b==6||b==9)&&
					(c==3||c==6||c==9)) {
				System.out.println("¦¦¦"+"("+i+")");
			}else if((c==3||c==6||c==9)&&
					(a==3 ||a==6||a==9||
					b==3||b==6||b==9)) {
				System.out.println("¦¦"+"("+i+")");
			}else if((a==3||a==6||a==9)&&
					(b==3||b==6||b==9)) {
				System.out.println("¦¦"+"("+i+")");
			}else if(a==3||a==6||a==9||
					b==3||b==6||b==9||
					c==3||c==6||c==9) {
				System.out.println("¦"+"("+i+")");
			}else{
				System.out.println(i);
			}
		}
	}	
}
