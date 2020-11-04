/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dylan
 */
public class powerBallTest {
    
    public powerBallTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getWinnings method, of class powerBall.
     */
    @Test
    public void testGetWinnings() {
        System.out.println("getWinnings");
        powerBall winningTicket = null;
        powerBall instance = new powerBall();
        double expResult = 0.0;
        double result = instance.getWinnings(winningTicket);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWhiteBalls method, of class powerBall.
     */
    @Test
    public void testGetWhiteBalls() {
        System.out.println("getWhiteBalls");
        powerBall instance = new powerBall();
        int[] expResult = null;
        int[] result = instance.getWhiteBalls();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRedBall method, of class powerBall.
     */
    @Test
    public void testGetRedBall() {
        System.out.println("getRedBall");
        powerBall instance = new powerBall();
        double expResult = 0.0;
        double result = instance.getRedBall();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasWhiteNumber method, of class powerBall.
     */
    @Test
    public void testHasWhiteNumber() {
        System.out.println("hasWhiteNumber");
        int num = 0;
        powerBall instance = new powerBall();
        boolean expResult = false;
        boolean result = instance.hasWhiteNumber(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class powerBall.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        powerBall instance = new powerBall();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
