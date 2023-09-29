import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int num = 0;
		
		System.out.println("Enter 1 for water. Enter 2 for coke. Enter 3 for coffee");
		num = input.nextInt(); 
		
		if (num == 1) {
			System.out.println("You picked water!");
		} else if (num == 2) {
			System.out.println("You picked coke!");
		} else {
			System.out.println("You picked coffee!");
		}
	}

}
