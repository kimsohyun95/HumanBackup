package com.human.ex;
import java.util.Arrays;

import com.human.dto.*;
public class JavaStart004 {

	public static void main(String[] args) {
		// �迭
		
		//int arr1[] = new int[3];
		int arr1[] = {1,2,3};
		arr1[1]=5;
		System.out.println(arr1[1]); 
		
		double arr2[] = {1.1,2.1,3.1};
		arr2[0]=1.5;
		System.out.println(arr2[0]);
		
		String arr3[] = {"������", "�����", "�ؾ�"};
		arr3[2]="�ܽ���";
		System.out.println(arr3[0]);
		
		Human arr4[]=new Human[3];
		arr4[0]=new Human();
		arr4[0].name="ȫ�浿";
		arr4[0].age=15;
		arr4[0].height=154.1;

		
		arr4[1]=new Human();
		arr4[1].name="ȫ�泲";
		arr4[1].age=25;
		arr4[1].height=157.1;
		
		arr4[2]=arr4[0];
		arr4[2].age=18;
		System.out.println(arr4[2].age);
		
		
		System.out.println(arr3);
		System.out.println(Arrays.toString(arr3));
		
		System.out.println(Arrays.toString(arr4));
		
		System.out.println(arr4[0]);

		
		arr4[1].name="ȫ�浿";
		arr4[1].age=15;
		arr4[1].height=154.1;
		System.out.println(arr4[0]==arr4[1]); //false
		System.out.println(arr4[0].equals(arr4[1])); //false
		//�ذ� ������ ���⼭ .equals�� false�� ������ ������ arr4[2].age=18;�� ����Ǿ��� �����̰�
		//�Ʒ������� �ٽ� arr4[0]�� �����͸� �ٲ�⶧���� true�� ����

		
		//�������Լ�
		//�۾��ϸ� �ּҷ� ��µǴ��� �����ͷ� ���?
		arr4[0]=new Human("ȫ�浿", 15, 154.1);
		System.out.println(arr4[0]);
		
		System.out.println(arr4[0]==arr4[1]); 
		System.out.println(arr4[0].equals(arr4[1]));
		//�� �� �� �ּ� �񱳷� false����

		
		

	}

}
