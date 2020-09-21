package leetcode;

/**
 * 
 * @author imaricevic
 *
 *         Given a 32-bit signed integer, reverse digits of an integer.
 */
public class ReverseInteger {

	public int reverse(int x) {

		if (x > -10 && x < 10) {
			return x;
		}

		String stringNumber = String.valueOf(Math.abs(x));
		StringBuilder reversedNumber = new StringBuilder();

		for (int i = stringNumber.length() - 1; i >= 0; i--) {
			reversedNumber.append(stringNumber.charAt(i));
		}

		try {
			return (x < 0) ? Integer.parseInt(reversedNumber.toString()) * -1
					: Integer.parseInt(reversedNumber.toString());
		} catch (NumberFormatException e) {
			return 0;
		}

	}

}
