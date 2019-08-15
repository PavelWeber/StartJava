package com.startjava.lesson_2_3.game;

import java.util.Scanner;
public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "yes";	 	
	 	while (answer.equals("yes")) {
	        	System.out.println("Insert first player's name");
		        Player player1 = new Player(scan.nextLine());
		        System.out.println("Insert second player's name");
		        Player player2 = new Player(scan.nextLine());
		        GuessNumber game = new GuessNumber(player1, player2);
		        game.play();
			
			do {
				System.out.println("do you want to continue yes/no");
				answer = scan.nextLine();
			} while (!answer.equals("yes") && !answer.equals("no"));				 		
	 	}		
	}
}



