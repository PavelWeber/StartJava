public class MyFirstGame {

	public static void main(String[] args) {
		int computerNumber = 67;
		int humanNumber = 0;

		for (int i = 0; i <= 99; i++){
		if (humanNumber < computerNumber) {
			System.out.println("Your figure is less than computer suggested");
			humanNumber++;
		} else if (humanNumber > computerNumber) {
				System.out.println("Your figure is more than computer suggested");
				humanNumber--;
		} else {
				System.out.println("You won!");
				break;
			}
		}
	}
}