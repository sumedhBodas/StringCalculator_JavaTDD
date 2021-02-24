package TDD;

import java.util.Arrays;

public class StringCalculatorSolution {

	public int Add(String input) {
		if (input.length() == 0)
		{
			return 0;
		}

		return Arrays.stream(input.split(","))
				.map(String::strip)
				.mapToInt(Integer::parseInt)
				.sum();
		
	
		
	}

}
