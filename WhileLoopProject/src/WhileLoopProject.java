import java.util.Scanner;

public class WhileLoopProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int num;
		int countEven, countOdd;
		double total; 
		double totalAvg;
		countEven = 0;
		countOdd = 0;
		total = 0;
		totalAvg = 0;
		
		System.out.println("Enter a number: ");
		num = input.nextInt();
		
		
	while (num != 0) {
		
	
	if	(num%2 == 0) {
		System.out.println("your number is even");
		countEven ++;
		total = total + num;
	}
		
	else {
		System.out.println("your number is odd");
		countOdd ++;
		total = total + num;

	}
		System.out.println("Enter a number: ");
		num = input.nextInt();
	}
	System.out.println(countEven + " " + countOdd + " " + total);
	
	}

}
