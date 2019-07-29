public class Calculator {
	private int a;
	private int b;
	private char scanSign;
	private String signOfOperation;
	private int result;

	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setScanSign(char scanSign) {
		this.scanSign = scanSign;
	}
	public void setSignOfOperation(String signOfOperation) {
		this.signOfOperation = signOfOperation;
	}

	public void calculate() {
		switch (signOfOperation) {
			case '+':
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.println(a / b);
				break;
			case '%':
				System.out.println(a % b);
				break;
			case '^':
				int result = 1;
				for(int i = 1; i <= b; i++) {
						result *= a;			
				}
				System.out.println(result);
				break;
			default:
				System.out.println("No option programmed for your operation");
				break;
			}
		}
}
