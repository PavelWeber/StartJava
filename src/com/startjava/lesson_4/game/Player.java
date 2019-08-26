package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers;

    public Player(String name) {
        this.name = name;
        numbers = new int[10];
    }

    public void setNumber(int number, int index) {
        if (number > 100 | number < 0) {
            System.out.println(" You have input number out of the interval. Turn goes to another player");
        } else {
            numbers[index - 1] = number;
        }

    }

    public int getNumber(int index) {
        return numbers[index-1];
    }

    public int[] getNumbers(int index) {

        return Arrays.copyOf(numbers, index);
    }


    public String getName() {
        return name;
    }
}
