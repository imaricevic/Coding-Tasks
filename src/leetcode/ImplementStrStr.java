package leetcode;

/**
 * 
 * @author imaricevic
 *
 *         Implement strStr().
 * 
 *         Return the index of the first occurrence of needle in haystack, or -1
 *         if needle is not part of haystack.
 */
public class ImplementStrStr {

	public int strStr(String haystack, String needle) {

		if (haystack == null || needle == null) {
			return -1;
		}
		if (needle.isEmpty()) {
			return 0;
		}

		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.length() - i < needle.length()) {
				return -1;
			}
			for (int j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
				if (j == needle.length() - 1) {
					return i;
				}
			}
		}

		return -1;
	}
}
