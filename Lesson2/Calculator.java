public class Calculator {
	private int a;
	private int b;
	private char sign;
	private int result;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public void calculate() {
		switch (sign) {
			case '+':
				System.out.println("Result is " + (a + b));
				break;
			case '-':
				System.out.println("Result is " + (a - b));
				break;
			case '*':
				System.out.println("Result is " + (a * b));
				break;
			case '/':
				System.out.println("Result is " + (a / b));
				break;
			case '%':
				System.out.println("Result is " + (a % b));
				break;
			case '^':
				result = 1;
				for(int i = 1; i <= b; i++) {
					result *= a;			
				}
				System.out.println("Result is " + result);
				break;
			default:
				System.out.println("No option programmed for your operation");
				break;
				}
	}
}
