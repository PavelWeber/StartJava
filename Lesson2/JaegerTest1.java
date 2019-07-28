public class JaegerTest1 {
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
	}
}