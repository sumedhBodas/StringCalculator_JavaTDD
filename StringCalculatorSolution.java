package TDD;

import java.util.Arrays;

public class StringCalculatorSolution {

	public int Add(String input) {
		
		 // Returns 0 if String is Empty ("")
		if (input.length() == 0)                      
		{
			return 0;
		}

		//returns a sequential Stream with the elements of the input array, passed as parameter, as its source.
		return Arrays.stream(input.split("[,\n]"))	    
				.map(String::strip)
				.mapToInt(Integer::parseInt)
				.filter(n -> n < 1001)
				.peek(n -> {
					if (n < 0) throw new IllegalArgumentException ("Negatives not allowed: " + n);
				})
				.sum();
		
	}

}
