package com.human.ex;

public class JavaStart011 {

	public static void main(String[] args) {
		// �迭 �����ڷ����� �� ==�� equals
		
		//����� �Է��� �޾� 10���� ū�� ������ ���
//		System.out.print("���� �Է�>>");
//		int i=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		if(i<10) {
//			System.out.println("�Է� ���ڴ� 10���� �۽��ϴ�.");
//		}else if(i>10) {
//			System.out.println("�Է� ���ڴ� 10���� Ů�ϴ�.");
//		}else {
//			System.out.println("�Է� ���ڴ� 10�� �����ϴ�.");
//		}

		//����� �Է� true�� �޾Ƽ� 'true'�� �ԷµǾ����ϴ�.'
		// 'true�� �Էµ��� �ʾҽ��ϴ�.'�� ��� �ǵ��� ����� ����.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("true, false>>");
//		String str1=scanner.next();
//		String str2="true";
//		if(str1.equals(str2)) {
//			System.out.println("true�� �ԷµǾ����ϴ�.");
//		}else {
//			System.out.println("true�� �Էµ��� �ʾҽ��ϴ�.");
//		}
		
		//����ڿ��� ���ڸ� �Է¹޾� 1004�̸� '��ȣ�� ����' �ƴϸ�
		//'��ȣ�� Ʋ��'�� ��µǵ��� ���α׷� ����
//		System.out.print("���� �Է�>>");
//		int i=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		if(i==1004) {
//			System.out.println("��ȣ�� ����");
//		}else {
//			System.out.println("��ȣ�� Ʋ��");
//		}
		
		//'�ȳ�'�� �Է��ϸ� '�ʵ� �ȳ�' '����' �Է��ϸ� '�ʵ� ����'
		//'�߰�'�Է��ϸ� '�ʵ� �߰�'�� ��µǵ��� ���α׷� ����
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.println("�ȳ�, ����, �߰� �� ��>>");
//		String str=scanner.next();
//		if(str.equals("�ȳ�")) {
//			System.out.println("�ʵ� �ȳ�");
//		}
//		if(str.equals("����")) {
//			System.out.println("�ʵ� ����");
//		}
//		if(str.equals("�߰�")) {
//			System.out.println("�ʵ� �߰�");
//		}

		//������
		//int 3i=5; �������� �������� ���ڴ� �ȵȴ�.
		//int _hello=55; ����
		//int hello=5.3; int�� ������ ������ double�� ����ؾ� �Ѵ�.
		//int i+j=4; Ư�����ڴ� _�� $�� ������� +�� ��� �ȵȴ�.
		//int public=5; public�� ������ ����� �ȵȴ�.
		//int i#2=5; Ư������ #�� ����� �ȵȴ�.
		//int MyCatAge=10; ����� �����ϳ� ���������� ������ ������ �ҹ��ڷ� �Ѵ�.
		//int mycatage=20; ��� �����ϳ� ���������� ���� �ܾ� ������ ù �ܾ� ���Ĵ� ù���ĺ��� �빮�ڷ� �Ѵ�.
		//class myCat(){} ��� �����ϳ� ���������� Ŭ������ �빮�ڷ� �����ϰ� ���� �ܾ�� ���� �ܾ�鵵 ù ���ĺ��� �빮�ڷ� �Ѵ�.
		
		
		//�迭
		
		//�迭 a�� 1,2,3�� ���� �� �迭 ���� ��� ���� 2�� ���� ���� 
		//3,4,5�� ������ ������ �迭�� ������ ȭ�鿡 ���
//		int a[]= {1,2,3};
//		for(int i=0; i<3; i++) {
//			a[i]=a[i]+2;
//			System.out.println(a[i]);
//		}
		
		//�迭 a[10]�� 3�� ����� ���� ������ �迭�� ������ ���
//		int a[]=new int[10];
//		int i;
//		for(i=0; i<10; i++) {
//			a[i]=(i+1)*3;
//			System.out.println(a[i]);
//		}
		
		//�迭 a[100]�� 1���� 100������ ���ڸ� ������� ���� ����
		//�迭�� �ε����� ¦���� �迭�� ��� �ִ� ���� ���
//		int a[]=new int[100];
//		for(int i=0; i<100; i++) {
//			a[i]=i+1;
//			if(i%2==0) {
//				System.out.println(a[i]);
//			}
//		}
		
		//�迭 a[]={12,1,5,3,6,8,5,3}�� ���� ������ �迭��
		//��� ������ ���� ���� sum�� �����Ͽ� ����ϴ� �ڵ�
//		int sum=0;
//		int a[]= {12,1,5,3,6,8,5,3};
//		for(int i=0; i<8; i++) {
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
		
		//a[]={12,1,5,3,6,8,5,3}�� a�迭���� �迭 ���� ���ڰ�
		//¦���� 12,6,8�� ���� ���� ��� ���� ����ϴ� ���α׷�
//		int a[]= {12,1,5,3,6,8,5,3};
//		int sum=0;
//		for(int i=0; i<8; i++) {
//			if(a[i]%2==0) {
//				sum=sum+a[i];
//			}
//		}
//		System.out.println(sum);
		
		//a[]={12,1,51,3,6,8,5}�� a�迭���� ���� ū ����
		//���� ���� ���� ���ϴ� ���α׷�
//		int a[]= {12,1,51,3,6,8,5};
//		int max=a[0];
//		int min=a[0];
//		for(int i=1; i<7; i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//			if(a[i]<min) {
//				min=a[i];
//			}
//		}
//		int sum=max+min;
//		System.out.println(sum);
		
		//�迭�� 5���� ���ڸ� �Է¹޾� ���� ���� ���� �ϳ��� �Է¹޾�
		//�ش� ���ڰ� ���° �ε����� ��� �ִ��� ���
//		int a[]=new int[5];
//		for(int i=0; i<5; i++) {
//			System.out.print("���� �Է�>>");
//			int b=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			a[i]=b;
//		}
//		System.out.println("������ �Է��� ���� �� �ϳ� �Է�>>");
//		int c=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		for(int i=0; i<5; i++) {
//			if(a[i]==c) {
//				System.out.println(c+"�� "+i+"�� �ε����� ��� �ִ�.");
//			}
//		}
		
		//�迭�� 5���� ���ڸ� �Է¹޾� ���� ���� ���� �ϳ��� �Է¹޾�
		//�ش� ���ڰ� ���° �ε����� ��� �ִ��� ���
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		String a[]=new String[5];
//		for(int i=0; i<5; i++) {
//			System.out.println("���� �Է�>>");
//			String str1=scanner.next();
//			a[i]=str1;
//		}
//		System.out.println("������ �Է� �ߴ� ���� �� �ϳ� �Է�>>");
//		String str2=scanner.next();
//		for(int i=0; i<5; i++) {
//			if(a[i].equals(str2)) {
//				System.out.println(str2+"�� "+i+"�� �ε����� ��� �ִ�.");
//			}
//		}
		
		//�迭 ũ�⸦ �Է¹޾� �迭 ũ�� ��ŭ 1,2,3,1,2,3,1,2,3..
		//���ڸ� ������� �迭�ȿ� ���� ���� �迭�� ������ ���
//		System.out.print("���� �Է�>>");
//		int i=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int a[]=new int[i];
//		for(int j=0; j<i; j++) {
//			a[j]=(j%3)+1;
//			System.out.println(a[j]);
//		}
		
		//�迭�� ����ִ� ������ ������ �������� �����ϴ� ���ο� �迭�� ����� ���
		//ex. �迭�� 1,2,3�� ��� ������ 1,2,3,3,2,1�� ��� �ִ� �迭
		//�迭�� 7,15,23,15,23�� ��� ������ 23,15,23,15,7,7,15,23,15,23
//		int a[]= {1,8,5,15};
//		int c=0;
//		int b[]=new int[8];
//		for(int i=0; i<8; i++) {
//			if(i<4) {
//				b[i]=a[c];
//				c++;
//			}else {
//				c--;
//				b[i]=a[c];
//				}
//			System.out.print(b[i]+" ");
//		}
		
		//�迭 1,2,3,4,5,6,7,8,9���� �̵�����, �̵�ĭ��, ä����ڸ� �Է� �޾� �迭�� ���� ���� �� ���
		//ex. �Է� ���� 3 2     ��� 4,5,6,7,8,9,2,2,2
		//ex. �Է� ������ 3 4   ��� 4,4,4,1,2,3,4,5,6
//		int a[]= {1,2,3,4,5,6,7,8,9};
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("�̵� ����(������, ����)>>");
//		String moveD=scanner.next();
//		System.out.print("�̵� ĭ��>>");
//		int moveNum=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("�� ���� ä�� ����>>");
//		int num1=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		for(int i=0; i<9; i++) {
//			if(moveD.equals("������")) {
//				if(i<moveNum) {
//					a[i]=num1;
//				}else {
//					a[i]=i-(moveNum-1);
//				}
//			}else {
//				if(i<(9-moveNum)) {
//					a[i]=i+moveNum+1;
//				}else {
//					a[i]=num1;
//				}
//			}
//			System.out.print(a[i]+" ");
//		}

		//�迭 1,2,3,4,5,6,7,8,9���� ȸ������� ȸ���� �Է¹޾� �迭 ������ ȸ����Ű�� ���
		//ex.�Է� ���� 2    ��� 3,4,5,6,7,8,9,1,2
		//ex.�Է� ������ 3  ��� 7,8,9,1,2,3,4,5,6
		int a[]= {1,2,3,4,5,6,7,8,9};
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.print("�̵� ����(������, ����)>>");
		String moveD=scanner.next();
		System.out.print("�̵� ĭ��>>");
		int moveNum=Integer.parseInt(new java.util.Scanner(System.in)
				.nextLine());
		System.out.print("�� ���� ä�� ����>>");
		int num1=Integer.parseInt(new java.util.Scanner(System.in)
				.nextLine());
		
		
		

		

			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
