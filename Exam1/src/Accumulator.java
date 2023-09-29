import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;
		int total = 0;
		System.out.println("Enter any number you want: ");
		num = input.nextInt();

		while (num != 0) {
			total = total + num;

			System.out.println("Enter any number you want: ");
			num = input.nextInt();
		}
		System.out.println("The sum of all the numbers are " + total);

	}

}
