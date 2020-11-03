package com.human.ex;
//Ŭ����
class Rectangle{
	
	//public�� �ܺ� ���� ���� private�� Ŭ���� �ȿ����� ���� ����
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
	//������ �߰� ��ũ��, source, constructor using field
	public Rectangle() {} //Rectangle r1=new Rectangle()
	
//	public Rectangle(double width) { // Rectangle r1=new Rectangle(30);
//		super(); //��Ӱ� ����. 
//		this.width = width;
//		this.height = width; //���簢��
//	}
	public Rectangle(double width) { // ������ �ȿ� �ٸ� ������ ȣ�� ����
		this(width,width);
	}
	
	public Rectangle(double height, double width) { //Rectangle r1=new Rectangle(30,40)
		super();
		this.height = height; // height=height�ʹ� �ٸ� this.�� �ڱ��ڽ��� �ǹ� 
		this.width = width;
	}
	@Override //��Ŭ��, source, tostring, field
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]"+this.area();
		//return ������ ���ڿ��� ��� ��.
		//this.area�� �߰��Ǽ� ��� ��.
	}
	@Override //hash code and equals
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		//area�� �������� �� ���� r1(30,40) r2(40,30)�� �� r1.equals r2�� true
		//���� 4���� height���� width���� �������� ����� ���̱� ������ false�� ����.
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
		} //���� ���� ��. objcet�� obj�� ���̿� �� �ڽ��� ���̰� ������ true
//		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
//			return false;
//		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
//			return false;
		return true;
	}
	
}


public class JavaStart014 {
	public static void main(String[] args) {	
		System.out.println(Rectangle.area(40, 10)); //�ν��Ͻ��� �ʿ� ����.
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
