import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {

    private int computerNumber = (int)(Math.random() * 101);;
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);

    public  GuessNumber(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
       for(int i=0; ;i++) {
            System.out.println("Insert first player's number");
            player1.setNumber(scan.nextInt());

            if(player1.getNumber() > 100 | player1.getNumber() < 0) {
                System.out.println(player1.getName() + " have input number out of the interval. Game over");
                break;
            }
            if (player1.getNumber() == computerNumber) {
                System.out.println(player1.getName() + " wins");
                break;
            }

            System.out.println("Turn goes to " + player2.getName());
            System.out.println("Insert second player's number");
            player2.setNumber(scan.nextInt());

            if(player2.getNumber() > 100 | player2.getNumber() < 0) {
                System.out.println(player2.getName() + " have input number out of the interval. Game over");
                break;
            }
            if (player2.getNumber() == computerNumber) {
                System.out.println(player2.getName() + " wins");
                break;
            }
            System.out.println("Turn goes to " + player1.getName());
        }
    }
}