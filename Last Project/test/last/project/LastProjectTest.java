
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
public class LastProjectTest {
    
    public LastProjectTest() {
    }
    
     @Test
    public void testAddTwoPositives() {
        // Arrange
        BigInt first = new BigInt("123");
        BigInt second = new BigInt("234");
        String expectedResult = "357";
        
        // Act
        BigInt result = first.add(second);
        String actualResult = result.toString();
        
        // Assert
        assertTrue(expectedResult.equals(actualResult));
        
    }
    
    @Test
    public void testSubtractANegative() {
        // Arrange
        BigInt b1 = new BigInt("-100");
        BigInt b2 = new BigInt("-100");
        String expectedResult = "-200";
        
        b1 = new BigInt("37");
   	b2 = new BigInt("-26");
        
        b1 = new BigInt("-37");
   	b2 = new BigInt("-26");
        
        
        
        // Act
        BigInt result = b1.subtract(b2);
        String actualResult = result.toString();
        
        // Assert
        assertTrue(expectedResult.equals(actualResult));
        
    }
    
    @Test
    public void testSubtractGetNegativeResult() {
        // Arrange
        BigInt first = new BigInt("123");
        BigInt second = new BigInt("234");
        String expectedResult = "-111";
        
        // Act
        BigInt result = first.subtract(second);
        String actualResult = result.toString();
        
        // Assert
        assertTrue(expectedResult.equals(actualResult));
        
    }
    
    @Test
    public void testSubtract() {
        // Arrange
        BigInt first = new BigInt("123");
        BigInt second = new BigInt("234");
        String expectedResult = "111";
        
        // Act
        BigInt result = second.subtract(first);
        String actualResult = result.toString();
        
        // Assert
        assertTrue(expectedResult.equals(actualResult));
        
    }
    
}
