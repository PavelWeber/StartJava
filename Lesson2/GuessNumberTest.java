import java.lang.Math;
import java.util.Scanner;
public class GuessNumberTest {
	public static void main(String[] args) {
		GuessNumberTest game = new GuessNumberTest();
		Scanner scan = new Scanner(System.in);
		int computerNumber = (int)(Math.random()*101);

		Player player1 = new Player(name);		
		System.out.println("Insert first player's name");
		player1.name = scan.nextLine();				
		Player player2 = new Player(name);
		System.out.println("Insert second player's name");
		player2.name = scan.nextLine();	
		String answer = "yes";

		while (answer.equals("yes")) {
			game.play();
			do {
				System.out.println("do you want to continue yes/no");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));				 		
	 	}		
	}
}
