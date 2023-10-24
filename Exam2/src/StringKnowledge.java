
public class StringKnowledge {

	public static void main(String[] args) {
//		String str = "catABC cat";
//		System.out.println(howManyCats(str));
		
		String a = "Hiabc";
		String b = "abc";
		System.out.println(endOther(a, b));
		
	}
	
	private static boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if (a.endsWith(b) || b.endsWith(a)) {
			return true;
		}
		return false;
	}

	private static int howManyCats(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			String temp = str.substring(i, i + 3);
			if (temp.equals("cat")) {
				count++;
			}
		}
		return count;
	}

}
