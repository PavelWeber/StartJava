public class Cycle {
	public static void main(String[] args) {
		//Задание 1	
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
		//Задание 2
		int m = 6;
		while (m>=-6) {
			System.out.println(m);
			m -= 2;
		}
		//Задание 3
		int n = 13;
		int result = 11;
		do {
			if (n % 2 != 0) {
				result+=n;
			}
			n++;		
		} while (n < 20);
		System.out.println(result);
	}
}