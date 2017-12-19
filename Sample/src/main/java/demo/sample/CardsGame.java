package demo.sample;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class CardsGame {
    public static void main (String [] args) throws IOException {  
	String repeat="";
	System.out.println("OPTIONS :");
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    DeckOfCards deck = new DeckOfCards();

	do{
		System.out.println("Enter 1 to shuffle. ");
		System.out.println("Enter 2 to deal. ");
	
		int option = Integer.parseInt(in.readLine());
		switch(option){
		case 1: deck.shuffle();
				break;
		case 2: deck.shuffle();
		        Card b = deck.deal();
		        System.out.println("Deal a card: " + Card.Rank[b.getCardRank()-1] +" of "+ Card.Suit[b.getCardSuit()-1]);
				
		}
		System.out.println("Enter y/Y to continue or n to exit. ");
		BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
		repeat = in2.readLine();
	}while(repeat.equals("y")||repeat.equals("Y"));    
   }
}  