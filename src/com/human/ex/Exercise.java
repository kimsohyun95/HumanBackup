package com.human.ex;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		String id[]=new String[100];
		String pw[]=new String[100];
		String name[]=new String[100];
		double account[]=new double[100];
		
		String inputId=null;
		String inputPw=null;
		int indexCount=0;
		
		double inMoney=0;
		double outMoney=0;
		
		
		while(true) {
			System.out.println("로그인 하세요");
			System.out.print("ID >> ");
			inputId=sc.nextLine();
			System.out.print("PW >> ");
			inputPw=sc.nextLine();
			
			if(inputId==null) {
				
			}else if(inputId.equals("exit")) {
				break;
			}else if(inputId.equals("admin")&&inputPw.equals("admin")) {
				//관리자 계정
				boolean isAdminLogin=true;
				while(isAdminLogin) {
					System.out.println("관리자 계정 입니다.");
					System.out.println("메뉴를 입력 해주세요.");
					System.out.println("1.계정 추가 2.계정 삭제 3.모든 사용자 정보 확인 4.id로 특정 사용자 정보 확인 5.종료");
					int selectNum=Integer.parseInt(sc.nextLine());
				}
				
			}else {
				//일반 사용자 로그인
				boolean isLogin=false;
				for(int i=0; i<id.length; i++) {
					if(id[i]!=null && id[i].equals(inputId)&&pw[i].equals(inputPw)) {
						isLogin=true;
						indexCount=i;
						break;
					}
				}
				
				if(isLogin) {
					//로그인 성공
					System.out.println(name[indexCount]+"님이 로그인 하셨습니다.");
					System.out.println("");
					while(isLogin) {
						System.out.println("메뉴를 입력해 주세요");
						System.out.println("1.입금 2.출금 3.조회 4.종료>>");
						System.out.println("");
						int selectNum=Integer.parseInt(sc.nextLine());
						switch(selectNum) {
						case 1:
							System.out.print("입금하실 금액을 입력 해 주세요.>>");
							inMoney=Double.parseDouble(sc.nextLine());
							account[indexCount]+=inMoney;
							System.out.println(name+"님께서 입금 하신 금액은 "+inMoney+"입니다.");
							break;
						case 2:
							System.out.print("출금하실 금액을 입력 해 주세요.>>");
							outMoney=Double.parseDouble(sc.nextLine());
							if(account[indexCount]>outMoney) {
								account[indexCount]-=outMoney;
								System.out.println(name+"님께서 출금 하신 금액은 "+outMoney+"입니다.");
							}else {
								System.out.println("잔액이 부족합니다.");
							}
							break;
						case 3:
							System.out.println(name+"님의 현재 잔액은 "+account[indexCount]+"입니다.");
							break;
						case 4:
							 System.out.println("로그아웃 되었습니다.");
							 inputId=null;
							 isLogin=false;
							 break;
						default:
							System.out.println("잘못된 입력입니다.\n 다시 입력 해 주세요.");
						}
					}
				}else {
					//로그인 실패
					System.out.println("아이디와 비밀 번호를 다시 확인 하세요.");
					inputId=null;
				}
			
			}
		}	
	}

}
