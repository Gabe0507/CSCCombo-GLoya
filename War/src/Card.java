public class Card {
	private int rank;
	private int suit;

	private final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6"
			, "7", "8", "9", "10", "Jack", "Queen", "King"};
	private final String[] SUITS = {"Spades", "Hearts",
			"Clubs", "Diamonds"};
// Constructor 
	public Card(int rank, int suit) {	
		this.rank = rank;
		this.suit = suit;
	}
// Getters
	public int getRank() {
		return rank;
	}
	public int getSuit() {
		return suit;
	}
// Setters	
	public void setRank(int rank) {
		this.rank = rank;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return RANKS[rank] + " of " + SUITS[suit];
	}
	
	
}
