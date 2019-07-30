public class Player {
		private int number;
		private String name;

		public Player( String name, int number) {
			this.name = name;
			this.number = number;
		}

		public int guessNumber(int number){
			return number = (int)(Math.random()*100);
		}	
}

