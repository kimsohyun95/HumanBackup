package com.human.ex;

import java.util.Arrays;



public class JavaStart011����Ǯ�� {

	public static void main(String[] args) {
		//4�� �迭 a[]={12,1,5,3,6,8,5,3}�� ���� ������ �迭�� ��� ������
		//���� ���� sum�� �����Ͽ� ���
//		int a[]= {12,1,5,3,6,8,5,3};
//		int sum=0;
//		for(int i=0; i<a.length; i++) {
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
//		
//		//for(�迭, �÷��� �ȿ� �ִ� �ϳ��� ������:[�迭�̳� �÷���]){
//		sum=0;
//		for(int i:a) { //a�� �ִ� ��� �迭�� �ϳ��� i�� ����Ǹ鼭 �ݺ�
//			sum=sum+i;
//		}
//		System.out.println(sum);
//		//�б���� i���� 0���� �ٲ㵵 �迭�� ������ ���� ���� ����
//		for(int i:a) {
//			i=0;
//		}
//		System.out.println(Arrays.toString(a));
//		//��ü�� ���
//		
//		Human aH[]= {
//				new Human("ȫ1"1,1),
//				new Human("ȫ2"12,12),
//				new Human("ȫ3"13,13),
//		};
//		for(Human h:aH) {
//			h.age=100; //���� �����Ͱ� ���� ��
//			h=new Human("ȫ1",99,99); //���� �����Ͱ� ������� ����
//		}
//		System.out.println(Arrays.toString(aH));
		
		
		
		
//---------------------------------------------------------------------------	
		
		//5�� �迭 1,2,3,4,5,6,7,8,9���� �̵�����, �̵�ĭ��, ä����ڸ� �Է¹޾�
		//�迭�� ������ ���� �� ���
		
//		int a[]= {1,2,3,4,5,6,7,8,9};
//		String direction="";
//		int moveCount=1;
//		int changeNum=3;
//		
//		moveFunc(a,direction,moveCount,changeNum);
//		//�̵��۾�
//		
//		System.out.println(Arrays.toString(a));
//		}
//		
//
//	private static void moveFunc(int[] a, String direction
//			, int moveCount, int changeNum) {
		//1. a�迭�� ������ ���������� 1ĭ shift�ϴ� �۾�
//		int temp=a[a.length-1]; //���������� �����ϸ� ����Ʈ�ϸ� 4�� ������� temp�� 4�� ���� 
//		for(int i=a.length-2; i>0;i--) {
//			a[i+1]=a[i];
//		}
//		a[0]=temp;
		
		//2. moveCount��ŭ 1ĭ shift�۾��� �ݺ��Ѵ�.
//		for(int j=0; j<moveCount; j++) {
//			int temp=a[a.length-1];
//			for(int i=a.length-2; i>0;i--) {
//				a[i+1]=a[i];
//			}
//			a[0]=temp;
//		}
		
		//3.changeNum�� �����غ���. 0���� ������ ���� �迭�� ��, �ƴϸ� �ش� ���� ����
//		if(direction.equals("������")) {
//			for(int j=0; j<moveCount; j++) {
//				int temp=a[a.length-1];
//				if(changeNum>=0) {
//					temp=changeNum;
//				}
//				for(int i=a.length-2; i>0;i--) {
//					a[i+1]=a[i];
//				}
//				a[0]=temp;
//			}
//		}else {
//			
//		}
		
		
		
//-----------------------------------------------------------------------------
		//7�� �迭�� 100�� �����Ͽ� 0~99���� ���� ���� i=2���� 50���� i�� ������ i�� ����� ���� �ε�����
		//0�� ���� ���� �迭�� 0�� �ƴ� ���� ���
		//��� ����� ��� �Ҽ��ε� ������ ���� �� ����.
		
//		int arr[]=new int[100];
//		for(int k=0; k<100; k++) {
//			arr[k]=k;
//		}
//		for(int i=2; i<50; i++) {// 3.���� �۾��� 2���� 50����
//			for(int j=i+i; j<=99; j=j+i) { // 1. i�� ������ i�� ��� ã��
//				arr[j]=0; //2. i����� �ε����� 0�ֱ�
//			}
//		}
//		for(int i:arr) {
//			if(i!=0) {
//				System.out.println(i);
//			}
//		}
		
		
		
//------------------------------------------------------------------------------		
		//8�� ��ǻ�Ϳ��� �ֻ��� ������ ���α׷��� �����Ͽ�����
		//������ ���� ���� ��(ȸ��)�� ���ϴ� ���α׷��� �ۼ��� ����.
		
		//int arr[]=new int[6]; //�迭 ����
		int arr[]={0,0,0,0,0,0}; //�迭 �ʱ�ȭ
		
		for(int i=0; i<2000; i++) {
			int rNum=(int)(Math.random()*6);
			arr[rNum]++;
		}
		System.out.println(Arrays.toString(arr)); 
		//[1�� ���� Ƚ��, 2Ƚ��, 3Ƚ��, 4Ƚ��, 5Ƚ��, 6Ƚ��]
		//���ĺ� �󵵼� 'a'-'a'==0 'b'-'a'==1

		
	}

	}
