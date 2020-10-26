package com.human.ex;
import java.util.Arrays;

import com.human.dto.*;
public class JavaStart004 {

	public static void main(String[] args) {
		// 배열
		
		//int arr1[] = new int[3];
		int arr1[] = {1,2,3};
		arr1[1]=5;
		System.out.println(arr1[1]); 
		
		double arr2[] = {1.1,2.1,3.1};
		arr2[0]=1.5;
		System.out.println(arr2[0]);
		
		String arr3[] = {"강아지", "고양이", "붕어"};
		arr3[2]="햄스터";
		System.out.println(arr3[0]);
		
		Human arr4[]=new Human[3];
		arr4[0]=new Human();
		arr4[0].name="홍길동";
		arr4[0].age=15;
		arr4[0].height=154.1;

		
		arr4[1]=new Human();
		arr4[1].name="홍길남";
		arr4[1].age=25;
		arr4[1].height=157.1;
		
		arr4[2]=arr4[0];
		arr4[2].age=18;
		System.out.println(arr4[2].age);
		
		
		System.out.println(arr3);
		System.out.println(Arrays.toString(arr3));
		
		System.out.println(Arrays.toString(arr4));
		
		System.out.println(arr4[0]);

		
		arr4[1].name="홍길동";
		arr4[1].age=15;
		arr4[1].height=154.1;
		System.out.println(arr4[0]==arr4[1]); //false
		System.out.println(arr4[0].equals(arr4[1])); //false
		//밑과 같은데 여기서 .equals가 false인 이유는 위에서 arr4[2].age=18;로 변경되었기 때문이고
		//아래에서는 다시 arr4[0]의 데이터를 바꿨기때문에 true가 나옴

		
		//생성자함수
		//작업하면 주소로 출력되던게 데이터로 출력?
		arr4[0]=new Human("홍길동", 15, 154.1);
		System.out.println(arr4[0]);
		
		System.out.println(arr4[0]==arr4[1]); 
		System.out.println(arr4[0].equals(arr4[1]));
		//두 개 다 주소 비교로 false나옴

		
		

	}

}
