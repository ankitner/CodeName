package demo.sample;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DeckOfCards {
	
	 public static int NEWCARDS = 52;
     public static List<Card> deckOfCards = new ArrayList<Card>();

     public DeckOfCards(){
        for (int suit = Card.DIAMOND; suit <= Card.SPADE; suit++)
           for ( int rank = 1; rank <= 13; rank++ )
               deckOfCards.add( new Card(suit, rank));
     }

     public void shuffle() {
         Collections.shuffle(deckOfCards);
     }
      
     public Card deal() {
    	 System.out.println(deckOfCards.size());
    	 if(deckOfCards.size()>0){
    		 Card currentCard = deckOfCards.get(0);
    		 deckOfCards.remove(0);
             return ( currentCard );
    	 }
    	 else{
    		 System.out.println("Out of Cards");
    		    System.exit(0);
    		    return ( null);
    	 }
     }
}