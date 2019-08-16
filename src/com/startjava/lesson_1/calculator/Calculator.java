package com.startjava.lesson_1.calculator;
import java.lang.Math;


public class Calculator {
	
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		char sign = '+';
		double result;

		if (sign == '/') {
			result = Math.floorDiv(a,b);
			System.out.println(result);
		} else if (sign == '+') {
			result = Math.addExact(a,b);
			System.out.println(result);
		} else if (sign == '-') {
			result = Math.subtractExact(a,b);
			System.out.println(result);
		} else if (sign == '*') {
			result = Math.multiplyExact(a,b);
			System.out.println(result);
		} else if (sign == '%') {
			result = Math.IEEEremainder(a,b);
			System.out.println(result);
		} else if (sign == '^') {
			result = Math.pow(a,b);
			System.out.println(result);
			}
	}
}