package com.startjava.lesson_4.game;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class GuessNumber {
    private int computerNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);
    private int counter;
    private int[] array1;
    private int[] array2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {

        for (int i = 1; i < 11; i++) {

            counter = i;

            System.out.println("Insert first player's number");
            player1.setNumber(scan.nextInt());
            player1.player1Numbers[i - 1] = player1.getNumber();

            if (i == 10) {
                System.out.println(player1.getName() + "attempts are off");
            }

            while (player1.getNumber() > 100 | player1.getNumber() < 0) {
                System.out.println(player1.getName() + " have input number out of the interval. Please input number in interval of 0 - 100");
                player1.setNumber(scan.nextInt());
            }

            if (player1.getNumber() == computerNumber) {
                System.out.println(player1.getName() + " guessed number from attempt № " + i);
                break;
            } else if (player1.getNumber() < computerNumber) {
                System.out.println(player1.getName() + " number is less than computerNumber");
            } else {
                System.out.println(player1.getName() + " number is more than computerNumber");
            }


            System.out.println("Turn goes to " + player2.getName());

            System.out.println("Insert second player's number");
            player2.setNumber(scan.nextInt());
            player2.player2Numbers[i - 1] = player2.getNumber();

            while (player2.getNumber() > 100 | player2.getNumber() < 0) {
                System.out.println(player2.getName() + " have input number out of the interval. Please input number in interval of 0 - 100");
                player2.setNumber(scan.nextInt());

            }
            if (player2.getNumber() == computerNumber) {
                System.out.println(player2.getName() + " guessed number from attempt № " + i);
                break;
            } else if (player2.getNumber() < computerNumber) {
                System.out.println(player2.getName() + " number is less than computerNumber");
            } else {
                System.out.println(player2.getName() + " number is more than computerNumber");
            }


            if (i < 10) {
                System.out.println("Turn goes to " + player1.getName());
            } else if (i == 10) {
                System.out.println(player2.getName() + "attempts are off");
            }

            if (i == 10) {
                System.out.println(Arrays.toString(player1.player1Numbers).replace('[', ' ').replace(']', ' ') + " " + Arrays.toString(player2.player2Numbers).replace('[', ' ').replace(']', ' '));
            }

        }

        array1 = Arrays.copyOf(player1.player1Numbers, counter - 1);
        array2 = Arrays.copyOf(player2.player2Numbers, counter - 1);
        Arrays.fill(array1, 0);
        Arrays.fill(array2, 0);

    }
}