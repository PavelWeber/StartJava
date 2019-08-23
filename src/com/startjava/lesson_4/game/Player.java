package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    public Player(String name) {
        this.name = name;
        numbers = new int[10];
    }

    private int number;
    private String name;
    private int[] numbers;

    public int[] getNumbers(Player player, int counter) {

        numbers[counter] = player.getNumber();
        return Arrays.copyOf(player.numbers, counter);
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


    public void cleanNumbers(Player player) {

        Arrays.fill(player.numbers, 0);
    }

    public void showArrays(Player player1, Player player2) {
        System.out.println(Arrays.toString(player1.numbers).replace('[', ' ').replace(']', ' ') + " " + Arrays.toString(player2.numbers).replace('[', ' ').replace(']', ' '));
    }

}