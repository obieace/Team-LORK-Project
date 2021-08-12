
package blackjack;

/**
 *
 * @author dabro
 */
public class Player {
    private String name;
    private int playerTotal;
    int count = 0;
    
    public Player(String name){
        this.name = name;
    }
    
    public Player(){
        
    }
    
    public void setPlayerTotal(int playerTotal){
        this.playerTotal = playerTotal;
    }
     
    public void playerCount(){
        System.out.println(playerTotal + " total players");
    }
    
    public void play(){
        
    }
    
    
    
    public String getName(){
        return name;
    }
    /*
    public boolean moreCards(){
        
    }
    
    public void getCard(){
        
    }
    
    public void showHand(){
        
    }
*/
}
