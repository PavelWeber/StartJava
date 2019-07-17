public class Cycle{
	public static void main (String[]args) {
//Задание 1	
		for(int i=0; i<=20; i++) {
			System.out.println(i);
		}
//Задание 2
		int m =6;
		while (m>=-6){
			System.out.println(m);
			m=m-2;
		}
//Задание 3
		int n = 10;
		int result=10;
		do {
			n = n+2;
			result=result+n;
		} while (n<20);
		System.out.println(result);
	}
}