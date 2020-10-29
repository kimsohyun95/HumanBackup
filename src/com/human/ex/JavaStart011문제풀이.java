package com.human.ex;

import java.util.Arrays;



public class JavaStart011문제풀이 {

	public static void main(String[] args) {
		//4번 배열 a[]={12,1,5,3,6,8,5,3}을 만든 다음에 배열의 모든 내용을
		//더한 값을 sum에 저장하여 출력
//		int a[]= {12,1,5,3,6,8,5,3};
//		int sum=0;
//		for(int i=0; i<a.length; i++) {
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
//		
//		//for(배열, 컬렉선 안에 있는 하나의 데이터:[배열이나 컬랙션]){
//		sum=0;
//		for(int i:a) { //a에 있는 모든 배열이 하나씩 i에 복사되면서 반복
//			sum=sum+i;
//		}
//		System.out.println(sum);
//		//읽기모드로 i값을 0으로 바꿔도 배열의 내용이 변경 되지 않음
//		for(int i:a) {
//			i=0;
//		}
//		System.out.println(Arrays.toString(a));
//		//객체의 경우
//		
//		Human aH[]= {
//				new Human("홍1"1,1),
//				new Human("홍2"12,12),
//				new Human("홍3"13,13),
//		};
//		for(Human h:aH) {
//			h.age=100; //실제 데이터가 변경 됨
//			h=new Human("홍1",99,99); //실제 데이터가 변경되지 않음
//		}
//		System.out.println(Arrays.toString(aH));
		
		
		
		
//---------------------------------------------------------------------------	
		
		//5번 배열 1,2,3,4,5,6,7,8,9에서 이동방향, 이동칸수, 채울숫자를 입력받아
		//배열의 내용을 변경 후 출력
		
//		int a[]= {1,2,3,4,5,6,7,8,9};
//		String direction="";
//		int moveCount=1;
//		int changeNum=3;
//		
//		moveFunc(a,direction,moveCount,changeNum);
//		//이동작업
//		
//		System.out.println(Arrays.toString(a));
//		}
//		
//
//	private static void moveFunc(int[] a, String direction
//			, int moveCount, int changeNum) {
		//1. a배열의 내용을 오른쪽으로 1칸 shift하는 작업
//		int temp=a[a.length-1]; //오른쪽으로 복사하면 시프트하면 4가 사라져서 temp에 4를 복사 
//		for(int i=a.length-2; i>0;i--) {
//			a[i+1]=a[i];
//		}
//		a[0]=temp;
		
		//2. moveCount만큼 1칸 shift작업을 반복한다.
//		for(int j=0; j<moveCount; j++) {
//			int temp=a[a.length-1];
//			for(int i=a.length-2; i>0;i--) {
//				a[i+1]=a[i];
//			}
//			a[0]=temp;
//		}
		
		//3.changeNum을 설정해보자. 0보다 작으면 원래 배열의 수, 아니면 해당 수로 변경
//		if(direction.equals("오른쪽")) {
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
		//7번 배열을 100개 선언하여 0~99까지 넣은 다음 i=2부터 50까지 i를 제외한 i의 배수와 같은 인덱스에
		//0을 넣은 다음 배열에 0이 아닌 수를 출력
		//출력 결과가 모두 소수인데 이유를 생각 해 보자.
		
//		int arr[]=new int[100];
//		for(int k=0; k<100; k++) {
//			arr[k]=k;
//		}
//		for(int i=2; i<50; i++) {// 3.밑의 작업을 2부터 50까지
//			for(int j=i+i; j<=99; j=j+i) { // 1. i를 제외한 i의 배수 찾기
//				arr[j]=0; //2. i배수의 인덱스에 0넣기
//			}
//		}
//		for(int i:arr) {
//			if(i!=0) {
//				System.out.println(i);
//			}
//		}
		
		
		
//------------------------------------------------------------------------------		
		//8번 컴퓨터에서 주사위 던지는 프로그램을 구현하였을때
		//던져서 나온 수의 빈도(회수)를 구하는 프로그램을 작성해 보자.
		
		//int arr[]=new int[6]; //배열 선언
		int arr[]={0,0,0,0,0,0}; //배열 초기화
		
		for(int i=0; i<2000; i++) {
			int rNum=(int)(Math.random()*6);
			arr[rNum]++;
		}
		System.out.println(Arrays.toString(arr)); 
		//[1이 나온 횟수, 2횟수, 3횟수, 4횟수, 5횟수, 6횟수]
		//알파벳 빈도수 'a'-'a'==0 'b'-'a'==1

		
	}

	}
