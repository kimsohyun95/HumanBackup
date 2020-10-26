package com.human.ex;

public class JavaStart004_1 {

	public static void main(String[] args) {
		String str1="홍길동"; //주소 0x01
		String str2="홍길동"; //주소 0x01
		//상수full로 변경x. 힙에 하나만 입력 됨.
		//string의 equals 메소드는 들어있는 문자열데이터를 비교한다.
		String str3=new String("홍길동"); //주소 0x02
		String str4=new String("홍길동"); //주소 0x03
		
		if(str1==str2) { //true. 들어있는 값(str1이랑 2에 들어있는 주소) 비교
			System.out.println("str1==2는 같다");
		}
		if(str1==str3) { //false
			System.out.println("str1==3는 같다");
		}
		if(str1.equals(str2)) { //true
			System.out.println("str1==2는 같다");
		}
		if(str1.equals(str3)) { //true . 내용(홍길동) 비교라 true
			System.out.println("str1==3는 같다");
		}
		if(str3==str4) { //false. 둘의 주소는 다르다.
			System.out.println("str3==4는 같다.");
		}
		if(str3.equals(str4)) { //true
			System.out.println("str3 equal 4는 같다.");
		}
	}

}
