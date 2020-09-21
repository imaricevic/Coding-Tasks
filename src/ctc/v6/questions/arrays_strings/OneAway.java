package ctc.v6.questions.arrays_strings;

/**
 * 
 * @author ivan
 *
 *         1.5 One Away: There are three types of edits that can be performed on
 *         strings: insert a character, remove a character, or replace a
 *         character. Given two strings, write a function to check if they are
 *         one edit (or zero edits) away. 
 *         
 *         EXAMPLE 
 *         pale, ple -> true 
 *         pales. pale -> true 
 *         pale. bale -> true 
 *         pale. bake -> false 
 *         
 *         Hints: #23, #97, #130
 */
public class OneAway {

	public static void main(String[] args) {
		String input1 = "ale";
		String input2 = "aleee";
		boolean result = isOneAway(input1, input2);
		System.out.println(result);
	}
	
	
	public static boolean isOneAway(String str1, String str2) {
		int lengthDiff = str1.length() - str2.length();
		if(Math.abs(lengthDiff) > 1) {
			return false;
		}
		int editCount = 0;
		for(int i=0; i < str1.length(); i++) {
			int first = i, second = i;
			if(lengthDiff > 0) {
				second = i - editCount;
			}
			else if(lengthDiff < 0) {
				first = i - editCount;
			}
			if(str1.charAt(first) != str2.charAt(second) && ++editCount > 1) {
				return false;
			}
		}
		
		return true;
	}
	
}
