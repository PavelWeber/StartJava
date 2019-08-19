package com.startjava.lesson_4.calculator;

public class Calculator {

    public String fromScan;
    String[] parts;
    private int number1;

    public void setNumber1(int number1){
        this.number1 = number1;
    }

    public int getNumber1(){
        return number1;
    }

    private String sign;

    public void setSign(String sign){
        this.sign = sign;
    }

    public String getSign(){
        return sign;
    }

    private int number2;

    public void setNumber2(int number2){
        this.number2 = number2;
    }

    public int getNumber2(){
        return number1;
    }

    public void calculate() {
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
        }
    }
}
