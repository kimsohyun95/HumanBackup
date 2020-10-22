package com.human.ex;

public class JavaStart002 {

	public static void main(String[] args) {
//if문 예제		
		// 1. 변수 a에 20, b에 0를 넣은 다음 만약에 a가 10보다 크면 a에 b를 넣고 아니면 b에 a를 넣어서 
		//    a,b값을 출력하는 프로그램을 만들어 보자.
//		int a=20;
//		int b=0;
//		if(a>10) {
//			int c=a;
//			a=b;
//			b=c;
//		}
//		System.out.println("a는"+a);
//		System.out.println("b는"+b);

		//2. 입력한 숫자가 10보다 큰 수인지 아닌지 출력하는 코드를 만들어 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("입력 숫자>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		if(i>10) {
//			System.out.println("입력한 숫자"+i+"는(은) 10보다 크다 ");
//		}else {
//			System.out.println("입력한 숫자"+i+"는(은) 10보다 작거나 같다");
//		}
		
		//3. result라는 변수를 선언하고 사용자에게 수를 입력 받아 0이 면 0를 0이아니면 1를 넣어서 
		//   출력하는 프로그램을 구현해 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("입력 숫자>>");
//		int result=Integer.parseInt(scanner.nextLine());
//		if(result==0) {
//			System.out.println(result);
//		}else {
//			result=1;
//			System.out.println(result);
//		}
		
		//4. 입력 받은 숫자가 양수인지 0인지 음수인지 판단하는 코드를 만들어 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("입력 숫자>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		if(i>0) {
//			System.out.println("입력 숫자는 양수이다.");
//		}else if(i==0) {
//			System.out.println("입력 숫자는 0이다.");
//		}else {
//			System.out.println("입력 숫자는 음수이다.");
//		}

		//5. 입력 받은 숫자의 절대값을 출력하는 프로그램을 만들어 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("입력 숫자>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		if(i>=0) {
//			System.out.println(i);
//		}else {
//			i=-i;
//			System.out.println(i);
//			}

		//6. 두수를 입력해서 큰수에서 작은수를 뺀 차이를 출력하는 프로그램을 구현해 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("첫 번째 입력 숫자>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		System.out.print("두 번째 입력 숫자>>");
//		int j=Integer.parseInt(scanner.nextLine());
//		if(i>j) {
//			int sum= i-j;
//			System.out.println(sum);
//		}else {
//			int sum=j-i;
//			System.out.println(sum);
//		}

		//7. 입력받은 3개의 숫자 중 가장 큰 수를 출력하는 코드를 구현하시오. 
		//   3개중에서 2개를 선택해서 큰수를 구한후 나머지 하나를 비교해 보면된다.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("첫 번째 입력 숫자>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		System.out.print("두 번째 입력 숫자>>");
//		int j=Integer.parseInt(scanner.nextLine());	
//		System.out.print("세 번째 입력 숫자>>");
//		int k=Integer.parseInt(scanner.nextLine());
//		if(i>j) {
//			if(i>k) {
//				System.out.println(i);
//			}else {
//				System.out.println(k);
//			}
//		}else {
//			if(j>k) {
//				System.out.println(j);
//			}else {
//				System.out.println(k);
//			}
//		}
		
		//%연산의 사용 용도
		//1. 숫자를 하나 입력 받아 홀수 인지 짝수 인지 구하는 프로그램을 구하여라.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("입력 숫자>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		if(i%2==0) {
//			System.out.println("입력한 숫자는 짝수이다.");
//		}else {
//			System.out.println("입력한 숫자는 홀수이다.");
//		}
		
		//2. 숫자 2개를 입력 받아 첫번째 숫자가 두번째 숫자의 배수인지 아닌지 출력하는 프로그램을 구하여라.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("첫 번째 입력 숫자>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		System.out.print("두 번째 입력 숫자>>");
//		int j=Integer.parseInt(scanner.nextLine());
//		if(i%j==0) {
//			System.out.println("첫 번째 숫자는 두 번째 숫자의 배수이다.");
//		}else {
//			System.out.println("첫 번재 숫자는 두 번째 숫자의 배수가 아니다.");
//		}

		// 3. a 원을 동전으로 바꾸면 500원짜리 몇 개 100원짜리 몇 개가 되는가?
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("가지고 있는 돈>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		int a=i/500;
//		int b=(i%500)/100;
//		System.out.println("500원짜리 "+a+"개 \n"+"100원짜리 "+b+"개");

		//4. 500원짜리 n개 100원짜리 m개 총 얼마인가?
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("500원 개수>>");
//		int n=Integer.parseInt(scanner.nextLine());
//		System.out.print("100원 개수>>");
//		int m=Integer.parseInt(scanner.nextLine());
//		int sum=(500*n)+(100*m);
//		System.out.println("총 "+sum+"원");
	
		// 5. n초를 입력 받아 시분초로 바꿔보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("입력 시간(초)>>");
//		int n=Integer.parseInt(scanner.nextLine());
//		int h=n/3600;
//		int m=(n%3600)/60;
//		int s=n%60;
//		System.out.println(h+"시 "+m+"분 "+s+"초");

		// 6. n시간 m분 l초는 총 몇초인가?
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("시간>>");
//		int n=Integer.parseInt(scanner.nextLine());
//		System.out.print("분>>");
//		int m=Integer.parseInt(scanner.nextLine());
//		System.out.print("초>>");
//		int l=Integer.parseInt(scanner.nextLine());
//		int sum=(3600*n)+(60*m)+l;
//		System.out.println("총 "+sum+"초");
		
		//교환 방법
		// 1) a, b 의 수를 입력 받아 두 수를 교환한 다음에 두 수를 출력하는 코드를 작성해 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("첫 번째 숫자 a입력>>");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("두 번째 입력 숫자 b입력>>");
//		int b=Integer.parseInt(scanner.nextLine());
//		int c=a;
//		a=b;
//		b=c;
//		System.out.println("a는 "+a);
//		System.out.println("b는 "+b);

		//2) 3개의 수를 입력 받아 가장 작은 수를 a, 다음 작은수를 b, 나머지 수를 c에 넣어 작은수부터 출력해 보자. 
		//  다음을 만족 시키자.
		//  변수 a,b,c를 무작위로 각각 숫자를 입력 받아 가장 작은 변수를 a값과 교환
		//  남은 변수도 비교해서 작은 수를 b와 교환
		//  a,b,c를 출력한 결과가 오름차순으로
		//  입력값 a,b,c 출력값 a,b,c
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("a값 입력>>");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("b값 입력>>");
//		int b=Integer.parseInt(scanner.nextLine());
//		System.out.print("c값 입력>>");
//		int c=Integer.parseInt(scanner.nextLine());
//		if(a>b) {
//			int t;
//			t=a; a=b; b=t;
//		}
//		if(b>c) {
//			int t;
//			t=b; b=c; c=t;
//		}
//		if(a>b) {
//			int t;
//			t=a; a=b; b=t;
//		}
//		System.out.println("출력값 "+a+", "+b+", "+c);

		//if문
		//1.왼쪽 순서도를 프로그램으로 구현해서 출력 결과를 확인해보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("입력 숫자>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		int a=11;
//		int b=14;
//		if(i==0) {
//			a=5;
//		}else {
//			b=a+3;
//		}
//		System.out.println("a는 "+a+" b는 "+b);

		//2.사용자에게 양수 5 혹은 음수 -5를 입력 받아 절대값을 출력하는 프로그램을 만들어 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("5나 -5 입력>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		if(i>0) {
//			System.out.println(i);
//		}else {
//			i=-i;
//			System.out.println(i);
//		}

		//3.사용자에게 숫자를 하나 입력받아 126의 약수인지 아닌지 기술해 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("입력 숫자>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		if(126%i==0) {
//			System.out.println("입력 숫자는 126의 약수이다.");
//		}else {
//			System.out.println("입력 숫자는 126의 약수가 아니다.");
//		}
		
		//4.국영수과목의 점수를 입력받아 평균이 80이상이면 합격 이하면 불합격을 출력해 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("국어 점수>>");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("영어 점수>>");
//		int b=Integer.parseInt(scanner.nextLine());
//		System.out.print("수학 점수>>");
//		int c=Integer.parseInt(scanner.nextLine());
//		System.out.print("과학 점수>>");
//		int d=Integer.parseInt(scanner.nextLine());
//		int sum=a+b+c+d;
//		int ave=sum/4;
//		if(ave>=80) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
		
		//5.사용자에게 입력받은 수 x가 5이하이면 x+15의 계산결과가,  
		//  5초과 이면 x+5의 계산 결과가 출력되는 프로그램을 만들어 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("입력 숫자>>");
//		int x=Integer.parseInt(scanner.nextLine());
//		if(x<=5) {
//			x=x+15;
//			System.out.println(x);
//		}else {
//			x=x+5;
//			System.out.println(x);
//		}

		//6.왼쪽의 if문이 어떻게 출력되는지 생각해보고 출력 결과를 확인해 보자.
//		boolean b1=5!=3;
//		boolean b2=5==3;
//		if(b1) {
//			if(b2) {
//				System.out.println("1번");
//			}else {
//				System.out.println("2번");
//			}
//		}else {
//			System.out.println("3번");
//			System.out.println("4번");
//		}

		//if 심화 문제
		//1.왼쪽 이미지에서 색칠한 부분의 값들이 들어 왔을때 true가되는 조건식을 만들어 보자.
//		조건식 : 14보다 큰 수 . 판별식 : a>14
		
		//2.왼쪽 이미지에서 색칠 안한 부분의 값들이 들어 왔을때 true가되는 조건식을 만들어 보자. 
		//  not연산자는 사용하지 말자.
//		조건식 : 12보다 크고, 22보다 작거나 같은 수. 판별식 : a>12 && a<=22
		
		//3.입력받은 수가 3의 배수 이거나 7의 배수이면 ‘3또는 7의 배수’가 출력되고, 
		// 2의 배수도 되고 5의 배수도 되면 ‘2와 5의 배수’를 출력하고 
		// 두가지 경우 다 만족하면 2가지 다 출력하는 프로그램을 만들어 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("입력 숫자>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		if(i%3==0 || i%7==0) {
//			System.out.println("입력 숫자는 3 또는 7의 배수");
//		}if(i%2==0 && i%5==0) {
//			System.out.println("입력 숫자는 2와 5의 배수");
//		}

		//4. 해당 점의 좌표를 입력받아 해당 점이 어느 위치에 있는지 출력해 보자. 
		//   x,y축 위에 있을 때는 x,y축 위에 있다고 출력하면 된다.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("x점의 좌표>>");
//		int x=Integer.parseInt(scanner.nextLine());
//		System.out.print("y점의 좌표>>");
//		int y=Integer.parseInt(scanner.nextLine());
//		if(x<0 && y>0) {
//			System.out.println("점은 1번 위치에 있다.");
//		}
//		if(x>0 && y>0) {
//			System.out.println("점은 2번 위치에 있다.");
//		}
//		if(x<0 && y<0) {
//			System.out.println("점은 3번 위치에 있다.");
//		}
//		if(x>0 && y<0) {
//			System.out.println("점은 4번 위치에 있다.");
//		}
//		if(x==0 && y!=0) {
//			System.out.println("점은 x축 위에 있다.");
//		}
//		if(x!=0 && y==0) {
//			System.out.println("점은 y축 위에 있다.");
//		}
//		if(x==0 && y==0) {
//			System.out.println("점은 x,y축 위에 있다.");
//		}

		//4.버스요금계산하는 프로그램을 구현해보자. 
		// 15세 이하는 1300원 초과는 1600원이고  버스카드로 결제하면 100원 할인해 준다.
		// 입력: 16엔터 true엔터
		// 출력: 버스요금은 1500원 입니다.
//		int age=16;
//		boolean a=Boolean.parseBoolean("true");
//		if(age<16 && a==true) {
//			System.out.println("버스 요금은 1200원 입니다.");
//		}
//		if(age<16 && a==false) {
//			System.out.println("버스 요금은 1300원 입니다.");
//		}
//		if(age>15 && a==true) {
//			System.out.println("버스 요금은 1500원 입니다.");
//		}
//		if(age>15 && a==false) {
//			System.out.println("버스 요금은 1600원 입니다.");
//		}
		
		//else if 혹은 switch문
		//1.다음 순서도와 동일하게 실행되도록 else if문과 switch문으로 기술하시오.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("숫자 입력(0포함)>>");
//		int input=Integer.parseInt(scanner.nextLine());
//		int a=5;
//		int b=7;
		//<else if문>
//		if(input==0) {
//			a=a+2;
//		}else if(input==1) {
//			b=b+4;
//		}else if(input==2) {
//			a=a+b;
//		}else {
//			b=b+5;
//		}
//		System.out.println(a);
//		System.out.println(b);
		//<switch문>
//		switch(input) {
//		case 0 :
//			a=a+2;
//			break;
//		case 1:
//			b=b+4;
//			break;
//		case 2:
//			a=a+b;
//			break;
//		default :
//			b=b+5;
//		}
//		System.out.println(a);
//		System.out.println(b);
		
		//2.다음을 구현하려면 어떤문을 사용해야 하는지 고민해 보고 구현해  보자.
			//1. 아침 밥을 먹었으면 ‘밥을 먹었음’ 이 출력 되고 밥을 먹지 않았으면 아무것도 출력되지 않음.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("밥을 먹었으면 treu, 안 먹었으면 false>>");
//		Boolean a=Boolean.parseBoolean(scanner.nextLine());
//		if(a==true) {
//			System.out.println("밥을 먹었음");
//		}
			//2. 아침에 빵을 먹었으면 ‘빵을 먹었음’이 출력되고 빵을 먹지 않았으면 ‘밥을 먹었음’이 출력됨
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("빵을 먹었으면 true, 안 먹었으면 false>>");
//		Boolean a=Boolean.parseBoolean(scanner.nextLine());
//		if(a==true) {
//			System.out.println("빵을 먹었음");
//		}else {
//			System.out.println("밥을 먹었음");
//		}
			// 3.아침 밥을 먹었으면 ‘밥을 먹었음’ 먹지 않았으면 ‘빵을 먹었음’이 출력되도록 구현.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("밥을 먹었으면 true, 안 먹었으면 false>>");
//		Boolean a=Boolean.parseBoolean(scanner.nextLine());
//		if(a==true) {
//			System.out.println("밥을 먹었음");
//		}else {
//			System.out.println("빵을 먹었음");
//		}
			// 4.아침 밥을 먹었으면 ‘밥을 먹었음’ 먹지 않았으면 ‘아무것도 안먹었음’이 출력 되도록 구현
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("밥을 먹었으면 true, 안 먹었으면 false>>");
//		Boolean a=Boolean.parseBoolean(scanner.nextLine());
//		if(a==true) {
//			System.out.println("밥을 먹었음");
//		}else {
//			System.out.println("아무것도 안 먹었음");
//		}
			// 5.밥,빵,국,우유 중 아침밥으로 먹은 것을 화면에 출력되도록 구현.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("아침밥으로 먹은 것은(1=밥, 2=빵, 3=국, 4=우유)>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		switch(i) {
//		case 1:
//			System.out.println("밥");
//			break;
//		case 2:
//			System.out.println("빵");
//			break;
//		case 3:
//			System.out.println("국");
//			break;
//		case 4:
//			System.out.println("우유");
//			break;
//		default:
//			System.out.println();
//		}
			//6.아침 식사로 ‘밥’과 ‘빵’이 있고 후식으로 국,우유, 아이스크림, 커피가 있는데 
		//  밥을 먹으면 국과 아이스크림중 하나를 빵을 먹으면 우유 커피 중 하나를 후식으로 먹을수 있다.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("아침 식사(1=밥. 2=빵)>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		if(i==1) {
//			System.out.print("후식(1=국 2=아이스크림)>>");
//			int j=Integer.parseInt(scanner.nextLine());
//			if(j==1) {
//				System.out.println("아침식사로 밥, 후식으로 국을 먹을 수 있다.");
//			}else if(j==2) {
//				System.out.println("아침식사로 밥, 후식으로 아이스크림을 먹을 수 있다.");
//			}
//		}else if(i==2) {
//			System.out.print("후식(1=우유 2=커피)>>");
//			int k=Integer.parseInt(scanner.nextLine());
//			if(k==1) {
//				System.out.println("아침 식사로 빵, 후식으로 우유를 먹을 수 있다");
//			}else if(k==2) {
//				System.out.println("아침 식사로 빵, 후식으로 커피를 먹을 수 있다.");
//			}
//		}
			//7.밥을 먹으면 ‘밥을 먹었음’과 ‘국을 먹었음’이 출력되고 밥을 먹지 않았으면 
		//  ‘빵을 먹었음’과 ‘우유를 먹었음’이 출력 되도록 구현.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("밥을 먹었으면 true>>");
//		Boolean a=Boolean.parseBoolean(scanner.nextLine());
//		if(a==true) {
//			System.out.println("밥을 먹었음");
//			System.out.println("국을 먹었음");
//		}else {
//			System.out.println("빵을 먹었음");
//			System.out.println("우유를 먹었음");
//		}
			//8.‘해’,’구름’, ‘달’, ‘별’ 를 이용해서 
		//  다음과 같이 7개가 출력 될수 있는 형태의 if문과
		//  boolean형태의 flag변수들을 선언하고 flag값들을 설정해 보자
		//  -해   -해,구름   -구름   -달   -달,별   -별
//		boolean sun=true, cloud=true, moon=true, star=true;
//		if(sun==true) {
//			System.out.println("-해");
//		}
//		if(sun==true && cloud==true) {
//			System.out.println("-헤,구름");
//		}
//		if(cloud==true) {
//			System.out.println("-구름");
//		}
//		if(moon==true) {
//			System.out.println("-달");
//		}
//		if(moon==true && star==true) {
//			System.out.println("-달, 별");
//		}
//		if(star==true) {
//			System.out.println("-별");
//		}
		
		//3.int i=(new java.util.Date()).getDay();
		//  다음과 같이 기술하면 오늘의 요일이 i에 숫자로 들어간다.
		//  i가 0일 경우 일요일이고 일월화수목금토일은 0123456과 같다. 
		//  i값을 가지고 오늘의 요일을 출력하는 프로그램을 만들어 보자.
//		int i=(new java.util.Date()).getDay();
//		if(i==0) {
//			System.out.println("일요일");
//		}else if(i==1) {
//			System.out.println("월요일");
//		}else if(i==2) {
//			System.out.println("화요일");
//		}else if(i==3) {
//			System.out.println("수요일");
//		}else if(i==4) {
//			System.out.println("목요일");
//		}else if(i==5) {
//			System.out.println("금요일");
//		}else if(i==6) {
//			System.out.println("토요일");
//		}
		
		//4.달을 입력받아 해당달이 28일인지 30일인지 31일인지 출력하는 프로그램을 구현해 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("1~12까지의 달 입력>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		if(i==2) {
//			System.out.println("해당 달은 28일까지 있다.");
//		}else {
//			if(i<8) {
//				if(i%2==0) {
//					System.out.println("해당 달은 30일까지 있다.");
//				}else {
//					System.out.println("해당 달은 31일까지 있다.");
//				}
//			}else {
//				if(i%2==0) {
//					System.out.println("해당 달은 31일까지 있다.");
//				}else {
//					System.out.println("해당 달은 30일까지 있다.");
//				}
//			}
//		}
		
		//5.한국사이즈를 입력받아 미국사이즈로 출력하시오.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("사이즈 입력(90이상)>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		if(i>=90 && i<95) {
//			System.out.println("미국 사이즈 : S");
//		}else if(i>=95 && i<100) {
//			System.out.println("미국 사이즈 : M");
//		}else if(i>=100 && i<105) {
//			System.out.println("미국 사이즈 : L");
//		}else if(i>=105 && i<110) {
//			System.out.println("미국 사이즈 : XL");
//		}else {
//			System.out.println("미국 사이즈: XXL");
//		}

		//6.java,html,db과목의 점수를 입력받아. 평균이 60점 이상이면 합격, 
		//  평균이 60점 미만이면 불합격, 40점 이하인 과목이 하나라도 있으면 과락이 출력
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("java 점수>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		System.out.print("html 점수>>");
//		int j=Integer.parseInt(scanner.nextLine());
//		System.out.print("db 점수>>");
//		int k=Integer.parseInt(scanner.nextLine());
//		int ave=(i+j+k)/3;
//		if(ave>=60 && (i>40 && j>40 && k>40)) {
//			System.out.println("합격");
//		}
//		if(ave<60 &&(i>40 && j>40 && k>40)) {
//			System.out.println("불합격");
//		}
//		if(i<=40 || j<=40 || k<=40) {
//			System.out.println("과락");
//		}

		//7.왼쪽은 비만도 산출식이다. 사용자 입력을 받아 결과가 아래 표와 같은 분류가 
		//  나오도록 프로그램을 구현하여라.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("키>>");
//		int x=Integer.parseInt(scanner.nextLine());
//		System.out.print("몸무게>>");
//		int y=Integer.parseInt(scanner.nextLine());
//		System.out.print("나이>>");
//		int age=Integer.parseInt(scanner.nextLine());
//		double sum=(y/((x-100)*0.9))*100;
//		if(age<20) {
//			if(sum<95) {
//				System.out.println("체중 미달");
//			}else if(sum>=95 && sum>120) {
//				System.out.println("정상");
//			}else if(sum>=120 && sum<130) {
//				System.out.println("경도 비만");
//			}else if(sum>=130 && sum<150) {
//				System.out.println("중도 비만");
//			}else {
//				System.out.println("고도 비만");
//			}
//		}else {
//			if(sum<100) {
//				System.out.println("체중 미달");
//			}else if(sum>=100 && sum <110) {
//				System.out.println("정상");
//			}else if(sum>=110 && sum<120) {
//				System.out.println("과체중");
//			}else if(sum>=120 && sum<150) {
//				System.out.println("비만");
//			}else {
//				System.out.println("고도 비만");
//			}
//		}
		
		//2.사용자가 알고 있는 신체사이즈중 하나를 입력받아
		//  해당 미국사이즈와 한국사이즈를 출력하시오.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.println("알고 있는 신체 사이즈 1.목둘레 2.가슴둘레 3.팔길이 4.허리둘레");
//		int i=Integer.parseInt(scanner.nextLine());
//		System.out.print("신체 사이즈>>");
//		int j=Integer.parseInt(scanner.nextLine());
//		if(i==1) {
//			if(j<33) {
//				System.out.println("미국 사이즈 : s, 한국 사이즈 : 90~95");
//			}else if(j>=33&&j<36) {
//				System.out.println("미국 사이즈 : s, 한국 사이즈 : 90~95");
//			}else if(j>=36 && j<38) {
//				System.out.println("미국 사이즈 : m, 한국 사이즈: 95~100");
//			}else if(j>=38 && j<40) {
//				System.out.println("미국 사이즈 : l, 한국 사이즈: 100~105");
//			}else if(j>=40 && j<42) {
//				System.out.println("미국 사이즈 : xl, 한국 사이즈 : 105~120");
//			}else {
//				System.out.println("미국 사이즈 : xxl, 한국 사이즈 : 110이상");
//			}
//		}else if(i==2) {
//			if(j>=86 && j<92) {
//				System.out.println("미국 사이즈 : s, 한국 사이즈 : 90~95");
//			}else if(j>=92 && j<103) {
//				System.out.println("미국 사이즈 : m, 한국 사이즈 : 95~100");
//			}else if(j>=103 && j<113) {
//				System.out.println("미국 사이즈 : l, 한국 사이즈 : 100~105");
//			}else if(j>=113 && j<123) {
//				System.out.println("미국 사이즈 : lx, 한국 사이즈 : 105~120");
//			}else {
//				System.out.println("미국 사이즈 : llx, 한국 사이즈 : 110이상");
//			}
//		}else if(i==3) {
//			if(j<33) {
//				System.out.println("미국 사이즈 : s, 한국 사이즈 : 90~95");
//			}else if(j>=78 && j<82) {
//				System.out.println("미국 사이즈 : s, 한국 사이즈 : 90~95");
//			}else if(j>=82 && j<85) {
//				System.out.println("미국 사이즈 : m, 한국 사이즈 : 95~100");
//			}else if(j>=85 && j<87) {
//				System.out.println("미국 사이즈 : l, 한국 사이즈 : 100~105");
//			}else if(j>=87 && j<90) {
//				System.out.println("미국 사이즈 : lx, 한국 사이즈 : 105~120");
//			}else {
//				System.out.println("미국 사이즈 : llx, 한국 사이즈 : 110이상");
//			}
//	
//		}else {
//			if(j<33) {
//				System.out.println("미국 사이즈 : s, 한국 사이즈 : 90~95");
//			}else if(j>=28 && j<30) {
//				System.out.println("미국 사이즈 : s, 한국 사이즈 : 90~95");
//			}else if(j>=30 && j<32) {
//				System.out.println("미국 사이즈 : m, 한국 사이즈 : 95~100");
//			}else if(j>=32 && j<35) {
//				System.out.println("미국 사이즈 : l, 한국 사이즈 : 100~105");
//			}else if(j>=35 && j<38) {
//				System.out.println("미국 사이즈 : lx, 한국 사이즈 : 105~120");
//			}else {
//				System.out.println("미국 사이즈 : llx, 한국 사이즈 : 110이상");
//			}
//	
//		}
		
		//1.다음과 같이 실행되는 계산기 프로그램을 만들어보자. 
		//  첫번째수 입력>>5, 연산자선택 1. + 2. - 3. * 4. / >>3
		//  두번째수 입력>>12 
		//  5*12=60 입니다.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("첫 번째 수>>");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("1.+ 2.- 3.* 4./ >>");
//		int i=Integer.parseInt(scanner.nextLine());
//		System.out.print("두 번째 수>>");
//		int b=Integer.parseInt(scanner.nextLine());
//		if(i==1) {
//			int sum=a+b;
//			System.out.println(a + "+" + b +"="+sum+"입니다.");
//		}else if(i==2) {
//			int sum=a-b;
//			System.out.println(a+"-"+b+"="+sum+"입니다.");
//		}else if(i==3) {
//			int sum=a*b;
//			System.out.println(a+"*"+b+"="+sum+"입니다.");
//		}else {
//			int sum=a/b;
//			System.out.println(a+"/"+b+"="+sum+"입니다.");
//		}
		
		//2.가위 바위 보 게임을 만들어서 이겼는지 졌는지 출력하는 프로그램을 만들어 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("1.가위 2.바위 3.보 >>");
//		int i=Integer.parseInt(scanner.nextLine());
//		int j=(int) (Math.random()*3+1);
//		if(i==j) {
//			System.out.println("비겼다");
//		}else {
//			if(i==1 && j==2) {
//				System.out.println("컴퓨터가 이겼다");
//			}
//			if(i==1 && j==3) {
//				System.out.println("플레이어가 이겼다");
//			}
//			if(i==2 && j==1) {
//				System.out.println("플레이어가 이겼다");
//			}
//			if(i==2 && j==3) {
//				System.out.println("컴퓨터가 이겼다");
//			}
//			if(i==3 && j==1) {
//				System.out.println("컴퓨터가 이겼다");
//			}
//			if(i==3 && j==2) {
//				System.out.println("플레이어가 이겼다");
//			}
//		}

		//3.왼쪽표를 기본으로 본인이 낼 새금이 얼마인지 출력하는 프로그램을 구현
		//  만약에 본인이 번돈이 1600만원 이라면 1200만원은 세율이 6%이고 
		//  나머지 400만원은 세율이 15%
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("소독금액(원)>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		if(i<=12000000) {
//			int sum=i*6/100;
//			System.out.println("내야 할 세금 : "+sum);
//		}else if(i>12000000 && i<=46000000) {
//			int j=i-12000000;
//			int sum=(12000000*6/100)+(j*15/100);
//			System.out.println("내야 할 세금 : "+sum);
//		}else if(i>46000000 && i<=88000000) {
//			int j=i-46000000;
//			int k=j-12000000;
//			int sum=(12000000*6/100)+(k*15/100)+(j*24/100);
//			System.out.println("내야 할 세금 : "+sum);
//		}else if(i>88000000 && i<=150000000) {
//			int j=i-88000000;
//			int k=j-46000000;
//			int l=k-12000000;
//			int sum=(12000000*6/100)+(l*15/100)+(k*24/100)+(j*35/100);
//			System.out.println("내야 할 세금 : "+sum);
//		}else if(i>150000000 && i<=300000000) {
//			int j=i-150000000;
//			int k=j-88000000;
//			int l=k-46000000;
//			int m=l-12000000;
//			int sum=(12000000*6/100)+(m*15/100)+(l*24/100)+(k*35/100)+(j*38/100);
//			System.out.println("내야 할 세금 : "+sum);
//		}else if(i>300000000 && i<=500000000) {
//			int j=i-300000000;
//			int k=j-150000000;
//			int l=k-88000000;
//			int m=l-46000000;
//			int n=m-12000000;
//			int sum=(12000000*6/100)+(n*15/100)+(m*24/100)+(l*35/100)+(k*38/100)+(j*4/100);
//			System.out.println("내야 할 세금 : "+sum);
//		}else {
//			int j=i-500000000;
//			int k=j-300000000;
//			int l=k-150000000;
//			int m=l-88000000;
//			int n=m-46000000;
//			int o=n-12000000;
//			int sum=(12000000*6/100)+(o*15/100)+(n*24/100)+(m*35/100)+(l*38/100)+(k*4/100)+(j*42/100);
//			System.out.println("내야 할 세금 : "+sum);
//		}

		

		
		
		
		
		
		
	}

}
