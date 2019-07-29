public class Calculator {
	private int a;
	private int b;
	private String input;
	private char signOfOperation;
	private int result;

	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public void setSignOfOperation(char signOfOperation) {
		this.signOfOperation = signOfOperation;
	}

	public void calculate() {
		switch (signOfOperation) {
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
				int result = 1;
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
