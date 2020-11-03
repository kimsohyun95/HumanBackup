package com.human.ex;

public class JavaStart014_2 {
	//필드, 정적 변수, 클래스 변수, static변수
	public static String name="홍길동";
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
		// 학생의 과목 총점, 평균을 저장하는 프로그램
		System.out.println(name+"님의 총점 : "+total());
		System.out.println(name+"님의 평균: "+avg());
		

	}

}
