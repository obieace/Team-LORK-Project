package blackjack;
/**
 * a class that models the Card Hand.
 * Generation of card is delegated to this class
 * A Card hand has an array of cards. 
 * How can you change the size of the hand? how big is it right now?
 * @author srinivsi, 2020.
 */

public class CardHand extends BlackJack {

        private int handSize = 52;
        public CardHand [][] hand = new CardHand [4][11];
        
        Player p1 = new Player();
        private Suit suit;
        private Value value;
        private int playerNum;
        
        public CardHand(Suit suit, Value value) {
            this.suit = suit;
            this.value = value;
        }
        
        public CardHand(){
            
        }
        
        public void showHand() {
            for (int i = 0; i < hand.length; i++){
                    for (int j = 0; j < hand[i].length; j++){
                        if (p1.player[i] != null){
                            System.out.println(hand[0][j].getValue() + " of " + hand[0][i].getSuit());
                        }
                    }
            }
        }
        
        public Suit getSuit(){
            return suit;
        }
        
        public Value getValue(){
            return value;
        }
        

}