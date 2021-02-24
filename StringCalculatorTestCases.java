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
	
	@Test
	public void HandleUnknownAmountofNumbers()
	{
		assertEquals(sol.Add("0,0,0,0,0,0"), 0);
		assertEquals(sol.Add("1,2,3,4,5,6"), 21);
	}
	
	@Test
	public void HandleNewLineBetweenNumbers()
	{
		assertEquals(sol.Add("1\n2,3"), 6);
	}

}
