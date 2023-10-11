
public class Fibb {

	static long[] fibArray;

	public static void main(String[] args) {
		// fib normal main
		// int n = fib(46);
		// System.out.println(n);

		// fibArray main
		int term = 13;
		fibArray = new long[term + 1];
		System.out.println(fib(term));
		for (long i = 0; i < fibArray.length; i++) {
			if (i%7 == 0)System.out.println();
			System.out.println(fibArray[(int) i] + " ");
			
		}

	}

	// fibArray method
	private static long fib(int n) {
		if (n == 0 || n == 1) return n;
		if(fibArray[n] != 0) {
			return fibArray[n];
		}
		long nthFibNum = fib(n-1)+fib(n-2);
		fibArray[n] = nthFibNum;
		return nthFibNum;
	}
	// fib normal method
	// private static int fib(int n) {
	// if (n == 0 || n == 1) return n;
	// return fib(n-1)+fib(n-2);
	// }

}

//int fib;
//int n;
//
//		if (n==0 || n==1) {
//			return n;
//		}
//		return fib(n-1)+fib(n-2);

//a = a(n-1)+a(n-2)	
//0 1 1 2 3 5 8 13
// N = N-1 + N-2