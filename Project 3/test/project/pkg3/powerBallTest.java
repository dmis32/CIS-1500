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
    
    @Test
    public void testGetWinnings() {
        System.out.println("getWinnings");
        powerBall winningTicket = null;
        powerBall instance = new powerBall();
        double expResult = 0.0;
        double result = instance.getWinnings(winningTicket);
        assertEquals(expResult, result, 0.0);
   
    }

 
    @Test
    public void testGetWhiteBalls() {
        System.out.println("getWhiteBalls");
        powerBall instance = new powerBall();
        int[] expResult = null;
        int[] result = instance.getWhiteBalls();
        assertArrayEquals(expResult, result);

    }

  
    @Test
    public void testGetRedBall() {
        System.out.println("getRedBall");
        powerBall instance = new powerBall();
        double expResult = 0.0;
        double result = instance.getRedBall();
        assertEquals(expResult, result, 0.0);

    }

  
    @Test
    public void testHasWhiteNumber() {
        System.out.println("hasWhiteNumber");
        int num = 0;
        powerBall instance = new powerBall();
        boolean expResult = false;
        boolean result = instance.hasWhiteNumber(num);
        assertEquals(expResult, result);
      
    }

    
    @Test
    public void testToString() {
        System.out.println("toString");
        powerBall instance = new powerBall();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
