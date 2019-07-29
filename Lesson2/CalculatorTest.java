import java.util.Scanner;
public class CalculatorTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String reply = "yes";	 	
	 	while (reply.equals("yes")) {
			Calculator calculator = new Calculator();

			System.out.println("Please input an integer ");
			int a = scan.nextInt();
			calculator.setA(a);

			System.out.println("Please input an operation sign ");
			String input = scan.next();
			char signOfOperation = input.charAt(0);
			calculator.setSignOfOperation(signOfOperation);
			
			System.out.print("Please input an integer ");
			int b = scan.nextInt();
			calculator.setB(b);

			calculator.calculate();
			
			do {
				System.out.println("do you want to continue yes/no");
				reply = scan.next();
			} while (!reply.equals("yes") && !reply.equals("no"));				 		
	 	}		
	}
}




