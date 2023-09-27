import java.util.Scanner;

public class WordsScrambled {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String tiles;
		String word;
//		tiles = "quablab";
		System.out.println("Enter tiles here: ");
		tiles = input.next();
		System.out.println("Enter word here: ");
		word = input.next();
//		word = "abba";
		System.out.println(canMake(word, tiles));

	}

	public static boolean canMake(String word, String tiles) {
		for (int i = 0; i < word.length(); i++) {
			int count = 0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					count++;

				}
			}
			for (int k = 0; k < tiles.length(); k++) {
				if (word.charAt(i) == tiles.charAt(k)) {
					count--;
				}

			}
			if (count > 0)
				return false;
		}
		return true;
	}
}
