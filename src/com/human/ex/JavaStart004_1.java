package com.human.ex;

public class JavaStart004_1 {

	public static void main(String[] args) {
		String str1="ȫ�浿"; //�ּ� 0x01
		String str2="ȫ�浿"; //�ּ� 0x01
		//���full�� ����x. ���� �ϳ��� �Է� ��.
		//string�� equals �޼ҵ�� ����ִ� ���ڿ������͸� ���Ѵ�.
		String str3=new String("ȫ�浿"); //�ּ� 0x02
		String str4=new String("ȫ�浿"); //�ּ� 0x03
		
		if(str1==str2) { //true. ����ִ� ��(str1�̶� 2�� ����ִ� �ּ�) ��
			System.out.println("str1==2�� ����");
		}
		if(str1==str3) { //false
			System.out.println("str1==3�� ����");
		}
		if(str1.equals(str2)) { //true
			System.out.println("str1==2�� ����");
		}
		if(str1.equals(str3)) { //true . ����(ȫ�浿) �񱳶� true
			System.out.println("str1==3�� ����");
		}
		if(str3==str4) { //false. ���� �ּҴ� �ٸ���.
			System.out.println("str3==4�� ����.");
		}
		if(str3.equals(str4)) { //true
			System.out.println("str3 equal 4�� ����.");
		}
	}

}
