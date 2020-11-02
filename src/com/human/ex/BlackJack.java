package com.human.ex;

public class BlackJack {
	public static java.util.Scanner sc=new java.util.Scanner(System.in);
	public static int deck[]=new int[52];
	public static int p1Deck[]=new int[10];
	public static int p2Deck[]=new int[10];
	public static int deckIndex=52;
	public static int p1DeckIndex=0;
	public static int p2DeckIndex=0;
	public static boolean isP1GEnd=false; //게임이 끝났냐? 아니요 true면 네 카드를 받을 것인지에 대한 유무를 위한 변수
	public static boolean isP2GEnd=false;
	public static String cardShape[]= {"스페이드", "다이아", "하트", "클로버"};
	public static String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public static void newCard() {
		for(int i=0; i<deck.length; i++) {
			deck[i]=i;
		}
		deckIndex=52; // 게임을 진행 후 새로 진행할 때를 위해 다 초기화 해야 함.
		p1DeckIndex=0; p2DeckIndex=0;
		isP1GEnd=false; isP2GEnd=false;
	}
	public static void mixCard() {
		for(int i=0; i<10000; i++) {
			int randomIndex=(int)(Math.random()*52);
			int temp=deck[0];
			deck[0]=deck[randomIndex];
			deck[randomIndex]=temp;
		}
	}
	public static void displayDeckCard() {
		for(int i=0; i<deckIndex; i++) {
			System.out.println(cardShape[deck[i]/13]+" "+
						cardNumber[deck[i]%13]);
		}
	}
	
	public static void displayP1Card() {
		System.out.print("p1Card : ");
		for(int i=0; i<p1DeckIndex; i++) {
			System.out.print(cardShape[p1Deck[i]/13]+" "+
						cardNumber[p1Deck[i]%13]+", ");
		}
		System.out.println(" 현재 점수 : "+p1Scoure());
	}
	
	
	public static void displayP2Card() {
		System.out.print("p2Card : ");
		for(int i=0; i<p2DeckIndex; i++) {
			System.out.print(cardShape[p2Deck[i]/13]+" "+
						cardNumber[p2Deck[i]%13]+", ");
		}
		System.out.println(" 현재 점수 : "+p2Scoure());
	}
		
	
	public static void getP1Card() {
		//deck배열에서 p1Deck으로 카드 옮기기
		//deck이 가지고 있는 카드 수는 deckIndex
		//p1Deck이 가지고 있는 카드 수는 p1DeckIndex
		//카드를 한 장 p1Deck으로 옮기면 deckIndex의 수를 하나 줄여서 카드 범위 설정하면 됨.(ex.deck의 마지막 배열의 카드를 p1deck으로 옮기고 deckIndex는 51로 줄익)
		p1Deck[p1DeckIndex]=deck[deckIndex-1]; //p1deckIndex는 0으로 p1deck의 첫번째 배열에 deck카드의 제일 마지막 배열의 숫자를 넣는다.
		deckIndex--; p1DeckIndex++;
	}
	
	public static void getP2Card() {
		//deck배열에서 p2Deck으로 카드 옮기기	
		p2Deck[p2DeckIndex]=deck[deckIndex-1];
		deckIndex--; p2DeckIndex++;
	}
	
	public static int p1Scoure() {
		int returnValue=0;
		//a 1 or 11
		//j q k 10   //11,12,13을 10으로 바꾸주면 됨
		for(int i=0; i<p1DeckIndex;i++) {
			int countNum=p1Deck[i]%13+1;
			if(countNum>10) {
				countNum=10;
			}	
			
			returnValue+=countNum;
		}
		for(int j=0; j<p1DeckIndex; j++) {
			if(p1Deck[j]%13==0) { //a가 있으면
				if((returnValue+10) >21){ //a를 11로 변경해서 21보다 크면
					
				}else {
					returnValue=returnValue+10;
				}
				
				break;
			}
		}
		return returnValue;
	}
	
	public static int p2Scoure() {
		int returnValue=0;
		for(int i=0; i<p2DeckIndex;i++) {
			int countNum=p2Deck[i]%13+1;
			if(countNum>10) {
				countNum=10;
			}	
			
			returnValue+=countNum;
		}
		for(int j=0; j<p2DeckIndex; j++) {
			if(p2Deck[j]%13==0) { //a가 있으면
				if((returnValue+10) >21){ //a를 11로 변경해서 21보다 크면
					
				}else {
					returnValue=returnValue+10;
				}
				
				break;
			}
		}
		return returnValue;
	}		
	
	public static void disPlayGEnd() {
		String result="";
		displayP1Card();
		displayP2Card();
		
		if(p1Scoure()>21) {
			result="p2가 승리하였습니다.";
		}else if(p2Scoure()>21) {
			result="p1이 승리하였습니다.";
		}else if(p1Scoure()>p2Scoure()) {
			result="p1이 승리하였습니다.";
		}else if(p1Scoure()<p2Scoure()) {
			result="p2가 승리하였습니다.";
		}else {
			result="무승부 입니다.";
		}
		
		System.out.println("게임 결과는 "+result);
		
	}
	
	public static void play() {
		for(int i=0; i<10; i++) {
			//p1카드 받기	
			System.out.println((i+1)+"번째 Card 수령중...");
			if(!isP1GEnd) {
				System.out.println("p1 player님 카드를 받으시겠습니까? 1.yes 2.no");
				if(1==Integer.parseInt(sc.nextLine())) {//1을 입력하면 실행
					getP1Card(); //p1이 카드 한 장 취득
					if(p1Scoure()>21) { //p1이 게임에 진상태로 종료
						break;
					}
				}else {
					isP1GEnd=true;
				}
				
			}
			
			//p2카드 받기
			if(!isP2GEnd) {
				System.out.println("p2 player님 카드를 받으시겠습니까? 1.yes 2.no");
				if(1==Integer.parseInt(sc.nextLine())) {//1을 입력하면 실행
					getP2Card(); //p2가 카드 한 장 취득
					if(p2Scoure()>21) { //p2가 게임에 진상태로 종료
						break;
					}
				}else {
					isP2GEnd=true;
				}
				
			}
			
			if(isP1GEnd&&isP2GEnd) {
				break;
			}

			displayP1Card();
			displayP2Card();
		}
		// 승패 보여주기
		disPlayGEnd();
	}
	
	public static void main(String[] args) {
		//BlackJack.deck으로 접근해야 함 - 다른 클래스 일 때
		//deck 으로 접근해야 함- 같은 클래스 일 때
		
		while(true) {
			//새로운 카드 1벌 세팅하기
			newCard();

			//카드 섞기
			mixCard();

			//카드 보여주기
			//displayDeckCard();

			play();
			
			System.out.println("게임을 계속 하시겠습니까?(1.yes 2.no");
			int i=Integer.parseInt(sc.nextLine());
			if(i==1) {
				break;
			}




			
		}

		
	
		

	}
	


}
