package tempConversion;

import java.util.Scanner;

public class tempConversion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		double fahrenheit;
		double celsius;
		double kelvin;
		
		System.out.print("What is the temperature?");
		fahrenheit = input.nextDouble();
		
		celsius = (fahrenheit - 32) * 5.0 / 9;
		
//		System.out.print(celsius);
		
		
		
		
		
	}

}
