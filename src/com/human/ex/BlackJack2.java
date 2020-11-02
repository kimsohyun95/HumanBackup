package com.human.ex;

import java.util.Scanner;

public class BlackJack2 {
	
	
	public static int deck[]=new int[52];
	public static int p1Deck[]=new int[10];
	public static int p2Deck[]=new int[10];
	public static int deckIndex=52;
	public static int p1DeckIndex=0;
	public static int p2DeckIndex=0;
	public static boolean isP1Flag=true;
	public static boolean isP2Flag=true;
	public static String cardShape[]= {"스페이드", "다이아", "하트", "클로버"};
	public static String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public static void newCard() {
		for(int i=0; i<deck.length; i++) {
			deck[i]=i;
		}
		deckIndex=52; p1DeckIndex=0; p2DeckIndex=0;
		isP1Flag=true; isP2Flag=true;
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
		System.out.println("");
		System.out.println("p1Card....");
		for(int i=0; i<p1DeckIndex; i++) {
			System.out.print(cardShape[p1Deck[i]/13]+" "+
						cardNumber[p1Deck[i]%13]+", ");
		}
		System.out.println("현재 점수 : "+p1Scoure());
	}
	
	public static void displayP2Card() {
		System.out.println("");
		System.out.println("p2Card....");
		for(int i=0; i<p2DeckIndex; i++) {
			System.out.print(cardShape[p2Deck[i]/13]+" "+
						cardNumber[p2Deck[i]%13]+", ");
		}
		System.out.println("현재 점수 : "+p2Scoure());
		System.out.println("");
	}
	public static void getP1Card() {
		p1Deck[p1DeckIndex]=deck[deckIndex-1];
		deckIndex--; p1DeckIndex++;
	}
	
	public static void getP2Card() {
		p2Deck[p2DeckIndex]=deck[deckIndex-1];
		deckIndex--; p2DeckIndex++;
	}
	
	public static int p1Scoure() {
		int returnValue=0;
		for(int i=0; i<p1DeckIndex;i++) {
			int countNum=p1Deck[i]%13+1;
			if(countNum>10) {
				countNum=10;
			}	
			
			returnValue+=countNum;
		}
		for(int j=0; j<p1DeckIndex; j++) {
			if(p1Deck[j]%13==0) {
				if((returnValue+10) >21){
					
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
			if(p1Deck[j]%13==0) { 
				if((returnValue+10) >21){
					
				}else {
					returnValue=returnValue+10;
				}
				
				break;
			}
		}
		return returnValue;
	}		
	
	
	public static void win() {
		System.out.println("p1 player의 점수 : "+p1Scoure());
		System.out.println("p2 player의 점수 : "+p2Scoure());
		System.out.println("");
		
		if(p1Scoure()>p2Scoure()) {
			if(p1Scoure()>21) {
				System.out.println("p2 player님이 이기셨습니다.");
			}else {
				System.out.println("p1 player님이 이기셨습니다.");
			}
		}else if(p1Scoure()<p2Scoure()) {
			if(p2Scoure()>21) {
				System.out.println("p1 player님이 이기셨습니다.");
			}else {
				System.out.println("p2 player님이 이기셨습니다.");
			}
		}else {
			System.out.println("두 player님이 돔점으로 무승부입니다.");
		}
		
	}
	
	
	
	public static void main(String[] args) {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	
		newCard();
		

		mixCard();
		
		for(int i=0; i<10; i++) {
			if(isP1Flag) {
				System.out.println("카드를 받으시겠습니까?(1.yes 2.no)");
				System.out.print("p1 player >>");
				int p1Play=Integer.parseInt(sc.nextLine());
				if(p1Play==1) {
					getP1Card();
					if(p1Scoure()>21) {
						break;
					}
				}else {
					isP1Flag=false;
				}
			}
			if(isP2Flag) {
				System.out.print("p2 player >>");
				int p2Play=Integer.parseInt(sc.nextLine());
				if(p2Play==1) {
					getP2Card();
					if(p2Scoure()>21) {
						break;
					}
				}else {
					isP2Flag=false;
				}
			}
			if(!isP1Flag&&!isP2Flag) {
				break;
			}
			displayP1Card();
			displayP2Card();
		}
		win();
		
		
		
		
		
		
	}

	


}
