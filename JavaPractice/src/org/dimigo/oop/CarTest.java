package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic |_ PrimitiveDataType.java
 *
 * 1. 개요 : 2. 작성일 : 2017. 3. 23.
 * 
 * <pre>
 * 
 * @author 허창준
 * @version : 1.0
 */

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		//현대자동차
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.printf("가격 : " + "%,d" + "원\n\n", car.getPrice());
		
		Car car2 = new Car();
		//기아자동차
		
		car2.setCompany("기아자동차");
		car2.setModel("K7");
		car2.setColor("흰색");
		car2.setMaxSpeed(246);
		car2.setPrice(40000000);
	
		System.out.println("제조사명 : " + car2.getCompany());
		System.out.println("모델명 : " + car2.getModel());
		System.out.println("색상 : " + car2.getColor());
		System.out.println("최대속도 : " + car2.getMaxSpeed() + "km");
		System.out.printf("가격 : " + "%,d" + "원\n\n", car2.getPrice());
		
		Car car3 = new Car();
		//삼성자동차
		
		car3.setCompany("삼성자동차");
		car3.setModel("SM7");
		car3.setColor("회색");
		car3.setMaxSpeed(200);
		car3.setPrice(38000000);

		System.out.println("제조사명 : " + car3.getCompany());
		System.out.println("모델명 : " + car3.getModel());
		System.out.println("색상 : " + car3.getColor());
		System.out.println("최대속도 : " + car3.getMaxSpeed() + "km");
		System.out.printf("가격 : " + "%,d" + "원\n", car3.getPrice());
	}

}
