package ctc.v6.questions.arrays_strings;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ivan
 * 
 *         1.1 Is Unique: Implement an algorithm to determine if a string has
 *         all unique characters. What if you cannot use additional data
 *         structures?
 * 
 *         Hints: #44, #117, #132
 */
public class IsUnique {

	public static void main(String[] args) {
		String testString = "Hello world!";
		System.out.println(isUnique(testString));
	}

	// my solution
	public static boolean isUnique(String word) {
		// in case string is an ASCII
		if (word.length() > 128) {
			return false;
		}
		Set<Character> characterSet = new HashSet<>();
		for (int i = 0; i < word.length(); i++) {
			Character currentCharacter = word.charAt(i);
			if (characterSet.contains(currentCharacter)) {
				return false;
			} else {
				characterSet.add(currentCharacter);
			}
		}
		return true;
	}

}
