package com.startjava.lesson_4.game;

import java.util.Scanner;
import java.lang.Math;


public class GuessNumber {
    private int computerNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);
    private int counter;

    public GuessNumber(Player player1, Player player2, int counter) {
        this.player1 = player1;
        this.player2 = player2;
        this.counter = counter;
    }

    public void play() {
        for (int i = 1; i < 11; i++) {

            counter = i;

            playerSettingNumber(i, player1);
            logAttemptsAreOff(i, player1);
            logOutOfInterval(player1);

            if (guessingNumber(i, player1)) break;
            changeTurns(player2);

            playerSettingNumber(i, player2);
            logOutOfInterval(player2);
            if (guessingNumber(i, player2)) break;

            if (i < 10) {
                changeTurns(player1);
            } else if (i == 10) {
                logAttemptsAreOff(i, player2);
            }
            if (i == 10) {
                player1.showArrays(player1, player2);
            }
        }
        player1.copyArray(player1, counter - 1);
        player2.copyArray(player2, counter - 1);
        player1.cleanArray(player1);
        player2.cleanArray(player2);
        player1.showArrays(player1,player2);
    }

    private void changeTurns(Player player) {
        System.out.println("Turn goes to " + player.getName());
    }

    private boolean guessingNumber(int i, Player player) {
        if (player.getNumber() == computerNumber) {
            System.out.println(player.getName() + " guessed number from attempt № " + i);
            return true;
        } else if (player.getNumber() < computerNumber) {
            System.out.println(player.getName() + " number is less than computerNumber");
        } else {
            System.out.println(player.getName() + " number is more than computerNumber");
        }
        return false;
    }

    private void logOutOfInterval(Player player) {
        while (player.getNumber() > 100 | player.getNumber() < 0) {
            System.out.println(player.getName() + " have input number out of the interval. Please input number in interval of 0 - 100");
            player.setNumber(scan.nextInt());
        }
    }

    private void logAttemptsAreOff(int i, Player player) {
        if (i == 10) {
            System.out.println(player.getName() + " attempts are off");
        }
    }

    private void playerSettingNumber(int i, Player player) {
        System.out.println("Insert first player's number");
        player.setNumber(scan.nextInt());
        player.getPlayerNumbers()[i - 1] = player.getNumber();
    }

}