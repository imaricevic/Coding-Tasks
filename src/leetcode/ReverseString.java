package leetcode;

/**
 * 
 * @author imaricevic
 *
 *         Write a function that reverses a string. The input string is given as
 *         an array of characters char[].
 * 
 *         Do not allocate extra space for another array, you must do this by
 *         modifying the input array in-place with O(1) extra memory.
 * 
 *         You may assume all the characters consist of printable ascii
 *         characters.
 */
public class ReverseString {

	public void reverseString(char[] s) {

		char tmp = 0;
		int len = s.length;
		for (int i = 0; i < len / 2; i++) {
			tmp = s[i];
			s[i] = s[len - i - 1];
			s[len - i - 1] = tmp;
		}

	}
}
