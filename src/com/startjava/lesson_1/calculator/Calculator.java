package com.startjava.lesson_1.calculator;
import java.lang.Math;

public class Calculator {
	
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		char sign = '+';
		double result;

		if (sign == '/') {
			result = a/b;
			System.out.println(result);
		} else if (sign == '+') {
			result = a + b;
			System.out.println(result);
		} else if (sign == '-') {
			result = a - b;
			System.out.println(result);
		} else if (sign == '*') {
			result = a * b;
			System.out.println(result);
		} else if (sign == '%') {
			result = a & b;
			System.out.println(result);
		} else if (sign == '^') {
			result = 0;
			for(int i = 0; i < b; i++){
				result = result*a;
			}
			}
	}
}