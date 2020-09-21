package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

	public int singleNumber(int[] nums) {

		Set<Integer> numbers = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (numbers.contains(nums[i])) {
				numbers.remove(nums[i]);
			} else {
				numbers.add(nums[i]);
			}
		}

		return numbers.iterator().next();
	}

}
