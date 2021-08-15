package tut4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import tut4.App;

/**
 * Unit test for simple App.
 */
public class AppTest 

{
    
    @Test
    public void addTest()
    {
    	int result = App.add(1, 1);
    	assertEquals(result, 2);
    }
    
    @Test
    public void subtractTest() 
    {
    	int result = App.subtract(1, 1);
    	assertEquals(result, 0);
    }


}