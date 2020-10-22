package com.human.ex;

public class JavaStart003 {

	public static void main(String[] args) {
//반복문

		//1.while문과 for문을 이용해서 왼쪽 순서도를 프로그램으로 구현해 보자.
//		<while>
//		int a=2;
//		int b=1;
//		b=b+1;
//		System.out.println(a+"\t"+b);
//		while(b<15) {
//			a=a+1; //3 4 5 6
//			b=b+a; //5 9 14 20
//		}
//		System.out.println(a+"\t"+b);
//		<for문>
//		int a=2;
//		int b=1;
//		b++;
//		System.out.println(a+"\t"+b);
//		for(b=2; b<15; a=a+1, b=b+a) {
//		}
//		System.out.println(a+"\t"+b);
		
		//2.1~100사이의 모든 약수를 구하면 된다.
//		int i=1;
//		while(i<101) {
//			if(100%i==0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		//3.두 수를 입력받아 두수의 공통된 약수를 모두 출력해 보자
		// 0부터 하나씩 증가시키며 두수 모두 나눠지는 수를 출력하면 된다
//		System.out.print("숫자 입력>>");
//		int a=(Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine()));
//		System.out.print("숫자 입력>>");
//		int b=(Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine()));
//		int i=1;
//		while(i<=a || i<=b) {
//			if(a%i==0 && b%i==0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		//4.두수를 입력받아 두수의 최대 공약수를 구하는 프로그램
//		System.out.print("숫자 입력>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("숫자 입력>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int i=1;
//		int j=1;
//		int c=0;
//		while(i<=a || i<=b) {
//			if(a%i==0) {
//				if(b%j==0) {
//					if(i==j) {
//						c=i;
//					}
//				}
//			}
//			i++;
//			j++;
//		}
//		System.out.println(c);
		
		//5.사용자에게 숫자를 하나 입력받아 입력한 숫자들의 합이 100이 될때까지 계속입력을 받다가 
		//   100이 넘으면 합산을 출력하는 프로그램을 구현
//		int sum=0;
//		for(;;) {
//			System.out.print("숫자 입력>>");
//			int a=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			sum=sum+a;
//			if(sum>100) {
//				System.out.println(sum);
//				break;
//			}
//			
//		}
		
		//6.사용자에게 계속해서 숫자를 입력받아 1~10사이의 숫자를 3번 입력 할 때 까지 반복한다
		// 입력이 끝나면 잘못 입력한 회수와 제대로 입력한 회수를 출력하고 
		// 사용자가 제대로 입력한 총합을 출력하는  프로그램을 만들어 보자.
//		int i=0;
//		int j=0;
//		int sum=0;
//		for(;;) {
//			System.out.print("숫자 입력>>");
//			int a=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			if(a>=1 && a<=10) {
//				i++;
//				sum=sum+a;
//			}else {
//				j++;
//			}
//			if(i==3) {
//				break;
//			}
//		}
//		System.out.println("잘 못 입력 한 횟수>>"+j);
//		System.out.println("제대로 입력 한 횟수>>"+i);
//		System.out.println("제대로 입력 한 수의 합>>"+sum);		
		
		//7.두 수를 입력 받아 공배수 중 가장 작은 배수, 최소 공배수를 출력
//		System.out.print("숫자 입력>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("숫자 입력>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int i=1;
//		int c;
//		for(;;) {
//			if(i%a==0) {
//				if(i%b==0) {
//						c=i;
//						break;
//				}
//			}
//			i++;
//		}
//		System.out.println(c);
		
		//8.3개의 수를 입력 받아 가장 작은 수와 가장 큰수를 출력하는 프로그램을 만들어 보자
//		System.out.print("숫자 입력>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("숫자 입력>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("숫자 입력>>");
//		int c=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		if(a>b) {
//			if(a>c) {
//				System.out.println("가장 큰 수>>"+a);
//				if(b>c) {
//					System.out.println("가장 작은 수>>"+c);
//				}else {
//					System.out.println("가장 작은 수>>"+b);
//				}
//			}else {
//				System.out.println("가장 큰 수>>"+c);
//				System.out.println("가장 작은 수>>"+b);
//			}
//		}else {
//			if(b>c) {
//				System.out.println("가장 큰 수>>"+b);
//				if(a>c) {
//					System.out.println("가장 작은 수>>"+c);
//				}else {
//					System.out.println("가장 작은 수>>"+c);
//				}
//			}else {
//				System.out.println("가장 큰 수>>"+c);
//				System.out.println("가장 작은 수>>"+a);
//			}
//		}
		
		//9.100이하의 수학과목 점수를 5번 입력받아 
		//  60이하 탈락자가 몇명인지 출력하는 프로그램을 구현해 보자.
//		int i=0;
//		int sum=0;
//		while(i<5) {
//			System.out.print("수학과목 점수(100이하)>>");
//			int a=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			if(a<=60) {
//				sum++;
//			}
//			i++;
//		}
//		System.out.println("탈락자"+sum+"명");

		//10.1부터 차례대로 더한 총합이 최초 100을 넘기 직전까지 누적한 
		//  결과값을 순서대로 출력하시오. 
		//1:1 2:3 3:6 4:10 5:15 6:21..100이전의 총합들을 다음과 같이 출력되면 된다.
//		int i=1;
//		int sum=0;
//		while(sum<=100) {
//			sum=sum+i;
//			System.out.println(i+":"+sum);
//			i++;
//		}
		
		//11.문자열과 숫자를 입력받아 입력받은 문자열을 숫자만큼 출력하는 프로그램을 만들어 보자
//		java.util.Scanner a=new java.util.Scanner(System.in);
//		System.out.print("문자 입력>>");
//		String val=a.next();
//		System.out.print("숫자 입력>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int c=0;
//		while(c<b) {
//			System.out.println(val);
//			c++;
//		}
		
		//12. 입력받은 두수 사이의 숫자들의 합을 구하는 프로그램을 만들어 보자.
//		System.out.print("숫자 입력>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("숫자 입력>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int sum=0;
//		if(a>=b) {
//			int i=b+1;
//			while(i>b && i<a) {
//				sum=sum+i;
//				i++;
//			}
//		}else {
//			int i=a+1;
//			while(i>a && i<b) {
//				sum=sum+i;
//				i++;
//			}
//		}
//		System.out.println(sum);
		
		//13.수를 하나 입력받아 소수인지 아닌지 판별하는 프로그램을 구현하시오.
//		System.out.print("숫자 입력>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int i=1;
//		int j=0;
//		while(i<=a) {
//			if(a%i==0) {
//				j++;
//			}
//			i++;
//		}
//		if(j==2) {
//			System.out.println(a+"는 소수이다.");
//		}else {
//			System.out.println(a+"는 소수가 아니다.");
//		}
		
		//14.두 수를 입력 받아 첫 번째수 부터 시작하여 하나씩 카운트하여 
		//   두번째수 수 만큼 화면에 출력 하는 프로그램을 만든다. 
//		System.out.print("숫자 입력>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("숫자 입력>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int i=0;
//		while(i<b) {
//			System.out.println(a);
//			a++;
//			i++;
//		}
		
		//15. 1~9 사이의 숫자를 하나 입력받아 해당 숫자의 구구단을 출력하여 보자
//		System.out.print("숫자 입력(1~9)>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int i=1;
//		while(i<10) {
//			int sum=a*i;
//			System.out.println(a+"x"+i+"="+sum);
//			i++;
//		}
		
		//16.숫자를 하나 입력받아 1~1000사이에 입력받은 숫자의 배수가 몇 개인지 
		//  출력하는 프로그램을 만들어 보자.
//		System.out.print("숫자 입력>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int i=1;
//		int j=0;
//		while(i<=1000) {
//			if(i%a==0) {
//				j++;
//			}
//			i++;
//		}
//		System.out.println(j);
		
		//17.사용자에게 행과 열을 입력 받아 행과 열에 맞취서 1부터 100까지 출력
//		System.out.print("행의 개수>>");
//		int a=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("열의 개수>>");
//		int b=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());		
//		int i=1;
//		int j=1;
//		while(i<=b) {
//			while(j<=a) {
//				System.out.print(j+"\t");
//				j++;
//			}
//			System.out.println("");
//			a=a+5;
//			i++;
//		}
		
		//18.다음과 같이 출력 되도록 프로그램을 완성해 보자.
		// 1  2  3  4  5
		// 10 9  8  7  6
		// 11 12 13 14 15
		// 21 22 23 24 25
//		int i=1;
//		int j=10;
//		while(i<11) {
//			if(i<6) {
//				System.out.print(i+"\t");
//			}else {
//				if(i==6) {
//					System.out.println("");
//					System.out.print(j+"\t");
//					j--;
//				}else {
//					System.out.print(j+"\t");
//					j--;
//
//				}
//			}
//			i++;
//		}
//		System.out.println("");
//		i=1;
//		j=1;
//		int c=11;
//		while(i<3) {
//			while(j<6) {
//				System.out.print(c+"\t");
//				j++;
//				c++;
//			}
//			System.out.println("");
//			j=1;
//			c=c+5;
//			i++;
//		}
		
		//19.해당 달의 시작 요일과 일수를 입력 받아 달력을 출력. \t탭을 이용
		System.out.print("시작 요일 \n 1.일 2.월 3.화 4.수 5.목 6.금 7.토\n>>");
		int a=Integer.parseInt(new java.util.Scanner(System.in)
				.nextLine());
		System.out.print("해당 달의 일수>>");
		int b=Integer.parseInt(new java.util.Scanner(System.in)
				.nextLine());
		
		//20.컴퓨터가 던진 동전이 앞면 인지 뒷면 인지 맞추는 프로그램을 구현
		//  맞춘 횟수와 틀린 횟수를 기록해서 보여주자.
//		int j=0;
//		int k=0;
//		for(;;) {
//			int i=(int)(Math.random()*2+1);
//			System.out.print("앞면이면 1번, 뒷면이면 2번, 종료 3번>>");
//			int a=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			if(i==a) {
//				System.out.println("맞춤");
//				j++;
//			}
//			if(i!=a){
//				System.out.println("틀림");
//				k++;
//			}
//			if(a==3){
//				System.out.println("맞춘 횟숫 : "+j+"\n"+"틀린 횟수 : "+k);
//				break;
//			}
//		}
		
		//21.컴퓨터가 던진 주사위를 맞추는 프로그램을 구현. 맞춘 횟수와 틀린 횟수를 기록해서 보여 주자.
//		int i=0;
//		int j=0;
//		for(;;) {
//			int k=(int)(Math.random()*6+1);
//			System.out.print("주사위 숫자는?\n1.1 2.2 3.3 4.4 5.5 6.6 7.종료 >>");
//			int a=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			if(k==a) {
//				System.out.println("주사위 수는"+k+"\n맞추셨습니다.");
//				i++;
//			}
//			if(k!=a) {
//				System.out.println("주사위 수는 "+k+"\n틀리셨습니다.");
//				j++;
//			}
//			if(a==7) {
//				System.out.println("맞춘 횟수 : "+i+"\t틀린 횟수 : "+j);
//				break;
//			}
//		}
		
	}

}
