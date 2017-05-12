package org.dimigo.inheritance;

public class SmartPhone {

	private String model;
	private String company;
	private int price;

	public SmartPhone() {

	}

	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}

	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println(model + "의 전워을 끕니다.");
	}

	public void pay() {
		System.out.println("로 결제합니다.");
	}

	public void useSpecialFunction(SmartPhone Phone) {
		System.out.println("기능을 사용합니다.");
	}

	public String toString() {
		return "모델명 : " + model + ", 제조사 : " + company + ", 가격 : " + String .format("%,d",price) + "원";
	}
}
