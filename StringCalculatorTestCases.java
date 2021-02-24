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
	
	@Test
	public void nonEmptyString()
	{
		assertEquals(sol.Add("0"), 0);
		assertEquals(sol.Add("1"), 1);
		assertEquals(sol.Add("2"), 2);
	}
	
	@Test
	public void CommaSeparatedString_returnsSum()
	{
		assertEquals(sol.Add("0,1"), 1);
		assertEquals(sol.Add("0,0"), 0);
		assertEquals(sol.Add("1,1"), 2);
		assertEquals(sol.Add("1,2"), 3);
	}

}
