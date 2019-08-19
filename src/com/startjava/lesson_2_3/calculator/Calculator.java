package com.startjava.lesson_2_3.calculator;

public class Calculator {
	private int a;
	private int b;
	private char sign;
	private double result;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public void calculate() {
		switch (sign) {
			case '+':
				result = a + b;
				System.out.println("Result is " + result);
				break;
			case '-':
				result = a - b;
				System.out.println("Result is " + result);
				break;
			case '*':
				result = a * b;
				System.out.println("Result is " + result);
				break;
			case '/':
				result = a / b;
				System.out.println("Result is " + result);
				break;
			case '%':
				result = a % b;
				System.out.println("Result is " + result);
				break;
			case '^':
				result = 0;
				for(int i = 0; i < b; i++){
					result = result*a;
				}
				break;
			default:
				System.out.println("No option programmed for your operation");
				break;
		}
	}
}
