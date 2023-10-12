public class Bin {

	public static void main(String[] args) {
		bin(255);
	}

	private static void bin(int n) {
		if (n == 0) {
			return;
		}
		bin(n / 2);
		System.out.print(n % 2);

	}

}