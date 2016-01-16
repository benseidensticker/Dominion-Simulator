package Scripts;
import java.util.LinkedList;

/* One assigned to each Player class
 * Singly linked list of cards. Cards are not removed from the deck.
 * 
 * 
 */
public class Hand {
	private int size;
	private Deck handDeck;
	private LinkedList<Card> cards;
	
	/*** Create new hand ***/
	public Hand(Deck d){
		//set private variables
		size =0;
		handDeck = d;
		//Draw first 5 cards
		for (int i=0;i < 5; i++){
			
		}
	}
	
	
	/*** Draw one card ***/
	public void drawCard(){
		//pop one card from deck and add to hand
		cards.addFirst(handDeck.getTop());
		size++;
	}
	
	
	/*** Discard number of cards ***/
	/* Use first parameter to define number of cards to discard. If null, discard all. */
	public static void discardCards(int numCards){
		
	}
	
}
