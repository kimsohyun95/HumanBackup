package com.human.ex;

public class JavaStart011 {

	public static void main(String[] args) {
		// 배열 참조자료형의 비교 ==과 equals
		
		//사용자 입력을 받아 10보다 큰지 않은지 출력
//		System.out.print("숫자 입력>>");
//		int i=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		if(i<10) {
//			System.out.println("입력 숫자는 10보다 작습니다.");
//		}else if(i>10) {
//			System.out.println("입력 숫자는 10보다 큽니다.");
//		}else {
//			System.out.println("입력 숫자는 10과 같습니다.");
//		}

		//사용자 입력 true를 받아서 'true'가 입력되었습니다.'
		// 'true가 입력되지 않았습니다.'가 출력 되도록 만들어 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("true, false>>");
//		String str1=scanner.next();
//		String str2="true";
//		if(str1.equals(str2)) {
//			System.out.println("true가 입력되었습니다.");
//		}else {
//			System.out.println("true가 입력되지 않았습니다.");
//		}
		
		//사용자에게 숫자를 입력받아 1004이면 '암호가 맞음' 아니면
		//'암호가 틀림'이 출력되도록 프로그램 구현
//		System.out.print("숫자 입력>>");
//		int i=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		if(i==1004) {
//			System.out.println("암호가 맞음");
//		}else {
//			System.out.println("암호가 틀림");
//		}
		
		//'안녕'을 입력하면 '너도 안녕' '잘자' 입력하면 '너도 잘자'
		//'잘가'입력하면 '너도 잘가'가 출력되도록 프로그램 구현
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.println("안녕, 잘자, 잘가 중 택>>");
//		String str=scanner.next();
//		if(str.equals("안녕")) {
//			System.out.println("너도 안녕");
//		}
//		if(str.equals("잘자")) {
//			System.out.println("너도 잘자");
//		}
//		if(str.equals("잘가")) {
//			System.out.println("너도 잘가");
//		}

		//변수명
		//int 3i=5; 변수명의 시작으로 숫자는 안된다.
		//int _hello=55; 정상
		//int hello=5.3; int는 정수형 예약어로 double을 사용해야 한다.
		//int i+j=4; 특수문자는 _와 $만 허용으로 +는 허용 안된다.
		//int public=5; public은 예약어로 허용이 안된다.
		//int i#2=5; 특수문자 #은 허용이 안된다.
		//int MyCatAge=10; 사용은 가능하나 관용적으로 변수명 시작은 소문자로 한다.
		//int mycatage=20; 사용 가능하나 관용적으로 여러 단어 구성시 첫 단어 이후는 첫알파벳을 대문자로 한다.
		//class myCat(){} 사용 가능하나 관용적으로 클래스는 대문자로 시작하고 여러 단어시 이후 단어들도 첫 알파벳을 대문자로 한다.
		
		
		//배열
		
		//배열 a에 1,2,3을 넣은 후 배열 내의 모든 값에 2를 더한 값인 
		//3,4,5로 변경한 다음에 배열의 내용을 화면에 출력
//		int a[]= {1,2,3};
//		for(int i=0; i<3; i++) {
//			a[i]=a[i]+2;
//			System.out.println(a[i]);
//		}
		
		//배열 a[10]에 3의 배수를 넣은 다음에 배열의 내용을 출력
//		int a[]=new int[10];
//		int i;
//		for(i=0; i<10; i++) {
//			a[i]=(i+1)*3;
//			System.out.println(a[i]);
//		}
		
		//배열 a[100]에 1부터 100까지의 숫자를 순서대로 넣은 다음
		//배열의 인덱스가 짝수인 배열에 들어 있는 값만 출력
//		int a[]=new int[100];
//		for(int i=0; i<100; i++) {
//			a[i]=i+1;
//			if(i%2==0) {
//				System.out.println(a[i]);
//			}
//		}
		
		//배열 a[]={12,1,5,3,6,8,5,3}을 만든 다음에 배열의
		//모든 내용을 더한 값을 sum에 저장하여 출력하는 코드
//		int sum=0;
//		int a[]= {12,1,5,3,6,8,5,3};
//		for(int i=0; i<8; i++) {
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
		
		//a[]={12,1,5,3,6,8,5,3}의 a배열에서 배열 안의 숫자가
		//짝수인 12,6,8의 값을 더한 결과 값을 출력하는 프로그램
//		int a[]= {12,1,5,3,6,8,5,3};
//		int sum=0;
//		for(int i=0; i<8; i++) {
//			if(a[i]%2==0) {
//				sum=sum+a[i];
//			}
//		}
//		System.out.println(sum);
		
		//a[]={12,1,51,3,6,8,5}의 a배열에서 가장 큰 값과
		//가장 작은 값을 더하는 프로그램
//		int a[]= {12,1,51,3,6,8,5};
//		int max=a[0];
//		int min=a[0];
//		for(int i=1; i<7; i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//			if(a[i]<min) {
//				min=a[i];
//			}
//		}
//		int sum=max+min;
//		System.out.println(sum);
		
		//배열에 5개의 숫자를 입력받아 넣은 다음 숫자 하나를 입력받아
		//해당 숫자가 몇번째 인덱스에 들어 있는지 출력
//		int a[]=new int[5];
//		for(int i=0; i<5; i++) {
//			System.out.print("숫자 입력>>");
//			int b=Integer.parseInt(new java.util.Scanner(System.in)
//					.nextLine());
//			a[i]=b;
//		}
//		System.out.println("위에서 입력한 숫자 중 하나 입력>>");
//		int c=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		for(int i=0; i<5; i++) {
//			if(a[i]==c) {
//				System.out.println(c+"는 "+i+"번 인덱스에 들어 있다.");
//			}
//		}
		
		//배열에 5개의 문자를 입력받아 넣은 다음 문자 하나를 입력받아
		//해당 문자가 몇번째 인덱스에 들어 있는지 출력
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		String a[]=new String[5];
//		for(int i=0; i<5; i++) {
//			System.out.println("문자 입력>>");
//			String str1=scanner.next();
//			a[i]=str1;
//		}
//		System.out.println("위에서 입력 했던 문자 중 하나 입력>>");
//		String str2=scanner.next();
//		for(int i=0; i<5; i++) {
//			if(a[i].equals(str2)) {
//				System.out.println(str2+"는 "+i+"번 인덱스에 들어 있다.");
//			}
//		}
		
		//배열 크기를 입력받아 배열 크기 만큼 1,2,3,1,2,3,1,2,3..
		//숫자를 순서대로 배열안에 넣은 다음 배열의 내용을 출력
//		System.out.print("숫자 입력>>");
//		int i=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		int a[]=new int[i];
//		for(int j=0; j<i; j++) {
//			a[j]=(j%3)+1;
//			System.out.println(a[j]);
//		}
		
		//배열에 들어있는 내용을 정순과 역순으로 저장하는 새로운 배열을 만들어 출력
		//ex. 배열에 1,2,3이 들어 있으면 1,2,3,3,2,1이 들어 있는 배열
		//배열에 7,15,23,15,23이 들어 있으면 23,15,23,15,7,7,15,23,15,23
//		int a[]= {1,8,5,15};
//		int c=0;
//		int b[]=new int[8];
//		for(int i=0; i<8; i++) {
//			if(i<4) {
//				b[i]=a[c];
//				c++;
//			}else {
//				c--;
//				b[i]=a[c];
//				}
//			System.out.print(b[i]+" ");
//		}
		
		//배열 1,2,3,4,5,6,7,8,9에서 이동방향, 이동칸수, 채울숫자를 입력 받아 배열의 내용 변경 후 출력
		//ex. 입력 왼쪽 3 2     결과 4,5,6,7,8,9,2,2,2
		//ex. 입력 오른쪽 3 4   결과 4,4,4,1,2,3,4,5,6
//		int a[]= {1,2,3,4,5,6,7,8,9};
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		System.out.print("이동 방향(오른쪽, 왼쪽)>>");
//		String moveD=scanner.next();
//		System.out.print("이동 칸수>>");
//		int moveNum=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		System.out.print("빈 공간 채울 숫자>>");
//		int num1=Integer.parseInt(new java.util.Scanner(System.in)
//				.nextLine());
//		for(int i=0; i<9; i++) {
//			if(moveD.equals("오른쪽")) {
//				if(i<moveNum) {
//					a[i]=num1;
//				}else {
//					a[i]=i-(moveNum-1);
//				}
//			}else {
//				if(i<(9-moveNum)) {
//					a[i]=i+moveNum+1;
//				}else {
//					a[i]=num1;
//				}
//			}
//			System.out.print(a[i]+" ");
//		}

		//배열 1,2,3,4,5,6,7,8,9에서 회전방향과 회수를 입력받아 배열 내용을 회전시키고 출력
		//ex.입력 왼쪽 2    결과 3,4,5,6,7,8,9,1,2
		//ex.입력 오른쪽 3  결과 7,8,9,1,2,3,4,5,6
		int a[]= {1,2,3,4,5,6,7,8,9};
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.print("이동 방향(오른쪽, 왼쪽)>>");
		String moveD=scanner.next();
		System.out.print("이동 칸수>>");
		int moveNum=Integer.parseInt(new java.util.Scanner(System.in)
				.nextLine());
		System.out.print("빈 공간 채울 숫자>>");
		int num1=Integer.parseInt(new java.util.Scanner(System.in)
				.nextLine());
		
		
		

		

			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
