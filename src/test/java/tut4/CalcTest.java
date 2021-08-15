package tut4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import tut4.Calc;

/**
 * Unit test for simple App.
 */
public class CalcTest 

{
	
    @Test
    public void addTest()
    {
    	Calc calc = new Calc();
    	int result = calc.add(1, 1);
    	assertEquals(result, 2);
    }
    
    @Test
    public void subtractTest() 
    {
    	Calc calc = new Calc();
    	int result = calc.subtract(1, 1);
    	assertEquals(result,10);
    }


}