package ctc.v6.questions.arrays_strings;

/**
 * @author ivan
 * 
 *         1.9 String Rotation: Assume you have a method isSubstring which
 *         checks if one word is a substring of another. Given two strings, s1
 *         and s2, write code to check if s2 is a rotation of s1 using only one
 *         call to isSubstring (e.g., "waterbottle" is a rotation of
 *         "erbottlewat").
 * 
 *         Hints: #34, #88, #104
 */
public class StringRotation {

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		boolean result = isRotation(s1, s2);
		System.out.println(result);
	}
	
	
	public static boolean isRotation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		String s1s1 = s1 + s1;
		return s1s1.contains(s2);
	}
}
	