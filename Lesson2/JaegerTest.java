public class JaegerTest {
	public static void main(String[] args) {
		Jaeger gipsy = new Jaeger("Gipsy", "Mark2", "USA", 98, 1998, 7, 9, 1000);
		
		gipsy.move();
		gipsy.scanKaiju();
		gipsy.useVortexCannon();

		Jaeger avenger = new Jaeger("Avenger", "Mark2", "Indonesia", 102, 2004, 6, 8, 2000);

		avenger.move();
		avenger.scanKaiju();
		avenger.useVortexCannon();

	}
}
