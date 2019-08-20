package com.startjava.lesson_4.calculator;

public class Calculator {

    private String userInput;

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String getUserInput() {
        return userInput;
    }

    private String[] mathExpression;


    public void calculate(String userInput) {

        mathExpression = userInput.split(" ", 3);

        switch (mathExpression[1]) {
            case "+":
                System.out.println("result of calculation is " + Math.addExact(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2])));
                break;
            case "-":
                System.out.println("result of calculation is " + Math.subtractExact(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2])));
                break;
            case "*":
                System.out.println("result of calculation is " + Math.multiplyExact(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2])));
                break;
            case "/":
                System.out.println("result of calculation is " + Math.floorDiv(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2])));
                break;
            case "%":
                System.out.println("result of calculation is " + Math.IEEEremainder(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2])));
                break;
            case "^":
                System.out.println("result of calculation is " + Math.pow(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2])));
                break;
            default:
                System.out.println("your input is incorrect, plese try again");
                break;
        }
    }
}
