package com.human.ex;

public class JavaStart014_2 {
	//�ʵ�, ���� ����, Ŭ���� ����, static����
	public static String name="ȫ�浿";
	public static int kor=50;
	public static int math=50;
	public static int eng=60;
	
	public static int total() {
		return kor+math+eng;
	}
	public static double avg() {
		return total()/3.;
	}
	
	
	public static void main(String[] args) {
		// �л��� ���� ����, ����� �����ϴ� ���α׷�
		System.out.println(name+"���� ���� : "+total());
		System.out.println(name+"���� ���: "+avg());
		

	}

}
