package com.human.ex;

public class JavaStart007 {

	public static void main(String[] args) {
		// 이중반복문
		// 1.상위 왼쪽의 이미지를 기본으로 원하는 결과를 출력할 수 있도록 a값을 설정할 수 있는 코드를 구현
		
		
		//은행 프로그램 '전체메뉴: 1.입금 2.출금 3.조회 0.종료'
		//account 변수 0으로 세팅, 입금 출금을 통에 원하는 액수 더하거나 빼주기
		//account변수에 있는 숫자가 은행계좌에 남은 돈이 된다.
//		
//		int inputString=9;
//		int account=0;
//		while(inputString!=0) {
//			System.out.println("전체메뉴: 1.입금 2.출금 3.조회 0.종료");
//			inputString=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			switch(inputString) {
//			case 1 :
//				System.out.print("입금 금액>>");
//				int a=Integer.parseInt(new java.util.Scanner(System.in)
//						.nextLine());
//				account=account+a;
//				break;
//			case 2 :
//				System.out.print("출금 금액>>");
//				int b=Integer.parseInt(new java.util.Scanner(System.in)
//						.nextLine());
//				if(account<b) {
//					System.out.println("잔액이 부족합니다.");
//				}else {
//					account=account-b;
//				}
//				break;
//			case 3 :
//				System.out.println("현재 잔액>> "+account);
//				break;
//			case 0:
//				System.out.println("종료");
//				break;
//			default :
//				System.out.println("다시 선택하세요");
//			
//			}
//		}
		
		//금액을 입력받아 천원, 오백원, 백원, 오십원, 십원 짜리 잔돈으로 거슬러 주는 프로그램 구현
		//선언 변수 : change1000, change500, change100, change50, change10, moneyInput
		
//		System.out.print("금액 입력 >> ");
//		int moneyInput=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		
//		int change1000=moneyInput/1000;
//		int change500=(moneyInput%1000)/500;
//		int change100=(moneyInput%500)/100;
//		int change50=(moneyInput%100)/50;
//		int change10=(moneyInput%50)/10;
//		System.out.println("천원짜리 "+change1000+"개, "+"오백원짜리 "+change500+
//				"개, "+"백원짜리 "+change100+"개, "+"오십원짜리 "+change50+
//				"개, "+"십원짜리 "+change10+"개");
		
		//실존하는 자판기와 동일하게 만들어 보자.
		//남은 돈0원. 1.사이다 700 2.콜라 500 3.환타 350 4.100투입 5.500투입 6.반환
//		int inputString=9;
//		int account=0;
//		String str="";
//		while(inputString!=6) {
//			System.out.println("남은 돈 : "+account);
//			System.out.println("1.사이다 700원 2.콜라 500원 3.환타 350원 4.100원 투입 5.500원 투입 6.반환");
//			inputString=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			switch(inputString) {
//			case 1:
//				if(account<700) {
//					System.out.println("잔액이 부족합니다.");
//				}else {
//					str=str+"사이다\t";
//					account=account-700;
//				}
//				break;
//			case 2:
//				if(account<500) {
//					System.out.println("잔액이 부족합니다.");
//				}else {
//					str=str+"콜라\t";
//					account=account-500;
//				}
//				break;
//			case 3:
//				if(account<350) {
//					System.out.println("잔액이 부족합니다.");
//				}else {
//					str=str+"환타\t";
//					account=account-350;
//				}
//				break;
//			case 4:
//				System.out.print("100원 투입 개수>>");
//				int money100=Integer.parseInt(new java.util.Scanner(System.in)
//						.nextLine());
//				account=account+(100*money100);
//				break;
//			case 5:
//				System.out.println("500원 투입 개수>>");
//				int money500=Integer.parseInt(new java.util.Scanner(System.in)
//						.nextLine());
//				account=account+(500*money500);
//				break;
//			case 6:
//				int change1000=account/1000;
//				int change500=(account%1000)/500;
//				int change100=(account%500)/100;
//				int change50=(account%100)/50;
//				System.out.println(str);
//				System.out.println("천원짜리 "+change1000+"개 "+
//						"오백원짜리 "+change500+"개 "+
//						"백원짜리 "+change100+"개 "+
//						"오십원짜리 "+change50+"개 ");
//				break;
//			default:
//				System.out.println("다시 입력하세요");
//					
//			}
//		}
		
		//아래처럼 출력
		//1)1**********************1 (*=22개)
//		System.out.print(1);
//		for(int i=0; i<22; i++) {
//		System.out.print("*");	
//		}
//		System.out.print(1);
		//2)*****1*****1*****1*****1
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print("*");
//			}
//			System.out.print(1);
//		}
		//3)2*****2*****2*****2*****
//		for(int i=0; i<4; i++) {
//			System.out.print(2);
//			for(int j=0; j<5; j++) {
//				System.out.print("*");
//			}
//		}
		//4)21**********************1
//		System.out.print(2);
//		System.out.print(1);
//		for(int i=0; i<22; i++) {
//			System.out.print("*");
//		}
//		System.out.print(1);
		//5)1****21****21****21****2
//		for(int i=0; i<4; i++) {
//			System.out.print(1);
//			for(int j=0; j<4; j++) {
//				System.out.print("*");
//			}
//			System.out.print(2);
//		}
		//6)1111****21111****21111****21111****2
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.print(1);
//			}
//			for(int k=0; k<4; k++) {
//				System.out.print("*");
//			}
//			System.out.print(2);
//		}
		//7)1111****22221111****22221111****2222
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.print(1);
//			}
//			for(int k=0; k<4; k++) {
//				System.out.print("*");
//			}
//			for(int l=0; l<4; l++) {
//				System.out.print(2);
//			}
//		}
		//8)111122223333444411112222333344441111222233334444
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.print(1);
//			}
//			for(int k=0; k<4; k++) {
//				System.out.print(2);
//			}
//			for(int l=0; l<4; l++) {
//				System.out.print(3);
//			}
//			for(int m=0; m<4; m++) {
//				System.out.print(4);
//			}
//		}
		
		//사용자에게 1~9사이에 숫자를 받아서 그에 해당하는 구구단 단을 출력
//		System.out.print("1~9까지 숫자 입력>>");
//		int i=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		for(int j=1; j<10; j++) {
//			int sum=i*j;
//			System.out.println(i+"x"+j+"="+sum);
//		}
		
		//상위 3개의 이미지를 보고 어떤 결과가 출력되는지
		//1)
//		for(int i=3; i<=5; i++) {
//			for(int j=6; j<=8; j++) {
//				System.out.println("("+i+","+j+")");
//			}
//		}
		//2)
//		for(int i=1; i<=3; i++) {
//			for(int j=4; j<=8; j+=2) {
//				System.out.println("("+i+","+j+")");
//			}
//		}
		//3)
//		for(int i=2; i<=6; i+=2) {
//			for(int j=1; j<=3; j++) {
//				System.out.println("("+i+","+j+")");
//			}
//		}
		
		//이미지와 같은 형태의 구구단을 출력
		//1)
//		for(int i=1; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				int sum=i*j;
//				System.out.print(i+"*"+j+"="+sum+"\t");
//			}
//			System.out.println("");
//		}
		//2)
//		for(int i=1; i<=9; i++) {
//			System.out.println(i+"단");
//			for(int j=1; j<=9; j++) {
//				int sum=i*j;
//				System.out.println(i+"*"+j+"="+sum);
//			}
//		}
		//3)
//		int b=1;
//		for(int a=0; a<3; a++) {
//			for(int i=1; i<=9; i++) {
//				for(int j=b; j<b+3; j++) {
//					int sum=i*j;
//					System.out.print(j+"*"+i+"="+sum+"\t");
//				}
//				System.out.println("");
//			}
//			b=b+3;
//			System.out.println("");
//		}
		
		//별찍기
		//1)*엔터**엔터***엔터****엔터*****엔터******엔터*******엔터
//		for(int i=0; i<7; i++) {
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.print("엔터");
//		}
		//2)*******엔터******엔터*****엔터****엔터***엔터**엔터*엔터
//		for(int i=0; i<7; i++) {
//			for(int j=0; j<7-i; j++) {
//				System.out.print("*");
//			}
//			System.out.print("엔터");
//		}
		//3)공간공간공간공간공간공간*엔터공간공간공간공간공간**엔터공간공간공간
		//공간***엔터공간공간공간****엔터공간공간*****엔터공간******엔터*******엔터
//		for(int i=0; i<7; i++) {
//			for(int j=0; j<6-i; j++) {
//				System.out.print("공간");
//			}
//			for(int k=0; k<i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.print("엔터");
//		}
		//1-1)
//		for(int i=0; i<7; i++) {
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//2-1)
//		for(int i=0; i<7; i++) {
//			for(int j=0; j<7-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//3-1)
//		for(int i=0; i<7; i++) {
//			for(int j=0; j<6-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//다양한 별 찍기
		//1)
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//2)
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<8-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//3)
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<9-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//4)
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<9-i; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//5)
//		int a=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<a+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a++;
//			}else {
//				a--;
//			}
//		}
		//6)
//		int a=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<4-a; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<a+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a++;
//			}else {
//				a--;
//			}
//		}
		//7)
//		int a=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<5-a; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a++;
//			}else {
//				a--;
//			}
//		}
		//8)
//		int a=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<a; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<5-a; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a++;
//			}else {
//				a--;
//			}
//		}
		//9)
//		int a=0;
//		int b=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<5-a; j++) {
//				System.out.print("*");
//			}
//			for(int k=0; k<b+1; k++) {
//				System.out.print(" ");
//			}
//			for(int l=0; l<5-a; l++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a++;
//				b+=2;
//			}else {
//				a--;
//				b-=2;
//			}
//		}
		//10)
//		int a=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<8-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<a+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			a+=2;
//		}
		//11)
//		int a=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<17-a; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			a+=2;
//		}
		//12)
//		int a=0;
//		int b=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<b; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<9-a; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i<4) {
//				a+=2;
//				b++;
//			}else {
//				a-=2;
//				b--;
//			}
//		}
		//13)
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
