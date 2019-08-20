package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            Calculator calculator = new Calculator();

            System.out.println("Please input equation is format 1 + 1, do not forget to leave blank spaces ");

            calculator.setUserInput(scan.nextLine());
            calculator.split(calculator.getUserInput());
            calculator.setNumber1(Integer.parseInt(calculator.parts[0]));
            calculator.setSign(calculator.parts[1]);
            calculator.setNumber2(Integer.parseInt(calculator.parts[2]));

            calculator.calculate();

            do {
                System.out.println("do you want to continue yes/no");
                answer = scan.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}




