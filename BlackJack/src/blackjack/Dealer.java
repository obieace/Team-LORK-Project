/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author dabro
 */
public class Dealer {
    
    private Suit suit;
    private int suitNum;
    private Value value;
    private int valueNum;
    Player p1 = new Player();
    CardHand ch = new CardHand();
    CardHand [][] hand = new CardHand[4][11];
    private int cardNum;
    private int playerTurn;
    int [] total = new int [4];
    
    public void setPlayerTurn(int playerTurn){
        this.playerTurn = playerTurn;
    }
    
    public void hit(){
        suitNum = (int) Math.floor(Math.random()*4)+1;
        valueNum = (int) Math.floor(Math.random()*13)+1;
        switch(suitNum){
            case 1:
                suit = Suit.DIAMONDS;
                break;
            case 2:
                suit = Suit.SPADES;
                break;
            case 3:
                suit = Suit.CLUBS;
                break;
            case 4:
                suit = Suit.HEARTS;
                break;
        }
        
        switch(valueNum){
            case 1:
                value = Value.ACE;
                break;
            case 2:
                value = Value.TWO;
                break;
            case 3:
                value = Value.THREE;
                break;
            case 4:
                value = Value.FOUR;
                break;
            case 5:
                value = Value.FIVE;
                break;
            case 6:
                value = Value.SIX;
                break;
            case 7:
                value = Value.SEVEN;
                break;
            case 8:
                value = Value.EIGHT;
                break;
            case 9:
                value = Value.NINE;
                break;
            case 10:
                value = Value.TEN;
                break;
            case 11:
                value = Value.JACK;
                break;
            case 12:
                value = Value.QUEEN;
                break;
            case 13:
                value = Value.KING;
                break;
        }
        hand[playerTurn][cardNum] = new CardHand(suit, value);
        cardNum++;
    }
    
    public void setCardNum(int cardNum){
        this.cardNum = cardNum;
    }
    
    public void getHand(){
        
        for (int i = 0; i < 4; i++){
                for(int j = 0; j < 2; j++){
                    suitNum = (int) Math.floor(Math.random()*4)+1;
                    valueNum = (int) Math.floor(Math.random()*13)+1;
                    
                    switch(suitNum){
                        case 1:
                            suit = Suit.DIAMONDS;
                            break;
                        case 2:
                            suit = Suit.SPADES;
                            break;
                        case 3:
                            suit = Suit.CLUBS;
                            break;
                        case 4:
                            suit = Suit.HEARTS;
                            break;
                        }
        
                    switch(valueNum){
                        case 1:
                            value = Value.ACE;
                            break;
                        case 2:
                            value = Value.TWO;
                            break;
                        case 3:
                            value = Value.THREE;
                            break;
                        case 4:
                            value = Value.FOUR;
                            break;
                        case 5:
                            value = Value.FIVE;
                            break;
                        case 6:
                            value = Value.SIX;
                            break;
                        case 7:
                            value = Value.SEVEN;
                            break;
                        case 8:
                            value = Value.EIGHT;
                            break;
                        case 9:
                            value = Value.NINE;
                            break;
                        case 10:
                            value = Value.TEN;
                            break;
                        case 11:
                            value = Value.JACK;
                            break;
                        case 12:
                            value = Value.QUEEN;
                            break;
                        case 13:
                            value = Value.KING;
                            break;
                    }
                    hand[i][j] = new CardHand(suit, value);
                    System.out.println(hand[i][j].getValue() + " of " + hand[i][j].getSuit());
                }
        }
    }
    
    //checks score of every player
    public void checkScore(){
        for (int i = 0; i < hand[playerTurn].length; i++){
            if(hand[playerTurn][i] != null){
                if(hand[playerTurn][i].getValue().equals(Value.TWO)){
                    total[playerTurn]+= 2;
                }
                if(hand[playerTurn][i].getValue().equals(Value.THREE)){
                    total[playerTurn]+= 3;
                }
                if(hand[playerTurn][i].getValue().equals(Value.FOUR)){
                    total[playerTurn]+= 4;
                }
                if(hand[playerTurn][i].getValue().equals(Value.FIVE)){
                    total[playerTurn]+= 5;
                }
                if(hand[playerTurn][i].getValue().equals(Value.SIX)){
                    total[playerTurn]+= 6;
                }
                if(hand[playerTurn][i].getValue().equals(Value.SEVEN)){
                    total[playerTurn]+= 7;
                }
                if(hand[playerTurn][i].getValue().equals(Value.EIGHT)){
                    total[playerTurn]+= 8;
                }
                if(hand[playerTurn][i].getValue().equals(Value.NINE)){
                    total[playerTurn]+= 9;
                }
                if(hand[playerTurn][i].getValue().equals(Value.TEN)){
                    total[playerTurn]+= 10;
                }
                if(hand[playerTurn][i].getValue().equals(Value.JACK)){
                    total[playerTurn]+= 10;
                }
                if(hand[playerTurn][i].getValue().equals(Value.QUEEN)){
                    total[playerTurn]+= 10;
                }
                if(hand[playerTurn][i].getValue().equals(Value.KING)){
                    total[playerTurn]+= 10;
                }
                if(hand[playerTurn][i].getValue().equals(Value.ACE)){
                    total[playerTurn]+= 11;
                }
                else if (total[playerTurn] > 21){
                    total[playerTurn]+= 1;
                }
                System.out.println(total[playerTurn]);
            }
        }
    }
}
