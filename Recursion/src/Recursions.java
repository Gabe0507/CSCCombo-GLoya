
public class Recursions {

	public static void main(String[] args) {
		
		factoral(5);
	}

	private static int factoral(int n) {
		if (n == 0)return 1;
			
		int product = n * factoral(n - 1);
		System.out.println(product);
		
		return product;
	}

}
// *** main ***
//		System.out.println(factoral(5));
// *** method ***
//		if (n==0) {
//			return 1;
//		}
//		return n * factoral(n-1);

// *** main ***
//		factoral(5);
// *** method ***
//		int product = 1;
//		for (int i = n; i > 0; i--) {
//			product *= i;
//			System.out.println(product);
//		}

// *** main recursion ***
//		int result = sum(10);
//		System.out.println(result);
// *** method ***
//	public static int sum(int k) {
//		if (k > 0) {
//			return k + sum(k - 1);
//		} else {
//			return 0;
//		}
//	}