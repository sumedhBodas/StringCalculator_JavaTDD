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
		assertEquals(sol.Add("1\n2\n3"), 6);
		assertEquals(sol.Add("1,2\n3"), 6);
	}

	@Test(expected = IllegalArgumentException.class)
	public void HandleNegativeNumbers()
	{
		sol.Add("-1, -4, 1, -5");
	}
	
	@Test
	public void IgnoreNumbersbiggerthan1000()
	{
		assertEquals(sol.Add("1, 1001"), 1);
		assertEquals(sol.Add("1, 1000"), 1001);
		assertEquals(sol.Add("1001, 1001"), 0);
		assertEquals(sol.Add("1000, 1000"), 2000);
	}
	
	@Test
	public void VariableLengthDelimiter()
	{
		assertEquals(sol.Add("//[***]\n1***2***3"), 6);
		assertEquals(sol.Add("//[***]\n1***2***3,4"), 10);
	}
	
	@Test
	public void MultipleDelimitersAllowed()
	{
		assertEquals(sol.Add("//[*][%]\n1*2%3"), 6);
		assertEquals(sol.Add("//[*][%]\n1*2%3,4"), 10);
	}
	
	@Test
	public void MultipleDelimitersMorethaoneCHAR()
	{
		assertEquals(sol.Add("//[abc][bcd]\n1aa2cc3"), 6);
	}

}
