package com.human.ex;

public class BlackJack {
	public static java.util.Scanner sc=new java.util.Scanner(System.in);
	public static int deck[]=new int[52];
	public static int p1Deck[]=new int[10];
	public static int p2Deck[]=new int[10];
	public static int deckIndex=52;
	public static int p1DeckIndex=0;
	public static int p2DeckIndex=0;
	public static boolean isP1GEnd=false; //������ ������? �ƴϿ� true�� �� ī�带 ���� �������� ���� ������ ���� ����
	public static boolean isP2GEnd=false;
	public static String cardShape[]= {"�����̵�", "���̾�", "��Ʈ", "Ŭ�ι�"};
	public static String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public static void newCard() {
		for(int i=0; i<deck.length; i++) {
			deck[i]=i;
		}
		deckIndex=52; // ������ ���� �� ���� ������ ���� ���� �� �ʱ�ȭ �ؾ� ��.
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
		System.out.println(" ���� ���� : "+p1Scoure());
	}
	
	
	public static void displayP2Card() {
		System.out.print("p2Card : ");
		for(int i=0; i<p2DeckIndex; i++) {
			System.out.print(cardShape[p2Deck[i]/13]+" "+
						cardNumber[p2Deck[i]%13]+", ");
		}
		System.out.println(" ���� ���� : "+p2Scoure());
	}
		
	
	public static void getP1Card() {
		//deck�迭���� p1Deck���� ī�� �ű��
		//deck�� ������ �ִ� ī�� ���� deckIndex
		//p1Deck�� ������ �ִ� ī�� ���� p1DeckIndex
		//ī�带 �� �� p1Deck���� �ű�� deckIndex�� ���� �ϳ� �ٿ��� ī�� ���� �����ϸ� ��.(ex.deck�� ������ �迭�� ī�带 p1deck���� �ű�� deckIndex�� 51�� ����)
		p1Deck[p1DeckIndex]=deck[deckIndex-1]; //p1deckIndex�� 0���� p1deck�� ù��° �迭�� deckī���� ���� ������ �迭�� ���ڸ� �ִ´�.
		deckIndex--; p1DeckIndex++;
	}
	
	public static void getP2Card() {
		//deck�迭���� p2Deck���� ī�� �ű��	
		p2Deck[p2DeckIndex]=deck[deckIndex-1];
		deckIndex--; p2DeckIndex++;
	}
	
	public static int p1Scoure() {
		int returnValue=0;
		//a 1 or 11
		//j q k 10   //11,12,13�� 10���� �ٲ��ָ� ��
		for(int i=0; i<p1DeckIndex;i++) {
			int countNum=p1Deck[i]%13+1;
			if(countNum>10) {
				countNum=10;
			}	
			
			returnValue+=countNum;
		}
		for(int j=0; j<p1DeckIndex; j++) {
			if(p1Deck[j]%13==0) { //a�� ������
				if((returnValue+10) >21){ //a�� 11�� �����ؼ� 21���� ũ��
					
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
			if(p2Deck[j]%13==0) { //a�� ������
				if((returnValue+10) >21){ //a�� 11�� �����ؼ� 21���� ũ��
					
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
			result="p2�� �¸��Ͽ����ϴ�.";
		}else if(p2Scoure()>21) {
			result="p1�� �¸��Ͽ����ϴ�.";
		}else if(p1Scoure()>p2Scoure()) {
			result="p1�� �¸��Ͽ����ϴ�.";
		}else if(p1Scoure()<p2Scoure()) {
			result="p2�� �¸��Ͽ����ϴ�.";
		}else {
			result="���º� �Դϴ�.";
		}
		
		System.out.println("���� ����� "+result);
		
	}
	
	public static void play() {
		for(int i=0; i<10; i++) {
			//p1ī�� �ޱ�	
			System.out.println((i+1)+"��° Card ������...");
			if(!isP1GEnd) {
				System.out.println("p1 player�� ī�带 �����ðڽ��ϱ�? 1.yes 2.no");
				if(1==Integer.parseInt(sc.nextLine())) {//1�� �Է��ϸ� ����
					getP1Card(); //p1�� ī�� �� �� ���
					if(p1Scoure()>21) { //p1�� ���ӿ� �����·� ����
						break;
					}
				}else {
					isP1GEnd=true;
				}
				
			}
			
			//p2ī�� �ޱ�
			if(!isP2GEnd) {
				System.out.println("p2 player�� ī�带 �����ðڽ��ϱ�? 1.yes 2.no");
				if(1==Integer.parseInt(sc.nextLine())) {//1�� �Է��ϸ� ����
					getP2Card(); //p2�� ī�� �� �� ���
					if(p2Scoure()>21) { //p2�� ���ӿ� �����·� ����
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
		// ���� �����ֱ�
		disPlayGEnd();
	}
	
	public static void main(String[] args) {
		//BlackJack.deck���� �����ؾ� �� - �ٸ� Ŭ���� �� ��
		//deck ���� �����ؾ� ��- ���� Ŭ���� �� ��
		
		while(true) {
			//���ο� ī�� 1�� �����ϱ�
			newCard();

			//ī�� ����
			mixCard();

			//ī�� �����ֱ�
			//displayDeckCard();

			play();
			
			System.out.println("������ ��� �Ͻðڽ��ϱ�?(1.yes 2.no");
			int i=Integer.parseInt(sc.nextLine());
			if(i==1) {
				break;
			}




			
		}

		
	
		

	}
	


}
