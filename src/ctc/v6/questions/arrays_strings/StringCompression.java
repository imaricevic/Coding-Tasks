package ctc.v6.questions.arrays_strings;

/**
 * @author ivan
 *
 *         Implement a method to perform basic string compression using the
 *         counts of repeated characters. For example, the string aabcccccaaa
 *         would become a2b1c5a3. If the "compressed" string would not become
 *         smaller than the original string, your method should return the
 *         original string. You can assume the string has only uppercase and
 *         lowercase letters (a - z).
 * 
 *         Hints: #92, #110
 */
public class StringCompression {

	public static void main(String[] args) {
		String inputString = "aabcccccaaa";
		String result = compress(inputString);
		System.out.println(result);
	}
	
	
	public static String compress(String str) {
		StringBuilder builder  = new StringBuilder();
		int count = 0;
		for(int i=0; i < str.length(); i++) {
			count++;
			if(i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
				builder.append(str.charAt(i)).append(count);
				count = 0;
			}
		}
		
		return builder.length() < str.length() ? builder.toString() : str;
	}
	
}
