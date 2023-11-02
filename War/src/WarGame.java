
public class WarGame {

	public static void main(String[] args) {
	//	Card card1 = new Card(11,0);
	//	System.out.println(card1);
		Deck deck = new Deck();
//		System.out.println(deck);
		
		deck.shuffle();
//		System.out.println();
//		System.out.println();
//		System.out.println(deck);
		
	//	Deck.suffle(deck);
//		deck.BubbleSort();
//		System.out.println();
//		System.out.println();
//		System.out.println(deck);
		
		Pile pile = new Pile();
		System.out.println(pile.isEmpty());
		pile.addCard(deck.getCards()[0]);
		pile.addCard(deck.getCards()[1]);
		pile.addCard(deck.getCards()[2]);
		pile.addCard(deck.getCards()[3]);
		
		System.out.println(pile);
		System.out.println(pile.popCard());
		System.out.println(pile);
		System.out.println(pile.isEmpty());
	}
	

}
