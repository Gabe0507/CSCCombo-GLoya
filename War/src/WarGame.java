
public class WarGame {

	public static void main(String[] args) {
	//	Card card1 = new Card(11,0);
	//	System.out.println(card1);
		Deck deck = new Deck();
		System.out.println(deck);
		
		deck.shuffle();
		System.out.println();
		System.out.println();
		System.out.println(deck);
		
	//	Deck.suffle(deck);
		deck.BubbleSort();
		System.out.println();
		System.out.println();
		System.out.println(deck);
	}

}