package com.human.ex;
// ���߹ݺ���

public class JavaStart007 {
	
	//��Ģ����
//	public static String function1(int a, int b) {
//		String sum=a+"+"+b+"=";
//		return sum;
//	}
//	public static String function2(int a, int b) {
//		String min=a+"-"+b+"=";
//		return min;
//	}
//	public static String function3(int a, int b) {
//		String mul=a+"x"+b+"=";
//		return mul;
//	}
//	public static String function4(int a, int b) {
//		String div=a+"/"+b+"=";
//		return div;
//	}
	
	//�̿��
//	public static int function1(int a, int b) {
//		int sum=a*b;
//		return sum;
//	}

	public static void main(String[] args) {
		
		//���� ���α׷� '��ü�޴�: 1.�Ա� 2.��� 3.��ȸ 0.����'
		//account ���� 0���� ����, �Ա� ����� �뿡 ���ϴ� �׼� ���ϰų� ���ֱ�
		//account������ �ִ� ���ڰ� ������¿� ���� ���� �ȴ�.
//		
//		int inputString=9;
//		int account=0;
//		while(inputString!=0) {
//			System.out.println("��ü�޴�: 1.�Ա� 2.��� 3.��ȸ 0.����");
//			inputString=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			switch(inputString) {
//			case 1 :
//				System.out.print("�Ա� �ݾ�>>");
//				int a=Integer.parseInt(new java.util.Scanner(System.in)
//						.nextLine());
//				account=account+a;
//				break;
//			case 2 :
//				System.out.print("��� �ݾ�>>");
//				int b=Integer.parseInt(new java.util.Scanner(System.in)
//						.nextLine());
//				if(account<b) {
//					System.out.println("�ܾ��� �����մϴ�.");
//				}else {
//					account=account-b;
//				}
//				break;
//			case 3 :
//				System.out.println("���� �ܾ�>> "+account);
//				break;
//			case 0:
//				System.out.println("����");
//				break;
//			default :
//				System.out.println("�ٽ� �����ϼ���");
//			
//			}
//		}
		
		//�ݾ��� �Է¹޾� õ��, �����, ���, ���ʿ�, �ʿ� ¥�� �ܵ����� �Ž��� �ִ� ���α׷� ����
		//���� ���� : change1000, change500, change100, change50, change10, moneyInput
		
//		System.out.print("�ݾ� �Է� >> ");
//		int moneyInput=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		
//		int change1000=moneyInput/1000;
//		int change500=(moneyInput%1000)/500;
//		int change100=(moneyInput%500)/100;
//		int change50=(moneyInput%100)/50;
//		int change10=(moneyInput%50)/10;
//		System.out.println("õ��¥�� "+change1000+"��, "+"�����¥�� "+change500+
//				"��, "+"���¥�� "+change100+"��, "+"���ʿ�¥�� "+change50+
//				"��, "+"�ʿ�¥�� "+change10+"��");
		
		//�����ϴ� ���Ǳ�� �����ϰ� ����� ����.
		//���� ��0��. 1.���̴� 700 2.�ݶ� 500 3.ȯŸ 350 4.100���� 5.500���� 6.��ȯ
//		int inputString=9;
//		int account=0;
//		String str="";
//		while(inputString!=6) {
//			System.out.println("���� �� : "+account);
//			System.out.println("1.���̴� 700�� 2.�ݶ� 500�� 3.ȯŸ 350�� 4.100�� ���� 5.500�� ���� 6.��ȯ");
//			inputString=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			switch(inputString) {
//			case 1:
//				if(account<700) {
//					System.out.println("�ܾ��� �����մϴ�.");
//				}else {
//					str=str+"���̴�\t";
//					account=account-700;
//				}
//				break;
//			case 2:
//				if(account<500) {
//					System.out.println("�ܾ��� �����մϴ�.");
//				}else {
//					str=str+"�ݶ�\t";
//					account=account-500;
//				}
//				break;
//			case 3:
//				if(account<350) {
//					System.out.println("�ܾ��� �����մϴ�.");
//				}else {
//					str=str+"ȯŸ\t";
//					account=account-350;
//				}
//				break;
//			case 4:
//				System.out.print("100�� ���� ����>>");
//				int money100=Integer.parseInt(new java.util.Scanner(System.in)
//						.nextLine());
//				account=account+(100*money100);
//				break;
//			case 5:
//				System.out.println("500�� ���� ����>>");
//				int money500=Integer.parseInt(new java.util.Scanner(System.in)
//						.nextLine());
//				account=account+(500*money500);
//				break;
//			case 6:
//				int change1000=account/1000;
//				int change500=(account%1000)/500;
//				int change100=(account%500)/100;
//				int change50=(account%100)/50;
//				System.out.println(str);
//				System.out.println("õ��¥�� "+change1000+"�� "+
//						"�����¥�� "+change500+"�� "+
//						"���¥�� "+change100+"�� "+
//						"���ʿ�¥�� "+change50+"�� ");
//				break;
//			default:
//				System.out.println("�ٽ� �Է��ϼ���");
//					
//			}
//		}
		
		//�Ʒ�ó�� ���
		//1)1**********************1 (*=22��)
//		System.out.print(1);
//		for(int i=0; i<22; i++) {
//		System.out.print("*");	
//		}
//		System.out.print(1);
		//2)*****1*****1*****1*****1
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print("*");
//			}
//			System.out.print(1);
//		}
		//3)2*****2*****2*****2*****
//		for(int i=0; i<4; i++) {
//			System.out.print(2);
//			for(int j=0; j<5; j++) {
//				System.out.print("*");
//			}
//		}
		//4)21**********************1
//		System.out.print(2);
//		System.out.print(1);
//		for(int i=0; i<22; i++) {
//			System.out.print("*");
//		}
//		System.out.print(1);
		//5)1****21****21****21****2
//		for(int i=0; i<4; i++) {
//			System.out.print(1);
//			for(int j=0; j<4; j++) {
//				System.out.print("*");
//			}
//			System.out.print(2);
//		}
		//6)1111****21111****21111****21111****2
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.print(1);
//			}
//			for(int k=0; k<4; k++) {
//				System.out.print("*");
//			}
//			System.out.print(2);
//		}
		//7)1111****22221111****22221111****2222
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.print(1);
//			}
//			for(int k=0; k<4; k++) {
//				System.out.print("*");
//			}
//			for(int l=0; l<4; l++) {
//				System.out.print(2);
//			}
//		}
		//8)111122223333444411112222333344441111222233334444
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.print(1);
//			}
//			for(int k=0; k<4; k++) {
//				System.out.print(2);
//			}
//			for(int l=0; l<4; l++) {
//				System.out.print(3);
//			}
//			for(int m=0; m<4; m++) {
//				System.out.print(4);
//			}
//		}
		
		//����ڿ��� 1~9���̿� ���ڸ� �޾Ƽ� �׿� �ش��ϴ� ������ ���� ���
//		System.out.print("1~9���� ���� �Է�>>");
//		int i=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		for(int j=1; j<10; j++) {
//			int sum=i*j;
//			System.out.println(i+"x"+j+"="+sum);
//		}
		
		//���� 3���� �̹����� ���� � ����� ��µǴ���
		//1)
//		for(int i=3; i<=5; i++) {
//			for(int j=6; j<=8; j++) {
//				System.out.println("("+i+","+j+")");
//			}
//		}
		//2)
//		for(int i=1; i<=3; i++) {
//			for(int j=4; j<=8; j+=2) {
//				System.out.println("("+i+","+j+")");
//			}
//		}
		//3)
//		for(int i=2; i<=6; i+=2) {
//			for(int j=1; j<=3; j++) {
//				System.out.println("("+i+","+j+")");
//			}
//		}
		
		//�̹����� ���� ������ �������� ���
		//1)
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				int sum=i*j;
//				System.out.print(i+"*"+j+"="+sum+"\t");
//			}
//			System.out.println("");
//		}
		//2)
//		for(int i=1; i<=9; i++) {
//			System.out.println(i+"��");
//			for(int j=1; j<=9; j++) {
//				int sum=i*j;
//				System.out.println(i+"*"+j+"="+sum);
//			}
//		}
		//3)
//		int b=1;
//		for(int a=0; a<3; a++) {
//			for(int i=1; i<=9; i++) {
//				for(int j=b; j<b+3; j++) {
//					int sum=i*j;
//					System.out.print(j+"*"+i+"="+sum+"\t");
//				}
//				System.out.println("");
//			}
//			b=b+3;
//			System.out.println("");
//		}
		
		//�����
		//1)*����**����***����****����*****����******����*******����
//		for(int i=0; i<7; i++) {
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.print("����");
//		}
		//2)*******����******����*****����****����***����**����*����
//		for(int i=0; i<7; i++) {
//			for(int j=0; j<7-i; j++) {
//				System.out.print("*");
//			}
//			System.out.print("����");
//		}
		//3)������������������������*���Ͱ�������������������**���Ͱ�����������
		//����***���Ͱ�����������****���Ͱ�������*****���Ͱ���******����*******����
//		for(int i=0; i<7; i++) {
//			for(int j=0; j<6-i; j++) {
//				System.out.print("����");
//			}
//			for(int k=0; k<i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.print("����");
//		}
		//1-1)
//		for(int i=0; i<7; i++) {
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//2-1)
//		for(int i=0; i<7; i++) {
//			for(int j=0; j<7-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//3-1)
//		for(int i=0; i<7; i++) {
//			for(int j=0; j<6-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//�پ��� �� ���
		//1)
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//2)
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<8-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//3)
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<9-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//4)
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<9-i; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//5)
//		int a=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<a+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a++;
//			}else {
//				a--;
//			}
//		}
		//6)
//		int a=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<4-a; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<a+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a++;
//			}else {
//				a--;
//			}
//		}
		//7)
//		int a=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<5-a; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a++;
//			}else {
//				a--;
//			}
//		}
		//8)
//		int a=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<a; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<5-a; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a++;
//			}else {
//				a--;
//			}
//		}
		//9)
//		int a=0;
//		int b=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<5-a; j++) {
//				System.out.print("*");
//			}
//			for(int k=0; k<b+1; k++) {
//				System.out.print(" ");
//			}
//			for(int l=0; l<5-a; l++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a++;
//				b+=2;
//			}else {
//				a--;
//				b-=2;
//			}
//		}
		//10)
//		int a=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<8-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<a+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			a+=2;
//		}
		//11)
//		int a=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<17-a; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			a+=2;
//		}
		//12)
//		int a=0;
//		int b=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<b; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<9-a; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a+=2;
//				b++;
//			}else {
//				a-=2;
//				b--;
//			}
//		}
		//13)
//		int a=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<a; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<5; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a++;
//			}else {
//				a--;
//			}
//		}
		//14) 9�� 17��
//		int a=0;
//		for(int i=0; i<8; i++) {
//			for(int j=0; j<8-i; j++) {
//				System.out.print(" ");
//			}
//			System.out.print("*");
//			for(int k=1; k<a; k++) {
//				System.out.print(" ");
//			}
//			if(i>0) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			a=a+2;
//		}
//		for(int i=0; i<17; i++) {
//			System.out.print("*");
//		}
		//15)
//		int a=0;
//		int b=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<a; j++) {
//				System.out.print(" ");
//			}
//			System.out.print("*");
//			for(int k=0; k<7-b; k++) {
//				System.out.print(" ");
//			}
//			if(i!=4) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a++;
//				b+=2;
//			}else {
//				a--;
//				b-=2;
//			}
//		}
		
		//1.369���� �ش��� �����
		//3,6,9�� �ϳ��� ���� "¦"
		//33,36�� ���� �ΰ� ���� "¦¦"
		//10000����
//		for(int i=1; i<=1000; i++) {
//			int a=i%10; //1�� �ڸ� 369ã��
//			int b=i/10; //10�� �ڸ� 369ã��
//			int c=i/100; //100�� �ڸ�369ã��
//			if(i>100) {
//				b=(i/10)-(i/100)*10;
//			}
//			if((a==3||a==6||a==9)&&
//					(b==3||b==6||b==9)&&
//					(c==3||c==6||c==9)) {
//				System.out.println("¦¦¦"+"("+i+")");
//			}else if((c==3||c==6||c==9)&&
//					(a==3 ||a==6||a==9||
//					b==3||b==6||b==9)) {
//				System.out.println("¦¦"+"("+i+")");
//			}else if((a==3||a==6||a==9)&&
//					(b==3||b==6||b==9)) {
//				System.out.println("¦¦"+"("+i+")");
//			}else if(a==3||a==6||a==9||
//					b==3||b==6||b==9||
//					c==3||c==6||c==9) {
//				System.out.println("¦"+"("+i+")");
//			}else{
//				System.out.println(i);
//			}
//		}
		
		//�����ϰ� ����, ����, ����, ������ ������ ���� ����ڰ� ���ߴ� ���α׷� ����
		//���� 4�ܰ�, ó������ ���ϱ� ������ �����ٰ� ������ ���Ǹ� ����, ����, �������� ���ʴ�� �߰�
		//2�ڸ� ���� ���� ��길
//		int num4=0;
//		int count=0;
//		for(int lev=1; lev<5;) {
//			int num1=(int)(Math.random()*99+1);
//			int num2=(int)(Math.random()*99+1);
//			int num3=(int)(Math.random()*lev+1);
//			
//			System.out.println("level "+lev);
//			if(lev==1) {
//				System.out.println(function1(num1,num2));
//				num4=num1+num2;
//			}else if(lev==2) {
//				if(num3==1) {
//					System.out.println(function1(num1,num2));
//					num4=num1+num2;
//				}else {
//					System.out.println(function2(num1,num2));
//					num4=num1-num2;
//				}
//			}else if(lev==3) {
//				if(num3==1) {
//					System.out.println(function1(num1,num2));
//					num4=num1+num2;
//				}else if(num3==2) {
//					System.out.println(function2(num1,num2));
//					num4=num1-num2;
//				}else {
//					System.out.println(function3(num1,num2));
//					num4=num1*num2;
//				}
//				
//			}else {
//				if(num3==1) {
//					System.out.println(function1(num1,num2));
//					num4=num1+num2;
//				}else if(num3==2) {
//					System.out.println(function2(num1,num2));
//					num4=num1-num2;
//				}else if(num3==3) {
//					System.out.println(function3(num1,num2));
//					num4=num1*num2;
//				}else {
//					System.out.println(function4(num1,num2));
//					num3=num1/num2;
//				}
//			}
//			int a=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			if(a==num4) {
//				System.out.println("����");
//				count++;
//			}else {
//				System.out.println("��");
//			}
//			if(count==5) {
//				System.out.println("���� ��");
//				lev++;
//				count=0;
//			}
//			System.out.println("���� ����");
//			
//		}
		
		//�Ʒ�ǥ�� �̿��ؼ� ��� ����ϴ� ���α׷� ����
//		String strAge="";
//		String type="";
//		int num1=0;
//		int price=0;
//		int totalPrice=0;
//		for(;;) {
//			System.out.print("����>> ");
//			int age=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			if(age>19 &&age<65) {
//				strAge="����";
//			}else if(age>12&&age<20) {
//				strAge="û�ҳ�";
//			}else {
//				strAge="����/���";
//			}
//			System.out.print("�ο� �� >>");
//			num1=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			
//			System.out.println("�̿�� ����\n�ְ���(1�ϱ�), ���ı�(����3��~), ���;߰���(����5��~), 2�ϱ�");
//			java.util.Scanner str=new java.util.Scanner(System.in);
//			type=str.next();
//			if(strAge=="����") {
//				if(type.equals("�ְ���")) {
//					price=function1(num1,46000);
//				}else if(type.equals("���ı�")){
//					price=function1(num1,38000);
//				}else if(type.equals("���;߰���")) {
//					price=function1(num1,20000);
//				}else {
//					price=function1(num1,74000);
//				}
//			}else if(strAge=="û�ҳ�") {
//				if(type.equals("�ְ���")) {
//					price=function1(num1,39000);
//				}else if(type.equals("���ı�")){
//					price=function1(num1,32000);
//				}else if(type.equals("���;߰���")) {
//					price=function1(num1,17000);
//				}else {
//					price=function1(num1,62000);
//				}
//			}else {
//				if(type.equals("�ְ���")) {
//					price=function1(num1,36000);
//				}else if(type.equals("���ı�")){
//					price=function1(num1,29000);
//				}else if(type.equals("���;߰���")) {
//					price=function1(num1,16000);
//				}else {
//					price=function1(num1,58000);
//				}
//			}
//			System.out.println(strAge+" "+ num1+"�� "+type+"\n�� "+price+"��");
//			System.out.print("���� �� 0 ��� ���Ž� 1>>");
//			int a=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			totalPrice+=price;
//			if(a==0) {
//				System.out.println("�� �ݾ� "+totalPrice+"��");
//				break;
//			}
//
//		}

		//��ǻ�Ͱ� ���Ƿ� ���� �ϳ��� ���ڸ� ���ߴ� ���α׷�
		//����ڰ� �Է��� ���ڰ� ������ ���ڶ� ���� �ʴٸ� ����ڰ� ���ڸ� ���� �� �ֵ���
		//ū�� ������ ��Ʈ�� �༭ ���� �� �ֵ��� ����
		//������ ���߸� ������ ����ٴ� �޼����� �Բ� �� ��ȸ�� ���� ���� ������� ����غ���
		int num=(int)(Math.random()*99+1);
		int a=0;
		System.out.println("������ ���� ���߱�");
		for(;;) {
			a++;
			System.out.println("���� �Է�>>");
			int user=Integer.parseInt(new java.util.Scanner(System.in)
					.nextLine());
			if(num==user) {
				System.out.println("�����Դϴ�.");
				break;
			}else {
				if(num<user) {
					System.out.println("���ڰ� �Է��Ͻ� ������ �۽��ϴ�.");
				}else {
					System.out.println("���ڰ� �Է��Ͻ� ������ Ů�ϴ�.");
				}
			}

		}
		System.out.println("���� Ƚ��>>"+a);
					
			
			


		
		
		
		
		
		
		
	}

}
