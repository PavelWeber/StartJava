package com.startjava.lesson_4.game;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class GuessNumber {
    private int computerNumber = (int) (Math.random() * 101);
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        player1.player1Numbers = new int[10];
        player2.player2Numbers = new int[10];

        for (int i = 1; i < 11; i++) {

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

            if (i == 10) {
                System.out.println(player2.getName() + "attempts are off");
                break;
            }


            System.out.println("Turn goes to " + player1.getName());

        }

        System.out.println(Arrays.toString(player1.player1Numbers));
        System.out.println(Arrays.toString(player2.player2Numbers));

     //   for (int k = 0; k < player1.player1Numbers.length; k++) {
       //     System.out.println(player1.player1Numbers[k]);
      //  }
      //  for (int m = 0; m < player2.player2Numbers.length; m++) {
         //   System.out.println(player1.player1Numbers[m]);
        //}


    }
}