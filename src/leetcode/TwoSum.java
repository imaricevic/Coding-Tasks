package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author imaricevic
 *
 *         Given an array of integers nums and an integer target, return indices
 *         of the two numbers such that they add up to target.
 * 
 *         You may assume that each input would have exactly one solution, and
 *         you may not use the same element twice.
 * 
 *         You can return the answer in any order.
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {

		int[] result = new int[2];
		Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int newTarget = target - nums[i];
			if (tmp.containsKey(newTarget)) {
				result[0] = tmp.get(newTarget);
				result[1] = i;
				break;
			} else {
				tmp.put(nums[i], i);
			}
		}

		return result;
	}
}
