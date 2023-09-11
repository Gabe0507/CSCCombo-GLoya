package randomNumber;

import java.util.Random;

public class randomNumber {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int upperbound = 31;
		
		int int_random = rand.nextInt(upperbound); 
		
	     System.out.println("Random number between 0 and " + (upperbound-1) + " is " + int_random);
	     
	     int min = 0;
	     int max = 30;
	     
	     System.out.print("The users guess between "+ min + " and " + max + " is ");
	     
	     int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
	     
	     System.out.print(random_int);

	     

	}

}
