package com.human.ex;
// ���߹ݺ���

public class JavaStart007 {
	
	//��Ģ����
	public static String function1(int a, int b) {
		String sum=a+"+"+b+"=";
		return sum;
	}
	public static String function2(int a, int b) {
		String min=a+"-"+b+"=";
		return min;
	}
	public static String function3(int a, int b) {
		String mul=a+"x"+b+"=";
		return mul;
	}
	public static String function4(int a, int b) {
		String div=a+"/"+b+"=";
		return div;
	}
	


	public static void main(String[] args) {
		//�����ϰ� ����, ����, ����, ������ ������ ���� ����ڰ� ���ߴ� ���α׷� ����
		//���� 4�ܰ�, ó������ ���ϱ� ������ �����ٰ� ������ ���Ǹ� ����, ����, �������� ���ʴ�� �߰�
		//2�ڸ� ���� ���� ��길
		int num4=0;
		int count=0;
		for(int lev=1; lev<5;) {
			int num1=(int)(Math.random()*99+1);
			int num2=(int)(Math.random()*99+1);
			int num3=(int)(Math.random()*lev+1);
			
			System.out.println("level "+lev);
			if(lev==1) {
				System.out.println(function1(num1,num2));
				num4=num1+num2;
			}else if(lev==2) {
				if(num3==1) {
					System.out.println(function1(num1,num2));
					num4=num1+num2;
				}else {
					System.out.println(function2(num1,num2));
					num4=num1-num2;
				}
			}else if(lev==3) {
				if(num3==1) {
					System.out.println(function1(num1,num2));
					num4=num1+num2;
				}else if(num3==2) {
					System.out.println(function2(num1,num2));
					num4=num1-num2;
				}else {
					System.out.println(function3(num1,num2));
					num4=num1*num2;
				}
				
			}else {
				if(num3==1) {
					System.out.println(function1(num1,num2));
					num4=num1+num2;
				}else if(num3==2) {
					System.out.println(function2(num1,num2));
					num4=num1-num2;
				}else if(num3==3) {
					System.out.println(function3(num1,num2));
					num4=num1*num2;
				}else {
					System.out.println(function4(num1,num2));
					num3=num1/num2;
				}
			}
			int a=Integer.parseInt(new java.util.Scanner(System.in)
					.nextLine());
			if(a==num4) {
				System.out.println("����");
				count++;
			}else {
				System.out.println("��");
			}
			if(count==5) {
				System.out.println("���� ��");
				lev++;
				count=0;
			}
			System.out.println("���� ����");
			
		}
		



			
			


		
		
		
		
		
		
		
	}

}
