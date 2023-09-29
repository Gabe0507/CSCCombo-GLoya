import java.util.Scanner;

public class TenMaker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int num1;
		int num2;
		System.out.print("Enter two integers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.print(num1 + " plus " + num2 + " is 10. " );
		System.out.print(makes10(num1, num2));
	}

	private static boolean makes10(int num1, int num2) {
		if (num1 + num2 == 10) {
			return true; 
		}
		return false; 
	}

}
