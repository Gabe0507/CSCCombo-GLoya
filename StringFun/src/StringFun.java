import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String day = "Tuseday";
		int date = 5;
		String month = "September";
		int year = 2023;
		
		String answer;
		
		System.out.print(day + " ");
		System.out.print(month + " ");
		System.out.print(date + ", ");
		System.out.print(year +"\n");
		
		System.out.print(day + " ");
		System.out.print(date + " ");
		System.out.print(month + " ");
		System.out.print(year + "\n");
		
		System.out.println(day +" " + date + " " + month  + " " + year);
		
		System.out.println("Do you know how to get input?");
		answer = input.next();
		
		System.out.println(answer);
	}

}
