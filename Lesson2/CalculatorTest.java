import java.util.Scanner;
public class CalculatorTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		do {
			System.out.println ("do you want to continue yes/no");
			String reply = scan.nextLine();
		} while (reply!="yes" && reply!="no");
		 
		if (reply == "yes") {

		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();

		System.out.println("Please input an integer ");
		int a = scan.nextInt();
		calculator.setA(a);
		System.out.println("Please input an operation sign ");
		String scanSign = scan.next();
		char signOfOperation = scanSign.charAt(0);
		calculator.setSignOfOperation(signOfOperation);
		System.out.print("Please input an integer ");
		int b = scan.nextInt();
		calculator.setB(b);

		calculator.calculate();
		}
	}
}


