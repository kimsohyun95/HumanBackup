package com.human.ex;
//이중반복문
public class JavaStart006 {


	public static void main(String[] args) {
		//1.369게임 해답지 만들기
		//3,6,9중 하나라도 들어가면 "짝"
		//33,36과 같이 두개 들어가면 "짝짝"
		//10000이하
		for(int i=1; i<=1000; i++) {
			int a=i%10; //1의 자리 369찾기
			int b=i/10; //10의 자리 369찾기
			int c=i/100; //100의 자리369찾기
			if(i>100) {
				b=(i/10)-(i/100)*10;
			}
			if((a==3||a==6||a==9)&&
					(b==3||b==6||b==9)&&
					(c==3||c==6||c==9)) {
				System.out.println("짝짝짝"+"("+i+")");
			}else if((c==3||c==6||c==9)&&
					(a==3 ||a==6||a==9||
					b==3||b==6||b==9)) {
				System.out.println("짝짝"+"("+i+")");
			}else if((a==3||a==6||a==9)&&
					(b==3||b==6||b==9)) {
				System.out.println("짝짝"+"("+i+")");
			}else if(a==3||a==6||a==9||
					b==3||b==6||b==9||
					c==3||c==6||c==9) {
				System.out.println("짝"+"("+i+")");
			}else{
				System.out.println(i);
			}
		}
	}	
}
