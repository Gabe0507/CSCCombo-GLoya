package calc;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int val1, val2;
		
		System.out.print("Enter val1: ");
		val1 = input.nextInt();
		
		System.out.print("Enter val2: ");
		val2 = input.nextInt();
		
		int val = subCal(val1,val2);
		System.out.println("Sub val is " + val);
		
		int add = addCal(val1, val2);
		System.out.println("Add val is: " + add);
		
		int mult = multCal(val1, val2);
		System.out.println("Mult val is " + mult);
		
		float div = divCal(val1, val2);
		System.out.println("Div val is " + div);
	}

	public static float divCal(int val1, int val2) {
		return val1 / (float) val2;
	}

	private static int multCal(int val1, int val2) {
		int mult = val1 * val2;
		return mult;
	}

	public static int addCal(int val1, int val2) {
		// TODO Auto-generated method stub
		int add = val1 + val2;
		return add;
	}

	public static int subCal(int val1, int val2) {
		int sub; 
		sub = val1 - val2;
		return sub;
	}
	
	

}
