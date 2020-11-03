package com.human.ex;

import java.util.Scanner;

public class Exercise {
	public static java.util.Scanner sc=new java.util.Scanner(System.in);
	public static int deck[]=new int [52];
	public static int p1Deck[]=new int[10];
	public static int p2Deck[]=new int[10];
	public static int deckIndex=52;
	public static int p1DeckIndex=0;
	public static int p2DeckIndex=0;
	public static boolean isP1Game=true;
	public static boolean isP2Game=true;
	
	public static String cardShape[]= {"스페이드", "다이아", "하트", "클로버"};
	public static String cardNumber[]= {"A","","3","4","5","6","7","8","9","10","J","Q","K"};
	
	
	public static void newCard() {
		for(int i=0; i<deck.length; i++) {
			deck[i]=i;
		}
	}
	
	public static void mixCard() {
		for(int i=0; i<10000; i++) {
			int randomIndex=(int)(Math.random());
			int temp=deck[0];
			deck[0]=deck[randomIndex];
			deck[randomIndex]=temp;
		}
	}
	
	public static void displayP1Card() {
		System.out.print("p1Card : ");
		for(int i=0; i<p1DeckIndex; i++) {
			System.out.print(cardShape[p1Deck[i]/13]+" "+ cardNumber[p1Deck[i]%13]+", ");
			
		}
		System.out.println("현재 점수 : "+p1Scoure());
	}
	
	public static void displayP2Card() {
		System.out.print("p2 Card : ");
		for(int i=0; i<p2DeckIndex; i++) {
			System.out.println(cardShape[p2Deck[i]/13]+" "+cardNumber[p2Deck[i]%13]+", ");
		}
		System.out.println("현재 점수 : p2Scoure()");
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
		for(int i=0; i<p1DeckIndex; i++) {
			int countNum=p1Deck[i]%13+1;
			if(countNum>10) {
				countNum=10;
			}
			returnValue+=countNum;
		}
		for(int j=0; j<p1DeckIndex; j++) {
			if(p1Deck[j]%13==0) {
				if((returnValue+10)>21){
				}else {
					returnValue+=10;
				}
				break;
			}
		}
		return returnValue;
	}
	
	public static int p2Scoure() {
		int returnValue=0;
		for(int i=0; i<p2DeckIndex; i++) {
			int countNum=p2Deck[i]%13+1;
			if(countNum>10) {
				countNum=10;
			}
			returnValue+=countNum;
		}
		for(int j=0; j<p2DeckIndex; j++) {
			if(p2Deck[j]%13==0) {
				if(returnValue+10>21) {
					
				}else {
					returnValue+=10;
				}
				break;
			}
			break;
			
		}
		return returnValue;
	}
	
	public static void play() {
		for(int i=0; i<10; i++) {
			System.out.println(i+1+"번째------------");
			if(isP1Game) {
				System.out.println("p1 player님 카드를 받으시겠습니까?(1.yes 2.no)");
				if(1==Integer.parseInt(sc.nextLine())) {
					getP1Card();
					if(p1Scoure()>21) {
						break;
					}
				}else {
					isP1Game=false;
				}
			}
			if(isP2Game) {
				System.out.println("p2 player님 카드를 받으시겠습니까?(1.yes 2.no)");
				if(1==Integer.parseInt(sc.nextLine())) {
					getP2Card();
					if(p2Scoure()>21) {
						break;
					}
				}else {
					isP2Game=false;
				}
			}
			if(!isP1Game&&!isP2Game) {
				break;
			}
			
			displayP1Card();
			displayP2Card();
		}
	}
	
	public static void win() {
		if(p1Scoure()>21 || p1Scoure()<p2Scoure()) {
			System.out.println("p2가 승리하였습니다.");
		}else if(p2Scoure()>21 || p1Scoure()>p2Scoure()) {
			System.out.println("p1이 승리하였습니다.");
		}else {
			System.out.println("동점으로 무승부 입니다.");
		}
	}
	public static void main(String[] args) {
		while(true) {
			newCard();
			mixCard();
			play();
			win();
			
			System.out.println("게임을 계속 하시겠습니까?(1.yes 2.no)");
			int i=Integer.parseInt(sc.nextLine());
			if(i==2) {
				break;
			}
		}	
		
		
	}

}
