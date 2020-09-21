package ctc.v6.questions.arrays_strings;

/**
 * @author ivan
 * 
 *         1.3 URLify: Write a method to replace all spaces in a string with
 *         '%20'. You may assume that the string has sufficient space at the end
 *         to hold the additional characters, and that you are given the "true"
 *         length of the string. (Note: If implementing in Java, please use a
 *         character array so that you can perform this operation in place.)
 * 
 *         EXAMPLE 
 *         Input: "Mr John Smith ", 13 "Mr John SmitSmith", 13 Output:
 *         "Mr%20John%20Smith"
 * 
 *         Hints: #53, #118
 */
public class URLify {

	public static void main(String[] args) {
		String testString = " Mr John Smith      ";
		urlify(testString.toCharArray(), 14);
	}

	public static void urlify(char[] charList, int length) {
		int charsToReplace = (charList.length - length);
		if (charsToReplace > 0) {
			for (int i = charList.length - charsToReplace - 1; i >= 0; i--) {
				if (charList[i] == ' ') {
					charList[i + charsToReplace] = '%';
					charList[i + charsToReplace - 1] = '0';
					charList[i + charsToReplace - 2] = '2';
					charsToReplace = charsToReplace - 2;
				} else {
					charList[i + charsToReplace] = charList[i];
				}
			}
		}

		System.out.println(String.copyValueOf(charList));
	}

}
