
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator.java
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 13.
 * <pre>
 * 
 * @author 허창준
 * @version : 1.0
 */

public class Operator {
	
	public static void main(String args[])
	{
		int month = 1700000;
		int people = 3;
		int market = 1500;
		long year = (long)month * 12 * (long)people * (long)market;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d", month) + "원");
		System.out.println("점포 내 직원 수 : " + people + "명");
		System.out.println("점포 수 : " + String.format("%,d", market) + "개" + "\n\n");
		System.out.println("연간 인건비 : " + String.format("%,d", year) +"원");		
	}

}
