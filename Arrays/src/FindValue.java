import java.util.Scanner;

public class FindValue {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		int[] a = {1, 2, 3, 4, 5, 6};
		int num;
		
		System.out.println("Enter an int here: ");
		num = input.nextInt();
		
		System.out.println(vol(a, num));
	}

	private static boolean vol(int[] a, int num) {
		for (int i = 0; i < a.length; i++) {
			if (num == a[i])
			return true;
		}
		return false;
	}

	
}
//***** the body code ******
//		Scanner input = new Scanner(System.in);
//		int num;
//		
//		num = input.nextInt();
//		
//		int[] counts = new int[4];
//		
//		System.out.println(val(num, counts ));
//	
//
//	
// ****** the method code *******
//	private static boolean val(int num, int[] counts) {
//		if (num != counts) {
//			return false;
//		}
//		return true;
//	}