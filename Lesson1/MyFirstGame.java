public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 67;
        int humanNumber = 0;
		
        while (humanNumber != computerNumber) {
		if (humanNumber < computerNumber) {
		    System.out.println("Your figure is less than computer suggested");
		    humanNumber++;
		} else if (humanNumber > computerNumber) {
		    System.out.println("Your figure is more than computer suggested");
	            humanNumber--;
		} 
        }        
        System.out.println("You won!");                   
    }
}
