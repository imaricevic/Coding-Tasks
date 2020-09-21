package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author imaricevic
 *
 *         Given two strings s and t , write a function to determine if t is an
 *         anagram of s.
 */
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {

		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			Character sc = s.charAt(i);
			Character tc = t.charAt(i);

			if (map.containsKey(sc)) {
				map.put(sc, map.get(sc) + 1);
			} else {
				map.put(sc, 1);
			}

			if (map.containsKey(tc)) {
				map.put(tc, map.get(tc) - 1);
			} else {
				map.put(tc, -1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() != 0) {
				return false;
			}
		}

		return true;
	}

}
