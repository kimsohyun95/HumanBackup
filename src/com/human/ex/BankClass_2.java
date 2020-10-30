package com.human.ex;

import java.util.Scanner;

public class BankClass_2 {
	//013_2문제풀이
	

		public static Scanner sc=new Scanner(System.in);
		public static int listCount=3;
		public static String id[]=new String[100];
		public static String pw[]=new String[100];
		public static double account[]=new double[100];
		public static double outMoney=0;
		
		public static String inputId=null;
		public static String inputPw=null;
		public static int indexCount=0;
		
		public static void init() { 
			id[0]="a1"; id[1]="a2"; id[2]="a3";      
			pw[0]="a1"; pw[1]="a1"; pw[2]="a3";       
			account[0]=1; account[1]=2; account[2]=3; 
		}
		public static void adminMenu() {
			//관리자 계정
			boolean isAdminLogin=true;
			while(isAdminLogin) {
				System.out.println("관리자 계정");
				System.out.println("1.계정 추가 2.계정 삭제 3.모든 사용자 정보 확인 4.id로 특정 사용자 정보 확인 5.종료");
				System.out.println("메뉴 입력>>");
				int selectNum=Integer.parseInt(sc.nextLine());
				switch(selectNum) {
				case 1:
					System.out.println("추가할 사용자 정보 입력");
					System.out.println("ID>> ");
					id[listCount]=sc.nextLine();
					System.out.println("PW>> ");
					pw[listCount]=sc.nextLine();
					account[listCount]=0;
					listCount++;
					System.out.println("사용자 정보가 추가 되었습니다.");
					break;
				case 2:
					System.out.println("삭제할 사용자 정보 입력");
					System.out.println("ID>> ");
					String deleteId=sc.nextLine();
					int findIndex=-1;
					for(int i=0; i<listCount; i++) {
						if(id[i].equals(deleteId)) {
							findIndex=i;
							break;
						}
					}
					if(findIndex<0) {
						System.out.println("없는 아이디 입니다.");
					}else {
						for(int i=findIndex; i<id.length-1; i++) { 
							id[i]=id[i+1];
							pw[i]=pw[i+1];
							account[i]=account[i+1];
						}
						listCount--;
						System.out.println("사용자 정보가 삭제 되었습니다.");
					}
					break;
				case 3:
					System.out.println("모든 사용자 정보 출력 : ");
					for(int i=0; i<listCount; i++) {
						System.out.println(i+"번------------------------------------------");
						System.out.println("ID>> "+id[i]);
						System.out.println("PW>> "+pw[i]);
						System.out.println("account>> "+account[i]);
					}
					if(listCount==0) {
						System.out.println("존재하는 데이터가 없습니다.");
					}
					break;
				case 4:
					System.out.println("찾을 ID를 입력하세요");
					System.out.println("ID>> ");
					String findID=sc.nextLine();
					boolean isFind=false; 
					for(int i=0; i<listCount; i++) {
						if(id[i].equals(findID)) {
							System.out.println("ID>> "+id[i]);
							System.out.println("PW>> "+pw[i]);
							System.out.println("account>> "+account[i]);
							isFind=true;
						}
					}
					if(!isFind) { 
						System.out.println("없는 아이디 입니다.");
					}
					
					
					break;
				case 5:
					isAdminLogin=false;
					inputId=null;
					System.out.println("로그아웃 되었습니다.");
					break;
				default :
					System.out.println("잘못된 입력입니다.");

				}
			}//isAdminLogin while문 종료.
			
		}
		public static void mainMenu() {
			System.out.println("id와 pw를 입력하세요");
			System.out.println("ID>> ");
			inputId=sc.nextLine();
			if(inputId.contentEquals("exit")) {
				return;
			}
			System.out.println("PW>> ");
			inputPw=sc.nextLine();
		}
		private static void userMenu() {
			//일반사용자 로그인
			boolean isLogin=false;
			for(int i=0; i<id.length; i++) {
				if(id[i]!=null&&id[i].equals(inputId)&&pw[i].equals(inputPw)) {
					isLogin=true;
					indexCount=i;
					break;
				}
			}


			if(isLogin) {
				//로그인 성공
				System.out.println(inputId
						+"님이 로그인 하였습니다.");
				while(isLogin) {
					System.out.println("1.입금 2.출금 3.확인 4.종료>>");
					int selectNum=Integer.parseInt(sc.nextLine());
					switch(selectNum) {
					case 1:
						System.out.println("1.입금, 입금 하실 금액을 입력하세요>> ");
						account[indexCount]+=Double.parseDouble(sc.nextLine());
						System.out.println(inputId
								+"님의 현재 금액 : "+account[indexCount]);
						break;
					case 2:
						System.out.println("2.출금, 출금 하실 금액을 입력하세요>> ");
						outMoney=Double.parseDouble(sc.nextLine());
						if(account[indexCount]>outMoney) {
							account[indexCount]-=outMoney;
						}else {
							System.out.println("금액이 부족합니다.");
						}
						System.out.println(inputId
								+"님의 현재 금액 : "+account[indexCount]);
						break;
					case 3:
						System.out.println(inputId
								+"님의 현재 금액 : "+account[indexCount]);
						break;
					case 4:
						System.out.println("로그아웃 되었습니다.");
						inputId=null;
						isLogin=false;
						break;
					default:
						System.out.println("잘못된 입력 입니다. \n다시 입력해 주세요");
					}
				}
		
			}else {
				//로그인 실패 - 로그인 화면으로 돌아가기
				inputId=null;
			
			
						
			}
			
		}
		public static void play() {
			while(true) {
				mainMenu();

				if(inputId==null) {
				}else if(inputId.equals("exit")) {
					break;
				}else if(inputId.equals("admin")&&inputPw.equals("admin")) { 
					adminMenu();
					
					
				}else {
					userMenu();
	
				}
			}
			
		}
		
		
		public static void main(String[] args) {
		//메인에서 선언한 지역 변수
			init(); //변수 초기화
			play(); //함수 실행
		

	}

}
