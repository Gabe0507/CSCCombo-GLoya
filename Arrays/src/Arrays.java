import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;
		System.out.println("How many strings.");
		num = input.nextInt();
		int[] count = new int[num];
		String[] str = new String[num];

		for (int i = 0; i < num; i++) {
			System.out.println("Enter strings");
			str[i] = input.next();
			count[i] = str[i].length();
		}
		for (int i = 0; i < num; i++) {
			System.out.println(str[i]);
			System.out.println(count[i]);
		}
		
	}

}
