package com.human.ex;

import java.util.Scanner;

public class BankClass {
	//�迭����
	//013_1����Ǯ��
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int listCount=3;//����Ʈ�� �ϱ� ���� ������ ������ �� �� �ִ� ���� . �迭�� �����Ͱ� �� �� ��� �ִ���. �Ʒ����� ������ 3���� �־��� ������
		String id[]=new String[100];
		String pw[]=new String[100];
		double account[]=new double[100];
		double outMoney=0;
		
		id[0]="a1"; id[1]="a2"; id[2]="a3";       //�߰�Ȯ���Ϸ��� �ӽ÷� ���� ��
		pw[0]="a1"; pw[1]="a1"; pw[2]="a3";       //�߰�Ȯ���Ϸ��� �ӽ÷� ���� ��
		account[0]=1; account[1]=2; account[2]=3; //�߰�Ȯ���Ϸ��� �ӽ÷� ���� ��
		
		String inputId=null; //����� �Է����� ���� �Ŷ� null
		String inputPw=null;
		int indexCount=0;
		
		while(true) {
			System.out.println("id�� pw�� �Է��ϼ���");
			System.out.println("ID>> ");
			inputId=sc.nextLine();
			System.out.println("PW>> ");
			inputPw=sc.nextLine();


			if(inputId==null) {

			}else if(inputId.equals("exit")) {
				break;
			}else if(inputId.equals("admin")&&inputPw.equals("admin")) { 
				//������ ����
				//���� �߰� �� �迭�� ¥�� �߰��� ���� ������ null������ ���� �� ���� ������ �߰��Ϸ��� �ʹ� ���������� ������
				//list�� ����
				boolean isAdminLogin=true;
				while(isAdminLogin) {
					System.out.println("������ ����");
					System.out.println("1.���� �߰� 2.���� ���� 3.��� ����� ���� Ȯ�� 4.id�� Ư�� ����� ���� Ȯ�� 5.����");
					System.out.println("�޴� �Է�>>");
					int selectNum=Integer.parseInt(sc.nextLine());
					switch(selectNum) {
					case 1:
						System.out.println("�߰��� ����� ���� �Է�");
						System.out.println("ID>> ");
						id[listCount]=sc.nextLine();
						System.out.println("PW>> ");
						pw[listCount]=sc.nextLine();
						account[listCount]=0;
						listCount++;
						System.out.println("����� ������ �߰� �Ǿ����ϴ�.");
						break;
					case 2:
						System.out.println("������ ����� ���� �Է�");
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
							System.out.println("���� ���̵� �Դϴ�.");
						}else {
							for(int i=findIndex; i<id.length-1; i++) { //length���� ������ �ȵ�. �ؿ� +1�� �ֱ⶧���� �迭�� 100ĭ�ε� 101ĭ���� ������ ���� ���� ����
								id[i]=id[i+1];
								pw[i]=pw[i+1];
								account[i]=account[i+1];
							}
							listCount--;
							System.out.println("����� ������ ���� �Ǿ����ϴ�.");
						}
						break;
					case 3:
						System.out.println("��� ����� ���� ��� : ");
						for(int i=0; i<listCount; i++) {
							System.out.println(i+"��------------------------------------------");
							System.out.println("ID>> "+id[i]);
							System.out.println("PW>> "+pw[i]);
							System.out.println("account>> "+account[i]);
						}
						if(listCount==0) {
							System.out.println("�����ϴ� �����Ͱ� �����ϴ�.");
						}
						break;
					case 4:
						System.out.println("ã�� ID�� �Է��ϼ���");
						System.out.println("ID>> ");
						String findID=sc.nextLine();
						boolean isFind=false; //boolean�ڷ����� �տ� is�� �־��ִ� ������ ����� ����.
						for(int i=0; i<listCount; i++) {
							if(id[i].equals(findID)) {
								System.out.println("ID>> "+id[i]);
								System.out.println("PW>> "+pw[i]);
								System.out.println("account>> "+account[i]);
								isFind=true;
							}
						}
						if(!isFind) { //ã���� true�⶧���� �� ã���� �� ���¾��̵� ����ϱ� ���� falase�� �ǵ��� �ؾ� ��
							System.out.println("���� ���̵� �Դϴ�.");
						}
						
						
						break;
					case 5:
						isAdminLogin=false;
						inputId=null;
						System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
						break;
					default :
						System.out.println("�߸��� �Է��Դϴ�.");

					}
				}//isAdminLogin while�� ����.
				
				
			}else {
				//�Ϲݻ���� �α���
				//�����ϴ� ������� indexCount�� �����ΰ�?(100���� �迭 �� �� ��° �ε�������) 	
				boolean isLogin=false;
				for(int i=0; i<id.length; i++) {
					if(id[i]!=null&&id[i].equals(inputId)&&pw[i].equals(inputPw)) {
					//if(id[i].equals(inputId)&&id[i]!=null) { 
						//�̷��� �ٲ㼭 ���� �� �� �� �ڵ�� ���� �ȵ�. null point exception�߸鼭 ����.
						isLogin=true;
						indexCount=i;
						break;
					}
				}
				
				System.out.println(indexCount+":"
						+inputId+":"+id[indexCount]); //���������� ���ư����� �߰� Ȯ��(�Ʒ��� �� �ּ��س���)

				if(isLogin) {
					//�α��� ����
					//�����ϴ� ������� indexCount�� �����ΰ�?
					System.out.println(inputId
							+"���� �α��� �Ͽ����ϴ�.");
					while(isLogin) {
						System.out.println("1.�Ա� 2.��� 3.Ȯ�� 4.����>>");
						int selectNum=Integer.parseInt(sc.nextLine());
						switch(selectNum) {
						case 1:
							System.out.println("1.�Ա�, �Ա� �Ͻ� �ݾ��� �Է��ϼ���>> ");
							account[indexCount]+=Double.parseDouble(sc.nextLine());
							System.out.println(inputId
									+"���� ���� �ݾ� : "+account[indexCount]);
							break;
						case 2:
							System.out.println("2.���, ��� �Ͻ� �ݾ��� �Է��ϼ���>> ");
							outMoney=Double.parseDouble(sc.nextLine());
							if(account[indexCount]>outMoney) {
								account[indexCount]-=outMoney;
							}else {
								System.out.println("�ݾ��� �����մϴ�.");
							}
							System.out.println(inputId
									+"���� ���� �ݾ� : "+account[indexCount]);
							break;
						case 3:
							System.out.println(inputId
									+"���� ���� �ݾ� : "+account[indexCount]);
							break;
						case 4:
							System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
							inputId=null;
							isLogin=false; //�����ָ� while(isLogin)���� ���� null���� �α����Ͽ����ϴ�.���� ���۵�
							break;
						default:
							System.out.println("�߸��� �Է� �Դϴ�. \n�ٽ� �Է��� �ּ���");
						}
					}
			
				}else {
					//�α��� ���� - �α��� ȭ������ ���ư���
					inputId=null; //������ ���� ���� ������ �߻� �ϹǷ� �ݵ�� �ʱ�ȭ �ϴ� ���� ����.
				}
				
				
							
			}
		}	
		
		
		
		
		
		
		
		
		
		
		
		//String loginId=""; //������ ��� ��
		//String loginId=null; //���� ��
		//loginId.equlas(null) - loginId�� null�� ��� ������ loginId��ü�� null�� ��� �ִ°� �ƴϱ� ������ x
		//loginId.equlas("null") - ���� ���������� x
		//loginId==null
		
		
		//System.out.println(loginId.toString());

	}

}
