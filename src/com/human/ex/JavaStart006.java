package com.human.ex;

public class JavaStart006 {


	public static void main(String[] args) {
		//369���� ���� Ǯ��_JavaStart007
		for(int count=1;count<=1000;count++) {
			if(f369(count)) { //�ڼ�ġ�� �Լ�
				System.out.print(count); //���� ��� �κ�
			}
			System.out.print("\t");
			if((count+1)%10==0) {
				System.out.println();
			}
		}
		
		
	}

	public static boolean f369(int count) {
		//369 returnValue �ڼ���ġ�� true
		boolean isReturnFlag=true;
		while(count!=0) {
			if((count%10%3==0)&&(count%10!=0)) {
				System.out.print("¦");
				isReturnFlag=false;
			}
			count=count/10;
		}
		return isReturnFlag;

	}	
}
