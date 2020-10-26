package com.human.ex;

public class JavaStart006 {
	//µ¡¼À, »¬¼À, °ö¼À, ³ª´°¼À ¹®Á¦
	public static String function1(int a, int b) {
		String sum=a+"+"+b+"=";
		return sum;
	}
	public static String function2(int a, int b) {
		String min=a+"-"+b+"=";
		return min;
	}
	public static String function3(int a, int b) {
		String mul=a+"x"+b+"=";
		return mul;
	}
	public static String function4(int a, int b) {
		String div=a+"/"+b+"=";
		return div;
	}

	public static void main(String[] args) {
		//369°ÔÀÓ ÇØ´äÁö¸¸µé±â 1000ÀÌÇÏ
		//1,2,Â¦,3,4,Â¦
		//33,36°ú °°ÀÌ µÎ °³°¡ µé¾î°¡¸é ¹Ú¼ö¸¦ µÎ ¹ø Ä£´Ù.
//		for(int i=1; i<=1000; i++) {
//			int j=i%10;  //1ÀÇ ÀÚ¸®
//			int l=i/100;  //100ÀÇ ÀÚ¸®
//			int k;        //10ÀÇ ÀÚ¸®
//				if(i>100) {
//					k=(i/10)-((i/100)*10);
//				}else {
//					k=i/10;
//				}
//				if((l==3||l==6||l==9)&&(k==3 || k==6 || k==9)&&(j==3 || j==6 || j==9)) {
//					System.out.println("Â¦,Â¦,Â¦"+"("+i+")");
//				}else if((k==3||l==3)&&(j==3 || j==6 || j==9)) {
//					System.out.println("Â¦,Â¦"+"("+i+")");
//				}else if((k==6||l==6)&&(j==3 || j==6 || j==9)) {
//					System.out.println("Â¦,Â¦"+"("+i+")");
//				}else if((k==9||l==9)&&(j==3 || j==6 || j==9)) {
//					System.out.println("Â¦,Â¦"+"("+i+")");
//				}else if((l==3 || l==6 || l==9)&&(k==3 || k==6 || k==9)) {
//					System.out.println("Â¦,Â¦"+"("+i+")");
//				}else if(j==3 || j==6 || j==9) {
//					System.out.println("Â¦"+"("+i+")");
//				}else if(k==3 || k==6 || k==9) {
//					System.out.println("Â¦"+"("+i+")");
//				}else if(l==3 || l==6 || l==9) {
//					System.out.println("Â¦"+"("+i+")");
//				}else {
//					System.out.println(i);
//				}
//		}
		
		//·£´ýÇÏ°Ô µ¡¼À,»¬¼À,°ö¼À,³ª´°¼À ¹®Á¦¸¦ ³»¼­ »ç¿ëÀÚ°¡ ¸ÂÃß´Â ÇÁ·Î±×·¥
		//·¹º§Àº 4´Ü°è·Î Ã³À½¿£ ´õÇÏ±â ·¹º§ ¾÷ µÇ¸é »¬¼À, °ö¼À, ³ª´°¼ÀÀ¸·Î
		//2ÀÚ¸® ÀÌÇÏ Á¤¼ö·Î¸¸
		int sum=0;
		int a=1;
		while(a<5) {
			int b=(int)(Math.random()*99+1);
			int c=(int)(Math.random()*99+1);
			switch(a) {
			case 1:
				System.out.println("·¹º§ 1");
				sum=b+c;
				System.out.println(function1(b,c));
				break;
			case 2:
				System.out.println("·¹º§ 2");
				sum=b-c;
				System.out.println(function2(b,c));
				break;
			case 3:
				System.out.println("·¹º§ 3");
				sum=b*c;
				System.out.println(function3(b,c));
				break;
			default:
				System.out.println("·¹º§ 4");
				sum=b/c;
				System.out.println(function4(b,c));
			}
			int d=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
			if(d==sum) {
				System.out.println("Á¤´ä");
				a++;
			}else {
				System.out.println("¶¯");
			}
		}
		System.out.println("³¡");
		
		
		
	}

}
