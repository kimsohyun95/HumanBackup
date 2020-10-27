package com.human.ex;

public class JavaStart009 {

	public static void main(String[] args) {
		//컴퓨터가 임의로 정한 하나의 숫자를 맞추는 프로그램
		//사용자가 입력한 숫자가 임의의 숫자랑 같지 않다면 사용자가 숫자를 맞출 수 있도록
		//큰지 작은지 힌트를 줘서 맞출 수 있도록 해줌
		//정답을 맞추면 정답을 맞췄다는 메세지와 함께 총 몇회에 도전 끝에 맞췄는지 출력해보자
		int num=(int)(Math.random()*99+1);
		int a=0;
		System.out.println("임의의 숫자 맞추기");
		for(;;) {
			a++;
			System.out.println("숫자 입력>>");
			int user=Integer.parseInt(new java.util.Scanner(System.in)
					.nextLine());
			if(num==user) {
				System.out.println("정답입니다.");
				break;
			}else {
				if(num<user) {
					System.out.println("숫자가 입력하신 수보다 작습니다.");
				}else {
					System.out.println("숫자가 입력하신 수보다 큽니다.");
				}
			}

		}
		System.out.println("도전 횟수>>"+a);
					

	}

}
