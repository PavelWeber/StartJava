package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;


public class GuessNumber {
    private int computerNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);
    private int index;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        for (index = 1; index < 11; index++) {
            if (index == 10) {
                System.out.println(player1.getName() + " attempts are off");
            }
            inputNumber(player1);
            System.out.println("Turn goes to another player");
            if (guessingNumber(player1)) break;
            if (index == 10) {
                System.out.println(player2.getName() + " attempts are off");
            }
            inputNumber(player2);
            if(index < 10) {
                System.out.println("Turn goes to another player");
            }
            if (guessingNumber(player2)) break;
        }
        showArrays(player1, player2);
        cleanNumbers();
    }


    public void inputNumber(Player player) {
        System.out.println("Insert " + player.getName() + "'s number");
        player.setNumber(scan.nextInt(), index);
    }


    private boolean guessingNumber(Player player) {
        if (player.getNumber(index) == computerNumber) {
            System.out.println(player.getName() + " guessed number from attempt № " + index);
            return true;
        } else if (player.getNumber(index) < computerNumber) {
            System.out.println(player.getName() + " number is less than computerNumber");
        } else {
            System.out.println(player.getName() + " number is more than computerNumber");
        }
        return false;
    }

    private void showArrays(Player player1, Player player2) {
        System.out.println(Arrays.toString(player1.getNumbers(index)).replace('[', ' ').replace(']', ' ') + " " + Arrays.toString(player2.getNumbers(index)).replace('[', ' ').replace(']', ' '));
    }

    public void cleanNumbers() {
        Arrays.fill(player1.getNumbers(index), 0);
        Arrays.fill(player2.getNumbers(index), 0);
    }

}