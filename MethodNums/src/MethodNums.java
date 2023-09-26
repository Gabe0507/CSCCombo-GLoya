import java.util.Scanner;

public class MethodNums {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Enter 3 numbers here: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		int Small = smallNum(a, b, c);
		System.out.print(Small + " is the samllest number and ");
		
		int Avg = avgNum(a, b, c);
		System.out.print(Avg + " is the average of the 3 numbers.");
	}

	private static int avgNum(int a, int b, int c) {
		return (a + b + c) /3;
	}

	private static int smallNum(int a, int b, int c) {
		if 	(a <= b && a <= c) {
			return a;
		}
		if	(b <= a && b <= c) {
			return b;
		}
		if (c <= a && c <= b) {
			return c;
		}
		return -1;
	}

	
}
