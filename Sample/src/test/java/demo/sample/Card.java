package demo.sample;

public class Card {

	public static final int DIAMOND = 1;
	public static final int CLUB    = 2;
	public static final int HEART   = 3;
	public static final int SPADE   = 4;

   private int rank;
   private int suit;
   static final String[] Suit = {"Hearts", "Clubs", "Spades", "Diamonds"};
   static final String[] Rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};                     
 
   private int cardSuit;
   public int getCardSuit() {
	return cardSuit;
}

public void setCardSuit(int cardSuit) {
	this.cardSuit = cardSuit;
}

public int getCardRank() {
	return cardRank;
}

public void setCardRank(int cardRank) {
	this.cardRank = cardRank;
}

private int cardRank;
 
   public Card(int suit, int rank) {
     cardRank = (int) rank;
     cardSuit = (int) suit;
   }

}