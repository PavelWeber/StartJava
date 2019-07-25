public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();
		wolf1.sex = "man";
		wolf1.name ="Volk";
		wolf1.age = 5;
		wolf1.colour = "red";

		System.out.println(wolf1.sex);
		System.out.println(wolf1.name);
		System.out.println(wolf1.age);
		System.out.println(wolf1.colour);

		wolf1.go();
		wolf1.sit();
		wolf1.vow();
		wolf1.hunt();
	}
}