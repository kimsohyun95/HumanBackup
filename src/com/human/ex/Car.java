package com.human.ex;
import com.human.dto.ClassCar;



public class Car {

	public static void main(String[] args) {
		ClassCar c1=new ClassCar();
		c1.color="파랑";
		c1.tire.brand="넥센";
		c1.tire.price=220000;
		c1.tire.mileage=5000;
		c1.brand="현대";
		c1.Maxspeed=200;
		c1.type="아반떼";
		
		System.out.println("자동차 색 : "+c1.color);
		System.out.println("바퀴 제조사 : "+c1.tire.brand);
		System.out.println("바퀴 가격 : "+c1.tire.price+"원");
		System.out.println("바퀴 주행거리 : "+c1.tire.mileage+"km");
		System.out.println("자동차 제조사 : "+c1.brand);
		System.out.println("자동차 최고속도 : "+"시속 "+c1.Maxspeed+"km");
		System.out.println("차종 : "+c1.type);

		System.out.println("");

		//c2=c1으로 하면 c2에 c1의 주소가 들어가기 때문에 독립된 두 개의 데이터가 되지 않음
		//c2나 c1을 바꾸면 둘 다 바뀌게 됨.
		ClassCar c2=new ClassCar();
		c2.color="검정";
		c2.tire.brand="금호";
		c2.tire.price=142000;
		c2.tire.mileage=7000;
		c2.brand="기아";
		c2.Maxspeed=220;
		c2.type="k7";
		//분리된 똑같은 데이터는 c2.color=c1.color;로
		// 그런데 스트링 객체는 내용변경이 불가해서 색상에 검정대신 노랑을 입력하면 검정이 없어지고 노랑이 되는게 아닌
		// 노랑이 새로 생김
		
		System.out.println("자동차 색 : "+c2.color);
		System.out.println("바퀴 제조사 : "+c2.tire.brand);
		System.out.println("바퀴 가격 : "+c2.tire.price+"원");
		System.out.println("바퀴 주행거리 : "+c2.tire.mileage+"km");
		System.out.println("자동차 제조사 : "+c2.brand);
		System.out.println("자동차 최고속도 : "+"시속 "+c2.Maxspeed+"km");
		System.out.println("차종 : "+c2.type);

		System.out.println("");


		
		ClassCar c3=new ClassCar();
		c3.color="빨강";
		c3.tire.brand="미쉐린";
		c3.tire.price=186000;
		c3.tire.mileage=8000;
		c3.brand="쌍용";
		c3.Maxspeed=190;
		c3.type="티볼리";

		System.out.println("자동차 색 : "+c1.color);
		System.out.println("바퀴 제조사 : "+c1.tire.brand);
		System.out.println("바퀴 가격 : "+c1.tire.price+"원");
		System.out.println("바퀴 주행거리 : "+c1.tire.mileage+"km");
		System.out.println("자동차 제조사 : "+c1.brand);
		System.out.println("자동차 최고속도 : "+"시속 "+c1.Maxspeed+"km");
		System.out.println("차종 : "+c1.type);

		System.out.println("");

		
		


		

	}

}
