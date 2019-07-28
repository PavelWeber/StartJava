import java.util.Scanner;
public class CalculatorTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator1 = new Calculator();

		System.out.println("Please input an integer ");
		int a = scan.nextInt();
		System.out.println("Please input an operation sign ");
		String sign = scan.next();
		char sign1 = sign.charAt(0);
		System.out.print("Please input an integer ");
		int b = scan.nextInt();

		calculator1.count();

	}
}

