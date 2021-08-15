package tut4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import src/main/java/tut4.Calc;

/**
 * Unit test for simple App.
 */
public class CalcTest 

{
    
    @Test
    public void addTest()
    {
    	int result = Calc.add(1, 1);
    	assertEquals(result, 2);
    }
    
    @Test
    public void subtractTest() 
    {
    	int result = Calc.subtract(1, 1);
    	assertEquals(result, 0);
    }


}