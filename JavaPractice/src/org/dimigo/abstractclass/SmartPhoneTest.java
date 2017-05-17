package org.dimigo.abstractclass;

public class SmartPhoneTest {

	public static void main(String[] args) {

		SmartPhone[] smartphones = { new Galaxy("갤럭시 S8", "삼성", 800000), new IPhone("iPhone 7", "애플", 900000) };

		for (SmartPhone s : smartphones) {
			System.out.println(s);
			s.turnOn();
			s.pay();
			s.useSpecialFunction();
			s.turnOff();
		}
	}

}
