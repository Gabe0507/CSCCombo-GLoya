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
		
		kelvin = (celsius + 273.15);
		
		System.out.println(fahrenheit + " deegree's fahrenheit");
		System.out.println(celsius + " deegree's celsius");
		System.out.println(kelvin + " deegree's kelvin");

		
		
		
		
		
		
	}

}
