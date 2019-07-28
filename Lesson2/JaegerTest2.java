public class JaegerTest2 {
	public static void main(String[] args) {
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