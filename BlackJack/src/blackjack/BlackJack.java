/*
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author dabro
 */
public class BlackJack {
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        Player p1 = new Player();
        Dealer dealer = new Dealer();
        CardHand ch = new CardHand();
        int count = 1;
        String name;
        
        //Sets total number of players
        System.out.println("Enter the number of players (1-4): ");
        int playerTotal = k.nextInt();
        while(playerTotal > 4 ||playerTotal < 1){
            System.out.println("Invalid number of players entered please Re-enter (1-4): ");
            playerTotal = k.nextInt();
        }
        p1.setPlayerTotal(playerTotal);
        p1.playerCount();
        
        //Sets player names
        for(int i = 0; i < playerTotal; i++){
            System.out.println("Enter player " + count + "'s name");
            name = k.next();
            p1.player[i] = new Player(name);
            count++;
        }
        p1.displayName();
        
        //Deals out the cards
        dealer.getHand();
        
        //hit and stand section for each player
        dealer.setCardNum(2);
        int turn = 0;
        while(turn < playerTotal){
            dealer.setPlayerTurn(turn);
            System.out.println(p1.player[turn].getName() + "'s Turn");
            for (int i = 0; i < 11; i++){
                if(dealer.hand[turn][i]!= null)
                    System.out.println(dealer.hand[turn][i].getValue() + " of " + dealer.hand[turn][i].getSuit());
            }
            System.out.println("Would you like to hit or stand? 1=hit 0=stand");
            int hitStand = k.nextInt();
            while (hitStand < 0 || hitStand > 1){
                System.out.println("INVALID ENTRY PLEASE RE-ENTER! 1=hit 0=stand");
                hitStand = k.nextInt();
            }
            if (hitStand == 1){
                dealer.hit();
            }
            
            while(hitStand == 1){
                for (int i = 0; i < 11; i++){
                    if(dealer.hand[turn][i] != null){
                        System.out.println(dealer.hand[turn][i].getValue() + " of " + dealer.hand[turn][i].getSuit());
                    }
                }
                System.out.println("Would you like to hit again or stand? 1=hit 0=stand");
                hitStand = k.nextInt();
                    while (hitStand < 0 || hitStand > 1){
                        System.out.println("INVALID ENTRY PLEASE RE-ENTER! 1=hit 0=stand");
                        hitStand = k.nextInt();
                    }
                    if (hitStand == 1){
                        dealer.hit();
                }
                    
            }
            dealer.checkScore();
            dealer.setCardNum(2);
            turn++;
        }
    }
    
}
