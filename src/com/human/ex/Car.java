package com.human.ex;
import com.human.dto.ClassCar;



public class Car {

	public static void main(String[] args) {
		ClassCar c1=new ClassCar();
		c1.color="�Ķ�";
		c1.tire.brand="�ؼ�";
		c1.tire.price=220000;
		c1.tire.mileage=5000;
		c1.brand="����";
		c1.Maxspeed=200;
		c1.type="�ƹݶ�";
		
		System.out.println("�ڵ��� �� : "+c1.color);
		System.out.println("���� ������ : "+c1.tire.brand);
		System.out.println("���� ���� : "+c1.tire.price+"��");
		System.out.println("���� ����Ÿ� : "+c1.tire.mileage+"km");
		System.out.println("�ڵ��� ������ : "+c1.brand);
		System.out.println("�ڵ��� �ְ�ӵ� : "+"�ü� "+c1.Maxspeed+"km");
		System.out.println("���� : "+c1.type);

		System.out.println("");

		ClassCar c2=new ClassCar();
		c2.color="����";
		c2.tire.brand="��ȣ";
		c2.tire.price=142000;
		c2.tire.mileage=7000;
		c2.brand="���";
		c2.Maxspeed=220;
		c2.type="k7";
		
		System.out.println("�ڵ��� �� : "+c2.color);
		System.out.println("���� ������ : "+c2.tire.brand);
		System.out.println("���� ���� : "+c2.tire.price+"��");
		System.out.println("���� ����Ÿ� : "+c2.tire.mileage+"km");
		System.out.println("�ڵ��� ������ : "+c2.brand);
		System.out.println("�ڵ��� �ְ�ӵ� : "+"�ü� "+c2.Maxspeed+"km");
		System.out.println("���� : "+c2.type);

		System.out.println("");


		
		ClassCar c3=new ClassCar();
		c3.color="����";
		c3.tire.brand="�̽���";
		c3.tire.price=186000;
		c3.tire.mileage=8000;
		c3.brand="�ֿ�";
		c3.Maxspeed=190;
		c3.type="Ƽ����";

		System.out.println("�ڵ��� �� : "+c1.color);
		System.out.println("���� ������ : "+c1.tire.brand);
		System.out.println("���� ���� : "+c1.tire.price+"��");
		System.out.println("���� ����Ÿ� : "+c1.tire.mileage+"km");
		System.out.println("�ڵ��� ������ : "+c1.brand);
		System.out.println("�ڵ��� �ְ�ӵ� : "+"�ü� "+c1.Maxspeed+"km");
		System.out.println("���� : "+c1.type);

		System.out.println("");

		
		


		

	}

}
