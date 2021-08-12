package blackjack;

import java.util.Scanner;

/**
 * A high cohesive class to handle the user interaction for the Card
 * project. Contains a main method that calls other class to 
 * generates a deck of card and then iterates 
 * over it to print its contents to the console.
 * @author srinivsi, 2020
 */
public class GamePlayer {

	public static void main(String[] args) {
		CardHand ch = new CardHand();
                ch.generateHand(); // generation of card is delegated to another class CardHand
                for(Card c: ch.cards)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
             
        }

}