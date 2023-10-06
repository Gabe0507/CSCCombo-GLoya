import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
//		System.out.println(Reverse(num));
		num = Reverse(num);
		System.out.println(num);
		Arrays.toString(num);
	}

	private static int[] Reverse(int[] num) {
		for (int i = 0; i < (num.length / 2); ++i) {
			int TempValue = num[i];
			num[i] = num[num.length - 1 - i];
			num[num.length - 1 - i] = TempValue;
		}
		return num;

	}

}
