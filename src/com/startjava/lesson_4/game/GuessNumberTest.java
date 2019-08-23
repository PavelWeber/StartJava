package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "yes";

        while (answer.equals("yes")) {
            System.out.println("You have ten attempts");
            System.out.println("Insert first player's name");
            Player player1 = new Player(scan.nextLine());
            System.out.println("Insert second player's name");
            Player player2 = new Player(scan.nextLine());
            GuessNumber game = new GuessNumber(player1, player2, 10);
            game.play();
            player1.showArrays(player1, player2);
            player1.cleanNumbers(player1);
            player2.cleanNumbers(player2);

            do {
                System.out.println("do you want to continue yes/no");
                answer = scan.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}


