public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger (String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor){
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public void move() {
		System.out.println("Robot is moving");
	}

	public void scanKaiju() {
		System.out.println("Robot is scanning");
	}

	public void useVortexCannon() {
		System.out.println("Robot is shooting");
	}
}