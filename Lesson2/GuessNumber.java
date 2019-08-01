public class GuessNumber {
		public void play() {
		System.out.println("Insert first player's number");
		player1.setNumber(scan.nextInt());
			while (player1.getNumber() != computerNumber) {
			System.out.println("Turn goes to player 2");				
			System.out.println("Insert second player's number");
			player2.setNumber(scan.nextInt());		
			if (player2.getNumber() != computerNumber) {					
					System.out.println("Turn goes to player 1");
					}	
					System.out.println("player wins");
			}
		}
}




