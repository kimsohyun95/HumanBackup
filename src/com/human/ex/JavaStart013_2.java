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
		arrName[0]="ȫ�浿"; arrName[1]="ȫ�泲"; arrName[2]="ȫ�漭";
		account[0]=0; account[1]=0; account[2]=0;
	}
	public static void adminMenu() {
		int selectNum=0;
		while(selectNum!=5) {
			System.out.println("������ ����");
			System.out.println("1.���� �߰� 2.���� ���� 3.��� ����� ���� Ȯ�� 4.id�� Ư�� ����� ���� Ȯ�� 5.����");
			System.out.println("�޴� �Է�>>");
			selectNum=Integer.parseInt(sc.nextLine());
			if(selectNum==1) {
				System.out.println("�߰��� ������� id�� �Է��ϼ���>>");
				arrId[listCount]=sc.nextLine();
				System.out.println("�߰��� ������� pw�� �Է��ϼ���>>");
				arrPw[listCount]=Integer.parseInt(sc.nextLine());
				System.out.println("�߰��� ������� ������ �Է��ϼ���>>");
				arrName[listCount]=sc.nextLine();
				account[listCount]=0;
				listCount++;
				System.out.println("����� ������ �߰� �Ǿ����ϴ�.");

			}else if(selectNum==2) {
				System.out.println("������ ������� id�� �Է��ϼ���>>");
				String deleteId=sc.nextLine();
				int findIndex=-1;
				for(int i=0; i<listCount; i++) {
					if(arrId[i].equals(deleteId)) {
						findIndex=i;
						break;
					}
				}
				if(findIndex<0) {
					System.out.println("ã���ô� ���̵� �����ϴ�.");
				}else {
					for(int i=findIndex; i<arrId.length-1; i++) {
						arrId[i]=arrId[i+1];
						arrPw[i]=arrPw[i+1];
						account[i]=account[i+1];
						arrName[i]=arrName[i+1];
					}
					listCount--;
					System.out.println("������� ������ �����߽��ϴ�.");
				}
			}else if(selectNum==3) {
				System.out.println("��� ����� ����");
				for(int i=0; i<listCount; i++) {
					System.out.println("---------------------------");
					System.out.println("Id :"+arrId[i]);
					System.out.println("Pw :"+arrPw[i]);
					System.out.println("Name :"+arrName[i]);
					System.out.println("Account :"+account[i]);
				}
				if(listCount==0) {
					System.out.println("��ϵ� ����� ������ �����ϴ�.");
				}

			}else if(selectNum==4) {
				System.out.println("ã���ô� ������� id�� �Է��ϼ���>>");
				String findId=sc.nextLine();
				boolean isFindId=false;
				System.out.println(findId+"���� ����");
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
					System.out.println("ã���ô� id�� �����ϴ�.");
				}
			}else if(selectNum==5) {
				System.out.println("�α׾ƿ� �Ǿ����ϴ�.");

			}else {
				System.out.println("�߸��� �Է� �Դϴ�.");
			}
		}
	}
	public static void loginMenu() {
		System.out.println("�α����� ���ּ���");
		System.out.print("���̵� : ");
		id=sc.nextLine();
		if(id.equals("exit")) {
			return;
		}
		System.out.print("��� ��ȣ : ");
		pw=Integer.parseInt(sc.nextLine());
		
	}
	public static void mainMenu() {
		System.out.println("");
		if(id.equals(arrId[0])&&pw==arrPw[0]){
			System.out.println(arrName[0]+"���� �α��� �ϼ̽��ϴ�.");
			return;
		}else if(id.equals(arrId[1])&&pw==arrPw[1]) {
			System.out.println(arrName[1]+"���� �α��� �ϼ̽��ϴ�.");
			return;
		}else if(id.equals(arrId[2])&&pw==arrPw[2]) {
			System.out.println(arrName[2]+"���� �α��� �ϼ̽��ϴ�.");
			return;
		}else if(id.equals("admin")&&(pw==1111)) {
			adminMenu();
		}else if(id.equals("exit")){
			return;
		}else {	
			System.out.println("���̵�, ��� ��ȣ�� Ȯ���� �ּ���.");
			System.out.println("");
		}
	}
	public static void userMenu() {
		int inputNum=0;
		for(int i=0; i<arrId.length; i++) {
			if(id.equals(arrId[i])) {
				while(inputNum!=4) {
					System.out.println("");
					System.out.println("1.�Ա� 2.��� 3.��ȸ 4.����");
					inputNum=Integer.parseInt(sc.nextLine());
					if(inputNum==1) {
						System.out.print("�Ա� �Ͻ� �ݾ��� �Է� �� �ּ���>> ");
						int inMoney=Integer.parseInt(sc.nextLine());
						account[i]=account[i]+inMoney;
					}else if(inputNum==2) {
						System.out.print("��� �Ͻ� �ݾ��� �Է� �� �ּ���>> ");
						int outMoney=Integer.parseInt(sc.nextLine());
						if(account[i]<outMoney) {
							System.out.println("����Ͻ� �ݾ��� ���� �մϴ�.");
						}else {
							account[i]=account[i]-outMoney;
						}
					}else if(inputNum==3) {
						System.out.println("���� �ܾ��� "+account[i]+"�� �Դϴ�.");
					}else if(inputNum==4) {
						System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
						System.out.println("");
					}else {
						System.out.println("�޴��� �ٽ� �Է� �� �ּ���");
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
