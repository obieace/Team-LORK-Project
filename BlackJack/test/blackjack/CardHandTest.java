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
public class CardHandTest {
    
    public CardHandTest() {
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
     * Test of showHand method, of class CardHand.
     */
    @Test
    public void testShowHand() {
        System.out.println("showHand");
        CardHand instance = new CardHand();
        instance.showHand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSuit method, of class CardHand.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        CardHand instance = new CardHand(Suit.CLUBS, Value.ACE);
        Suit expResult = Suit.CLUBS;
        Suit result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class CardHand.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        CardHand instance = new CardHand(Suit.DIAMONDS, Value.JACK);
        Value expResult = Value.JACK;
        Value result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
