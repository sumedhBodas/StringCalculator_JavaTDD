package TDD;

public class StringCalculatorSolution {

	public int Add(String input) {
		if (input.length() == 0)
		{
			return 0;
		}
		
		if (input.contains(","))
		{
			return Integer.parseInt(input.split(",")[0].trim()) 
					 + Integer.parseInt(input.split(",")[1].trim());
		}
		return Integer.parseInt(input);
		
	}

}
