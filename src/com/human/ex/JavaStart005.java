package com.human.ex;

public class JavaStart005 {


	//ÇÔ¼ö
	
	//+ (add)
	public static int sum(int a, int b) {
		int sum=0;
		sum=a+b;
		return sum;
	}
	
	//- (min)
	public static int sum2(int c, int d) {
		int sum2=0;
		sum2=c-d;
		return sum2;
	}
	
	//* (mul)
	public static int sum3(int e, int f) {
		int sum3=0;
		sum3=e*f;
		return sum3;
	}
	
	// /(div)
	public static int sum4(int g, int h) {
		int sum4=0;
		sum4=g/h;
		return sum4;
	}

	public static void main(String[] args) {
		int a=sum(1,2);  //1+2=3
		int b=a+sum(2,2); //3+(2+2)=7
		System.out.println(a+b); //10
		
		int c=sum2(1,2); //1-2=-1
		int d=c+sum2(2,2); //-1-(2-2)=-1
		System.out.println(c-d); //-1-(-1)=0
		
		int e=sum3(1,2); //1*2=2
		int f=e+sum3(2,2); //2+(2*2)=6
		System.out.println(e*f); //2*6=12
		
		int g=sum4(8,2); // 8/2=4
		int h=g/sum4(7,2); // 4/(7/2)=4/3=1
		System.out.println(g/h); // 4/1=4
		
		
		
	



	}

}
