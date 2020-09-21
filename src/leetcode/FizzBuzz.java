package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author imaricevic
 *
 *         Write a program that outputs the string representation of numbers
 *         from 1 to n.
 * 
 *         But for multiples of three it should output “Fizz” instead of the
 *         number and for the multiples of five output “Buzz”. For numbers which
 *         are multiples of both three and five output “FizzBuzz”.
 */
public class FizzBuzz {

	public List<String> fizzBuzz(int n) {

		List<String> output = new ArrayList<String>(n);
		String buzz = "Buzz";
		String fizz = "Fizz";
		String fizzBuzz = "FizzBuzz";

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				output.add(fizzBuzz);
			} else if (i % 3 == 0) {
				output.add(fizz);
			} else if (i % 5 == 0) {
				output.add(buzz);
			} else {
				output.add(String.valueOf(i));
			}
		}

		return output;
	}
}
