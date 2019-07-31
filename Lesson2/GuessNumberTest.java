import java.lang.Math;
import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {

		GuessNumberTest guessNumberTest = new GuessNumberTest();

		Scanner scan = new Scanner(System.in);
		String answer = "yes";
		int computerNumber = (int)(Math.random()*101);

		Player player1 = new Player(name);
		System.out.println("Insert first player's name");
		player1.name = scan.nextLine();
				
		Player player2 = new Player(name);
		System.out.println("Insert second player's name");
		player2.name = scan.nextInt();

		public void play() {
				
		System.out.println("Insert first player's number");
		player1.setNumber(scan.nextInt());
			while (player1.getNumber() != computerNumber) {
					System.out.println("Turn goes to player 2");
						}
			System.out.println("Insert second player's number");
			player2.setNumber(scan.nextInt());
			
			if (player2.getNumber() != computerNumber) {					
					System.out.println("Turn goes to player 1");
					}	
					System.out.println("player wins");
			}						
		
			while (answer.equals("yes")) {

				guessNumberTest.play();
	
			do {
				System.out.println("do you want to continue yes/no");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));				 		
	 	}		
	}
}
