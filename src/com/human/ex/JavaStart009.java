package com.human.ex;

public class JavaStart009 {

	public static void main(String[] args) {
		//��ǻ�Ͱ� ���Ƿ� ���� �ϳ��� ���ڸ� ���ߴ� ���α׷�
		//����ڰ� �Է��� ���ڰ� ������ ���ڶ� ���� �ʴٸ� ����ڰ� ���ڸ� ���� �� �ֵ���
		//ū�� ������ ��Ʈ�� �༭ ���� �� �ֵ��� ����
		//������ ���߸� ������ ����ٴ� �޼����� �Բ� �� ��ȸ�� ���� ���� ������� ����غ���
		int num=(int)(Math.random()*99+1);
		int a=0;
		System.out.println("������ ���� ���߱�");
		for(;;) {
			a++;
			System.out.println("���� �Է�>>");
			int user=Integer.parseInt(new java.util.Scanner(System.in)
					.nextLine());
			if(num==user) {
				System.out.println("�����Դϴ�.");
				break;
			}else {
				if(num<user) {
					System.out.println("���ڰ� �Է��Ͻ� ������ �۽��ϴ�.");
				}else {
					System.out.println("���ڰ� �Է��Ͻ� ������ Ů�ϴ�.");
				}
			}

		}
		System.out.println("���� Ƚ��>>"+a);
					

	}

}
