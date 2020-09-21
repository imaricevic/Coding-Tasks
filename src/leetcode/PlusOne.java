package leetcode;

/**
 * 
 * @author imaricevic
 *
 *         Given a non-empty array of digits representing a non-negative
 *         integer, increment one to the integer.
 * 
 *         The digits are stored such that the most significant digit is at the
 *         head of the list, and each element in the array contains a single
 *         digit.
 * 
 *         You may assume the integer does not contain any leading zero, except
 *         the number 0 itself.
 */
public class PlusOne {

	public int[] plusOne(int[] digits) {

		int carrier = 1;
		for (int i = digits.length - 1; i >= 0; i--) {

			digits[i] = (digits[i] + carrier) % 10;
			if (digits[i] == 0 && carrier == 1) {
				carrier = 1;
			} else {
				carrier = 0;
			}
		}

		if (digits[0] == 0) {
			int[] newDigits = new int[digits.length + 1];
			newDigits[0] = 1;
			newDigits[1] = digits[0];
			return newDigits;
		}

		return digits;
	}

}
