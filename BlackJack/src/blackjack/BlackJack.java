/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author dabro
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        Player p1 = new Player();
        Player[] player = new Player[4];
        int count = 1;
        String name;
        
        System.out.println("Enter the number of players (1-4): ");
        int playerTotal = k.nextInt();
        while(playerTotal > 4 ||playerTotal < 1){
            System.out.println("Invalid number of players entered please Re-enter (1-4): ");
            playerTotal = k.nextInt();
        }
        
        p1.setPlayerTotal(playerTotal);
        p1.playerCount();
        
        for(int i = 0; i < playerTotal; i++){
            System.out.println("Enter player " + count + "'s name");
            name = k.next();
            player[i] = new Player(name);
            count++;
        }
        
        for (int i = 0; i < player.length; i++){
            if( player[i] != null){
                System.out.println(player[i].getName());
            }
        }
        
        
    }
    
}
