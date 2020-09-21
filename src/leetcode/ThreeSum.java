package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author imaricevic
 *
 *         Given an array nums of n integers, are there elements a, b, c in nums
 *         such that a + b + c = 0? Find all unique triplets in the array which
 *         gives the sum of zero.
 * 
 *         Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Set<Integer> used = new HashSet<Integer>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (used.contains(nums[i])) {
				continue;
			}

			Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
			Set<Integer> used2 = new HashSet<Integer>();
			for (int j = i + 1; j < nums.length; j++) {
				int newTarget = -nums[i] - nums[j];
				if (tmp.containsKey(newTarget) && !used.contains(nums[i]) && !used.contains(nums[j])
						&& !used.contains(newTarget) && !used2.contains(newTarget) && !used2.contains(nums[j])) {

					List<Integer> res = new ArrayList<Integer>();
					res.add(nums[i]);
					res.add(newTarget);
					res.add(nums[j]);
					result.add(res);

					used2.add(newTarget);
					used2.add(nums[j]);
				}
				tmp.put(nums[j], j);

			}
			used.add(nums[i]);
		}

		return result;
	}
}
