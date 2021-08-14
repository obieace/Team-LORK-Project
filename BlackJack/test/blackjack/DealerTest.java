/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dabro
 */
public class DealerTest {
    
    public DealerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setPlayerTurn method, of class Dealer.
     */
    @Test
    public void testSetPlayerTurn() {
        System.out.println("setPlayerTurn");
        int playerTurn = 0;
        Dealer instance = new Dealer();
        instance.setPlayerTurn(playerTurn);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hit method, of class Dealer.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Dealer instance = new Dealer();
        instance.hit();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCardNum method, of class Dealer.
     */
    @Test
    public void testSetCardNum() {
        System.out.println("setCardNum");
        int cardNum = 0;
        Dealer instance = new Dealer();
        instance.setCardNum(cardNum);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class Dealer.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Dealer instance = new Dealer();
        instance.getHand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkScore method, of class Dealer.
     */
    @Test
    public void testCheckScore() {
        System.out.println("checkScore");
        Dealer instance = new Dealer();
        instance.checkScore();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkDealerScore method, of class Dealer.
     */
    @Test
    public void testCheckDealerScore() {
        System.out.println("checkDealerScore");
        Dealer instance = new Dealer();
        instance.checkDealerScore();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkWinner method, of class Dealer.
     */
    @Test
    public void testCheckWinner() {
        System.out.println("checkWinner");
        Dealer instance = new Dealer();
        int expResult = 3;
        int result = instance.checkWinner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
