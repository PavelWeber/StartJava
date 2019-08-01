public class Player {
		private int number;
		private String name;
		public Player(String name) {
			this.name = name;
			name = scan.nextLine();
		}

		public String getName() {
			return name;
		}

		public void setNumber(int number) {
			this.number = number;

		}

		public int getNumber() {
			return number;
		}
}