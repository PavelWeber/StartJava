import java.lang.*;
import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		GuessNumber computerNumber = new GuessNumber(Math.random());
		Scanner scan = new Scanner(System.in);

		int maximum = 100.; // Максимальное число для диапазона от 0 до max
		int rnd = rnd(maximum);	

		Player igrok1 = new Player(name, number);
		System.out.println("Insert first player's name");
		String igrok1.name = scan.nextLine();
		int igrok1.number = igrok1(maximum);
		
		Player igrok2 = new Player(name, number);
		System.out.println("Insert second player's name");
		String igrok2.name = scan.nextLine();
		int igrok2.number = igrok2(maximum);

		}

		igrok1.play();
}
