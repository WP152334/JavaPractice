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

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 car = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		// 현대자동차
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.printf("가격 : " + "%,d" + "원\n\n", car.getPrice());

		Car2 car2 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		// 기아자동차

		System.out.println("제조사명 : " + car2.getCompany());
		System.out.println("모델명 : " + car2.getModel());
		System.out.println("색상 : " + car2.getColor());
		System.out.println("최대속도 : " + car2.getMaxSpeed() + "km");
		System.out.printf("가격 : " + "%,d" + "원\n\n", car2.getPrice());

		Car2 car3 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		

		System.out.println("제조사명 : " + car3.getCompany());
		System.out.println("모델명 : " + car3.getModel());
		System.out.println("색상 : " + car3.getColor());
		System.out.println("최대속도 : " + car3.getMaxSpeed() + "km");
		System.out.printf("가격 : " + "%,d" + "원\n", car3.getPrice());
	}
}
