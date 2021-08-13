
package blackjack;

/**
 *
 * @author dabro
 */
public class Player {
    private String name;
    private int playerTotal;
    int count = 0;
    Player[] player = new Player[4];
    
    public Player(String name){
        this.name = name;
        for (int i = 0; i < playerTotal; i++){
            player[i] = new Player(name);
        }
    }
    
    public Player(){
        
    }
    
    public void setPlayerTotal(int playerTotal){
        this.playerTotal = playerTotal;
    }
     
    public void playerCount(){
        System.out.println(playerTotal + " total players");
    }
    
    public void displayName(){
        //Displays all the player's names
        System.out.println("Welcome: ");
        for (int i = 0; i < player.length; i++){
            if(player[i] != null){
                System.out.println(player[i].getName());
            }
        }
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
