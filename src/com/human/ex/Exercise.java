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
			System.out.println("�α��� �ϼ���");
			System.out.print("ID >> ");
			inputId=sc.nextLine();
			System.out.print("PW >> ");
			inputPw=sc.nextLine();
			
			if(inputId==null) {
				
			}else if(inputId.equals("exit")) {
				break;
			}else if(inputId.equals("admin")&&inputPw.equals("admin")) {
				//������ ����
				boolean isAdminLogin=true;
				while(isAdminLogin) {
					System.out.println("������ ���� �Դϴ�.");
					System.out.println("�޴��� �Է� ���ּ���.");
					System.out.println("1.���� �߰� 2.���� ���� 3.��� ����� ���� Ȯ�� 4.id�� Ư�� ����� ���� Ȯ�� 5.����");
					int selectNum=Integer.parseInt(sc.nextLine());
				}
				
			}else {
				//�Ϲ� ����� �α���
				boolean isLogin=false;
				for(int i=0; i<id.length; i++) {
					if(id[i]!=null && id[i].equals(inputId)&&pw[i].equals(inputPw)) {
						isLogin=true;
						indexCount=i;
						break;
					}
				}
				
				if(isLogin) {
					//�α��� ����
					System.out.println(name[indexCount]+"���� �α��� �ϼ̽��ϴ�.");
					System.out.println("");
					while(isLogin) {
						System.out.println("�޴��� �Է��� �ּ���");
						System.out.println("1.�Ա� 2.��� 3.��ȸ 4.����>>");
						System.out.println("");
						int selectNum=Integer.parseInt(sc.nextLine());
						switch(selectNum) {
						case 1:
							System.out.print("�Ա��Ͻ� �ݾ��� �Է� �� �ּ���.>>");
							inMoney=Double.parseDouble(sc.nextLine());
							account[indexCount]+=inMoney;
							System.out.println(name+"�Բ��� �Ա� �Ͻ� �ݾ��� "+inMoney+"�Դϴ�.");
							break;
						case 2:
							System.out.print("����Ͻ� �ݾ��� �Է� �� �ּ���.>>");
							outMoney=Double.parseDouble(sc.nextLine());
							if(account[indexCount]>outMoney) {
								account[indexCount]-=outMoney;
								System.out.println(name+"�Բ��� ��� �Ͻ� �ݾ��� "+outMoney+"�Դϴ�.");
							}else {
								System.out.println("�ܾ��� �����մϴ�.");
							}
							break;
						case 3:
							System.out.println(name+"���� ���� �ܾ��� "+account[indexCount]+"�Դϴ�.");
							break;
						case 4:
							 System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
							 inputId=null;
							 isLogin=false;
							 break;
						default:
							System.out.println("�߸��� �Է��Դϴ�.\n �ٽ� �Է� �� �ּ���.");
						}
					}
				}else {
					//�α��� ����
					System.out.println("���̵�� ��� ��ȣ�� �ٽ� Ȯ�� �ϼ���.");
					inputId=null;
				}
			
			}
		}	
	}

}
