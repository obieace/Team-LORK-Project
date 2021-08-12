package blackjack;
/**
 * Starter code for the Card class.
 * 
 * @author srinivsi, 2020
 */
public class Card { // reusing to print UNO (color+rank) card 
    //Loose coupling,High cohesion,delegation and encapsulation - USED to great software 
    // enums are predefined contants and special datatype
        private final Suit suit; //varaibles are encapsulated
        private final Value value;
        
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
        
	public Value getValue() {
		return this.value;
	}

	public Suit getSuit() {
		return this.suit;
        }
}