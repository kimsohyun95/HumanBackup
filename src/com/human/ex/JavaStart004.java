package com.human.ex;
import com.human.dto.*;
public class JavaStart004 {

	public static void main(String[] args) {
		// ¹è¿­
		
		//int arr1[] = new int[3];
		int arr1[] = {1,2,3};
		arr1[1]=5;
		System.out.println(arr1[1]);
		
		double arr2[] = {1.1,2.1,3.1};
		arr2[0]=1.5;
		System.out.println(arr2[0]);
		
		String arr3[] = {"°­¾ÆÁö", "°í¾çÀÌ", "ºØ¾î"};
		arr3[2]="ÇÜ½ºÅÍ";
		System.out.println(arr3[0]);
		
		Human arr4[]=new Human[3];
		arr4[0]=new Human();
		arr4[0].name="È«±æµ¿";
		arr4[0].age=15;
		arr4[0].height=154.1;
		
		arr4[1]=new Human();
		arr4[1].name="È«±æ³²";
		arr4[1].age=25;
		arr4[1].height=157.1;
		
		arr4[2]=arr4[0];

	}

}
