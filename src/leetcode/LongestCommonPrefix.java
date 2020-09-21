package leetcode;

/**
 * 
 * @author imaricevic
 *
 *         Write a function to find the longest common prefix string amongst an
 *         array of strings.
 * 
 *         If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length < 1) {
			return "";
		}

		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			if (prefix.isEmpty()) {
				return prefix;
			}
			prefix = commonPrefix(prefix, strs[i]);
		}

		return prefix;
	}

	private String commonPrefix(String str1, String str2) {
		StringBuilder prefix = new StringBuilder("");
		for (int i = 0; i < str1.length() && i < str2.length(); i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				prefix.append(str1.charAt(i));
			} else {
				break;
			}
		}
		return prefix.toString();
	}
}
