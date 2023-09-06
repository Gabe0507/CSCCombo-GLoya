import java.util.Scanner;

public class ImputCheckSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String word;
		int intNum; 
		float realNum;
		double biggerRealNum;
		char letter;
		
		System.out.print("The words go here: ");
		word = input.nextLine();
		
		System.out.print("Enter an integer here: ");
		intNum = input.nextInt();
				
		System.out.print("Enter a real number here: ");
		realNum = input.nextFloat();
		
		System.out.print("Enter a double here: ");
		biggerRealNum = input.nextDouble();
				
		System.out.print("Enter a single character here: ");
		letter = input.next().charAt(0);
		
		System.out.println("The word goes here " + word);
		
		System.out.println("The integer goes here: " + intNum);
		
		System.out.println("The real number goes here: " + realNum);
		
		System.out.println("The double goes here: " + biggerRealNum);
		
		System.out.println("The character goes here: " + letter);
		


		
		}
	
}
