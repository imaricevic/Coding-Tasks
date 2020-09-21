package ctc.v6.questions.arrays_strings;

import java.util.HashMap;

/**
 * @author ivan
 * 
 *         1.2 Check Permutation: Given two strings, write a method to decide if
 *         one is a permutation of the other.
 * 
 *         Hints: #7, #84, #122, #131
 */
public class CheckPermutation {

	public static void main(String[] args) {
		String testString1 = "asd";
		String testString2 = "dss";
		System.out.println(checkPermutation(testString1, testString2));
	}

	public static boolean checkPermutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		} else {
			HashMap<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < str1.length(); i++) {
				fillMap(map, str1.charAt(i), 1);
				fillMap(map, str2.charAt(i), -1);
			}
			return areValuesZero(map);
		}
	}

	private static void fillMap(HashMap<Character, Integer> map, Character character, int value) {
		if (map.containsKey(character)) {
			map.put(character, map.get(character) + value);
		} else {
			map.put(character, value);
		}
	}

	private static boolean areValuesZero(HashMap<Character, Integer> map) {
		for (Integer value : map.values()) {
			if (value != 0) {
				return false;
			}
		}
		return true;
	}

}
