package com.human.ex;

public class JavaStart013_2 {
	
	
	public static java.util.Scanner sc=new java.util.Scanner(System.in);
	
	public static String arrId[]= new String[100];
	public static int arrPw[]= new int[100];
	public static String arrName[]= new String[100];
	public static int account[]= new int[100];
	public static int listCount=3;
	
	public static String id="";
	public static int pw=0;
	
	
	
	public static void init() {
		arrId[0]="a1"; arrId[1]="a2"; arrId[2]="a3"; 
		arrPw[0]=123; arrPw[1]=456; arrPw[2]=789;
		arrName[0]="홍길동"; arrName[1]="홍길남"; arrName[2]="홍길서";
		account[0]=0; account[1]=0; account[2]=0;
	}
	public static void adminMenu() {
		int selectNum=0;
		while(selectNum!=5) {
			System.out.println("관리자 계정");
			System.out.println("1.계정 추가 2.계정 삭제 3.모든 사용자 정보 확인 4.id로 특정 사용자 정보 확인 5.종료");
			System.out.println("메뉴 입력>>");
			selectNum=Integer.parseInt(sc.nextLine());
			if(selectNum==1) {
				System.out.println("추가할 사용자의 id를 입력하세요>>");
				arrId[listCount]=sc.nextLine();
				System.out.println("추가할 사용자의 pw를 입력하세요>>");
				arrPw[listCount]=Integer.parseInt(sc.nextLine());
				System.out.println("추가할 사용자의 성함을 입력하세요>>");
				arrName[listCount]=sc.nextLine();
				account[listCount]=0;
				listCount++;
				System.out.println("사용자 계정이 추가 되었습니다.");

			}else if(selectNum==2) {
				System.out.println("삭제할 사용자의 id를 입력하세요>>");
				String deleteId=sc.nextLine();
				int findIndex=-1;
				for(int i=0; i<listCount; i++) {
					if(arrId[i].equals(deleteId)) {
						findIndex=i;
						break;
					}
				}
				if(findIndex<0) {
					System.out.println("찾으시는 아이디가 없습니다.");
				}else {
					for(int i=findIndex; i<arrId.length-1; i++) {
						arrId[i]=arrId[i+1];
						arrPw[i]=arrPw[i+1];
						account[i]=account[i+1];
						arrName[i]=arrName[i+1];
					}
					listCount--;
					System.out.println("사용자의 정보를 삭제했습니다.");
				}
			}else if(selectNum==3) {
				System.out.println("모든 사용자 정보");
				for(int i=0; i<listCount; i++) {
					System.out.println("---------------------------");
					System.out.println("Id :"+arrId[i]);
					System.out.println("Pw :"+arrPw[i]);
					System.out.println("Name :"+arrName[i]);
					System.out.println("Account :"+account[i]);
				}
				if(listCount==0) {
					System.out.println("등록된 사용자 정보가 없습니다.");
				}

			}else if(selectNum==4) {
				System.out.println("찾으시는 사용자의 id를 입력하세요>>");
				String findId=sc.nextLine();
				boolean isFindId=false;
				System.out.println(findId+"님의 정보");
				for(int i=0; i<listCount; i++) {
					if(arrId[i].equals(findId)) {
						System.out.println("Id :"+arrId[i]);
						System.out.println("Pw :"+arrPw[i]);
						System.out.println("Name :"+arrName[i]);
						System.out.println("Account :"+account[i]);
						isFindId=true;
					}
				}
				if(!isFindId) {
					System.out.println("찾으시는 id가 없습니다.");
				}
			}else if(selectNum==5) {
				System.out.println("로그아웃 되었습니다.");

			}else {
				System.out.println("잘못된 입력 입니다.");
			}
		}
	}
	public static void loginMenu() {
		System.out.println("로그인을 해주세요");
		System.out.print("아이디 : ");
		id=sc.nextLine();
		if(id.equals("exit")) {
			return;
		}
		System.out.print("비밀 번호 : ");
		pw=Integer.parseInt(sc.nextLine());
		
	}
	public static void mainMenu() {
		System.out.println("");
		if(id.equals(arrId[0])&&pw==arrPw[0]){
			System.out.println(arrName[0]+"님이 로그인 하셨습니다.");
			return;
		}else if(id.equals(arrId[1])&&pw==arrPw[1]) {
			System.out.println(arrName[1]+"님이 로그인 하셨습니다.");
			return;
		}else if(id.equals(arrId[2])&&pw==arrPw[2]) {
			System.out.println(arrName[2]+"님이 로그인 하셨습니다.");
			return;
		}else if(id.equals("admin")&&(pw==1111)) {
			adminMenu();
		}else if(id.equals("exit")){
			return;
		}else {	
			System.out.println("아이디, 비밀 번호를 확인해 주세요.");
			System.out.println("");
		}
	}
	public static void userMenu() {
		int inputNum=0;
		for(int i=0; i<arrId.length; i++) {
			if(id.equals(arrId[i])) {
				while(inputNum!=4) {
					System.out.println("");
					System.out.println("1.입금 2.출금 3.조회 4.종료");
					inputNum=Integer.parseInt(sc.nextLine());
					if(inputNum==1) {
						System.out.print("입금 하실 금액을 입력 해 주세요>> ");
						int inMoney=Integer.parseInt(sc.nextLine());
						account[i]=account[i]+inMoney;
					}else if(inputNum==2) {
						System.out.print("출금 하실 금액을 입력 해 주세요>> ");
						int outMoney=Integer.parseInt(sc.nextLine());
						if(account[i]<outMoney) {
							System.out.println("출금하실 금액이 부족 합니다.");
						}else {
							account[i]=account[i]-outMoney;
						}
					}else if(inputNum==3) {
						System.out.println("현재 잔액은 "+account[i]+"원 입니다.");
					}else if(inputNum==4) {
						System.out.println("로그아웃 되었습니다.");
						System.out.println("");
					}else {
						System.out.println("메뉴를 다시 입력 해 주세요");
					}
				}	
			}
		}
	}
	private static void play() {
		for(;;) {
			loginMenu();
			if(id.equals("exit")) {
				break;
			}
			for(;;) {
				mainMenu();
				break;
			}
			userMenu();

			
		}				
		
	}
	

	public static void main(String[] args) {

		init();
		play();
		

						
	}
}
