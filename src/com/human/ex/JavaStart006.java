package com.human.ex;

public class JavaStart006 {
	//����, ����, ����, ������ ����
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
		//369���� �ش�������� 1000����
		//1,2,¦,3,4,¦
		//33,36�� ���� �� ���� ���� �ڼ��� �� �� ģ��.
//		for(int i=1; i<=1000; i++) {
//			int j=i%10;  //1�� �ڸ�
//			int l=i/100;  //100�� �ڸ�
//			int k;        //10�� �ڸ�
//				if(i>100) {
//					k=(i/10)-((i/100)*10);
//				}else {
//					k=i/10;
//				}
//				if((l==3||l==6||l==9)&&(k==3 || k==6 || k==9)&&(j==3 || j==6 || j==9)) {
//					System.out.println("¦,¦,¦"+"("+i+")");
//				}else if((k==3||l==3)&&(j==3 || j==6 || j==9)) {
//					System.out.println("¦,¦"+"("+i+")");
//				}else if((k==6||l==6)&&(j==3 || j==6 || j==9)) {
//					System.out.println("¦,¦"+"("+i+")");
//				}else if((k==9||l==9)&&(j==3 || j==6 || j==9)) {
//					System.out.println("¦,¦"+"("+i+")");
//				}else if((l==3 || l==6 || l==9)&&(k==3 || k==6 || k==9)) {
//					System.out.println("¦,¦"+"("+i+")");
//				}else if(j==3 || j==6 || j==9) {
//					System.out.println("¦"+"("+i+")");
//				}else if(k==3 || k==6 || k==9) {
//					System.out.println("¦"+"("+i+")");
//				}else if(l==3 || l==6 || l==9) {
//					System.out.println("¦"+"("+i+")");
//				}else {
//					System.out.println(i);
//				}
//		}
		
		//�����ϰ� ����,����,����,������ ������ ���� ����ڰ� ���ߴ� ���α׷�
		//������ 4�ܰ�� ó���� ���ϱ� ���� �� �Ǹ� ����, ����, ����������
		//2�ڸ� ���� �����θ�
		int sum=0;
		int a=1;
		while(a<5) {
			int b=(int)(Math.random()*99+1);
			int c=(int)(Math.random()*99+1);
			switch(a) {
			case 1:
				System.out.println("���� 1");
				sum=b+c;
				System.out.println(function1(b,c));
				break;
			case 2:
				System.out.println("���� 2");
				sum=b-c;
				System.out.println(function2(b,c));
				break;
			case 3:
				System.out.println("���� 3");
				sum=b*c;
				System.out.println(function3(b,c));
				break;
			default:
				System.out.println("���� 4");
				sum=b/c;
				System.out.println(function4(b,c));
			}
			int d=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
			if(d==sum) {
				System.out.println("����");
				a++;
			}else {
				System.out.println("��");
			}
		}
		System.out.println("��");
		
		
		
	}

}
