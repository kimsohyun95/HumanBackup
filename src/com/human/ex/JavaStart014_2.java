package com.human.ex;
// �л��� ���� ����, ����� �����ϴ� ���α׷�
class Student{
	public String name="ȫ�浿";
	public int kor=50;
	public int math=50;
	public int  eng=60;
	public int total() {
		return kor+math+eng;
	}
	public double avg() {
		return total()/3;
	}
}

public class JavaStart014_2 {
//	//�ʵ�, ���� ����, Ŭ���� ����, static����
//	public static String name="ȫ�浿";
//	public static int kor=50;
//	public static int math=50;
//	public static int eng=60;
//	
//	public static int total() {
//		return kor+math+eng;
//	}
//	public static double avg() {
//		return total()/3.;
//	}

	public static void main(String[] args) {
		Student st1=new Student();
		System.out.println(st1.name+"���� ���� : "+st1.total());
		System.out.println(st1.name+"���� ���: "+st1.avg());
		System.out.println((st1));
		Student st2=new Student();
		st2.name="ȫ�泲";
		st2.kor=100;
		System.out.println(st2.name+"���� ���� : "+st2.total());
		System.out.println(st2.name+"���� ���: "+st2.avg());
		System.out.println(st2);
		

	}

}
