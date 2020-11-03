package com.human.ex;
//클래스
class Rectangle{
	
	//public은 외부 접근 가능 private는 클래스 안에서만 접근 가능
	private double height =20;
	private double width =40;
	
	//getter setter
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height<0) {
			height=0;
		}
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	
	public double periphery() {
		return 2*height+2*width;
	}
	
	public static double area(double height, double width) {
		return height*width;
	}
	
	public double area() {
		return height*width;
	}
	//생성자 추가 우크릭, source, constructor using field
	public Rectangle() {} //Rectangle r1=new Rectangle()
	
//	public Rectangle(double width) { // Rectangle r1=new Rectangle(30);
//		super(); //상속과 관련. 
//		this.width = width;
//		this.height = width; //정사각형
//	}
	public Rectangle(double width) { // 생성자 안에 다른 생성자 호출 가능
		this(width,width);
	}
	
	public Rectangle(double height, double width) { //Rectangle r1=new Rectangle(30,40)
		super();
		this.height = height; // height=height와는 다름 this.은 자기자신을 의미 
		this.width = width;
	}
	@Override //우클릭, source, tostring, field
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]"+this.area();
		//return 이하의 문자열로 출력 됨.
		//this.area가 추가되서 출력 됨.
	}
	@Override //hash code and equals
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		//area가 같은지를 비교 따라서 r1(30,40) r2(40,30)일 때 r1.equals r2는 true
		//밑의 4줄은 height끼리 width끼리 같은지를 물어보는 것이기 때문에 false가 나옴.
//		temp = Double.doubleToLongBits(height);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(width);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if(this.area()!=other.area()) {
			return false;
		} //직접 만든 것. objcet의 obj의 넓이와 내 자신의 넓이가 같으면 true
//		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
//			return false;
//		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
//			return false;
		return true;
	}
	
}


public class JavaStart014 {
	public static void main(String[] args) {	
		System.out.println(Rectangle.area(40, 10)); //인스턴스가 필요 없음.
		//Rectangle r1=new Rectangle();
		//Rectangle r1=new Rectangle(30);
		Rectangle r1=new Rectangle(30,40);
		Rectangle r2=new Rectangle(40,30);
		System.out.println(r1.equals(r2)); //true
		
		//r1.height=30;	r1.width=40;
//		System.out.println(r1);
//		System.out.println(r1.area());
//		System.out.println(r1.periphery());
//		
//		r2.height=20;	r2.width=30;
//		System.out.println(r2.area());
//		System.out.println(r2.periphery());
		

	

		
		

	}

}
