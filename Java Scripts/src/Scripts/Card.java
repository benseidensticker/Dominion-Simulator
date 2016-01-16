package Scripts;
/* An object for each individual card in the game. 
 * A card object is not constructed until it's part of a player's deck.
 * Has a cost variable.
 * Has a unique descriptor.
 * 
 */
public class Card {
	private int cost;
	private String desc;
	private Player owner;
	
	
	/*** Create a new Card Object ***/
	public Card(int cardCost,String descriptor,Player ownedBy){
		cost = cardCost;
		desc = descriptor;
		owner = ownedBy;
	}
	
	/*** Get the cost back ***/
	public int getCost(){
		return cost;
	}
	
	/*** Get the descriptor ***/
	public String getDesc(){
		return desc;
	}
	
	/*** Run the logic for this particular card ***/
	public void runCard(){
		
	}
	
	
	/***** Include logic for individual cards ***/
	
	
	
	
}
