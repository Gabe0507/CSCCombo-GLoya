package Examples;

import java.util.Scanner;

public class Examples {

	public static void main(String[] args) {

		class ExamReview {

			public static void main(String[] args) {

//				***** System out *****
//				***** User input from scanner *****
//		 		***** If statement (ex: check for even/odd) *****
//				***** While loops *****
//				***** For loops ***** 
//				***** method call *****

//				***** Example *****
//				***** Get user input (integer ) from scanner, check if it is even or odd. 
//				Print the number, and then print "Even" or "Odd" to the screen. If number is negative, print "Negative" *****

				Scanner numberInput = new Scanner(System.in);
				System.out.println(
						"Input a number, I will check if it's odd or even. To end program, input a negative number.");
				int num = -0;
				System.out.println("Please input an integer:");
				num = numberInput.nextInt();

//				***** Method will return true if number is even, print result to screen *****

				System.out.println(isEven(num));
				boolean isTrue = isEven(num);
				System.out.println(isTrue);
				if (isEven(num)) {
					System.out.println(num + " is even!");
				} else {
					System.out.println(num + " is odd!");
				}

//				while (num >= 0) {
//					System.out.println("Please input an integer:");
//					num = numberInput.nextInt();
//					if (num == 0) {
//						System.out.println("I'm not sure if 0 is even or odd.");
//					} else if (num % 2 == 0) {
//						System.out.println(num + " is even!");
//					} else {
//						System.out.println(num + " is odd!");
//					}
//					
//				}
//				System.out.println("Program end.");

			}

			public static boolean isEven(int num) {
				return (num % 2 == 0);

			}

		}

	}

}
