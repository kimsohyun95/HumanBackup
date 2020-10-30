package com.human.ex;

import java.util.Scanner;

class Bank{
	public Scanner sc=new Scanner(System.in);
	public int listCount=3;
	public String id[]=new String[100];
	public String pw[]=new String[100];
	public double account[]=new double[100];
	
	public String inputId=null;
	public String inputPw=null;
	public int indexCount=0;
	
	public Bank() {
		init();
	}
	
	public void init() {
		id[0]="a1"; id[1]="a2"; id[2]="a3";
		pw[0]="a1"; pw[1]="a2"; pw[2]="a3";
		account[0]=1; account[1]=2; account[2]=3;
	}
	public void userMenu() {
		//�Ϲ� ����� �α���
		boolean isLogin=false;
		for(int i=0; i<id.length; i++) {
			if(id[i]!=null&&id[i].equals(inputId)&&pw[i].equals(inputPw)) {
				isLogin=true;
				indexCount=i;
				break;
			}
		}
		if(isLogin) {
			//�α��� ����
			//�����ϴ� ����� indexCount�� �����ΰ�?
			System.out.println(inputId+"���� �α��� �߽��ϴ�.");
			while(isLogin) {
				System.out.println("1.�Ա� 2.��� 3.Ȯ�� 4.����>>");
				int selectNum=Integer.parseInt(sc.nextLine());
				switch(selectNum) {
				case 1:
					System.out.println("�Ա��� �ݾ��� �Է��ϼ���.>> ");
					account[indexCount]+=Double.parseDouble(sc.nextLine());
					System.out.println(inputId+"���� ���� �ܾ�"+account[indexCount]);
					break;
				case 2:
					System.out.println("����� �ݾ��� �Է��ϼ���.>>");
					account[indexCount]-=Double.parseDouble(sc.nextLine());
					break;
				case 3:
					System.out.println(inputId+"���� ���� �ܾ� "+account[indexCount]);
					break;
				case 4:
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					inputId=null;
					isLogin=false;
					break;
				default:
					System.out.println("�� �� �Է��ϼ̽��ϴ�.");
				}
			}
		}else {
			inputId=null;
		}
	}
	public void adminMenu() {
		boolean isAdminLogin=true;
		while(isAdminLogin) {
			System.out.println("������ ����");
			System.out.println("1.���� �߰� 2.���� ���� 3.��� ����� ���� Ȯ�� 4. id�� Ư�� ����� ���� Ȯ�� 5.����");
			System.out.println("�޴� �Է�>>");
			int selectNum=Integer.parseInt(sc.nextLine());
			switch(selectNum) {
			case 1: 
				System.out.println("�߰� �� ������� ���� �Է�");
				System.out.println("���̵�>>");
				id[listCount]=sc.nextLine();
				System.out.println("Pw>>");
				pw[listCount]=sc.nextLine();
				account[listCount]=0;
				listCount++;
				System.out.println("����� ������ �߰� �Ǿ����ϴ�.");
				break;
			case 2:
				System.out.println("������ ����� ���� �Է�");
				System.out.println("���̵�>>");
				String deleteId=sc.nextLine();
				int findIndex=-1;
				for(int i=0; i<listCount; i++) {
					if(id[i].equals(deleteId)) {
						findIndex=i;
						break;
					}
				}
				if(findIndex<0) {
					System.out.println("���� ���̵��Դϴ�.");
				}else {
					for(int i=findIndex; i<id.length-1; i++) {
						id[i]=id[i+1];
						pw[i]=pw[i+1];
						account[i]=account[i+1];
					}
					listCount--;
					System.out.println("�����Ǿ����ϴ�.");
				}
				break;
			case 3:
				System.out.println("��� ����� ���� ���");
				for(int i=0; i<listCount; i++) {
					System.out.println(i+"------------------------");
					System.out.println("���̵�>> id[i]");
					System.out.println("Pw>>"+pw[i]);
					System.out.println("account>>"+account[i]);
				}
				if(listCount==0) {
					System.out.println("�����Ͱ� �����ϴ�.");
				}
				break;
			case 4:
				System.out.println("ã�� ���̵� �Է��ϼ���");
				System.out.println("���̵� >>");
				String findId=sc.nextLine();
				boolean isFind=false;
				for(int i=0; i<listCount; i++) {
					if(id[i].equals(findId)) {
						System.out.println("���̵�>> "+id[i]);
						System.out.println("pw>> "+pw[i]);
						System.out.println("account>> "+account[i]);
						isFind=true;
					}
				}
				if(!isFind) {
					System.out.println("���� ���̵� �Դϴ�.");
				}
				break;
			case 5:
				isAdminLogin=false;
				inputId=null;
				break;
			default :
				System.out.println("�� �� �Է� �ϼ̽��ϴ�.");
			}
		} //isAdminLogin while�� ����
	
	}
	
	public void mainMenu() {
		System.out.println("���̵�� pw�� �Է��ϼ���");
		System.out.println("���̵� >>");
		inputId=sc.nextLine();
		if(inputId.contentEquals("exit")) {
			return;
		}
		System.out.println("pw>> ");
		inputPw=sc.nextLine();
	}
	public void play() {
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
	
}

public class BankClass_3 {

	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.play();
		//Bank b2=new Bank();
		//b2.play();
		

	}

}
