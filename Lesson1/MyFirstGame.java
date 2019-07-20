public class MyFirstGame {

	public static void main(String[] args) {
		int computerNumber = 67;
		int humanNumber = 65;

			if (humanNumber<computerNumber) {
				System.out.println ("Your figure is less than computer suggested");
			}

		    else if (humanNumber>computerNumber) {
				System.out.println ("Your figure is more than computer suggested");
			}

		    else {
				System.out.println ("You won!");
			}
		}
}