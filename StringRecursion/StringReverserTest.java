

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StringReverserTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StringReverserTest
{
    // 3 normal test cases
    @Test
    public void testHello(){
        String input = "Hello";
        String expected = "olleH";
        assertEquals(expected, StringReverser.reverseString(input));
        
    }
    
    @Test
    public void testAzariasProgramming(){
        String input = "Azarias Programming";
        String expected = "gnimmargorP sairazA";
        assertEquals(expected, StringReverser.reverseString(input));
        
    }
    
    @Test
    public void testNumbers(){
        String input = "12345";
        String expected = "54321";
        assertEquals(expected, StringReverser.reverseString(input));
        
    }
    
    // 3 edge test cases
    @Test
    public void testEmpty(){
        String input = "";
        String expected = "";
        assertEquals(expected, StringReverser.reverseString(input));
        
    }
    
    @Test
    public void testNull(){
        String input = null;
        String expected = null;
        assertEquals(expected, StringReverser.reverseString(input));
        
    }
    
    @Test
    public void testLetter(){
        String input = "H";
        String expected = "H";
        assertEquals(expected, StringReverser.reverseString(input));
        
    }
    
}