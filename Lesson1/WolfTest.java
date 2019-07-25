public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();
		wolf1.setWolfSex("female");

		wolf1.setWolfName("Iora");

		wolf1.setWolfAge(9);

		wolf1.setWolfColour("grey");

		System.out.println(wolf1.getWolfSex());

		System.out.println(wolf1.getWolfName());

		System.out.println(wolf1.getWolfAge());

		System.out.println(wolf1.getWolfColour());

		wolf1.go();

		wolf1.sit();

		wolf1.vow();

		wolf1.hunt();

	}
}