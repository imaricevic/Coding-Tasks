package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author imaricevic
 *
 *         Given a non-empty string s and a dictionary wordDict containing a
 *         list of non-empty words, determine if s can be segmented into a
 *         space-separated sequence of one or more dictionary words.
 * 
 *         Note:
 * 
 *         The same word in the dictionary may be reused multiple times in the
 *         segmentation. You may assume the dictionary does not contain
 *         duplicate words.
 */
public class WordBreak {

	private Set<String> wordDict = new HashSet<String>();

	private Map<String, Boolean> results = new HashMap<String, Boolean>();

	public boolean wordBreak(String s, List<String> wordDict) {
		for (int i = 0; i < wordDict.size(); i++) {
			this.wordDict.add(wordDict.get(i));
		}

		return recursive(s);
	}

	private boolean recursive(String s) {
		if (s.isEmpty() || isInDict(s)) {
			return true;
		}

		boolean rec = false;

		for (int i = 1; i <= s.length(); i++) {
			String currentWord = s.substring(0, i);

			if (isInDict(currentWord)) {
				String nextWord = s.substring(i);

				rec = rec || (results.containsKey(nextWord) ? results.get(nextWord) : recursive(nextWord));
			}
		}
		results.put(s, rec);

		return rec;
	}

	private boolean isInDict(String word) {
		return wordDict.contains(word);
	}
}
