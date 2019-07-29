public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setArmor(int armor){
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