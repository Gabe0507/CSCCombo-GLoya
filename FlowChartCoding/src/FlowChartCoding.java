import java.util.Scanner;

public class FlowChartCoding {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in); 
	
	
		int total;
		String answer; 
		
		
		System.out.print("How many credtis are you taking?");
		int creds = input.nextInt();
		total = (creds * 580) + 650;
		if	(creds > 12) {
			total+=250;
		}
		
		else {
			System.out.println("would you like the activity fee?");
			answer = input.next();
			if (answer.equals("Y")) {
				total+=250;
			}
		
		}
		System.out.println("The tuition is: " + total);
	}

}
