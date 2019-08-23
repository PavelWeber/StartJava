package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private int number;
    private String name;
    private int[] playerNumbers;

    public int[] getPlayerNumbers() {
        return playerNumbers;
    }

    public void setPlayerNumbers(int[] playerNumbers) {
        this.playerNumbers = playerNumbers;
    }

    public Player(String name) {
        this.name = name;
        playerNumbers = new int[10];
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

    public void copyArray(Player player, int counter) {

        Arrays.copyOf(player.playerNumbers, counter);

    }

    public void cleanArray(Player player) {

        Arrays.fill(player.playerNumbers, 0);
    }

    public void showArrays(Player player1, Player player2) {
        System.out.println(Arrays.toString(player1.playerNumbers).replace('[', ' ').replace(']', ' ') + " " + Arrays.toString(player2.playerNumbers).replace('[', ' ').replace(']', ' '));
    }


}