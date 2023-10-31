import java.util.Arrays;
import java.util.Random;

public class Deck {
	private final int NUMBER_OF_CARDS = 52;
	Card[] cards = new Card[NUMBER_OF_CARDS];

	private static Random rand = new Random();
	public Deck() {
		int count = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 14; j++, count++) {
				cards[count] = new Card(j, i);
			}
		}
	}

	public Card[] getCards() {
		return cards;
	}

	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			 int index = rand.nextInt(cards.length);
			 swap(i , index);
		}
	}
	
	public static void suffle(Deck deck) {
		Card[] cards = deck.getCards();
		for (int i = 0; i < cards.length; i++) {
			 int index = rand.nextInt(cards.length);
			 Card temp = cards[i];
			 cards[i] = cards[index];
			 cards[index] = temp;
		}
	}
	
	private void swap(int a, int b) {
		 Card temp = cards[a];
		 cards[a] = cards[b];
		 cards[b] = temp;
	}
	private static void swapDeckCards(Card[] cards, int a, int b) {
		 Card temp = cards[a];
		 cards[a] = cards[b];
		 cards[b] = temp;
	}
	
	public void BubbleSort() {
		for (int i = 0; i < cards.length -1; i++) {
			for (int j = 1; j < cards.length -i; j++) {
				if (cards[j - 1].compareTo(cards[j]) > 0) {
					swap(j-1, j);
				}
			}
		} 
	}
	
	public static void BubbleSort(Deck deck) {
		Card[] cards = deck.getCards();
		for (int i = 0; i < cards.length -1; i++) {
			for (int j = 1; j < cards.length -i; j++) {
				if (cards[j - 1].compareTo(cards[j]) > 0) {
					swapDeckCards(cards, j - 1, j);
	}
	@Override
	public String toString() {
		StringBuilder retStr = new StringBuilder();
		for (int i = 0; i < cards.length; i++) {
			retStr.append(cards[i].toString());
			retStr.append(", ");
			if (i % 7 == 0 && i != 0) retStr.append("\n");
		}
		return retStr.toString();
	}
}
