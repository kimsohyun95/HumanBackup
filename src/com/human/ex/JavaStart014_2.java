package com.human.ex;
// ÇĞ»ıÀÇ °ú¸ñ ÃÑÁ¡, Æò±ÕÀ» ÀúÀåÇÏ´Â ÇÁ·Î±×·¥
class Student{
	public String name="È«±æµ¿";
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
//	//ÇÊµå, Á¤Àû º¯¼ö, Å¬·¡½º º¯¼ö, staticº¯¼ö
//	public static String name="È«±æµ¿";
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
		System.out.println(st1.name+"´ÔÀÇ ÃÑÁ¡ : "+st1.total());
		System.out.println(st1.name+"´ÔÀÇ Æò±Õ: "+st1.avg());
		System.out.println((st1));
		Student st2=new Student();
		st2.name="È«±æ³²";
		st2.kor=100;
		System.out.println(st2.name+"´ÔÀÇ ÃÑÁ¡ : "+st2.total());
		System.out.println(st2.name+"´ÔÀÇ Æò±Õ: "+st2.avg());
		System.out.println(st2);
		

	}

}
