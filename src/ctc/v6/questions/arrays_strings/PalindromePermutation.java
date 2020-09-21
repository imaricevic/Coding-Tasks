package ctc.v6.questions.arrays_strings;

/**
 * @author ivan
 *
 *         1.4 Palindrome Permutation: Given a string, write a function to check if
 *         it is a permutation of a palindrome. A palindrome is a word or phrase
 *         that is the same forwards and backwards. A permutation is a rearrangement 
 *         of letters. The palindrome does not need to be limited to just dictionary words. 
 *         
 *         EXAMPLE 
 *         Input: Tact Coa 
 *         Output: True (permutations: "taco cat". "atco cta". etc.) 
 *         
 *         Hints: #106, #121, #134, #136
 */
public class PalindromePermutation {

	public static void main(String[] args) {
		String input = "Tact Coa";
		boolean result = printPalindromePermutation(input);
		System.out.println(result);
	}
	
	public static boolean printPalindromePermutation(String str) {
		
		str = str.toLowerCase();
		int[] countArray = new int[128];
		for(int i=0; i < str.length(); i++) {
			if(isValid(str.charAt(i))) {
				continue;
			}
			countArray[str.charAt(i)]++;
		}
		
		int oddCount = 0;
		for(int i=0; i < countArray.length; i++) {
			if(countArray[i] % 2 != 0 && ++oddCount > 1) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isValid(Character character) {
		if(character >= Character.getNumericValue('a') && character <= Character.getNumericValue('z')) {
			return true;
		}
		return false;
	}
	
}
