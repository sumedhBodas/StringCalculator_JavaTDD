package TDD;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringCalculatorTestCases {
	
	StringCalculatorSolution sol = new StringCalculatorSolution();
	
	@Test
	public void EmptyString_returnzZero()
	{
		assertEquals(sol.Add(""), 0);
	}

}
