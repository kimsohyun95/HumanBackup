package com.human.ex;

public class JavaStart006 {


	public static void main(String[] args) {
		//369게임 문제 풀이_JavaStart007
		for(int count=1;count<=1000;count++) {
			if(f369(count)) { //박수치는 함수
				System.out.print(count); //숫자 찍는 부분
			}
			System.out.print("\t");
			if((count+1)%10==0) {
				System.out.println();
			}
		}
		
		
	}

	public static boolean f369(int count) {
		//369 returnValue 박수안치면 true
		boolean isReturnFlag=true;
		while(count!=0) {
			if((count%10%3==0)&&(count%10!=0)) {
				System.out.print("짝");
				isReturnFlag=false;
			}
			count=count/10;
		}
		return isReturnFlag;

	}	
}
