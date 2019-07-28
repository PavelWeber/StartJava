import java.lang.*;
import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {

		GuessNumber computerNumber = new GuessNumber(Math.random());
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Insert first player's name");
		String imya1=scan.nextLine();

		System.out.println("Insert second player's name");
		String imya2 = scan.nextLine();

		int numer1 = Math.random();
		int numer2 = Math.random();

		Player igrok1 = new Player(imya1, numer1);
		Player igrok2 = new Player(imya2, numer2);
		}
		igrok1.play();
}
