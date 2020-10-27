package com.human.ex;
// 이중반복문

public class JavaStart007 {
	
	//사칙연산
	public static String function1(int a, int b) {
		String sum=a+"+"+b+"=";
		return sum;
	}
	public static String function2(int a, int b) {
		String min=a+"-"+b+"=";
		return min;
	}
	public static String function3(int a, int b) {
		String mul=a+"x"+b+"=";
		return mul;
	}
	public static String function4(int a, int b) {
		String div=a+"/"+b+"=";
		return div;
	}
	


	public static void main(String[] args) {
		//랜덤하게 덧셈, 뺄셈, 곱셈, 나눗셈 문제를 내서 사용자가 맞추는 프로그램 구현
		//레벨 4단계, 처음에는 더하기 문제만 나오다가 레벨이 업되면 뺄셈, 곱셈, 나눗셈을 차례대로 추가
		//2자리 이하 정수 계산만
		int num4=0;
		int count=0;
		for(int lev=1; lev<5;) {
			int num1=(int)(Math.random()*99+1);
			int num2=(int)(Math.random()*99+1);
			int num3=(int)(Math.random()*lev+1);
			
			System.out.println("level "+lev);
			if(lev==1) {
				System.out.println(function1(num1,num2));
				num4=num1+num2;
			}else if(lev==2) {
				if(num3==1) {
					System.out.println(function1(num1,num2));
					num4=num1+num2;
				}else {
					System.out.println(function2(num1,num2));
					num4=num1-num2;
				}
			}else if(lev==3) {
				if(num3==1) {
					System.out.println(function1(num1,num2));
					num4=num1+num2;
				}else if(num3==2) {
					System.out.println(function2(num1,num2));
					num4=num1-num2;
				}else {
					System.out.println(function3(num1,num2));
					num4=num1*num2;
				}
				
			}else {
				if(num3==1) {
					System.out.println(function1(num1,num2));
					num4=num1+num2;
				}else if(num3==2) {
					System.out.println(function2(num1,num2));
					num4=num1-num2;
				}else if(num3==3) {
					System.out.println(function3(num1,num2));
					num4=num1*num2;
				}else {
					System.out.println(function4(num1,num2));
					num3=num1/num2;
				}
			}
			int a=Integer.parseInt(new java.util.Scanner(System.in)
					.nextLine());
			if(a==num4) {
				System.out.println("정답");
				count++;
			}else {
				System.out.println("땡");
			}
			if(count==5) {
				System.out.println("레벨 업");
				lev++;
				count=0;
			}
			System.out.println("게임 종료");
			
		}
		



			
			


		
		
		
		
		
		
		
	}

}
