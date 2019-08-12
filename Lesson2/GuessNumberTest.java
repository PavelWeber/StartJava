import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert first player's name");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Insert second player's name");
        Player player2 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(player1,player2);
        game.play();
    }
}
