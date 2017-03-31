package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		String[] questions = { "가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?" };
		String[] answers = { "twice", "박보영", "응용프로그래밍" };
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + ". " + questions[i]);
			Scanner scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			if (answers[i].equals(answer))
				System.out.println("정답입니다!");
			else
				System.out.println("틀렸습니다!");
		}

		System.out.println("<<결과출력>>");
		for (int i = 0; i < 3; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(questions[i] + " ").append(answers[i]).append("입니다.");
			System.out.println(sb);
		}
	}
}
