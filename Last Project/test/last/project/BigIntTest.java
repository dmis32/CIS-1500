/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package last.project;

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
public class BigIntTest {
    
    public BigIntTest() {
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
     * Test of getSign method, of class BigInt.
     */
    @Test
    public void testGetSign() {
        System.out.println("getSign");
        BigInt instance = null;
        char expResult = ' ';
        char result = instance.getSign();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBigInt method, of class BigInt.
     */
    @Test
    public void testGetBigInt_0args() {
        System.out.println("getBigInt");
        BigInt instance = null;
        String expResult = "";
        String result = instance.getBigInt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBigInt method, of class BigInt.
     */
    @Test
    public void testGetBigInt_int() {
        System.out.println("getBigInt");
        int index = 0;
        BigInt instance = null;
        int expResult = 0;
        int result = instance.getBigInt(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class BigInt.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BigInt instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTrailingZeros method, of class BigInt.
     */
    @Test
    public void testAddTrailingZeros() {
        System.out.println("addTrailingZeros");
        int amount = 0;
        BigInt instance = null;
        String expResult = "";
        String result = instance.addTrailingZeros(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class BigInt.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        BigInt bigIntToAdd = null;
        BigInt instance = null;
        BigInt expResult = null;
        BigInt result = instance.add(bigIntToAdd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class BigInt.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        BigInt bigIntToSubtract = null;
        BigInt instance = null;
        BigInt expResult = null;
        BigInt result = instance.subtract(bigIntToSubtract);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
