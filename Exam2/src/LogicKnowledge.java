
public class LogicKnowledge {

	public static void main(String[] args) {
		
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		System.out.println(pickNumber(a, b, c));
		
		int a = 2;
		int b = 3;
		int c = 6;
		System.out.println(equiDistance(a,b,c));
	}
	private static boolean equiDistance(int a, int b, int c) {
		if (a + c == 2*b || (b + c == 2*a) || (a + b == 2*c)){
			return true;
		}
		return false;
	}
	public static int pickNumber(int a, int b, int c) {
		if (a == b && a == c && b == c) {
			return a;
	}
		if (a != b && a != c && b != c) 
			return a + b + c;
		if (a == b) {
			return c;
		}
		if (a == c) {
			return b;
		}
		if (b == c) {
			return a;
		}
		return 0;
	}
}
