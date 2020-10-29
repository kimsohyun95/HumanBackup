package com.human.ex;



public class JavaStart013_1 {

	public static void main(String[] args) {
		// 은행 프로그램을 배열을 사용하여 구현.(함수 없이)
		// 사용자 구분은 id로 보안을 위해서 password 사용자 이름 name이용
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String arrId[]= {"kim", "so", "hyun"};
		int arrPw[]= {123, 456, 789 };
		String arrName[]= {"홍길동", "홍길남", "홍길서"};
		int account[]= {0,0,0};
		String id="";
		int pw=0;
		
		for(;;) {
			System.out.println("로그인을 해주세요");
			System.out.print("아이디 : ");
			id=sc.nextLine();
			System.out.print("비밀 번호 : ");
			pw=Integer.parseInt(sc.nextLine());
			for(;;) {
				
				if(id.equals(arrId[0])&&pw==arrPw[0]){
					System.out.println(arrName[0]+"님이 로그인 하셨습니다.");
					break;
				}else if(id.equals(arrId[1])&&pw==arrPw[1]) {
					System.out.println(arrName[1]+"님이 로그인 하셨습니다.");
					break;
				}else if(id.equals(arrId[2])&&pw==arrPw[2]) {
					System.out.println(arrName[2]+"님이 로그인 하셨습니다.");
					break;
				}else {
					System.out.println("아이디, 비밀 번호를 확인해 주세요.");
					System.out.println("");		
				}
			}
			int inputNum=0;
			for(int i=0; i<3; i++) {
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
							System.out.println("종료 되었습니다.");
							System.out.println("");
						}else {
							System.out.println("메뉴를 다시 입력 해 주세요");
						}
					}	
				}
			}
		}						
						
	}

}
