package blackjack;
/**
 * a class that models the Card Hand.
 * Generation of card is delegated to this class
 * A Card hand has an array of cards. 
 * How can you change the size of the hand? how big is it right now?
 * @author srinivsi, 2020.
 */

public class CardHand {

        private int handSize = 52;
	public Card[] cards = new Card[handSize];
      
        public void generateHand()
        {
                int countCards = 0;
		for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                    }
                }//end outter for
        }//end method

}