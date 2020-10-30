package com.human.ex;

import java.util.Scanner;

public class BankClass {
	//배열구현
	//013_1문제풀이
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int listCount=3;//리스트를 하기 위해 변수의 갯수를 알 수 있는 변수 . 배열에 데이터가 몇 개 들어 있는지. 아래에서 데이터 3개를 넣었기 때문에
		String id[]=new String[100];
		String pw[]=new String[100];
		double account[]=new double[100];
		double outMoney=0;
		
		id[0]="a1"; id[1]="a2"; id[2]="a3";       //중간확인하려고 임시로 만든 것
		pw[0]="a1"; pw[1]="a1"; pw[2]="a3";       //중간확인하려고 임시로 만든 것
		account[0]=1; account[1]=2; account[2]=3; //중간확인하려고 임시로 만든 것
		
		String inputId=null; //사용자 입력으로 받을 거라 null
		String inputPw=null;
		int indexCount=0;
		
		while(true) {
			System.out.println("id와 pw를 입력하세요");
			System.out.println("ID>> ");
			inputId=sc.nextLine();
			System.out.println("PW>> ");
			inputPw=sc.nextLine();


			if(inputId==null) {

			}else if(inputId.equals("exit")) {
				break;
			}else if(inputId.equals("admin")&&inputPw.equals("admin")) { 
				//관리자 계정
				//계정 추가 시 배열로 짜면 중간에 계정 삭제로 null공간이 생겨 그 곳에 계정을 추가하려면 너무 복잡해지기 떄문에
				//list로 구현
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
							for(int i=findIndex; i<id.length-1; i++) { //length값만 있으면 안됨. 밑에 +1이 있기때문에 배열이 100칸인데 101칸에서 가져올 수가 없기 때문
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
						boolean isFind=false; //boolean자료형은 앞에 is를 넣어주는 관용적 약속이 있음.
						for(int i=0; i<listCount; i++) {
							if(id[i].equals(findID)) {
								System.out.println("ID>> "+id[i]);
								System.out.println("PW>> "+pw[i]);
								System.out.println("account>> "+account[i]);
								isFind=true;
							}
						}
						if(!isFind) { //찾으면 true기때문에 못 찾았을 때 없는아이디를 출력하기 위해 falase가 되도록 해야 함
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
				
				
			}else {
				//일반사용자 로그인
				//존재하는 사용자의 indexCount는 무엇인가?(100개의 배열 중 몇 번째 인덱스인지) 	
				boolean isLogin=false;
				for(int i=0; i<id.length; i++) {
					if(id[i]!=null&&id[i].equals(inputId)&&pw[i].equals(inputPw)) {
					//if(id[i].equals(inputId)&&id[i]!=null) { 
						//이렇게 바꿔서 쓰면 잘 못 된 코드로 쓰면 안됨. null point exception뜨면서 멈춤.
						isLogin=true;
						indexCount=i;
						break;
					}
				}
				
				System.out.println(indexCount+":"
						+inputId+":"+id[indexCount]); //정상적으로 돌아가는지 중간 확인(아래는 쭉 주석해놓고)

				if(isLogin) {
					//로그인 성공
					//존재하는 사용자의 indexCount는 무엇인가?
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
							isLogin=false; //안해주면 while(isLogin)으로 들어가서 null님이 로그인하였습니다.부터 시작됨
							break;
						default:
							System.out.println("잘못된 입력 입니다. \n다시 입력해 주세요");
						}
					}
			
				}else {
					//로그인 실패 - 로그인 화면으로 돌아가기
					inputId=null; //쓰레기 값이 생겨 문제가 발생 하므로 반드시 초기화 하는 것이 좋다.
				}
				
				
							
			}
		}	
		
		
		
		
		
		
		
		
		
		
		
		//String loginId=""; //공백이 출력 됨
		//String loginId=null; //오류 남
		//loginId.equlas(null) - loginId에 null이 들어 있으면 loginId자체엔 null이 들어 있는게 아니기 때문에 x
		//loginId.equlas("null") - 위와 마찬가지로 x
		//loginId==null
		
		
		//System.out.println(loginId.toString());

	}

}
