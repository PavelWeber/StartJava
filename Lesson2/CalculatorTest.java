import java.util.Scanner;
public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();

		System.out.println("Please input an integer ");
		int a = scan.nextInt();
		calculator.setA(a);
		System.out.println("Please input an operation sign ");
		String scanSign = scan.next();
		char signOfOperation = scanSign.charAt(0);
		calculator.setSign1(sign1);
		System.out.print("Please input an integer ");
		int b = scan.nextInt();
		calculator.setB(b);

		calculator.calculate();
	}
}

