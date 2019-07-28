import java.lang.Math;
	public class GuessNumber {
		private int computerNumber;
		public GuessNumber(int computerNumber) {
			this.computerNumber = computerNumber;
		}		
		public void play() {
			while (number != computerNumber) {
			if (number < computerNumber) {
				System.out.println("Your figure is less than computer suggested");
				number++;
			} else if (number> computerNumber) {
				System.out.println("Your figure is more than computer suggested");
				number--;
			} 
		} 
		System.out.println("You won!");
	}
}
