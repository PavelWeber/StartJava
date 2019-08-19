package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "yes";
		while (answer.equals("yes")) {
			Calculator calculator = new Calculator();

			System.out.println("Please input an integer ");
			int a = scan.nextInt();
			calculator.setA(a);

			System.out.println("Please input an operation sign ");
			char sign = scan.next().charAt(0);
			calculator.setSign(sign);

			System.out.print("Please input an integer ");
			int b = scan.nextInt();
			calculator.setB(b);

			calculator.calculate();

			do {
				System.out.println("do you want to continue yes/no");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		}
	}
}




