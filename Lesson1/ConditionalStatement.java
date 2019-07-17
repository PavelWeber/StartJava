public class ConditionalStatement {
	
	public static void main (String[] args) {
		int age = 33;
		boolean isMan = true;
		float height = 1.83f;
		char firstNameLetter = 'P';

		if(age > 20) {
		    System.out.println("You are adult");
		}

		if(isMan) {
		    System.out.println("You are man");
  	      }

		if(!isMan) {
		    System.out.println("You are woman");
		}

		if(height < 1.80) {
		    System.out.println("You are short");
		} else {
		    System.out.println("You are tall");
		}

		if (firstNameLetter == 'M') {
		   System.out.println("Your name starts with letter 'M'");
		} else if (firstNameLetter == 'I') {
		     System.out.println("Your name starts with letter 'I'");
		} else {
		     System.out.println("Your name starts with another letter");
		} 
	}
}