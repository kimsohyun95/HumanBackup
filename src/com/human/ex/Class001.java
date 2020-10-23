package com.human.ex;

public class Class001 {

	public static void main(String[] args) {
		com.human.dto.Human c1=new com.human.dto.Human(); //com.human.dto의 클래스 Human
		c1.name="김소현";
		c1.age=26;
		c1.height=158;
		
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.height);
		

	}

}
