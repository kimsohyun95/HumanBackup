package com.human.ex;



public class JavaStart013_1 {

	public static void main(String[] args) {
		// ���� ���α׷��� �迭�� ����Ͽ� ����.(�Լ� ����)
		// ����� ������ id�� ������ ���ؼ� password ����� �̸� name�̿�
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String arrId[]= {"kim", "so", "hyun"};
		int arrPw[]= {123, 456, 789 };
		String arrName[]= {"ȫ�浿", "ȫ�泲", "ȫ�漭"};
		int account[]= {0,0,0};
		String id="";
		int pw=0;
		
		for(;;) {
			System.out.println("�α����� ���ּ���");
			System.out.print("���̵� : ");
			id=sc.nextLine();
			System.out.print("��� ��ȣ : ");
			pw=Integer.parseInt(sc.nextLine());
			for(;;) {
				
				if(id.equals(arrId[0])&&pw==arrPw[0]){
					System.out.println(arrName[0]+"���� �α��� �ϼ̽��ϴ�.");
					break;
				}else if(id.equals(arrId[1])&&pw==arrPw[1]) {
					System.out.println(arrName[1]+"���� �α��� �ϼ̽��ϴ�.");
					break;
				}else if(id.equals(arrId[2])&&pw==arrPw[2]) {
					System.out.println(arrName[2]+"���� �α��� �ϼ̽��ϴ�.");
					break;
				}else {
					System.out.println("���̵�, ��� ��ȣ�� Ȯ���� �ּ���.");
					System.out.println("");		
				}
			}
			int inputNum=0;
			for(int i=0; i<3; i++) {
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
							System.out.println("���� �Ǿ����ϴ�.");
							System.out.println("");
						}else {
							System.out.println("�޴��� �ٽ� �Է� �� �ּ���");
						}
					}	
				}
			}
		}						
						
	}

}
