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
public class Card {
    
    private String name;
    private int value;
    private String suit;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public String getSuit(){
        return suit;
    }
    
    public void setSuit(String suit){
        this.suit = suit;
    }
}
