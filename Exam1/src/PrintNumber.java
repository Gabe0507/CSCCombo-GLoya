
public class PrintNumber {

	public static void main(String[] args) {

		int i;

		for (i = 4; i < 19; i++) {
			System.out.printf("%4s", i + 1);
			if (((i + 1) % 10 == 0) && (i != 0)) {
				System.out.println();
			}

		}

	}

}
