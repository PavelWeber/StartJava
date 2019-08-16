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
				result = Math.addExact(a,b);
				System.out.println("Result is " + result);
				break;
			case '-':
				result = Math.subtractExact(a,b);
				System.out.println("Result is " + result);
				break;
			case '*':
				result = Math.multiplyExact(a,b);
				System.out.println("Result is " + result);
				break;
			case '/':
				result = Math.floorMod(a,b);
				System.out.println("Result is " + result);
				break;
			case '%':
				result = Math.IEEEremainder(a,b);
				System.out.println("Result is " + result);
				break;
			case '^':
				result = (int) Math.pow(a,b);
				System.out.println("Result is " + result);
				break;
			default:
				System.out.println("No option programmed for your operation");
				break;
		}
	}
}
