package com.human.ex;

public class JavaStart003 {

	public static void main(String[] args) {
//�ݺ���

		//1.while���� for���� �̿��ؼ� ���� �������� ���α׷����� ������ ����.
//		<while>
//		int a=2;
//		int b=1;
//		b=b+1;
//		System.out.println(a+"\t"+b);
//		while(b<15) {
//			a=a+1; //3 4 5 6
//			b=b+a; //5 9 14 20
//		}
//		System.out.println(a+"\t"+b);
//		<for��>
//		int a=2;
//		int b=1;
//		b++;
//		System.out.println(a+"\t"+b);
//		for(b=2; b<15; a=a+1, b=b+a) {
//		}
//		System.out.println(a+"\t"+b);
		
		//2.1~100������ ��� ����� ���ϸ� �ȴ�.
//		int i=1;
//		while(i<101) {
//			if(100%i==0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		//3.�� ���� �Է¹޾� �μ��� ����� ����� ��� ����� ����
		// 0���� �ϳ��� ������Ű�� �μ� ��� �������� ���� ����ϸ� �ȴ�
//		System.out.print("���� �Է�>>");
//		int a=(Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine()));
//		System.out.print("���� �Է�>>");
//		int b=(Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine()));
//		int i=1;
//		while(i<=a || i<=b) {
//			if(a%i==0 && b%i==0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		//4.�μ��� �Է¹޾� �μ��� �ִ� ������� ���ϴ� ���α׷�
//		System.out.print("���� �Է�>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("���� �Է�>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int i=1;
//		int j=1;
//		int c=0;
//		while(i<=a || i<=b) {
//			if(a%i==0) {
//				if(b%j==0) {
//					if(i==j) {
//						c=i;
//					}
//				}
//			}
//			i++;
//			j++;
//		}
//		System.out.println(c);
		
		//5.����ڿ��� ���ڸ� �ϳ� �Է¹޾� �Է��� ���ڵ��� ���� 100�� �ɶ����� ����Է��� �޴ٰ� 
		//   100�� ������ �ջ��� ����ϴ� ���α׷��� ����
//		int sum=0;
//		for(;;) {
//			System.out.print("���� �Է�>>");
//			int a=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			sum=sum+a;
//			if(sum>100) {
//				System.out.println(sum);
//				break;
//			}
//			
//		}
		
		//6.����ڿ��� ����ؼ� ���ڸ� �Է¹޾� 1~10������ ���ڸ� 3�� �Է� �� �� ���� �ݺ��Ѵ�
		// �Է��� ������ �߸� �Է��� ȸ���� ����� �Է��� ȸ���� ����ϰ� 
		// ����ڰ� ����� �Է��� ������ ����ϴ�  ���α׷��� ����� ����.
//		int i=0;
//		int j=0;
//		int sum=0;
//		for(;;) {
//			System.out.print("���� �Է�>>");
//			int a=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			if(a>=1 && a<=10) {
//				i++;
//				sum=sum+a;
//			}else {
//				j++;
//			}
//			if(i==3) {
//				break;
//			}
//		}
//		System.out.println("�� �� �Է� �� Ƚ��>>"+j);
//		System.out.println("����� �Է� �� Ƚ��>>"+i);
//		System.out.println("����� �Է� �� ���� ��>>"+sum);		
		
		//7.�� ���� �Է� �޾� ����� �� ���� ���� ���, �ּ� ������� ���
//		System.out.print("���� �Է�>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("���� �Է�>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int i=1;
//		int c;
//		for(;;) {
//			if(i%a==0) {
//				if(i%b==0) {
//						c=i;
//						break;
//				}
//			}
//			i++;
//		}
//		System.out.println(c);
		
		//8.3���� ���� �Է� �޾� ���� ���� ���� ���� ū���� ����ϴ� ���α׷��� ����� ����
//		System.out.print("���� �Է�>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("���� �Է�>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("���� �Է�>>");
//		int c=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		if(a>b) {
//			if(a>c) {
//				System.out.println("���� ū ��>>"+a);
//				if(b>c) {
//					System.out.println("���� ���� ��>>"+c);
//				}else {
//					System.out.println("���� ���� ��>>"+b);
//				}
//			}else {
//				System.out.println("���� ū ��>>"+c);
//				System.out.println("���� ���� ��>>"+b);
//			}
//		}else {
//			if(b>c) {
//				System.out.println("���� ū ��>>"+b);
//				if(a>c) {
//					System.out.println("���� ���� ��>>"+c);
//				}else {
//					System.out.println("���� ���� ��>>"+c);
//				}
//			}else {
//				System.out.println("���� ū ��>>"+c);
//				System.out.println("���� ���� ��>>"+a);
//			}
//		}
		
		//9.100������ ���а��� ������ 5�� �Է¹޾� 
		//  60���� Ż���ڰ� ������� ����ϴ� ���α׷��� ������ ����.
//		int i=0;
//		int sum=0;
//		while(i<5) {
//			System.out.print("���а��� ����(100����)>>");
//			int a=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			if(a<=60) {
//				sum++;
//			}
//			i++;
//		}
//		System.out.println("Ż����"+sum+"��");

		//10.1���� ���ʴ�� ���� ������ ���� 100�� �ѱ� �������� ������ 
		//  ������� ������� ����Ͻÿ�. 
		//1:1 2:3 3:6 4:10 5:15 6:21..100������ ���յ��� ������ ���� ��µǸ� �ȴ�.
//		int i=1;
//		int sum=0;
//		while(sum<=100) {
//			sum=sum+i;
//			System.out.println(i+":"+sum);
//			i++;
//		}
		
		//11.���ڿ��� ���ڸ� �Է¹޾� �Է¹��� ���ڿ��� ���ڸ�ŭ ����ϴ� ���α׷��� ����� ����
//		java.util.Scanner a=new java.util.Scanner(System.in);
//		System.out.print("���� �Է�>>");
//		String val=a.next();
//		System.out.print("���� �Է�>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int c=0;
//		while(c<b) {
//			System.out.println(val);
//			c++;
//		}
		
		//12. �Է¹��� �μ� ������ ���ڵ��� ���� ���ϴ� ���α׷��� ����� ����.
//		System.out.print("���� �Է�>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("���� �Է�>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int sum=0;
//		if(a>=b) {
//			int i=b+1;
//			while(i>b && i<a) {
//				sum=sum+i;
//				i++;
//			}
//		}else {
//			int i=a+1;
//			while(i>a && i<b) {
//				sum=sum+i;
//				i++;
//			}
//		}
//		System.out.println(sum);
		
		//13.���� �ϳ� �Է¹޾� �Ҽ����� �ƴ��� �Ǻ��ϴ� ���α׷��� �����Ͻÿ�.
//		System.out.print("���� �Է�>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int i=1;
//		int j=0;
//		while(i<=a) {
//			if(a%i==0) {
//				j++;
//			}
//			i++;
//		}
//		if(j==2) {
//			System.out.println(a+"�� �Ҽ��̴�.");
//		}else {
//			System.out.println(a+"�� �Ҽ��� �ƴϴ�.");
//		}
		
		//14.�� ���� �Է� �޾� ù ��°�� ���� �����Ͽ� �ϳ��� ī��Ʈ�Ͽ� 
		//   �ι�°�� �� ��ŭ ȭ�鿡 ��� �ϴ� ���α׷��� �����. 
//		System.out.print("���� �Է�>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("���� �Է�>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int i=0;
//		while(i<b) {
//			System.out.println(a);
//			a++;
//			i++;
//		}
		
		//15. 1~9 ������ ���ڸ� �ϳ� �Է¹޾� �ش� ������ �������� ����Ͽ� ����
//		System.out.print("���� �Է�(1~9)>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int i=1;
//		while(i<10) {
//			int sum=a*i;
//			System.out.println(a+"x"+i+"="+sum);
//			i++;
//		}
		
		//16.���ڸ� �ϳ� �Է¹޾� 1~1000���̿� �Է¹��� ������ ����� �� ������ 
		//  ����ϴ� ���α׷��� ����� ����.
//		System.out.print("���� �Է�>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int i=1;
//		int j=0;
//		while(i<=1000) {
//			if(i%a==0) {
//				j++;
//			}
//			i++;
//		}
//		System.out.println(j);
		
		//17.����ڿ��� ��� ���� �Է� �޾� ��� ���� ���뼭 1���� 100���� ���
//		System.out.print("���� ����>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("���� ����>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());		
//		int i=1;
//		int j=1;
//		while(i<=b) {
//			while(j<=a) {
//				System.out.print(j+"\t");
//				j++;
//			}
//			System.out.println("");
//			a=a+5;
//			i++;
//		}
		
		//18.������ ���� ��� �ǵ��� ���α׷��� �ϼ��� ����.
		// 1  2  3  4  5
		// 10 9  8  7  6
		// 11 12 13 14 15
		// 21 22 23 24 25
//		int i=1;
//		int j=10;
//		while(i<11) {
//			if(i<6) {
//				System.out.print(i+"\t");
//			}else {
//				if(i==6) {
//					System.out.println("");
//					System.out.print(j+"\t");
//					j--;
//				}else {
//					System.out.print(j+"\t");
//					j--;
//
//				}
//			}
//			i++;
//		}
//		System.out.println("");
//		i=1;
//		j=1;
//		int c=11;
//		while(i<3) {
//			while(j<6) {
//				System.out.print(c+"\t");
//				j++;
//				c++;
//			}
//			System.out.println("");
//			j=1;
//			c=c+5;
//			i++;
//		}
		
		//19.�ش� ���� ���� ���ϰ� �ϼ��� �Է� �޾� �޷��� ���. \t���� �̿�
		System.out.print("���� ���� \n 1.�� 2.�� 3.ȭ 4.�� 5.�� 6.�� 7.��\n>>");
		int a=Integer.parseInt(new java.util.Scanner(System.in)
				.nextLine());
		System.out.print("�ش� ���� �ϼ�>>");
		int b=Integer.parseInt(new java.util.Scanner(System.in)
				.nextLine());
		
		//20.��ǻ�Ͱ� ���� ������ �ո� ���� �޸� ���� ���ߴ� ���α׷��� ����
		//  ���� Ƚ���� Ʋ�� Ƚ���� ����ؼ� ��������.
//		int j=0;
//		int k=0;
//		for(;;) {
//			int i=(int)(Math.random()*2+1);
//			System.out.print("�ո��̸� 1��, �޸��̸� 2��, ���� 3��>>");
//			int a=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			if(i==a) {
//				System.out.println("����");
//				j++;
//			}
//			if(i!=a){
//				System.out.println("Ʋ��");
//				k++;
//			}
//			if(a==3){
//				System.out.println("���� Ƚ�� : "+j+"\n"+"Ʋ�� Ƚ�� : "+k);
//				break;
//			}
//		}
		
		//21.��ǻ�Ͱ� ���� �ֻ����� ���ߴ� ���α׷��� ����. ���� Ƚ���� Ʋ�� Ƚ���� ����ؼ� ���� ����.
//		int i=0;
//		int j=0;
//		for(;;) {
//			int k=(int)(Math.random()*6+1);
//			System.out.print("�ֻ��� ���ڴ�?\n1.1 2.2 3.3 4.4 5.5 6.6 7.���� >>");
//			int a=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			if(k==a) {
//				System.out.println("�ֻ��� ����"+k+"\n���߼̽��ϴ�.");
//				i++;
//			}
//			if(k!=a) {
//				System.out.println("�ֻ��� ���� "+k+"\nƲ���̽��ϴ�.");
//				j++;
//			}
//			if(a==7) {
//				System.out.println("���� Ƚ�� : "+i+"\tƲ�� Ƚ�� : "+j);
//				break;
//			}
//		}
		
	}

}
