public class Calculator {
	private int a;
	private int b;
	private char sign1;
	private String sign;
	private int result;

	public void setA(int a) {
		this.a=a;
	}
	public void setB(int b) {
		this.b=b;
	}
	public void setSign1(char sign1) {
		this.sign1=sign1;
	}
	public void setSign(String sign) {
		this.sign=sign;
	}

	public void calculate() {
		switch (sign1) {
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
