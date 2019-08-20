package com.startjava.lesson_4.calculator;

public class Calculator {

    private String userInput;
    private int number1;
    private String sign;
    private int number2;
    private String[] mathExpression;

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber1() {
        return number1;
    }


    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber2() {
        return number1;
    }

    public void split(String userInput) {
        mathExpression = userInput.split(" ", 3);
    }

    public String[] getMathExpression() {
        return mathExpression;
    }

    public void setMathExpression(String[] mathExpression) {
        this.mathExpression = mathExpression;
    }


    public void calculate() {

        int i = 0;

        number1 = Integer.parseInt(mathExpression[i]);
        sign = mathExpression [i + 1];
        number2 = Integer.parseInt(mathExpression[i + 2]);

        switch (sign) {
            case "+":
                int result = Math.addExact(number1, number2);
                System.out.println("result of calculation is " + result);
                break;
            case "-":
                result = Math.subtractExact(number1, number2);
                System.out.println("result of calculation is " + result);
                break;
            case "*":
                result = Math.multiplyExact(number1, number2);
                System.out.println("result of calculation is " + result);
                break;
            case "/":
                result = Math.floorDiv(number1, number2);
                System.out.println("result of calculation is " + result);
                break;
            case "%":
                result = (int) Math.IEEEremainder(number1, number2);
                System.out.println("result of calculation is " + result);
                break;
            case "^":
                result = (int) Math.pow(number1, number2);
                System.out.println("result of calculation is " + result);
                break;
            default:
                System.out.println("your input is incorrect, plese try again");
                break;
        }
    }
}
