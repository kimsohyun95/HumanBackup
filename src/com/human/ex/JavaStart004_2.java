package com.human.ex;

import com.human.dto.Human;

public class JavaStart004_2 {

	public static void main(String[] args) {
//		int a[]= {0,1,2,3};
//		int b[];
//		b=a;
//		b[1]=10;
//		System.out.println(a[1]); //10
//		//공유되서(메모리를 같이 쓰고 있음) 10
//		
//		//값이 분리 되길 원할때
//		//a 0,1,2,3
//		//c 0,10,2,3
//		
//		int c[]=new int[4];  //분리된 메모리 c에 a의 데이터를 복사하는 과정
//		for(int i=0; i<a.length; i++) {
//			c[i]=a[i];
//		}
//		c[1]=20;
//		System.out.println(a[1]); //10(위에서 b[1]에 10을 넣었기때문에 1이 아닌 10이 출력 됨.

		Human arr1[]=new Human[2];
		arr1[0]=new Human("홍길동",10,155.5);
		arr1[1]=new Human("홍길남",10,155.5);
		Human arr2[]=arr1;
		Human arr3[]=new Human[2];
//		for(int i=0; i<arr3.length; i++) {
//			arr3[i]=arr1[i];
//		}
		//홍길남 나이 10을 20으로 변경해보자.
		arr1[1].age=20;
		
		System.out.println(arr1[1].age); //20
		System.out.println(arr2[1].age); //20
//		System.out.println(arr3[1].age); //20
		
		//arr1과 arr3가 다른값을 가질 수 있도록 설계해보자.
//		arr3[0]=new Human();
//		arr3[0].name=arr1[0].name;
//		arr3[0].age=arr1[0].age;
//		arr3[0].height=arr1[0].height;
//
//		arr3[1]=new Human();
//		arr3[1].name=arr1[1].name;
//		arr3[1].age=arr1[1].age;
//		arr3[1].height=arr1[1].height;
		// => 반복문으로
		for(int i=0; i<arr1.length; i++) {
			arr3[i]=new Human();
			arr3[i].name=arr1[i].name;
			arr3[i].age=arr1[i].age;
			arr3[i].height=arr1[i].height;
		}
		arr3[1].age=99;
		//arr1[1].age arr3[1].age은 다른 값을 가지게 된다.

		
		
		
		
		
		
		
		

	}

}
