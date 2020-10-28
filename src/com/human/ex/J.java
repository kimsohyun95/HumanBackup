package com.human.ex;

public class J {

	public static void main(String[] args) {
		for(int count=1; count<=1000; count++) {
			if(f369(count)) {
				System.out.print(count);
			}
			System.out.print("\t");
			if((count+1)%10==0) {
				System.out.println();
			}
		}

	}

	private static boolean f369(int count) {
		boolean isReturnFlag=true;
		while(count!=0) {
			if((count%10%3==0) && (count%10!=0)) {
				System.out.print("¦");
				isReturnFlag=false;
			}
			count=count/10;
		}
		return isReturnFlag;
	}

}
