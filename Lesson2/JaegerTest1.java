public class JaegerTest {
	public static void main(String[] args) {
		Jaeger gipsy = new Jaeger();
		gipsy.setModelName("Gipsy");
		gipsy.setMark("Mark2");
		gipsy.setOrigin("USA");
		gipsy.setHeight(98);
		gipsy.setWeight(1998);
		gipsy.setSpeed(7);
		gipsy.setStrength(9);
		gipsy.setArmor(1000);

		gipsy.move();
		gipsy.scanKaiju();
		gipsy.useVortexCannon();


		Jaeger avenger = new Jaeger();
		avenger.setModelName("Avenger");
		avenger.setMark("Mark2");
		avenger.setOrigin("Indonesia");
		avenger.setHeight(102);
		avenger.setWeight(2004);
		avenger.setSpeed(6);
		avenger.setStrength(8);
		avenger.setArmor(2000);

		avenger.move();
		avenger.scanKaiju();
		avenger.useVortexCannon();
	}
}
