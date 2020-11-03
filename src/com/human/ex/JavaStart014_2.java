package com.human.ex;
// �л��� ���� ����, ����� �����ϴ� ���α׷�
class Student{
	
	public static int count=0;
	
	
	private String name="ȫ�浿";
	private int kor=50;
	private int math=50;
	private int eng=60;
	
	public Student() {
		this("ȫ�浿",23,56,88);
	}
	public Student(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		Student.count++; //���⼱ Student���� ����

	}
	public int total() {
		return kor+math+eng;
	}
	public double avg() {
		return total()/3;
	}
	@Override
	public String toString() {
		return  name + "���� ���� : "+total()+"\n"+
				name+"���� ��� : "+avg();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eng;
		result = prime * result + kor;
		result = prime * result + math;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor<0) {
			this.kor=0;
		}
		if(kor>100) {
			this.kor=100;
		}
		
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
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
		Student st1=new Student("ȫ�浿",23,56,68);
//		System.out.println(st1.name+"���� ���� : "+st1.total());
//		System.out.println(st1.name+"���� ���: "+st1.avg());
		System.out.println((st1));
		Student st2=new Student();
		st2.setKor(213);
		st2.setName("ȫ�浿2");
//		st2.name="ȫ�泲";
//		st2.kor=100;
//		System.out.println(st2.name+"���� ���� : "+st2.total());
//		System.out.println(st2.name+"���� ���: "+st2.avg());
		System.out.println(st2);
		System.out.println(Student.count);
		

	}

}
